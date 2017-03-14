public class Calculate {

public static void main (String [] arg){
	System.out.println("calculate...");
    double first = Double.valueOf(arg[0]);
    String action = arg[1];
    double second = Double.valueOf(arg[2]);

    if(action.equals("+")){
        System.out.println("Sum is...");
        System.out.println(new Calculate().summ(first,second));
        }
    else if(action.equals("-")){
        System.out.println("Diff is...");
        System.out.println(new Calculate().minus(first,second));
    }
    else if(action.equals("*")){
        System.out.println("Mult is...");
        System.out.println(new Calculate().mult(first,second));
    }
    else if(action.equals("/")){
        System.out.println("Devide is...");
        System.out.println(new Calculate().devide(first,second));
    }
    else if(action.equals("^")){
        System.out.println("pow is...");
        System.out.println(new Calculate().sqrt(first,second));
    }

}
private double summ (double a, double b){
    return a+b;
}
private double minus (double a, double b){
    return a-b;
}
private double mult (double a, double b){
    return a*b;
}
private double devide (double a, double b){
    return a/b;
}
private double sqrt (double a, double b){
    int pow = (int)b;
    double res=a;
    for(int i=1;i<b;i++){
        res*=res;
    }
    return res;
}

}

