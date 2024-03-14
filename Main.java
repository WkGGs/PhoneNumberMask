import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        String phoneNumber = new String("+7(994)436 67-92");
        if(checkNumber(phoneNumber)){
            System.out.println(maskPlacer(phoneNumber.replaceAll("[ ()-]", "")));
        }
    }
    static boolean checkNumber(String number){
        Pattern phoneNumberCheck = Pattern.compile("\\+?[78][ (]?\\d{3}[ )]?\\d{3}[ -]?\\d{2}[ -]?\\d{2}"); //
        Matcher m = phoneNumberCheck.matcher(number);
        return (m.matches());
    }
    static String maskPlacer(String number){
        String maskedNumber = number.substring(0,number.length()-10) + "******" + number.substring(number.length()-4);
        return(maskedNumber);
    }
}