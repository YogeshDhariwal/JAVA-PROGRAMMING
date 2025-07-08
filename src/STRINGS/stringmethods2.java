package STRINGS;

public class stringmethods2 {
    public static void main(String[] args) {
        String name="yogesh";
        String lastname=" dhariwal";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.indexOf('g'));
        System.out.println(name.concat(lastname));
        System.out.println(name.trim());// used to remove spaces from the string gave new string
       String st="dhariwar";
        System.out.println(st.substring(4));// print string starting from given index to last
        System.out.println(st.substring(0,4));// 4 not include
        System.out.println(st.replace('d','m'));
        System.out.println(st.startsWith("ar"));
        System.out.println(st.endsWith("wal"));
        System.out.println(st.charAt(2));
        System.out.println(st.indexOf("h",7));// start searching from 2 index
        System.out.println(st.lastIndexOf("ar",3));
        System.out.println(st.lastIndexOf("ar",7));//** from means in that string onl
        System.out.println(name.equals("yogesh"));
        System.out.println(name.equalsIgnoreCase("YOGESH"));
        // ESCAPE SEQUENCE
        System.out.println("my name is \"yogesh\"");
    }
}
