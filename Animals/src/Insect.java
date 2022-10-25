public class Insect extends warmBloodedAnimal implements flyable {
        private String environment;

        public Insect() {
            this.environment = "Air";
        }


        public String getEnvironment() { return environment; }

        public void flightSpeed(int speed){
            System.out.println("Buzz! Most insects make a noise when they fly");
            System.out.println(" Most insects have air-speeds of less than 21 km/h.");
        }

}

