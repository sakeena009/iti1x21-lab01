public class Q3_ArrayInsertionDemo {

  public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
    int[] afterArray;
    afterArray=new int[beforeArray.length+1];
    for (int i=0; i<indexToInsert; i++){
      afterArray[i]=beforeArray[i];
    }
    afterArray[indexToInsert]=valueToInsert;
    if (indexToInsert<afterArray.length){
      for (int i=indexToInsert+1; i<afterArray.length; i++){
        afterArray[i]=beforeArray[i-1];
      }
    }
    System.out.println("Array after insertion: ");
    for (int i=0; i<afterArray.length; i++){
        System.out.println(afterArray[i]);
    }
    return afterArray;
  }

  public static void main(String[] args){
    int[] array= {1,5,4,7,9,6};
    System.out.println("Array before insertion:");
    for (int i=0; i<array.length; i++){
      System.out.println(array[i]);
    }
    int index=3;
    int value=15;
    insertIntoArray(array, index, value);
    
  }
}
