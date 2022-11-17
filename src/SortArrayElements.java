import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many has numbers in your array :");
        int[] numbers = new int[scan.nextInt()];
        for(int i = 0 ; i<numbers.length;i++){
            System.out.println(i+1 + ". element");
            numbers[i] = scan.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("The order of the array your entered: " + Arrays.toString(numbers));

    }
}
