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

  public RationalNumber reciprocal(){
    int nume2=denominator;
    int deno2=numerator;
    RationalNumber reci=new RationalNumber(nume2,deno2);
    return reci;
  }

  public boolean equals(RationalNumber other){
    reduce();
    other.reduce();
    return (getDenominator()==other.getDenominator()&&getNumerator()==other.getNumerator());
  }

  public String toString(){
    if (denominator==0){
      return (""+numerator);
    }
    else{
      return (numerator+"/"+denominator);
    }
  }

  private static int gcd(int a, int b){
    int temp=0;
    int remainder=1;
    if (a<b){
      temp=b;
      b=a;
      a=temp;
    }
    while (remainder!=0){
      remainder=a%b;
      a=b;
      b=remainder;
    }
    return a;
  }

  private void reduce(){
    int gcd=gcd(getNumerator(),getDenominator());
    numerator=getNumerator()/gcd;
    denominator=getDenominator()/gcd;
    if (denominator<0&&numerator>0){
      numerator=numerator*-1;
      denominator=denominator*-1;
    }
    if (denominator<0&&numerator<0){
      numerator=numerator*-1;
      denominator=denominator*-1;
    }
  }

  public RationalNumber multiply(RationalNumber other){
    int newnum=getNumerator()*other.getNumerator();
    int newdeno=getDenominator()*other.getDenominator();
    RationalNumber prod=new RationalNumber(newnum,newdeno);
    prod.reduce();
    return prod;
  }

  public RationalNumber divide(RationalNumber other){
    other=other.reciprocal();
    return multiply(other);
  }

  public RationalNumber add(RationalNumber other){
    int newnum=numerator*other.getDenominator()+other.getNumerator()*denominator;
    int newdeno=denominator*other.getDenominator();
    RationalNumber sum=new RationalNumber(newnum,newdeno);
    sum.reduce();
    return sum;
  }

  public RationalNumber subtract(RationalNumber other){
    int newnum=numerator*other.getDenominator()-other.getNumerator()*denominator;
    int newdeno=denominator*other.getDenominator();
    RationalNumber diff=new RationalNumber(newnum,newdeno);
    diff.reduce();
    return diff;
  }
}
