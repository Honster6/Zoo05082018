package programCompliler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramCompiler {
    public static void main(String[] args) {
        Pattern compile = Pattern.compile("(\\d+)\\s+(\\S+)\\s+(.*)");
        Matcher matcher = compile.matcher("12 PRINT Hello World");
        System.out.println(matcher);
        if(matcher.find()) {
            String group2 = matcher.group(0);
            String group = matcher.group(1);
            String group1 = matcher.group(2);
            System.out.println(group);
            System.out.println(group1);
            System.out.println(group2);
        }

    }
}




