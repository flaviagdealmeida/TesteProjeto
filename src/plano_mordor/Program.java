package plano_mordor;
import plano_mordor.comida.BoloDeMel;
import plano_mordor.comida.Cogumelo;
import plano_mordor.comida.Comida;
import plano_mordor.comida.Cram;
import plano_mordor.comida.Lembas;
import plano_mordor.comida.Maca;
import plano_mordor.comida.Melao;
import plano_mordor.comida.OutraComida;

public class Program {
    public static void main(String[] args) {
        Personagem gandalf = new Personagem();
        Personagem bilbo = new Personagem();
        Personagem legolas = new Personagem();
        Personagem tauriel = new Personagem();

        gandalf.comer(new Comida[] {
                new Maca(),
                new Maca(),
                new Cogumelo(),
                new OutraComida()
        });

        System.out.println(gandalf.toString());

        bilbo.comer(new Comida[] {
                new BoloDeMel(),
                new Maca(),
                new Melao(),
                new Cogumelo()
        });

        System.out.println(bilbo.toString());

        legolas.comer(new Comida[] {
                new BoloDeMel(),
                new Maca(),
                new Melao(),
                new Cogumelo(),
                new BoloDeMel(),
                new Cram(),
                new Cram()
        });

        System.out.println(legolas.toString());

        legolas.comer(new Comida[] {
                new BoloDeMel(),
                new Maca(),
                new Melao(),
                new Cogumelo(),
                new BoloDeMel(),
                new Lembas(),
                new Lembas(),
                new Cram()
        });

        System.out.println(legolas.toString());
    }
}

