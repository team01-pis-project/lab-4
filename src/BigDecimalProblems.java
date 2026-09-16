import java.math.BigDecimal;
public class BigDecimalProblems {

    public static void main(String[] args) {
        // Плохо
        System.out.println(new BigDecimal(1.1));

        // Правильно
        System.out.println(new BigDecimal("1.1"));
        System.out.println(BigDecimal.valueOf(1.1));

        // equals сравнивает scale
        BigDecimal d1 = new BigDecimal("1.1");
        BigDecimal d2 = new BigDecimal("1.10");
        System.out.println("equals = " + d1.equals(d2));       // false
        System.out.println("compareTo = " + d1.compareTo(d2)); // 0
    }
}