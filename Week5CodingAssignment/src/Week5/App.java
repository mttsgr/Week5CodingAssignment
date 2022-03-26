package Week5;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Bananas");
		logger.Error("Oranges");
		
		Logger secondLogger = new SpacedLogger();
		
		secondLogger.Log("Apples");
		secondLogger.Error("Pineapples");
	}
		

	}

