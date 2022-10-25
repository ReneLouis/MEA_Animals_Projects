public class Fish extends coldBloodedAnimal implements swimable {


    public Fish() {
        super.setEnvironment("Water");
    }
    public void swimSpeed(int speed){
        System.out.println("Fish are very speedy swimmers. Some of the fastest ones are sailfish, marlin and tuna. " +
                "A sailfish can swim up to 68 miles per hour");

        System.out.println("There are more fish in the world than mammals, amphibians, birds and reptiles combined!");
    }
}
