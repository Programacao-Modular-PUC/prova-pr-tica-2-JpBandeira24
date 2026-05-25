/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593655
 */
public class Moto extends Veiculo implements Inspecionavel {
    
    private int cilindrada;
    
     public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria,
                 double quilometragem, StatusVeiculo status, int cilindrada){
         
           super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
           
           this.cilindrada = cilindrada;   
     }
     
     @Override
     public void realizarInspecao(){
         System.out.println("Inspecao realizada na moto!");
     }
     
     @Override
     public String toString(){
         return super.toString() + "\nCilindrada: " + cilindrada;
     }
}
