package midterm2018;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

//    public static Long getOccurrences(String[] text) {
//        long uniqueWords()
//
//                .flatMap(line -> line.split(" ")))
//                .distinct()
//                .count();
//
//        return uniqueWords;
//
//    }

    public static int grabSumOfValues(String url) {
//        if (url == null || url.length() == 0) {
//            return 0;
//        }

        int singleSlash = url.indexOf("a");
        if (singleSlash == -1) {
            singleSlash = 0;
        } else {
            singleSlash += 1;
        }
        int parseEnd = url.indexOf("="); // grab the end of each equalSign between a and b
        parseEnd = parseEnd > 0 ? parseEnd : url.length();

        int questionMark = url.indexOf("b", parseEnd);
        parseEnd = (questionMark> 0 && questionMark < parseEnd) ? questionMark : parseEnd;

        String fullURL = url.substring(singleSlash, parseEnd);
        int sum = 1;

        for (int i = 0; i < fullURL.length(); i++) {
            sum += Integer.parseInt(String.valueOf(i));
        }

        return sum;
    }

    public static String getHost(String url) {
        if (url == null || url.length() == 0) {
            return "";
        }

        int parseDoubleSlash = url.indexOf("//");
        if (parseDoubleSlash == -1) {
            parseDoubleSlash = 0;
        } else {
            parseDoubleSlash += 2;
        }
        int parseSingleSlash = url.indexOf("/", parseDoubleSlash);
        parseSingleSlash = parseSingleSlash > 0 ? parseSingleSlash : url.length();

        int port = url.indexOf(":", parseDoubleSlash);
        parseSingleSlash = (port > 0 && port > parseSingleSlash) ? port : parseSingleSlash;

        return url.substring(parseDoubleSlash, parseSingleSlash);
    }

//    public static void main(String[] args) {
//
//    }

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
                + "Host: localhost:1298\n"
                + "Connection: keep-alive\n"
                + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
                + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
                + "Referer: http://localhost:1298/\n"
                + "Accept-Encoding: gzip, deflate, br\n"
                + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
                + "    “task” : “inc”,\n"
                + "    “num” : 3\n"
                + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        System.out.println("Answer to Question 1: " + getHost(question1and2));
        System.out.println("Answer to Question 2: " + grabSumOfValues(question1and2));
        System.out.println(question3);
//        System.out.println("Answer to Question 4: " + test0(question4and5));
        System.out.println(question4and5);

        // print each answer at the end

        // Question 1
        // Return the Host

        // Question 2
        // return sum of a and b

        // Question 3
        // convert to java object, increment num, convert back to json and return

        // Question 4
        // return unique words

        // Question 5
        // return 2nd most common word

    }
}
