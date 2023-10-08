public class Main {
    public static void main(String[] args) {
        GamepadDecorator sample = new SimpleGamepad();
        System.out.println("Cost : $" + sample.cost());
        System.out.println("Description: " + sample.description());

        System.out.println();

        GamepadDecorator sample2 = new chargingConnectorDecorator(new SimpleGamepad());
        System.out.println("Cost : $" + sample2.cost());
        System.out.println("Description: " + sample2.description());

        System.out.println();

        GamepadDecorator sample3 = new additionalButtonsDecorator(new SimpleGamepad());
        System.out.println("Cost : $" + sample3.cost());
        System.out.println("Description: " + sample3.description());

        System.out.println();

        GamepadDecorator sample4 = new chargingConnectorDecorator(new additionalButtonsDecorator(new SimpleGamepad()));
        System.out.println("Cost : $" + sample4.cost());
        System.out.println("Description: " + sample4.description());
    }
}