public abstract class warmBloodedAnimal extends Animal {

    public warmBloodedAnimal() {}


    public int getTemperature(){return super.getTemperature();}

    private void regulateTemperature(int temp){
        if (temp < super.getLowerLimit()) {
            System.out.println("This animal is shivering");
        }else if (temp > super.getUpperLimit()){
            System.out.println("This animal is sweating");
        } else {
            System.out.println("This animal is just fine");

        }

    }
}
