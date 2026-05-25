/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593655
 */
public class Premium extends Aluguel {

private boolean seguro;

public Premium(String cliente) {

super(cliente);

this.seguro = true;
}

@Override
public String toString() {

return super.toString() +
"\nTipo: Premium" +
"\nQuilometragem ilimitada" +
"\nSeguro: " + seguro;
}
}
