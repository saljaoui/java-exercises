public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        return switch (chifoumiAction) {
            case ROCK -> ChifoumiAction.SCISSOR;
            case SCISSOR -> ChifoumiAction.PAPER;
            case PAPER -> ChifoumiAction.ROCK; 
            default -> chifoumiAction;
        };
    }
}