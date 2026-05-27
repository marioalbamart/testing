package src;

public class calc {
  public static void main(String[] args) {

    /*
     * String a = "123";
     * int b = Integer.parseInt(a);
     * System.out.println(b);
     */

    // declaracion de variables
    boolean bucle = false;
    StringBuilder num1 = new StringBuilder();
    StringBuilder num2 = new StringBuilder();
    char caseOpt;
    String opt = "null";

    // intro de app
    System.out.println(
        "Bienvenido a mi calculadora.\nIntroduzca dos numeros y un operador.\nEjemplo: 2+2\nPara salir pulse 'q' + enter\n===========================");

    while (bucle != true) { // bucle encargado de mantener la app ejecutandose

      // reset a cero variables.
      caseOpt = 'a';
      num1 = new StringBuilder();
      num2 = new StringBuilder();

      String input = IO.readln(); // Entrada de la operación ej(2+2)

      // bucle encargado de gestionar los inputs dependiendo de cual sea el tipo de
      // entrada.
      // digit alphabet ...
      for (var i = 0; i < input.length(); i++) {

        if (input.charAt(i) == 'q') {
          bucle = true;
          break;
        } else if (input.charAt(i) == ' ') {
          continue;
        }

        switch (input.charAt(i)) {
          case '+':
            opt = "sum";
            caseOpt = 'b';
            break;

          case '-':
            opt = "res";
            caseOpt = 'b';
            break;

          case '/':
            opt = "div";
            caseOpt = 'b';
            break;

          case '*':
            opt = "mul";
            caseOpt = 'b';
            break;

          default:
            break;
        }

        switch (caseOpt) {
          case 'a':
            if (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.') {
              num1.append(input.charAt(i));
            }
            break;

          case 'b':
            if (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.') {
              num2.append(input.charAt(i));
            }

          default:
            break;
        }

      }

      if (bucle == true) {
        break;
      }

      Double num1Int = Double.parseDouble(num1.toString());
      Double num2Int = Double.parseDouble(num2.toString());

      switch (opt) {
        case "sum":
          System.out.println(num1Int + num2Int);
          break;

        case "res":
          System.out.println(num1Int - num2Int);
          break;

        case "mul":
          System.out.println(num1Int * num2Int);
          break;

        case "div":
          System.out.println(num1Int / num2Int);
          break;

      }
    }
  }
}
