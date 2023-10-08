public class additionalButtonsDecorator implements GamepadDecorator{
    private GamepadDecorator gamepadDecorator;
    public additionalButtonsDecorator(GamepadDecorator gamepadDecorator) {
        this.gamepadDecorator = gamepadDecorator;
    }

    @Override
    public int cost() {
        return gamepadDecorator.cost() + 20;
    }

    @Override
    public String description() {
        return gamepadDecorator.description() + ", additional buttons";
    }
}
