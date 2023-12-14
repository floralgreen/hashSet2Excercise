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

        //verifico se l'oggetto è presente all'interno dell'HashSet e stampo il risultato
        if(hashSetDiNomi.contains(nomeDaInserire)){
            System.out.println(nomeDaInserire + " è presete nella collection");
        } else {
            System.out.println(nomeDaInserire + " non è presente nella collenction");
        }
    }

}
