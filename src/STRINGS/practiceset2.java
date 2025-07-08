package STRINGS;

public class practiceset2 {
    public static void main(String[] args) {
        // problem 1-  replace space with underscore
        String st="to lower case";
        st=st.replace(" ","_");
        System.out.println(st);
        // problem 2- fill letter="dear <|name|>,"
        String letter="Dear <|name|>,Thanks a lot";
        letter= letter.replace("<|name|>","yogesh");
        System.out.println(letter);
        // 
    }
}
