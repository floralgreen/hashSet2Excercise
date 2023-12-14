import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Generatore generatore = new Generatore();
        //creo un hashSet tramite la funzione
        Set<String> hashSetDiNomi = generatore.generaHashSetString();

        //creo un oggetto dello stesso tipo dell'hashset
        String nomeDaInserire = "Lorenzo";

        //inserisco l'elemento creato prima nell'hashset
        hashSetDiNomi.add(nomeDaInserire);

        //this?
        for (String nome : hashSetDiNomi) {
            if (nome.equals("Lorenzo")){
                System.out.println(nome);
            }
        }

        //this?
        if (hashSetDiNomi.contains(nomeDaInserire)){
            System.out.println(hashSetDiNomi.contains(nomeDaInserire));
        }

    }

}
