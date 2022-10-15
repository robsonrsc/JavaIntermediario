package TratamentoExcecao;

public class Financiamento {

    public double valortotal;
    public double entrada;
    public Integer parcela;

    public  Financiamento (double valortotal, double entrada, Integer parcela){

        if (entrada< valortotal*0.2){

           throw new RuntimeException("Valor requerido de no minimo 20% de entrada");
        }
        else if (parcela<6){
            throw new RuntimeException("O minimo de parcelas e 6, favor reconsiderar");
        }

        this.valortotal = valortotal;
        this.entrada = entrada;
        this.parcela = parcela;


    }

    public double prestacao(){
        return (valortotal - entrada) / parcela;
    }

}
