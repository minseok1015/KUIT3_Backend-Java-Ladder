package ladder;

public class Node {
    private  Direction direction;

    private Node(Direction direction) {
        this.direction = direction;
    }

    public static Node of(Direction direction) {
        return new Node(direction);
    }

    private boolean isLeft() {
        return direction == Direction.LEFT;
    }

    public boolean isRight( ) {
        return direction == Direction.RIGHT;
    }
    public Position move(Position position) {

        if (isLeft()) {
            return position.next();
        }
        if (isRight()) {
            return position.prev();
        }
        return position;
    }

}
