//Ling Cheng,  Niels Graham
//APCS1 pd10
//HW#33 -- Do You Even Add, Bro?
//2015-11-18

public class Rational {
    
    //instance vars
    private int numerator;
    private int denominator;

    
    //default constructor
    public Rational() {
	numerator = 0;
	denominator = 1;
    }

    //overloaded constructor
    public Rational(int a, int b){
	if (b == 0){
	    numerator = 0;
	    denominator = 1;
	} else {
	    numerator = a;
	    denominator = b;
	}
    }
	    	    
    //mutators
    public void setNum( int num ) {
	numerator = num;
    }

    public void setDen( int num ) {
	denominator = num;
    }

    
    //Methods

    //string representation of num as fraction
    public String toString() {
	return numerator + "/" + denominator;
    }

    //return as a floating point 
    public static float floatValue(Rational num){
	return (float)num.numerator/num.denominator;
    }
    
    //multiply
    public void multiply( Rational num ) {
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Num;
	this.denominator = num1Den * num2Den;
    }

    //divide
    public void divide( Rational num) {
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Den;
	this.denominator = num1Den * num2Num;
    }

    //GCD
    private static int GCD(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        if (0 == n) return m;
        else return GCD(n, m % n);
    }
    
    //LCM
    public static int LCM(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        return m * (n / GCD(m, n));    
    }
    //add
    public void add(Rational num){
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Den + num1Num * num1Den;
	this.denominator = num1Den * num2Den;
    }
    //subtract
    public void subtract(Rational num){
	int num1Num = this.numerator;
	int num1Den = this.denominator;
	int num2Num = num.numerator;
	int num2Den = num.denominator;
	this.numerator = num1Num * num2Den - num1Num * num1Den;
	this.denominator = num1Den * num2Den;
    }
    //Reduce
    public void reduce(){
	int a = this.numerator;
	int b = this.denominator;
	int g = GCD(a , b);
	this.numerator = a/g;
	this.denominator = b/g;
    }
	
    
    //main method
    public static void main( String[]args ) {
	//Rational bob = new Rational();
	//Rational emma = new Rational();
	Rational kevin = new Rational(1, 2);
	Rational Jimbo = new Rational(1, 2);
	/*emma.setNum(10);
	bob.setNum(3);
	bob.setDen(5);
	System.out.println( emma + "\n" + bob);
	emma.multiply( bob );
	System.out.println( emma );
	System.out.println(floatValue(emma));
	System.out.println( kevin + "\n" + Jimbo);
	kevin.divide(Jimbo);
	System.out.println(kevin);
	*/
	kevin.subtract(Jimbo);
	kevin.reduce();
	System.out.println(kevin);
	
    }
    
}//end class
