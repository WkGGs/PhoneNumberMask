import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        String phoneNumber = new String("89944366792");
        System.out.println(checkNumber(phoneNumber));
        System.out.println("Вова, я наконец-то пришле в себя и справился с этим говном");
        if(checkNumber(phoneNumber)){
            System.out.println(maskPlacer(phoneNumber));
        }
    }
    static boolean checkNumber(String number){
        Pattern phoneNumberCheck = Pattern.compile("\\+?[78][ (]?\\d{3}[ )]?\\d{3}[ -]?\\d{2}[ -]?\\d{2}"); //
        Matcher m = phoneNumberCheck.matcher(number);
        return (m.matches());
    }
    static String maskPlacer(String number){
        String maskedNumber = new String();
        if(number.length() == 11){
            maskedNumber = number.substring(0, 1) + "******" + number.substring(7);
        }
        if(number.length() == 12){
            maskedNumber = number.substring(0, 2) + "******" + number.substring(8);
        }
        else{
            return ("неправильный номер");
        }
        return(maskedNumber);
    }
}