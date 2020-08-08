import java.security.MessageDigest;


public class CryptLearning{


	public static void main(String[] args) throws Exception{


		String msg = "messsaged changed";


		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(msg.getBytes());

		byte[] out = md.digest();
		
		StringBuffer hexstring = new StringBuffer();

		for(int x=0;x<out.length; x++){

			hexstring.append(Integer.toHexString(0xFF & out[x]));

		}

		System.out.println(hexstring.toString());



	}

}
