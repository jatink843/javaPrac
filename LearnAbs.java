import java.util.ArrayList;
import java.util.List;



abstract class Vehicle{

	abstract void run();

}



class Bus extends Vehicle{


	void run(){
		System.out.println("Bus is running");
	}


}


interface SpeakAble{

	
	void speak();
}


class Human implements SpeakAble{

	public void speak(){
		System.out.println("Bow. Bow Bow. Bow Bow.");
	}

}






class LearAbs{

	public static void main(String[] args){

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);

		for(int i:list){
			System.out.println(new Integer(i).toString());
		}



	}

}