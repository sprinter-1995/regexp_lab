import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class  Main {

    public static void main(String[] args) throws FileNotFoundException {
        String s = "";
        Scanner in = new Scanner(new File("C:\\Users\\Student\\IdeaProjects\\regexp_lab\\V.txt"));
        while(in.hasNext())
            s += in.nextLine() + "\r\n";
        in.close();
        System.out.println(s);
        findName(s);

    }
    public  static void findName(String s){
        String name,s1;
        name = "\\b[А-ЯЁ][а-яё]+\\b";
        s1=s.replaceAll(name,"[censored]");
        System.out.println(s1);
    }


}