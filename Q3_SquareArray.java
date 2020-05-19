public class Q3_SquareArray{

  public static int[] createArray(int size) {
    int[] array;
    array=new int[size];
    for (int i=0; i<size; i++){
      int s=i*i;
      System.out.println("The square of "+ i+" is:"+s);
      array[i]=s;
    }
    return array; 
  }
  

  public static void main(String[] args) { 
    int size=13;
    createArray(size);
  }
}
