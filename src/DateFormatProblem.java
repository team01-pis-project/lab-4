import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatProblem {

    // Плохо: один общий экземпляр на все потоки
    private static final DateFormat format =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getDate() {
        return format.format(new Date());
    }

    public static void main(String[] args) {
        System.out.println(getDate());
    }
}