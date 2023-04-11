package co.uptc.edu.git.app;

public class Application {
    private static void emeneses() {
        System.out.println("Hello Edgar Meneses");
    }
    
    public static void conversionNumFabian (int number){
		  String result = "";
		  int thousands = number/1;
		  int hundreds = number /10;
		  int tens = number/100;
	      int units = number/1000;
		  result += "\n milesimas \n" + thousands + "\n centenas \n" + hundreds + "\n decenas \n" + tens + "\n unidades \n" + units; 
		  System.out.println(result); 
	  }
    public static void main(String[] args) {
        emeneses();
        conversionNumFabian(5);
    }
}