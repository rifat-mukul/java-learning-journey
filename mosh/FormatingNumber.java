import java.text.NumberFormat;

public class FormatingNumber {
    public static void main(String[] args) {
        // 123456789 --> $123,456,789
        // 0.1 --> 10%
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123587946.25);
        System.out.println(result);
        // make prcent
        NumberFormat parcent = NumberFormat.getPercentInstance();
        String rssultOne = parcent.format(0.1);
        System.out.println(rssultOne);
        // comprsee code 
        String resultThree = NumberFormat.getPercentInstance().format(0.23);
        System.out.println(resultThree);
    }
}
