import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        //   Pattern
        Pattern pattern = Pattern.compile("java");
        String[] res =  pattern.split("dfjavalk-- yeah",2);
        System.out.println(Arrays.toString(res));
        System.out.println(Pattern.matches("y?z","yz"));

        // Matcher
        String mailRegex = "\\w{6,}@\\w+\\.\\p{Lower} {2,4}";
        String input = "e-mail's:blinov@gmail.com, romanchik@@bsu.by!";
        Pattern pattern1 = Pattern.compile(mailRegex);
        Matcher matcher = pattern1.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.group());
            System.out.println(matcher.end());
        }
        Pattern pattern2 = Pattern.compile("e-mail");
        Matcher matcher2 = pattern2.matcher(input);
        System.out.println(matcher2.lookingAt());
        System.out.println(matcher2.matches());


        /// Groups
        input = "java";
        String regex = "([a-z]*) ([a-z]+)";
        Pattern pattern3 = Pattern.compile(regex);
        Matcher matcher3 = pattern3.matcher(input);
        if (matcher3.matches()){
            System.out.println("main group: " + matcher3.group()); //eq . group(0)
            System.out.println("main group 1: " + matcher3.group(1));
            System.out.println("main group 2: " + matcher3.group(2));
        }else {
            System.out.println("Nothing");
        }
        System.out.println(matcher3.groupCount());
    }
}
