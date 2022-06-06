import java.text.NumberFormat;

public class NumberFormatFeatures {

    public static String getCompactNumberFormat(int i){
        return NumberFormat.getNumberInstance().format(i);
    }
}
