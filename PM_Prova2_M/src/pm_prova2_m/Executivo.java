/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 1593655
 */
public class Executivo extends Aluguel
implements Avaliavel {

private boolean motoristaParticular;
private int nota;

public Executivo(String cliente) {

super(cliente);

this.motoristaParticular = true;
}

@Override
public void avaliar(int nota) {

this.nota = nota;

System.out.println(
"Executivo avaliado com nota: " + nota
);
}

@Override
public String toString() {

return super.toString() +
"\nTipo: Executivo" +
"\nMotorista particular: " +
motoristaParticular +
"\nNota: " + nota;
}
}
