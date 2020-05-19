public class Q3_AverageDemo {

  public static void main(String[] args){
    double[] valuesArray;
    valuesArray = new double[]{100.0,34.0,72.0,56.0,82.0,67.0,94.0};
    System.out.println("The average is: " + calculateAverage(valuesArray));
  }

  
  public static double calculateAverage(double[] values){
    double result;
    result=0;
    int count;
    count=0;
    for (double v:values){
        result=result+v;
        count=count+1;
    }
    result=result/count;
    return result;
  }
}
