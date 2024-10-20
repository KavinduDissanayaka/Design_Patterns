public class Facade_Pattern {
    // Subsystem classes
    static class Engine {
        public String start() {
            return "Engine started";
        }
    }

    static class Transmission {
        public String setGear(String gear) {
            return "Transmission set to " + gear;
        }
    }

    static class GPS {
        public String setDestination(String destination) {
            return "GPS set to " + destination;
        }
    }

    // Facade
    static class VehicleFacade {
        private Engine engine;
        private Transmission transmission;
        private GPS gps;

        public VehicleFacade() {
            engine = new Engine();
            transmission = new Transmission();
            gps = new GPS();
        }

        public String goToDestination(String destination) {
            StringBuilder results = new StringBuilder();
            results.append(engine.start()).append("\n");
            results.append(transmission.setGear("drive")).append("\n");
            results.append(gps.setDestination(destination)).append("\n");
            return results.toString();
        }
    }

    // Client code

    public static void main(String[] args) {
        VehicleFacade vehicle = new VehicleFacade();
        System.out.println(vehicle.goToDestination("123 Main St"));
    }
}
