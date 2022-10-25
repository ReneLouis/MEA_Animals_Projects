public class Bird extends warmBloodedAnimal implements flyable, swimable {
    private String environment;

    public Bird() {
        this.environment = "Air";
    }


    public String getEnvironment() { return environment; }

    public void flightSpeed(int speed){
        System.out.println("Most birds can fly. Some don't like chickens and penguins");
        System.out.println("Only 60 flightless bird species survive today");
    }
    public void swimSpeed(int speed){
        System.out.println("Puffins are the only bird that can swim");
    }

}
