
public class Fraction {
	int numerator;
	int denominator;
	
	Fraction(){
		
	}
	
	
	Fraction(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	
	void setNumerator(int numerator) {
		this.numerator=numerator;
	}
	
	
	void setDenominator(int denominator) {
		this.denominator=denominator;
	}
	
	
	int getNumerator() {
		return numerator;
	}
	
	
	int getDenominator() {
		return denominator;
	}

	
	public String toString() {
		return ""+numerator+"/"+denominator;
	}
	
	
	void add(Fraction fraction) {
		Fraction f1=new Fraction();
		
		f1.numerator=numerator*fraction.denominator+fraction.numerator * denominator;
		f1.denominator=fraction.denominator*denominator;
		
		System.out.println("The summation:"+f1.toString());
	}
	
	
	void sub(Fraction fraction) {
		Fraction f1=new Fraction();
		
		f1.numerator=numerator*fraction.denominator-fraction.numerator * denominator;
		f1.denominator=fraction.denominator*denominator;
		
		System.out.println("The subtraction:"+f1.toString());
	}
	
	
	void multiplication(Fraction fraction) {
		Fraction f1=new Fraction();
		
		f1.numerator=fraction.numerator*numerator;
		f1.denominator=fraction.denominator*denominator;
		
		System.out.println("The multiplication:"+f1.toString());
	}
	
	void division(Fraction fraction) {
		Fraction f1=new Fraction();
		
		f1.numerator=fraction.numerator*denominator;
		f1.denominator=fraction.denominator*numerator;
		
		System.out.println("The division:"+f1.toString());
	}
}
