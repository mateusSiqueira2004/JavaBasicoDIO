package streamAPI.interfacesSupplier;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {

        List<String> listaSaudacoes = Stream.generate(() -> "Hello World!")
            .limit(5)
            .toList();
        listaSaudacoes.forEach(System.out::println);
    }
}
