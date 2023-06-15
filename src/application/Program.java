package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>(); // Instanciação do Set usando o HashSet.

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0); // Instanciação do objeto prod.

        System.out.println(set.contains(prod)); // set.contains(prod) verifica se existe um objeto prod dentro da coleção set.

    }

}
