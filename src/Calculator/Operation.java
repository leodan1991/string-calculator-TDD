package Calculator;

public class Operation {
	
	public String add(String valores) {
		
		String cadena = "";
		if (valores.trim().equals("")) {
			cadena = "0";
		}else {
			String[] valoresArray = valores.split(",");
			double suma = 0;
			for(String valor:valoresArray){
				double valorD = Double.parseDouble(valor);
				suma += valorD;
			}
			cadena = suma+"";
		}
		
		return cadena;
		
	}
	


}
