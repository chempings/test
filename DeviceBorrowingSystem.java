import java.util.InputMismatchException;
import java.util.Scanner;


public class DeviceBorrowingSystem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		try{
			System.out.print("Enter device code: ");
			int code = scanner.nextInt();

			System.out.print("Enter borrowing hours: ");
			int duration = scanner.nextInt();

			if(duration < 1 || duration > 6){
				throw new InvalidDurationException("Error: Borrowing duration must be between 1 and 6 hours.");
			}

			String deviceName = getDeviceName(code);

			System.out.println("\nDevice: " + deviceName);
			System.out.println("Borrowing Hours: " +  duration);
			System.out.println("Status: Request Accepted.");
		} catch (InputMismatchException e){
			System.out.println("Error: Please Enter Integer Numeric Value.");
		} catch (InvalidDurationException e){
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		finally{
			scanner.close();
		}
	}
	public static String getDeviceName(int code){
	switch(code){
	case 201: return "Keyboard";
	case 202: return "Mouse";
	case 203: return "Headset";
	case 204: return "Webcam";
	default:
		throw new IllegalArgumentException("Error: Invalid Device Code.");
	}
	}
}

class InvalidDurationException extends Exception{
	public InvalidDurationException(String message){
		super(message);
	}
}
