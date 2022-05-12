import java.util.Locale;
import java.util.StringJoiner;

public class Kata {

    public static void main(String[] args) {
        String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        System.out.println(meeting(s));

    }


    public static String meeting(String s) {
        String[] split = s.split(";");
        StringJoiner stringJoiner = new StringJoiner("");
        int c = split.length - 1;
        boolean b = true;
        for (int i = c; i >= 0; i --) {
            String[] split1 = split[i].split(":");
            String s1 = split1[1];
            String s2 = split1[0];
            stringJoiner.add("(" + s1.toUpperCase(Locale.ROOT));
            stringJoiner.add(", " + s2.toUpperCase(Locale.ROOT) + ")");


        }
        return stringJoiner.toString();
    }
}