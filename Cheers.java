
public class Cheers {
        public static void main(String[] args) {
                String Word = args[0];
                int n = Integer.parseInt(args[1]);
                for (int i=0; i< Word.length(); i++) {
                        char letter = Word.charAt(i);
                        System.out.println("Give me a " + letter + " :" + letter + "!");
                }
                System.out.println("What does that spell? ");
                for(int j=0; j<n; j++) {
                        System.out.println( Word + "!");
                        

                }
	    
        }
}
