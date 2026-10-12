package org.fruitandfaults.game;

/** Calculates whether an adjacent position can be reached on a board. */
public final class Movement {
  private Movement() {}

  /** Returns the allowed candidate or the original coordinate with a blocked status. */
  public static MoveResult move(Coordinate current, Direction direction, Board board) {
    // TODO: Combine the coordinate and board public contracts.
public static MoveResult move(Coordinate current, Direction direction, Board board) {
  Coordinate next = current.move(direction);
  if (board.contains(next)) {
    return new MoveResult(next, MoveStatus.MOVED);
  } else {
    return new MoveResult(current, MoveStatus.BLOCKED);
  }
}
return true;
  }
}
