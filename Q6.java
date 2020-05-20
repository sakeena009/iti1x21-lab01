import java.util.Scanner;
public class Q6 {
  public static void main(String[] args){
    double[] grades; 
    grades=new double[10];
    
    for (int i=0; i<=10; i++){
      
      System.out.print("Enter a number: ");
      Scanner scan=new Scanner(System.in);
      int myInt=scan.nextInt();
      grades[i]=myInt;
    }
    calculateAverage(grades);
    calculateMedian(grades);
    calculateNumberFailed(grades);
    calculateNumberPassed(grades);
  }

  public static double calculateAverage(double[] notes){
    double result;
    result=0;
    int count;
    count=0;
    for (int i=0; i<notes.length; i++){
      result=result+notes[i];
      count=count+1;
    }
    result=result/count;
    System.out.println("Average: "+result);
    return result;
  }

  public static double calculateMedian(double[] notes){
    for (int i=0; i<notes.length; i++){
        for (int j=i+1; j<notes.length; j++){
            if (notes[j]<notes[i]){
                double old=notes[i];
                notes[i]=notes[j];
                notes[j]=old;
            }
        }
    }
      double median;
      median=(notes[5]+notes[6])/2;
      System.out.println("Median: "+median);
      return median;

  }

  public static int calculateNumberFailed(double[] notes){
    int fails;
    fails=0;
    for (int i=0; i<notes.length; i++){
      if (notes[i]<50.0){
        fails=fails+1;
      }
    }
    System.out.println("Number Failed: "+fails);
    return fails;
  }

  public static int calculateNumberPassed(double[] notes){
    int passes;
    passes=0;
    for (int i=0; i<notes.length; i++){
      if (notes[i]>50.0){
        passes=passes+1;
      }
    }
    System.out.println("Number Passed: "+passes);
    return passes;
  }

}
