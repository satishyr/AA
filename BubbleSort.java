class BubbleSort {
  public static void main(String[] args) {
    int arr[] = new int[] { 4, 1, 8, 5, 2, 0, 4, 3, 7, 9 };
    for (int i : arr) {
      System.out.print(i + " ");
      }
     for (int i = 1; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i; j++) {
       if (arr[j] > arr[j + 1]) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
       }
     }
   }
     System.out.println();
     System.out.println("Sorted array");
     for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}