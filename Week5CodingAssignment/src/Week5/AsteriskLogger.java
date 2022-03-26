package Week5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.print("***" + log + "***");
		System.out.println(" ");
	}


	@Override
	public void Error(String error) {
		for (int i = 0; i < error.length() +13; i ++) {
			System.out.print("*");
		}
		System.out.println(" ");
		System.out.println("***" + "Error: " + error + "***");	
		
		for (int i = 0; i < error.length() + 13; i ++) {
			System.out.print("*");			
		}		
		System.out.println(" ");
	}
	
	
	
}