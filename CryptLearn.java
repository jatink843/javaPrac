import java.security.MessageDigest;


public class CryptLearn {


	public static void main(String[] args) throws Exception{

		MessageDigest md = MessageDigest.getInstance("SHA-256");

		System.out.println("Plain: "+args[0]);	

		byte[] message = args[0].getBytes();
		md.update(message);

		byte[] digest = md.digest();

		StringBuilder builder = new StringBuilder();

		for(int i : digest){

				builder.append(Integer.toHexString(0xFF & i));
		}

		System.out.println("Digest : "+ builder.toString());




	}


}