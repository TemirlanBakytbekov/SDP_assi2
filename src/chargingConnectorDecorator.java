public class chargingConnectorDecorator implements GamepadDecorator{
    private GamepadDecorator gamepadDecorator;
    public chargingConnectorDecorator(GamepadDecorator gamepadDecorator) {
        this.gamepadDecorator = gamepadDecorator;
    }

    @Override
    public int cost() {
        return gamepadDecorator.cost() + 10;
    }

    @Override
    public String description() {
        return gamepadDecorator.description() + ", charging connector";
    }
}
