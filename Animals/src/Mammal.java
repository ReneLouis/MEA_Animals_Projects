public class Mammal extends warmBloodedAnimal implements swimable {

    private String environment;

    public Mammal(String environment) {
        this.environment = environment;
    }


    public String getEnvironment() { return environment; }
    public void setEnvironment(String environment) { this.environment = environment; }

    public void swimSpeed(int speed){
        System.out.println("Dolphins are one of the only mammals that live in water");
    }
}
