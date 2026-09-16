public class TernaryProblems {

    public static void main(String[] args) {
        boolean flag = true;
        boolean flag1 = false;
        boolean flag2 = false;

        // Пример 1: Integer и Double
        // Компилятор приводит оба операнда к общему типу (double),
        // поэтому даже при flag == true получается Double, а не Integer.
        Number n1 = flag ? new Integer(1) : new Double(2.0);
        System.out.println("n1 = " + n1 + " (" + n1.getClass().getSimpleName() + ")");

        // Пример 2: простой случай с null (работает)
        Integer n2 = flag ? 1 : null;

        // Пример 3: вложенный тернарный оператор
        // При flag1 == false и flag2 == false происходит unboxing null → NPE
        Integer n3 = flag1 ? 1 : flag2 ? 2 : null;
        System.out.println("n3 = " + n3); // здесь упадёт
    }

    // Пример 4: метод возвращает double, но пытается вернуть null
    private static final double[] vals = {1.0, 2.0, 3.0};

    public static double getVal(int idx) {
        // Компилируется, но при неверном idx будет NullPointerException
        return (idx < 0 || idx >= vals.length) ? null : vals[idx];
    }
}