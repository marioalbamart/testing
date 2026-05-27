package src;

public class calc {
  public static void main(String[] args) {

    // declaracion de variables
    boolean bucle = false;
    StringBuilder num1 = new StringBuilder();
    StringBuilder num2 = new StringBuilder();
    char caseOpt;
    String opt = "null";

    // intro de app
    System.out.println(
        "Bienvenido a mi calculadora.\nIntroduzca dos numeros y un operador.\nEjemplo: 2+2\nPara salir pulse 'q' + enter\n=====================================");

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

        // salida de app
        if (input.charAt(i) == 'q') {
          bucle = true;
          break;
        } else if (input.charAt(i) == ' ') {
          continue;
        }

        // gestion de operadores
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

        // cambio de variable para el input sb
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

      // solucion parse null
      if (bucle == true) {
        break;
      }

      // paso de StringBuilder a string y a double
      Double num1Int = Double.parseDouble(num1.toString());
      Double num2Int = Double.parseDouble(num2.toString());

      // output
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
