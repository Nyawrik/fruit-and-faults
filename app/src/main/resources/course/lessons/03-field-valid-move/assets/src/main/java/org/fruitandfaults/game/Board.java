package org.fruitandfaults.game;

/** A rectangular board whose coordinates begin at zero. */
public record Board(int width, int height) {
  /** Returns whether the coordinate lies within the board's width and height. */
  public boolean contains(Coordinate coordinate) {
    public boolean contains(Coordinate coordinate) {
  if (coordinate.x() < 0 || coordinate.x() >= width) {
    return false;
  }
  if (coordinate.y() < 0 || coordinate.y() >= height) {
    return false;
  }
  return true;
}
  }
}
