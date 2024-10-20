public class Strategy_Pattern {
        // Strategy interface
        interface CreateStrategy {
            void create();
        }

        // Concrete strategies
        static class EngineStrategy implements CreateStrategy {
            @Override
            public void create() {
                System.out.println("Create Engine.");
            }
        }

        static class TransmissionStrategy implements CreateStrategy {
            @Override
            public void create() {
                System.out.println("Create Transmission.");
            }
        }

        // Context
        static class Component {
            private CreateStrategy strategy;

            public void setComponent(CreateStrategy strategy) {
                this.strategy = strategy;
            }

            public void create() {
                strategy.create();
            }
        }

        // Client code

        public static void main(String[] args) {
            Component component = new Component();

            component.setComponent(new EngineStrategy());
            component.create();

            component.setComponent(new TransmissionStrategy());
            component.create();
        }
    }

