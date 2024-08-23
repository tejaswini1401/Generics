package generics;
public class PrintArray {
	public static <E> void toPrint(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character [] characters = {'a', 'b', 'c', 'd', 'e'};

        System.out.println("Integer Array:");
        toPrint(integers);

        System.out.println("\nDouble Array:");
        toPrint(doubles);

        System.out.println("\nCharacter Array:");
        toPrint(characters);
    }
}
