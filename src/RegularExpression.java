import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        /**
         * 1st way of checking.
         */
        // 1st make a Pattern class object and compile a string into regular expression.
        Pattern pattern = Pattern.compile(".s");

        //Make a Matcher class object and pass the desired sting to check.
        Matcher matcher = pattern.matcher("as");
        boolean result1 = matcher.matches();
        System.out.println(result1);

        //2nd way of doing.
        boolean result2 = Pattern.matches("...s", "aaas");
        System.out.println(result2);

        boolean abc = Pattern.matches("[a-z0-9&&[^A-Z]]+", "1Aac");
        System.out.println("abc " + abc);


        /**
         * some famous regular expression patterns.
         */

        /*
        1.MOBILE NUMBER(94123455678)
        pattern: ^[987]{1}[0-9]{9}$
        */
        boolean result3 = Pattern.matches("^[987][0-9]{9}$", "9412325438");
        System.out.println("result3: " + result3);



        /*
        2. EMAIL ADDRESSES(ex-abcd@gmail.com) */
        // pattern: ^[a-z0-9_.]+[@][a-z]+\.[a-z]{2,4}
        boolean result4 = Pattern.matches("^[a-z0-9_.]+[@][a-z]+\\.[a-z]{2,4}$", "a.b_cd@gmail.com");
        System.out.println("result4 " + result4);


        /* 3. USER NAME (ex- kul.deep_506)
          Pattern: ^[a-zA-Z0-9_.]{4,8}$
         */
        boolean result5 = Pattern.matches("^[a-z0-9_.]{4,}$", "kul.deep_506");
        System.out.println("result5 " + result5);

        /* 4. URL (ex- https://www.google.com)
         pattern: ^(http|https):[///][www.][A-Za-z-0-9]+[.][a-z]{2,3}$
         */
        boolean result6 = Pattern.matches("^(https|ftp|file)://[A-Za-z-0-9!@#$%&*+:'<,|.]*[A-Za-z-0-9]{2,3}$", "https://www.google.com");
        System.out.println("result6 " + result6);
    }
}
