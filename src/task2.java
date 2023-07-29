public class task2 {public static void main(String[] args) {
    Integer [] numbers = {67,89,2,1,5,90,34,56};
    String [] words = {"All", "you", "need", "is", "love"};
    printArray(numbers);
    System.out.println(" ");
    printArray(words);

}

    static <T> void printArray(T[] array) {
        for (T item: array
        ) {
            System.out.printf(item + " ");

        }
    }
}
