/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593655
 */
public class Basico extends Aluguel {

private int kmPorDia;
private boolean seguro;

public Basico(String cliente) {

super(cliente);

this.kmPorDia = 100;
this.seguro = false;
}

@Override
public String toString() {

return super.toString() +
"\nTipo: Básico" +
"\nKM por dia: " + kmPorDia +
"\nSeguro: " + seguro;
}
}
