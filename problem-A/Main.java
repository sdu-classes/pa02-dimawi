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




