import java.util.Scanner;
/*
 * El codigo realiza pide dos entradas de texto, una por cada jugador, cada jugador debe escribir una de las 3 palabras, piedra, papel o tijeras
 * Una vez introducidas las palabras se procede a realizar una validación de los datos introducidos, se comparan las palabras, si son iguales se imprime el mensaje empate, en caso contrario
 * se entra en un switich el cuál contiene casos para los posibles escenarios, dependiendo del caso se guarda en una variable el número del judor ganador y se imprime al terminar el switch
 */
public class Ejercicio4 {
    //Se agrega el metodo main
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in); //Se agrega dentro de los parametros System.in
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    //Se elimino la declaracion de otro objeto Scanner
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          } //se agrega esta linea para cerrar el if

        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
      }
      System.out.println("Gana el jugador " + g);
    }
    s.close();
  }
}
    