
public class Cheers {
    public static void main(String[] args) {
        String name = args[0];
        int times = Integer.parseInt(args[1]);

        for (int i = 0; i < name.length(); i++) {
                 char c = name.charAt(i);
                 if ("AEFHILMNORSX".indexOf(c) >= 0) {
                         System.out.println("Give me an " + c + ": " + c + "!");
                        } else {
                                System.out.println("Give me a " + c + ": " + c + "!"); }
        }
        System.out.println("What does that spell?");

        for (int i = 0; i < times; i++) {
            System.out.println(name + "!!!");
        }
    }
}

