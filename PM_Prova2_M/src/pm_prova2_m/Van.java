/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593655
 */
public class Van extends Veiculo implements Avaliavel, Inspecionavel{ 
    
    private int maxPassageiros;
    private int nota;
    
    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria,
                 double quilometragem, StatusVeiculo status, int maxPassageiros){
    
      super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
    
      this.maxPassageiros = maxPassageiros;
    }
    
        @Override
    public void avaliar(int nota){
        this.nota = nota;
        
        System.out.println("Van avaliado com nota: " + nota);   
    
    }
     @Override
     public void realizarInspecao(){
         System.out.println("Inspecao realizada na van!");
     }
    @Override
    public String toString(){
        
        return super.toString() + "\nMaximo Passageiros: " + maxPassageiros + "\nNota: " + nota;
    }
}
