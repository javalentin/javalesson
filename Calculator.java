import java.util.Scanner;

/**
 * Created by root on 14.03.17.
 */
public class Calculator {

    public static void main (String [] arg ){

        Scanner scanner = new Scanner(System.in);
        String contine = "no";
        Calculate calc = new Calculate();
        while (!contine.equals("yes")){
                    String a = "";
                    String b = "";
                    if(calc.memory ==0){
                        System.out.println("Type first num:");
                        a = scanner.next();
                    }
                    else{
                        System.out.println("Type first num or \"m\" to use saved value:");
                        a = scanner.next();
                        if(a.equals("m")) a = String.valueOf(calc.getMemoryValue());
                    }
                    System.out.println("Select action(+ - * /):");
                    String act = scanner.next();

            if(calc.memory ==0){
                System.out.println("Type second num:");
                b = scanner.next();
            }
            else{
                System.out.println("Type first num or \"m\" to use saved value:");
                b = scanner.next();
                if(b.equals("m")) b = String.valueOf(calc.getMemoryValue());
            }



                    switch (act){
                        case "+":
                            calc.add(Double.valueOf(a),Double.valueOf(b));
                            System.out.println("result: " + calc.getResult());
                            break;
                        case "-":
                            calc.diff(Double.valueOf(a),Double.valueOf(b));
                            System.out.println("result: " + calc.getResult());
                            break;
                        case "*":
                            calc.mult(Double.valueOf(a),Double.valueOf(b));
                            System.out.println("result: " + calc.getResult());
                            break;
                        case "/":
                            calc.devide(Double.valueOf(a),Double.valueOf(b));
                            System.out.println("result: " + calc.getResult());
                            break;
                        default: System.out.println("unknown act");

                    }
                    System.out.println("Save result?(y/n)");
                    String answer = scanner.next();

                    switch (answer){
                        case "y": calc.saveResult();
                                    break;
                        case "n": calc.clearResult();
                                    calc.clearMemory();
                                    break;
                        default:  calc.saveResult();
            }

                    System.out.println("to breake? (yes/no):");
                    contine = scanner.next();


        }
        scanner.close();
    }
}
