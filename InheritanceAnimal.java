/* TASKS TO PERFORM IN THIS QUESTION

Create a class Animal with a field name (String), 
a constructor to set the name, and a method makeSound() 
that prints "Animal makes a sound". 
Then, create a class Cat that extends Animal, its constructor 
should call the parent constructor to set the name, and override 
the makeSound() method to print "Meow Meow". Next, create a class 
Tiger that extends Cat, its constructor should set the name, and override 
makeSound() to print "Roarrrr". In the main() method, create a Tiger object, 
set its name (e.g., "Sher Khan"), and call its makeSound() method.*/

class Animal {
    String name ;
    Animal(String name){
        this.name = name;
    }
    void makeSound(){
        System.out.println("Aanimal makes a sound");
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Meow Meow");
    }
}

class Tiger extends Cat{
    Tiger(String name){
        super(name);

    }

    @Override
    void makeSound(){
        System.out.println("Roarrrr");
    }
}

public class InheritanceAnimal {
    public static void main(String[] args) {
        Tiger t1 = new Tiger("Sher Khan");
        t1.makeSound();
    }
    
}
