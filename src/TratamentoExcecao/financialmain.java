package TratamentoExcecao;

public class financialmain {

    //logica de negocio nao deve estar junto com o programa principal
    //regras de negocio nao deve estar na mesma aplicacao de interacao com tela
    //regras de negocio deve estar oculta

    public static void main(String[] args) {

        double valortotal =1000.00;
        double entrada = 100.00;
        int parcela = 5;


        try {
            Financiamento f = new Financiamento (valortotal, entrada, parcela);
            System.out.println(f.prestacao());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
}
