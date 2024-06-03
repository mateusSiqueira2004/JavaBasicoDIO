package streamAPI.interfacesPredicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExemple {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java","python","kotlin");

        //Predicate<String> maisDeCinco = palavra -> palavra.length() > 5;

        palavras.stream().filter(p -> p.length() > 5).forEach(System.out::println);
    }
}
