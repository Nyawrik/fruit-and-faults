package org.fruitandfaults.game;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/** Learner-editable template: complete one analogous boundary case in your own words. */
class AnalogousBoundaryTest {
  @Test
  void outwardMovementAtMyChosenEdgeIsBlocked() {
    // Arrange: choose a board and a position at one of its edges.
    // Act: request a movement outward from that edge.
    // Assert: compare the returned coordinate and status with the public rule.
    // Explain why the chosen candidate is outside the board.
    Board board = new Board(3, 2);
    Coordinate original = new Coordinate(2, 1);
    MoveResult result = Movement.move(original, Direction.RIGHT, board);
    assertEquals(original, result.coordinate());
    assertEquals(MoveStatus.BLOCKED, result.status());

  }
}
