import java.util.Scanner;

public class PellSequenceGenerator{
	public static int getPellNumber(int n){
		if (n == 0) return 0;
		if (n == 1) return 1;

		return 2 * getPellNumber(n - 1) + getPellNumber(n - 2);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		if (n<0) {
			System.out.println("Error. Please enter a non-negative integer.");
		} else {
			int result = getPellNumber(n);
			System.out.println("Pell number at position " + n + ": " + result);
		}
		scanner.close();
	}
}



// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class PellSequenceGenerator {

//     public static int getPellNumber(int n) {
//         if (n == 0) return 0;
//         if (n == 1) return 1;
//         return 2 * getPellNumber(n - 1) + getPellNumber(n - 2);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         try {
//             System.out.print("Enter n: ");
//             int n = scanner.nextInt();

//             if (n < 0) {
//                 System.out.println("Error. Please enter a non-negative integer.");
//             } else if (n > 30) {
//                 System.out.println("Error: Input is too large! Numbers above 30 will overflow and crash recursive memory.");
//             } else {
//                 int result = getPellNumber(n);
//                 System.out.println("Pell number at position " + n + ": " + result);
//                 System.out.println();

//                 System.out.println("The sequence begins:");
                
//                 System.out.print("n\t");
//                 for (int i = 0; i <= n; i++) {
//                     System.out.print(i + "\t");
//                 }
//                 System.out.println();

//                 System.out.print("P(n)\t");
//                 for (int i = 0; i <= n; i++) {
//                     System.out.print(getPellNumber(i) + "\t");
//                 }
//                 System.out.println();
//             }

//         } catch (InputMismatchException e) {
//             System.out.println("Error. Please enter a valid whole number.");
//         } finally {
//             scanner.close();
//         }
//     }
// }

















// import java.util.Scanner;
// import java.math.BigInteger;
// import java.util.HashMap;

// public class PellSequenceGenerator {
    
//     // A simple memory cache to remember past answers
//     private static HashMap<Integer, BigInteger> cache = new HashMap<>();

//     public static BigInteger getPellNumber(int n) {
//         // 1. Base Cases
//         if (n == 0) return BigInteger.ZERO;
//         if (n == 1) return BigInteger.ONE;

//         // 2. Memory Check: If we already solved this before, return it instantly!
//         if (cache.containsKey(n)) {
//             return cache.get(n);
//         }

//         // 3. Your Original Recursive Formula: 2 * P(n-1) + P(n-2)
//         BigInteger result = getPellNumber(n - 1).multiply(BigInteger.valueOf(2)).add(getPellNumber(n - 2));

//         // 4. Save the answer in memory for next time
//         cache.put(n, result);

//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter n: ");
//         int n = scanner.nextInt();

//         if (n < 0) {
//             System.out.println("Error. Please enter a non-negative integer.");
//         } else {
//             BigInteger result = getPellNumber(n);
//             System.out.println("Pell number at position " + n + ": " + result);
//         }
//         scanner.close();
//     }
// }
