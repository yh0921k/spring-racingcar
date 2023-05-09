package racingcar.domain;

public class RacingCar {
  private final String name;
  private int position;

  public RacingCar(String name) {
    this.name = name;
    this.position = 0;
  }

  public String getName() {
    return this.name;
  }

  public int getPosition() {
    return this.position;
  }

  public void move(MovementAction movementAction) {
    if (movementAction.isMove()) {
      this.position++;
    }
  }
}
