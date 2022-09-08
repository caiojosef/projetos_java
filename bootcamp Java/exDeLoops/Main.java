import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        multidimensional();
         //nota();
        //maior();
        //parImpar();
        //tabuada();
        //ordemInversa();
        //consoantes();
        //numAleatorios();

    }

    public static void nota(){
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Digite a nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota Inválida. Digite novamente: ");
            nota = scan.nextInt();

        }
    }

    public static void maior(){
        Scanner scan = new Scanner(System.in);
        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;
        do{
            System.out.println("Digite um número para somar: ");
            numero = scan.nextInt();
            contador++;

            if(numero > maior){
                maior = numero;
            }

            soma = soma + numero;

        }while(contador < 5 );
        System.out.println(+ soma);
        System.out.println("O número maior é: "+ maior);
        System.out.println("A média dos valores é: " + (numero / 5));
    }

    public static void parImpar(){
        Scanner scan = new Scanner(System.in);

        int par = 0;
        int impar = 0 ;
        int numero;

        do {
            System.out.println("Digite os números e para encerrar digite 0: ");
            numero = scan.nextInt();
            if(numero % 2 == 0){
                par++;
            }else {
                impar++;
            }
        }while(numero != 0);

        System.out.println("Números pares: " +par);
        System.out.println("Números ímpar " +impar);
    }

    public static void tabuada(){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        int numero = 0;
        int cont = 0;
        int continuar = 0;

        while(continuar != 1){
            System.out.println("Qual tabuada você deseja fazer? Para sair digite 1");
            continuar = scan.nextInt();

            for(i = 1; i <= 10; i++){
                System.out.println(continuar + " X " + i + " = " + (continuar * i));
            }

        }

    }

    public static void ordemInversa(){


        int count = 0;

        int[] vetor = {1, -5, 10, 50, 20, 25};
        System.out.print("Vetor: ");
        while(count <= (vetor.length-1)){

            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }

    public static void consoantes(){
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadesConsoantes = 0;
        int count = 0;

        do{
            System.out.print("letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") |
                 letra.equalsIgnoreCase("e") |
                 letra.equalsIgnoreCase("i") |
                 letra.equalsIgnoreCase("o") |
                 letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;
                quantidadesConsoantes++;
            }
            count++;
        }while(count < consoantes.length);

        System.out.print("Consoantes: ");
        for(String consoante : consoantes){
            if(consoante != null)
            System.out.print(consoante + " ");
        }
    }

    public static void numAleatorios(){

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++){
            int numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;

        }
        System.out.print("Números Aleatórios: ");
        for (int numeros : numerosAleatorios) {

            System.out.print(numeros + " ");

        }
        System.out.print("\nNúmeros Aleatórios: ");
        for (int numeros : numerosAleatorios) {

            System.out.print((numeros+1) + " ");

        }
    }

    public static void multidimensional(){
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){
            for(int j = 0; i < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");

            }
        }
    }

}

