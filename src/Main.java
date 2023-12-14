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

        //verifico se l'oggetto è presente all'interno dell'HashSet e stampo true o false
        System.out.println(hashSetDiNomi.contains(nomeDaInserire));


    }

}
