public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if (getValue()>other.getValue()){
      return 1;
    }
    if (equals(other)){
      return 0;
    }
    return -1;
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
}
