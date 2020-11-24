public abstract class Number{
  public abstract double getValue();



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
}
