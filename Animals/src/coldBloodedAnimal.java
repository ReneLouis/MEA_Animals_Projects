public abstract class coldBloodedAnimal extends Animal{

    public coldBloodedAnimal() {}


    public int getTemperature(){return super.getTemperature();}

    private void regulateTemperature(int temp){
        if (temp < super.getLowerLimit()) {
            System.out.println("This animal needs some sunlight");
        }else if (temp > super.getUpperLimit()){
            System.out.println("This animal needs some shade");
        } else {
            System.out.println("This animal is just fine");

        }

    }
}
