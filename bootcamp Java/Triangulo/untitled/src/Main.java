public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício Retorno\n");
        double areaQuadrado = Equilatero.area(3);
        System.out.println("Area do Quadrado: " +areaQuadrado);

        double areaRetangulo = Equilatero.area(5,5);
        System.out.println("Area do Retangulo: "+ areaRetangulo);

        double areaTrapezio = Equilatero.area(7, 8, 9);
        System.out.println("Area do Trapezio: "+ areaTrapezio);

    }
}