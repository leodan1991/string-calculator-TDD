package UnitTest;

import Calculator.Operation;

public class UnitTestCalculator {
	
	public Boolean testCalculatorStep1(){
		
		Operation op = new Operation();
		
		String representante1 = "";
		String representante2 = "1,2,3,4.5";
		Boolean test1 = false;
		Boolean test2 = false;

		
		//Valida caso 1:Cadena vacia
		String resultado = op.add(representante1);
		if (resultado.trim().equals("0")) {
			test1 = true;
		}
		
		//Valida caso 2: Caso Valido
		String[] valores = representante2.split(",");
		
		try {
			for(String valor:valores){
				double valorD = Double.parseDouble(valor);
			}
			
			if(op.add(representante2).equals("10.5")) {
				test2 = true;
			}
			
		}catch(NumberFormatException nfe) {
			test2 = false;
		}

		
		return (test1 && test2);
	}
	
	public static void main(String []args) {
		
		UnitTestCalculator utc = new UnitTestCalculator();
		
		boolean resultadoTest = utc.testCalculatorStep1();
		
		if(resultadoTest) {
			System.out.println("Prueba exitosa");
		}else {
			System.out.println("Prueba no exitosa. Pasa a RH");
		}
		
	}

}
