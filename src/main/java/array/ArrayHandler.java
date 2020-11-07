package array;

//import java.util.Random;
import java.util.Scanner;

public class ArrayHandler {
    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();

        //Random random = new Random();
        //Scanner scanner = new Scanner(System.in);

        /*System.out.print("Give the lenght of the array: ");
        int[] source = new int[scanner.nextInt()];

        for (int i = 0; i < source.length; i++) {
            source[i] = random.nextInt(4);
        }*/

        int[] source= new int []{1,3,4,5};

        for (int i = 0; i < source.length; i++) {
            System.out.println(i + 1 + " item: " + source[i]);
        }
        System.out.println();

        System.out.println("Does array contain it?");
        System.out.println(arrayHandler.contains(source, 3));
        System.out.println(arrayHandler.contains(source, 2));

        System.out.println();

        System.out.println("Is it found in the array?");
        System.out.println(arrayHandler.find(source,3));
        System.out.println(arrayHandler.find(source,2));
    }

    public boolean contains(int[] source, int itemToFind) {
        for (int sourceItem : source) {
            if (sourceItem == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
        }
        return -1;
    }
}
