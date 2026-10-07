package org.fruitandfaults.game;

/** An immutable position in screen coordinates. */
public record Coordinate(int x, int y) {
  /** Returns the adjacent coordinate for the direction, preserving this value. */
  public Coordinate move(Direction direction) {
    // TODO: Calculate one adjacent position for each direction.
    switch (direction) {
      case UP:
        return new Coordinate(x, y -1);
        case DOWN:
          return new Coordinate(x, y + 1);
          case LEFT:
            return new Coordinate(x - 1, y);
            case RIGHT:
              return new Coordinate(x + 1, y);
    }
  }
}
