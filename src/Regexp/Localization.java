package Regexp;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Localization {
    public static void main(String[] args) {
        /// Local
//        Locale locale = Locale.GERMANY;
//        Locale locale1 = Locale.getDefault();
//        System.out.println(locale1);
//        Locale locale2 = new Locale("be");
//        Locale locale3 = new Locale("be","eng");
//        Locale.setDefault(locale3);
//        System.out.println(locale3);
//        System.out.println(locale);



        /// NumberFormat
//        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMAN);
//        String source = "1.234,567";
//        NumberFormat numberFormatUs = NumberFormat.getInstance(Locale.US);
//        NumberFormat numberFormatFr = NumberFormat.getInstance(Locale.FRANCE);
//        try {
//            double number = numberFormat.parse(source).doubleValue();
//            System.out.println(number);
//            String resultUs = numberFormatUs.format(number);
//            System.out.println("US " + resultUs);
//            String resultFr = numberFormatUs.format(number);
//            System.out.println("Fr " + resultFr);
//
//            double numberUs = numberFormatUs.parse(source).doubleValue();
//            System.out.println("US(parse) " + numberUs);
//            double numberFr = numberFormatFr.parse(source).doubleValue();
//            System.out.println("FR(parse) " + numberFr);
//
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }


        /// DateFormat
        //  DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.MEDIUM, new Locale("fr","FR"));
//        String dataStr = dateFormat.format(new Date());
//        System.out.println(dataStr);

//        try {
//            Date date = dateFormat.parse("lundi 31 juillet 2023, 21:07:41");
//            System.out.println(date);
//            DateFormat dateFormatCa = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, Locale.CANADA);
//            System.out.println(dateFormatCa.format(date));
//            DateFormat dateFormatUk = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, Locale.FRANCE);
//            System.out.println(dateFormatUk.format(date));
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }



        //// Password hashing
        String unencrypted = "very_Strong_pass1";
        byte[] bytes = null;
//        Base64.Encoder encoder = Base64.getEncoder();
//        bytes = encoder.encode(unencrypted.getBytes());
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(unencrypted.getBytes("UTF-8"));
            bytes = messageDigest.digest();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        BigInteger bigInteger = new BigInteger(1, bytes);
        String encrypted = bigInteger.toString(16);
        System.out.println(encrypted);
    }
}
