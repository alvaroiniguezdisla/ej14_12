package dominio;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ej14_12 {
    public static List<Integer> por2MayorQue6(List<Integer> lista){
        return Stream.iterate(0,i->i+1).limit(lista.size()).map(i->lista.get(i)*2).filter(i->i>6).collect(Collectors.toCollection(ArrayList::new));
    }
}
