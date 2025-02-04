class Voice {
    public void templateMethod() {
        prepareVoice();
        hear();
    }

    public void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    public void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }

    Animal[] animals = new Animal[5];

    abstract class Animal {
        public abstract void makeVoice();
    }

    class Cow extends Animal {
        public void makeVoice() {
            System.out.println("Cow speaks");
        }
    }

    class Dog extends Animal {
        public void makeVoice() {
            System.out.println("Dog speaks");
        }
    }

    class Pig extends Animal {
        public void makeVoice() {
            System.out.println("Pig speaks");
        }
    }

    class Goat extends Animal {
        public void makeVoice() {
            System.out.println("Goat speaks");
        }
    }

    class Lion extends Animal {
        public void makeVoice() {
            System.out.println("Lion speaks");
        }
    }
}
