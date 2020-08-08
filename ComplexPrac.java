import java.util.Scanner;




/* A class repersenting Complex number. */
class Complex{

	private int realPart;
	private int imgPart;

	// Default Constructor
	// if the parms are missing then default values will be  1  and 1
	Complex(){

		this.realPart = 1;
		this.imgPart = 1;
	}

	// Constructor with parameters.
	Complex(int r, int i){

		this.realPart = r;
		this.imgPart = i;

	}

	// method for getting real part.
	public int getRealPart(){

		return this.realPart;

	}

	// method for getting imaginary part.
	public int getImgPart(){

		return this.imgPart;

	}

	// method for performing addtion operation
	public Complex doAdd(Complex c){

		int cReal = c.getRealPart();
		int cImg  = c.getImgPart();
		
		Complex out = new Complex(this.realPart+cReal, this.imgPart+cImg);
		
		return out;

	}

	// method for performing substraction operation
	public Complex doSub(Complex c){

		int cReal = c.getRealPart();
		int cImagi  = c.getImgPart();
		
		Complex out = new Complex(this.realPart-cReal, this.imgPart-cImagi);
		
		return out;

	}


	// method for performing multiplication operation.
	public Complex doMult(Complex c){


		int firstPart = this.realPart*c.getRealPart();
		int secondPart = this.imgPart*c.getImgPart();
		int thirdPart  = (this.imgPart*c.getRealPart())+(this.realPart*c.getImgPart());


		int outRealPart = firstPart -  secondPart;
		int outImgPart = thirdPart;



		return new Complex(outRealPart, outImgPart);


	}


	// method for performing division operation.
	public RationalComplex doDiv(Complex c){

		Complex newC = new Complex(c.getRealPart(), -(c.getImgPart()));

		Complex numerator = this.doMult(newC);
		Complex denominator = c.doMult(newC);
		
		
		return new RationalComplex(numerator, denominator);


	}


	// method for displaying complex number.
	public void showComplex(){

		System.out.print(this.realPart+" + "+ this.imgPart+ "i\n");


	}

}




/* 
A class representing Rational complex number, i.e p/q form.

Constructor takes two parms,
@parm n := numerator complex number
@parm d := denominator complex number

Methods :
======== 

@method getNumerator() := return an object of class Complex (Note: Upper complex number).
@method getDenominator() := return an object of class Complex (Note: Lower complex number).

*/

class RationalComplex{

	private Complex numerator;
	private Complex denominator;


	RationalComplex(Complex n, Complex d){

		this.numerator = n;
		this.denominator = d;

	}

	public Complex getNumerator(){
		return this.numerator;
	}

	public Complex getDenominator(){
		return this.denominator;
	}


	public void showRationalComplex(){

			System.out.println(numerator.getRealPart() + "/"+denominator.getRealPart() + " + "+numerator.getImgPart()+"i"+"/"+denominator.getRealPart());
	}

}




// Main class
class ComplexPrac{


	public static void main(String args[]){

		// // Declaring first complex object of Complex class.
		// Complex c1 = new Complex(3, 4); 

		// // Declaring 2nd complex object of Complex class.
		// Complex c2 = new Complex(8, -2);

		// // Performing division i.e, c1/c2.
		// RationalComplex rationalComplex =  c1.doDiv(c2);
		// rationalComplex.showRationalComplex();





		Scanner input = new Scanner(System.in);


		System.out.print("Enter the real part of First Complex number: ");
		int c1Real = input.nextInt();

		System.out.print("Enter the imaginary part of First Complex number: ");
		int c1Img = input.nextInt();


		System.out.print("\nEnter the real part of Second Complex number: ");
		int c2Real = input.nextInt();

		System.out.print("Enter the imaginary part of Second Complex number: ");
		int c2Img = input.nextInt();



		Complex c1 = new Complex(c1Real,c1Img);
		Complex c2 = new Complex(c2Real,c2Img);


		System.out.print("\nFirst Complex No.: ");
		c1.showComplex();

		System.out.print("Second Complex No.: ");
		c2.showComplex();

		System.out.print("\nAfter Addition Operation: ");
		c1.doAdd(c2).showComplex();


		System.out.print("After Substration Operation: ");
		c1.doSub(c2).showComplex();


		System.out.print("After Multiplication Operation: ");
		c1.doMult(c2).showComplex();

		System.out.print("After Division Operation: ");
		c1.doDiv(c2).showRationalComplex();





	}



}