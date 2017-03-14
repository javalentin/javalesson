public class Calculate {

   double result;
   double memory;

public static void main (String [] arg){


}

public void add (double ... a){
    for (Double b: a){
     this.result+=b;
    }
}
public void mult (double ...a){
    this.result = 1;
    for (Double d: a){
        this.result*=d;
    }
}
public void devide (double ... a){

        this.result = a[0]/a[1];

}
public void diff (double ... a){
    this.result = a[0]-a[1];

}
public double getResult(){
    return this.result;
}
public void clearResult(){this.result=0;}
public void saveResult(){this.memory = this.result;}
public double getMemoryValue(){
    return this.memory;
}
public void clearMemory(){this.memory = 0;}


}

