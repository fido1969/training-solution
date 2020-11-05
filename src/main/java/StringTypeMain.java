public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        String i = "" + "";
        System.out.println(i);
        System.out.println(i.length());

        String abcde = "Abcde";
        System.out.println("String hossza:" + abcde.length());
        System.out.println(abcde.substring(0, 1) + ", " + abcde.substring(2, 3));
        System.out.println(abcde.charAt(0) + ", " + abcde.charAt(2));
        System.out.println(abcde.substring(0, 2));

    }
}
