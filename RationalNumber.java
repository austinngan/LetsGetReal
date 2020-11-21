public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator=nume;
    denominator=deno;
    if (denominator==0){
      denominator=1;
      numerator=0;
    }
  }

  public double getValue(){
    return (double) numerator/denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }
}
