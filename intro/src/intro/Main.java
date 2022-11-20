package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		//değişkenler javada camelCase şeklinde yazılır
		String ortaMetin="ilginizi çekebilir";
		String altMetin= "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"veri1","veri2","veri3"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
