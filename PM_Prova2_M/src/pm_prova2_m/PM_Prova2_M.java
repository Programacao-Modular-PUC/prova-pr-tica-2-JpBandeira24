/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2_m;
import java.util.ArrayList;
/**
 *
 * @author glbra
 */
public class PM_Prova2_M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
ArrayList<Aluguel> alugueis = new ArrayList<>();

carregarDados(veiculos, alugueis);

System.out.println(" VEICULOS ");

for (Veiculo v : veiculos) {

System.out.println(v);

}

System.out.println("\n ALUGUÉIS ");

for (Aluguel a : alugueis) {

System.out.println(a);

}

System.out.println("\n VEÍCULOS DISPONÍVEIS ");

for (Veiculo v : veiculos) {

if (v.getStatus() ==
StatusVeiculo.DISPONIVEL) {

System.out.println(v);

}
}

System.out.println("\n AVALIAÇÕES ");

for (Veiculo v : veiculos) {

if (v instanceof Avaliavel) {

((Avaliavel) v).avaliar(10);
}
}

System.out.println("\n INSPEÇÕES ");

for (Veiculo v : veiculos) {

if (v instanceof Inspecionavel) {

((Inspecionavel) v)
.realizarInspecao();
}
}

System.out.println(
"\n REMOVENDO MANUTENÇÃO "
);

veiculos.removeIf(
v -> v.getStatus() ==
StatusVeiculo.MANUTENCAO
);

for (Veiculo v : veiculos) {

System.out.println(v);
}
}

public static void carregarDados(
ArrayList<Veiculo> veiculos,
ArrayList<Aluguel> alugueis
) {

Carro carro = new Carro("AAA-1111","Civic",2020,250,50000,StatusVeiculo.DISPONIVEL,4);

Moto moto = new Moto("BBB-2222","XRE",2022,120,15000,StatusVeiculo.MANUTENCAO,300);

Van van = new Van("CCC-3333","Sprinter",2021,500,70000,StatusVeiculo.DISPONIVEL,15);

veiculos.add(carro);
veiculos.add(moto);
veiculos.add(van);

Basico basico = new Basico("João");
Premium premium = new Premium("Pedro");
Executivo executivo =
new Executivo("Vaninho");

basico.adicionarVeiculo(carro);
premium.adicionarVeiculo(van);

alugueis.add(basico);
alugueis.add(premium);
alugueis.add(executivo);
}
}// TODO code application logic here
    }
    
}
