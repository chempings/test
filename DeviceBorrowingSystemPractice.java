import java.util.Scanner;
import java.util.InputMismatchException;

public class DeviceBorrowingSystemPractice{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter device code: ");
			int deviceCode = scanner.nextInt();

			System.out.print("Enter borrowing duration: ");
			int durationHours = scanner.nextInt();
			if (durationHours < 1 || durationHours > 8){
				throw new InvalidHoursException("Invalid hours.");
			};

			String deviceName = getDevice(deviceCode);

			System.out.println("Success!");
		} catch (InputMismatchException e) {
			System.out.println("Please enter appropriate integer value.");
		} catch (InvalidHoursException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		} finally{
			scanner.close();
		};
	}

	public static String getDevice(int code){
		switch(code){
			case 201: return "keyboard";
			case 202: return "mouse";
			default: throw new IllegalArgumentException("Error Invalid Device Code");	
		}
	}

	
}
class InvalidHoursException extends Exception {
		public InvalidHoursException(String message){
			super(message);
		};
}