public class Factory_Method {
    // Product interface
    interface VehicleComponent {
        void createComponent();
    }

    // Concrete products
    static class Engine implements VehicleComponent {
        @Override
        public void createComponent() {
            System.out.println("Engine created");
        }
    }

    static class Transmission implements VehicleComponent {
        @Override
        public void createComponent() {
            System.out.println("Transmission created");
        }
    }

    public static void main(String[] args) {
        VehicleComponent engine = new Engine();
        engine.createComponent();

        VehicleComponent transmission = new Transmission() ;
        transmission.createComponent();
    }
}
