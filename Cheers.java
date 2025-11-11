
public class Cheers {
    public static void main(String[] args) {
        String name = args[0];
        int times = Integer.parseInt(args[1]);
        String upperName = name.toUpperCase(); 

        for (int i = 0; i < upperName.length(); i++) {
            char c = upperName.charAt(i);
            if ("AEFHILMNORSX".indexOf(c) >= 0) {
                System.out.println("Give me an " + c + ": " + c + "!");
            } else {
                System.out.println("Give me a  " + c + ": " + c + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < times; i++) {
            System.out.println(upperName + "!!!");
        }
    }
}


