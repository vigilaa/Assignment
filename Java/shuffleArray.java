import java.util.Arrays;
import java.util.Random;

public class shuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArr(array);
        System.out.println("Shuffled array: " + Arrays.toString(array));
    }

    private static void shuffleArr(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
