public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício de Controle de Fluxo");
        ifSemFlecha();
        ferias();
        ifMenor();
    }

    public static void ifSemFlecha(){
            int mes = 11;

            if(mes == 1) {
                System.out.println("Janeiro");
            }else if( mes == 2){
                System.out.println("Fevereiro");
            }else if( mes == 3){
                System.out.println("Março");
            }else if( mes == 4){
                System.out.println("Abril");
            }else if( mes == 5){
                System.out.println("Maio");
            }else if( mes == 6){
                System.out.println("Junho");
            }else if( mes == 7){
                System.out.println("Julho");
            }else if( mes == 8){
                System.out.println("Agosto");
            }else if( mes == 9){
                System.out.println("Setembro");
            }else if( mes == 10){
                System.out.println("Outubro");
            }else if( mes == 11){
                System.out.println("Novembro");
            }else if( mes == 12){
                System.out.println("Dezembro");
            }else{
                System.out.println("Mês Indefinido");
            }

    }

    public static void ferias(){
        String mes = "Julho";

        switch(mes){
            case "Julho":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Inválido");
                break;
        }
    }

    public static void ifMenor(){

        double salarioMensal = 11893.58;
        double mediaSalario = 10500;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if((salarioBaixo) && (muitosDependentes)){
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if(recebeAuxilio){
            System.out.println("Funcionário deve receber auxílio");
        }else{
            System.out.println("Funcionário não deve receber auxílio");
        }
    }

}

