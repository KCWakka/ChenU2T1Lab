public class CatRunner {
    public static void main(String [] args) {
        Cat cat1 = new Cat("Bob", 4, 8.9 );
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Jen", 7, 8.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
