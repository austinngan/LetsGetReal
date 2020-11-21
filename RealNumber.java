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
    if(value1==0){
      if (value2==0){
        return true;
      }
      else{
        return false;
      }
    }
    return (Math.abs(value1-value2)/value1<0.00001);
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

  public RealNumber divide(RealNumber other){
    double z=getValue()/other.getValue();
    RealNumber quot=new RealNumber(z);
    return quot;
  }

  public RealNumber subtract(RealNumber other){
    double z=getValue()-other.getValue();
    RealNumber diff=new RealNumber(z);
    return diff;
  }

}
