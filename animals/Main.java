package animals;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Dog კლასის ობიექტი
        Animal myCat = new Cat();  // Cat კლასის ობიექტი

        myDog.sound();  // გამოიძახეთ sound() Dog კლასიდან
        myCat.sound();  // გამოიძახეთ sound() Cat კლასიდან
    }
}
