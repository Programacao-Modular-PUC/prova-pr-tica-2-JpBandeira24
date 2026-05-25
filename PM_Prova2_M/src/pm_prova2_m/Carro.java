/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593655
 */
public class Carro extends Veiculo implements Avaliavel {
    
    private int quantPortas;
    private int nota;
    
    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria,
                 double quilometragem, StatusVeiculo status, int quantPortas){
        
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        
        this.quantPortas = quantPortas;
        
    }
    
       @Override
    public void avaliar(int nota){
        this.nota = nota;
        
        System.out.println("Carro avaliado com nota: " + nota);    
    }
    
    
    @Override
    public String toString(){
        
        return super.toString() + "\nQuantidade de portas: " + quantPortas + "\nNota: " + nota;
    }
 
}
