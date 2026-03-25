package default_package;

class Dog extends Animal {
    String breed;

    Dog(String name, String sound, int legs, String breed) {
        super(name, sound, legs);
        this.breed = breed;
    }
    @Override
    void speak() {
        System.out.println(name + " says " + sound + " and wags tail");
    }
}


class Bird extends Animal {
    boolean canFly;

    Bird(String name, String sound, int legs, boolean canFly) {
        super(name, sound, legs);
        this.canFly = canFly;
    }
    @Override
    void speak() {
        System.out.println(name + " Type is " + sound);
    }

    void fly() {   
        if (canFly) {
            System.out.println(name + " is flying!");
        } else {
            System.out.println(name + " is not flying!");
        }
    }
}


class Fish extends Animal {
    String WaterType;

    Fish(String name, String sound, int legs, String WaterType) {
        super(name, sound, legs);
        this.WaterType = WaterType;
    }

    void swim() {
        System.out.println(name + " is swimming in " + WaterType + " water");
    }
}


public class Animal {

    String name;
    String sound;
    int legs;

    Animal(String name, String sound, int legs) {
        this.name = name;
        this.sound = sound;
        this.legs = legs;
    }

    void speak() {
        System.out.println(name + " says " + sound);
    }

   
    public static void main(String[] args) {

        Dog dog = new Dog("Dog", "Bark", 4, "GoldenRetriever");
        Bird bird = new Bird("Bird", "Parrot", 2, true);
        Fish fish = new Fish("Fish", "Whale", 0, "Fresh");

        dog.speak();
        bird.speak();
        fish.speak();

        bird.fly();
        fish.swim();

       
        Animal[] animals = new Animal[4];
        animals[0] = dog;
        animals[1] = bird;
        animals[2] = fish;
        animals[3] = new Animal("Cat", "Meow", 4);

        for (Animal a : animals) {
            a.speak();
        }
    }
}