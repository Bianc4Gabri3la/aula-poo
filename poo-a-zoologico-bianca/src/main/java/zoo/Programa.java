package zoo;

import zoo.aves.Papagaio;
import zoo.aves.Tucano;
import zoo.mamiferos.*;

import java.util.ArrayList;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        System.out.println("Atividade Zoo");

        List<Animal> animals = new ArrayList<>();
        animals.add(construirPapagaio());
        animals.add(construirTucano());
        animals.forEach(Animal::emitirSom);


        List<Mamifero> mamiferos = new ArrayList<>();

        mamiferos.add(construirMamifero(new Hiena(),  "risadinha", Boolean.FALSE));
        mamiferos.add(construirMamifero(new Leao(),  "simba",  true));
        mamiferos.add(construirMamifero(new Elefante(), "Elephante", false));
        mamiferos.add(construirMamifero(new Girafa(), "Miau", false ));
        mamiferos.forEach(Mamifero::alimentar);
        mamiferos.addAll(mamiferos);
        mamiferos.forEach(Animal::emitirSom);


    }

    private static Mamifero construirMamifero(Mamifero mamifero, String nome, Boolean filhote) {
        mamifero.setNome(nome);
        mamifero.setFilhote(filhote);
        return mamifero;
    }

    private static Papagaio construirPapagaio() {
        var pirata = new Papagaio();
        pirata.setNome("Papagaio Pirata");
        pirata.repetirPalavras("Vai São Paulo");
        return pirata;
    }

    private static Tucano construirTucano() {
        var tucano = new Tucano();
        tucano.setNome("Tucano Amarelo");
        return tucano;
    }
}
