public class TimeCalc {
    public static void main(String[] args) {
        String[] parts = args[0].split(":");
		int hours = Integer.parseInt(parts[0]);
		int minutes = Integer.parseInt(parts[1]);
		int minutesadd = Integer.parseInt(args[1]);
		int Total = (hours * 60 + minutes + minutesadd);
		int newhours = (Total / 60) % 24;
		int newminutes = Total % 60;
        if (newhours < 10) {
            System.out.print("0" + newhours + ":");
         } else {
            System.out.print(newhours + ":");
         }
        if (newminutes < 10) {
            System.out.println(newhours + ":0" + newminutes);
         } else { 
            System.out.println(newhours + ":" + newminutes);
   }
}
}
