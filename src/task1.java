public class task1 {
    public static void main(String[] args) {
        printElements(3);
        printElements("Hello!");
        printElements(10.8);

    }

    static <T> void printElements(T element) {
        System.out.println(element);
    }
}