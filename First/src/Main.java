import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10]; // creating the array
        // 1. task, 1 var
        System.out.println("\n"+"1. task, 1 var");
        for (int i = 0; i < array.length; i++) { //filling with random numbers
            array[i] = 2 * random.nextInt(100);  // better to make some restrictions

            if (array[i] == 0){
                i--;
            }
            else
                System.out.print(array[i] + " ");
        }

        // 1. task, 2 var
        System.out.println("\n"+"1. task, 2 var");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] == 0) {
                i--;
            } else if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            } else i--;

        }

        // 2. task
        System.out.println("\n"+"2. task");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        // 3. task
        System.out.println("\n"+"3. task");
        char[] charArray = new char[10];
        for (int i = 0; i<charArray.length; i++){
        charArray[i] = (char) random.nextInt(255);
            System.out.print(charArray[i] + " ");
        }

        // 4. task
        System.out.println("\n"+"4. task");

        int max = array[0];
        System.out.print("Maximum value: ");
        for (int i = 0; i< array.length; i++) {
            if (max<array[i])
                max=array[i];
        }
        System.out.print(max);

        // 5. task
        System.out.println("\n"+"5. task");

        int min = array[0];
        System.out.print("Minimum value: ");
        for (int i = 0; i<array.length; i++) {
            if (min>array[i])
                min=array[i];
        }
        System.out.print(min);

        // 6. task
        System.out.println("\n"+"6. task");

        int sum = 0;
        float averageSum = 0;
        for (int i = 0; i<array.length; i++) {
            sum = sum+array[i];
        }
        averageSum = (float) sum/array.length;
        System.out.print("Average sum is: " + averageSum);

        }
}