/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;
import java.util.ArrayList;
/**
 *
 * @author glbra
 */
public abstract class Aluguel {

    protected String cliente;
    protected ArrayList<Veiculo> veiculos;
    private int quantidadeDias;
    private double valorTotal;
    private StatusAluguel status;

    public Aluguel(String cliente, int quantidadeDias, double valorTotal, StatusAluguel status) {

        this.cliente = cliente;
        this.veiculos = new ArrayList<>();
        this.quantidadeDias = quantidadeDias;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public String getcliente() {
        return cliente;
    }

    public void setcliente(String cliente) {
        this.cliente = cliente;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusAluguel getStatus() {
        return status;
    }

    public void setStatus(StatusAluguel status) {
        this.status = status;
    }

    public abstract void exibirDetalhes();

    public abstract boolean possuiSeguroIncluso();
    
    public void adicionarVeiculos(Veiculo veiculo){
        veiculos.add(veiculo);
        
        veiculos.setStatus(StatusVeiculo.ALUGADO);
    }
    
    public void exibirVeiculos(){
        
        for (Veiculo v : veiculos){
            System.out.println(v);
        }
    }
    
    @Override
    public String toString(){
        return "\nCliente: " + cliente;
    }
    
}
