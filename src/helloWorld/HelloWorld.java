package helloWorld; //línea

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("");
        saludar();
        saludar2("Hello world como parametro!!");
        int res = sumar(3, 4);
        saludar(String.valueOf(res));
    }
    
    public static void saludar(){
        System.out.println("Hello world desde saludar!");
        System.out.print("");
    }
    public static void saludar2(String mensaje){
        System.out.println(mensaje);
    }
    public static void saludar(String mensaje){
        System.out.println(mensaje);
    }
    
    public static int sumar(int a,int b){
        String c1="",c2="";
        if(c1.equals(c2)){
            //Cadenas iguales
        }
        return a+b;
    }
}
