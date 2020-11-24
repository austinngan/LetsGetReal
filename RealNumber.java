public class RealNumber extends Number{
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
