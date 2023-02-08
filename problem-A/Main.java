package OOPANIMAL;

public class dima{
    public static void main(String[] args) {
        Cat c1 = new Cat("Koshka");
        c1.greets();
        System.out.println(c1);

        Dog d1 = new Dog("Sobaka");
        d1.greets();
        System.out.println(d1);

        Dog d2 = new Dog();
        d1.greets(d2);


    }


}

 class Animal {
    public String name;

    public Animal(){

    }
    //constuctor
    public Animal(String name){
        this.name = name;
    }
    public String toString(){
        return "Animal[name=" + name + "]";
    }

}
class Mammal extends Animal{
    public Mammal(){

    }
     public Mammal(String name){
         super(name);
     }
     public String toString(){
         return "Mammal[" +super.toString() + "]";
     }
}
class Cat extends Mammal{
    public Cat(){

    }
    public Cat(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
class Dog extends Mammal{
    public Dog(){

    }
    public Dog(String name){
        super(name);

    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }

}


