public class PrintfNewlineProblem {

    public static void main(String[] args) {
        // Плохо
        System.out.printf("%s\n", "str#1");
        System.out.println("str#2");

        // Правильно
        System.out.printf("%s%n", "str#1");
        System.out.println("str#2");
    }
}