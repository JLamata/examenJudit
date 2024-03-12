import java.util.Scanner;

public class Prueba4 {
	//Atributos
	private int numPrueba;
	//Constructor
	public Prueba4(){
		this.numPrueba=4;
	}
	//Setter
	public void setNumPrueba() {
		Scanner scanner = new Scanner (System.in);
		this.numPrueba=scanner.nextInt();
		}