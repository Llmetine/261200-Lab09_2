import oop.lsp.*;

import java.util.ArrayList;
import java.util.List;

    public static void main(String[] args) {
        
        Moveable penguin = new Penguin();
        Moveable ostrich = new Ostrich();
        Flyable sparrow = new Sparrow();
        Flyable eagle = new Eagle();

        System.out.println("=== Individual Behavior ===");
        penguin.move();
        ostrich.move();
        sparrow.move();
        sparrow.fly();
        eagle.move();
        eagle.fly();

        System.out.println("\n=== Polymorphic Collection (Moveable) ===");
        
        List<Moveable> birds = new ArrayList<>();
        birds.add(penguin);
        birds.add(ostrich);
        birds.add(sparrow);
        birds.add(eagle);

        for (Moveable bird : birds) {
            bird.move();
        }

        System.out.println("\n=== Flyable Collection ===");
        
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(sparrow);
        flyingBirds.add(eagle);

        for (Flyable bird : flyingBirds) {
            bird.fly();
        }
    }
