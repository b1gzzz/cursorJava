import java.util.Random;

public class Tasks7_8 {
    public static void main(String[] args) {

        Random random = new Random();
        int [] array = new int[10];
        int maxEven = array[0];

        //7. task
        System.out.println("\n"+"7. task");

        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(70);
            if (array[i] > maxEven && array[i] % 2 == 0) {
                maxEven = array[i];
            }
        }
            System.out.println("Max even is: " + maxEven);

        //8. task
        System.out.println("\n"+"8. task");
        for (int i = 0; i<array.length; i++){
            if (i %2 == 0){
                System.out.print(array[i]+ " ");
            }
        }

    }
}