package src;

public class calc {
  public static void main(String[] args) {

    String input = "null";

    System.out.println(
        "Bienvenido a mi calculadora \nPara usar la calculadora debes de introducir los numeros en una sola linea: \nEjemplo: 2+2*4");
    while (!input.equals("quit")) {
      input = IO.readln();
      if (input.equals("quit")) {
        break;
      }

    }
  }
}
