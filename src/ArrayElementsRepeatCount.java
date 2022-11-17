import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementsRepeatCount {
    public static void main(String[] args) {
        System.out.print("Please enter how many elements on your array: ");
        Scanner input = new Scanner(System.in);
        int numb = input.nextInt();

        int[] numbers1 = new int[numb];
        int[] numbers2 = new int[numb];

        for (int i = 0; i < numbers1.length; i++) {
            System.out.print((i + 1) + ". Enter element: ");
            numbers1[i] = input.nextInt();
        }
        Arrays.sort(numbers1);
        System.out.println("Array: " + Arrays.toString(numbers1));

        int repeatedNumber = 0;
        for (int r : numbers1) {
            int a = 0;
            for (int j = 0; j < numbers1.length; j++) {
                if (r == numbers2[j]) {
                    a++;
                }
            }
            if (a == 0) {
                int counter = 0;
                for (int i : numbers1) {
                    if (r == i) {
                        counter++;
                    }
                }
                numbers2[repeatedNumber] = r;
                repeatedNumber++;
                System.out.println(r + " number " +"repeated " + counter + " times.");
            }
        }
    }
}
