public class RealNumber{
  private double value;

  public RealNumber(double v){
    value=v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

  public boolean equals(RealNumber other){
    double value1=getValue();
    double value2=other.getValue();
    if(value1==0&&value2!=0){
      return false;
    }
    if(value2==0&&value1!=0){
      return false;
    }
    if (value1/value2<=0.00001||value2/value1<=0.00001){
      return true;
    }
    return false;
  }

  public RealNumber add(RealNumber other){
    double z=getValue()+other.getValue();
    RealNumber sum=new RealNumber(z);
    return sum;
  }

  public RealNumber multiply(RealNumber other){
    double z=getValue()*other.getValue();
    RealNumber prod=new RealNumber(z);
    return prod;
  }
}
