// Computes an approximation of PI.
public class CalcPi {		
	public static void main(String [] args) { 
		int n = Integer.parseInt(args[0]);
		double Estimate = 0.0;
		for (int x = 0 ; x < n; x++) {
			if (x % 2 == 0) { 
				Estimate = Estimate + 1.0 / (2 * x + 1);
			} else {
				Estimate = Estimate - 1.0 / (2 * x + 1);
			}	
	}
	System.out.println("pi according to Java: " + Math.PI);     
	System.out.println("pi, approximated:    " + 4.0 * Estimate);
}

	}
