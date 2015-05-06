import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class  Main {

    public static void main(String[] args) throws FileNotFoundException {
        String s = "",s1="";
        Scanner in = new Scanner(new File("C:\\Users\\Student\\IdeaProjects\\regexp_lab\\V.txt"));
        while(in.hasNext())
            s += in.nextLine() + "\r\n";
        in.close();
        System.out.println("Исходный текст:");
        System.out.println(s);
        s1=findName(s);
        findNumber(s1);

    }
    public  static String findName(String s){
        String name,s1;
        name = "\\b[А-ЯЁ][а-яё]+\\b";
        s1=s.replaceAll(name,"[censored]");
        //System.out.println(s1);
        return s1;
    }
    public  static void findNumber(String s1){
        String name,s2;
        name = "\\d{7,12}";
        s2=s1.replaceAll(name,"[censored]");
        System.out.println("Итог:");
        System.out.println(s2);
    }

}