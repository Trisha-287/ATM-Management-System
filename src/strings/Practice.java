package strings;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String s = "welcome";
        System.out.println(s);
        //length()--return length of astring (number of character)
        int l = s.length();
        System.out.println(l);//7
        //appliy direct value
        System.out.println("welcome".length());//7
        //concat()--joing strings
        String s1 = "welcome";
        String s2 = "java";
        String s3 = "python";
        System.out.println(s1 + s2);//welcomejava
        System.out.println(s1.concat(s2));//welcomejava
        System.out.println(s1 + s2 + s3);//welcomejavapython
        System.out.println(s1.concat(s2).concat(s3));//welcomejavapython
        //another waqy this is also combination of concat and +
        System.out.println(s1.concat(s2 + s3));//welcomejavapython
        //directly concate values
        System.out.println("welcome" + "java");//welcomejava
        System.out.println("welcome".concat(s2 + s3));//welcomejavapython

        //trim()-remove sapace right and left side
        s = "   welcome    ";
        System.out.println(s.length());//14
        System.out.println(s);//   welcome
        System.out.println(s.trim());//welcome
        System.out.println(s.trim().length());//7
        //charAt()-- returns a character  from a string based on index
        //index start from zero
        s = "rani";
        System.out.println(s.charAt(3));//i
        //contains()--return true/false
        System.out.println(s.contains("ra"));//true
        System.out.println(s.contains("RA"));//false
        //equals() equalsignorecase()-compare strings
        s1 = "rani";
        s2 = "rani";
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s));//trye
        System.out.println(s1.equalsIgnoreCase("Rani"));//true
        System.out.println(s1.equals("Rani"));//false
//replace()-replce single/multiple(sequence)of charcters of a string
        s = "welcone to java in my ee expnain this concept";
        System.out.println(s.replace('e', 'x'));//wxlconx to java in my xx xxpnain this concxpt
        System.out.println(s.replace("java", "python"));//welcone to python in my ee expnain this concept
        //substring()-extract substring from the main string
        //starting index -0
        //ending index -1
        s = "ramalakshmi";
        System.out.println(s.substring(1, 5));//amal
        System.out.println(s.substring(0, 1));
        //to upeer case()  to lower case()
        System.out.println(s.toLowerCase());//ramalakshmi
        System.out.println(s.toUpperCase());//RAMALAKSHMI
        //split()-- split the string into mmultiple parts based on delimeter
        //delimeter--0,@.space
        s="abc123@.com";
        System.out.println(s.toUpperCase());//RAMALAKSHMI
        System.out.println(s.substring(1,4));//abc1
        System.out.println(s.split("@"));


    }
}
