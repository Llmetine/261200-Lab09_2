import oop.lsp.*; //import oop.lsp

import java.util.ArrayList;
import java.util.List;

    public static void main(String[] args) {
        //สร้างนกแต่ละชนิด
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
        
        List<Moveable> birds = new ArrayList<>(); //สร้าง Array ที่มี Moveable
        birds.add(penguin);
        birds.add(ostrich);
        birds.add(sparrow);
        birds.add(eagle);

        for (Moveable bird : birds) {
            bird.move();//เรียกทุกตัวที่มี method move
        }

        System.out.println("\n=== Flyable Collection ===");
        
        List<Flyable> flyingBirds = new ArrayList<>();//สร้าง Array ที่มี Flyable
        flyingBirds.add(sparrow);
        flyingBirds.add(eagle);

        for (Flyable bird : flyingBirds) {
            bird.fly();//เรียกทุกตัวที่มี method fly
        }
    }
