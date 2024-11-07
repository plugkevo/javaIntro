public class inheritance {

    class Animal {
        public void sound() {
            System.out.println("The animal makes sound");
        }
    }

    class Dog extends Animal {
        public void sound() {
            super.sound();
            System.out.println("The dog barks bow bow");
        }
    }

    class Cat extends Animal {
        public void sound() {
            super.sound();
            System.out.println("The cat meows");
        }
    }

    public static void main(String[] args) {
        inheritance inheritance = new inheritance(); //

        Animal myDog = inheritance.new Dog(); // Create an instance of Dog
        myDog.sound(); // Call the sound method

        Animal myCat = inheritance.new Cat(); // Create an instance of Cat
        myCat.sound(); // Call the sound method
    }
}