package aplicacion;
import java.util.ArrayList;
import  java.util.List;
import dominio.ej14_12;
public class Principal {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        System.out.println(ej14_12.por2MayorQue6(lista));
    }
}
