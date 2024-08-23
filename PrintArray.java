package generics;
public class PrintArray {
    public static void toPrint(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
    public static void toPrint(double[] array) {
        for (double element : array) {
            System.out.println(element);
        }
    }
    public static void toPrint(char[] array) {
        for (char element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        int[] integers = {1, 2, 3, 4, 5};
        double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        char [] characters = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Integer Array:");
        toPrint(integers);

        System.out.println("\nDouble Array:");
        toPrint(doubles);

        System.out.println("\nCharacter Array:");
        toPrint(characters);
    }
}
