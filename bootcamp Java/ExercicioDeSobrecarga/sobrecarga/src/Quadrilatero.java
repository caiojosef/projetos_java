public class Quadrilatero {
    public static void area(double lado){
        System.out.println("A area do Triângulo e: " + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("A area do Retângulo e: " + lado1 * lado2);
    }
    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("A area do Trapézio e: " + (baseMaior * baseMenor) * altura / 2);
    }

}
