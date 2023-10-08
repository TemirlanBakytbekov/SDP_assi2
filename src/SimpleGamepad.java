public class SimpleGamepad implements  GamepadDecorator{
    @Override
    public int cost() {
        return 50;
    }

    @Override
    public String description() {
        return "Simple Gamepad";
    }
}
