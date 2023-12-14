import java.util.HashSet;
import java.util.List;

public class Generatore {

    public HashSet<String> generaHashSetString(){
        HashSet<String> nomi = new HashSet<>(List.of("Matteo","Nicola","Federico"));
        return nomi;
    }

}
