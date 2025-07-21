class Catty implements AnimalInterface{
    // the Animal Interface is underlined becoz ide cant find it so the soln was to compile 
    //both files together 
    //with javac AnimalInterface.java Catty.java
    // or to use the package statement in both files

    public void makeNoise() {
        System.out.println("Meow! I am a cat, hear me roar!");
    }

    public void printName() {
            System.out.println("I am a cat, and my name is Catty.");
            System.out.println("I am a proud and few surviving member of the "+race);
        }

    public void poops() {
        System.out.println("preghhhepuchuudpdpdpdpdpd");
    }

}

class CattyTest {
    public static void main(String[] args) {
        Catty catty = new Catty();
        catty.makeNoise();
        catty.printName();
        catty.poops();
    }
}