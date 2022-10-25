public class Main {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Land");
        Bird pigeon = new Bird();

        System.out.println("Pigeon live is the " + pigeon.getEnvironment());

        Fish salmon =  new Fish();
        System.out.println("The salmon lives here: " + salmon.getEnvironment());

        salmon.swimSpeed(30);

        Insect mosquito = new Insect();
        mosquito.flightSpeed(21);

    }
}