package Atividade_6.Ex4;

public class Vendedor {
    protected float vendas;
    protected float salario;
    protected String nome;
    protected int falta;

    Vendedor(float v, float s, String n, int f){
        this.vendas = v;
        this.falta = f;
        this.nome = n;
        this.salario = s;
    }

    void setVendas(float v){
        this.vendas = v;
    }

    float getVendas(){
        return this.vendas;
    }

    void setSalario(float s){
        this.salario = s;
    }

    float getSalario(){
        return this.salario;
    }

    void setNome(String n){
        this.nome = n;
    }

    String getNome(){
        return this.nome;
    }

    void setFalta(int f){
        this.falta = f;
    }

    int getFalta(){
        return this.falta;
    }

    void imprimirDados(){
        System.out.print("Nome: " + getNome() + "\nVendas: R$ " + getVendas() + "\nSalário: R$ " + getSalario() + "\nFalta: " + getFalta() + "\n\n");
    }

    void calcularSalario(){
        this.salario = this.salario + calcularComissao() - descontoFolha();
    }

    float calcularComissao(){
        if (this.vendas >= 1000 && this.vendas < 2000){
            return (this.vendas * 10) / 100;
        }
        else if (this.vendas >= 2000){
            return (this.vendas * 15) / 100;
        } else {
            return 0;
        }
    }

    float descontoFolha(){
        return (this.salario/30) * this.falta;
    }
}
