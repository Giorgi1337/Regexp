import java.util.Arrays;

public class RegexpChapter1 {
    public static void main(String[] args) {
        /*
             \\ d - one digit
             \\ w - one letter

             + - 1 or more
             * - 0 or more
             ? - 0 or 1 characters before

             (a|b|c) - one from few
             [a-zA-Z] - all possible characters
             [^abc] - everything except abc

             . - any characters

             {2}  - 2 characters before (\\d{2})
             {2, } - 2 or more characters (\\d{2,})
             {2, 4} - between 2 and 4 characters (\\d{2,4})
         */

        String a = "-123";
        String b = "1232";
        String c = "+456";

        System.out.println(c.matches("([-+])?\\d*"));

        String d = "H1234";

        System.out.println(d.matches("\\w[a-zA-Z\\d+]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url1 = "https://www.google.com";
        String url2 = "https://www.twitch.com";
        System.out.println(url1.matches("https://www\\..+\\.(com|tv)"));
        System.out.println(url2.matches("https://www\\..+\\.(com|tv)"));

        String f =  "1235";
        System.out.println(f.matches("\\d{2,4}"));

       // https://regexlib.com/?AspxAutoDetectCookieSupport=1

        String h = "Who.is.there?";

        String[] words = h.split("\\.");
        System.out.println(Arrays.toString(words));

        String t = "New1231234text12313here";
        String modified = t.replaceAll("\\d+","--");
        String modifiedFirst = t.replaceFirst("\\d+","|");
        System.out.println(modified);
        System.out.println(modifiedFirst);
    }
}