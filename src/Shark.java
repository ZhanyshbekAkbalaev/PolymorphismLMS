import animals.Animal;

public class Shark extends Animal {
    @Override
    public void eat() {
        System.out.println("Akula");
    }

    public String  attack(){
        return "Balykka chabuul kylat";
    }
}
