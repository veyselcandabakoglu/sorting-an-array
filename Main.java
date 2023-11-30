import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      int arrayLength, number;
      
      
      Scanner input = new Scanner(System.in);
      System.out.print("Dizinin Boyutunu Giriniz: ");
      arrayLength = input.nextInt();
      int[] arr = new int[arrayLength];

      System.out.println();
      
      for(int i = 0; i < arr.length; i++) {
        System.out.print((i+1)+ ". Elemanı :");
        number = input.nextInt();
        arr[i] = number;
      }

      System.out.println();

      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));

      input.close();
    }
}