package herdado;

import com.bytebank.Conta;

public class Account {
    private int agencia;
    private int numero;
    private double saldo;
    private Client titular;
    private static int total; // atributo da Classe,

    public Account(int agencia, int numero){
        Account.total ++;
        System.out.println("O total de contas abertas até o momento é: " + total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getAgencia(){

        return agencia;
    }
    public void setAgencia(int agencia){
        if(agencia <=0){
            System.out.println("A agência não pode ter numeros iguais ou inferior a zero!");
            return;
        }
        this.agencia = agencia;
    }
    public int getNumero(){

        return numero;
    }
    public void setNumero(int numero){
        if (numero <=0){
            System.out.println("O numero da conta não pode ter numeros iguais ou inferior a zero!");
        }
        this.numero = numero;
    }
    public double getSaldo() {

        return saldo;
    }
    /*public void setSaldo (double saldo){
        this.saldo = saldo;
    }*/

    public Client getTitular() {

        return titular;
    }

    public void setTitular(Client titular) {

        this.titular = titular;
    }


    //o static permite que as instancias acessem os dados da classe.
    public static int getTotal(){
        return Account.total;
    }

    public void deposita(double valor){

        this.saldo = this.saldo + valor;
    }



    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }

    }

    public boolean transferir(double valor, Conta destino){
        if (this.saldo >= valor){
            this.sacar(valor);
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }
}
