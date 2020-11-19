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
    if (value1/value2<=0.00001){
      return true;
    }
    return false;
  }
}
