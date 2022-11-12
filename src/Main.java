import animals.Animal;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {

                new Eagle(),
                new Eagle(),
                new Eagle(),

                new Turtle(),
                new Turtle(),
                new Turtle(),
                new Turtle(),

                new Shark(),
                new Shark(),
                new Shark(),
        };
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        for (Animal animals1 : animals) {
            animals1.eat();
            if (animals1 instanceof Eagle) {
                counter++;
                System.out.println(((Eagle) animals1).fly());
            }
            if (animals1 instanceof Turtle) {
                counter1++;
                System.out.println(((Turtle) animals1).swim());
            }
            if (animals1 instanceof Shark) {
                counter2++;
                System.out.println(((Shark) animals1).attack());
            }
        }
//        for (Animal animal : animals) {
//            animal.eat();
//            if (animal instanceof Eagle) {
//                if (animal.getClass().equals(Eagle.class)) {
//                    System.out.println(((Eagle) animal).fly());
//                }
//            } else if (animal instanceof Turtle) {
//                if (animal.getClass().equals(Turtle.class)) {
//                    System.out.println(((Turtle) animal).swim());
//                }
//            } else  {
//                if (animal.getClass().equals(Shark.class)) {
//                    System.out.println(((Shark) animal).attack());
//                }
//            }
//        }
        System.out.println();
        Eagle[] eagles = new Eagle[counter];
        Turtle[] turtles = new Turtle[counter1];
        Shark[] sharks = new Shark[counter2];
        System.out.println("Burkut " + counter +"\nTashbaka " + counter1 +"\nKok kit "+ counter2);
    }
}