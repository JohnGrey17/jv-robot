package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();
        if (deltaX < 0) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            for (int i = 0; i < Math.abs(deltaX); i++) {
                robot.stepForward();
            }
        } else if (deltaX > 0) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            for (int i = 0; i < deltaX; i++) {
                robot.stepForward();
            }
        }

        if (deltaY < 0) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(deltaY); i++) {
                robot.stepForward();
            }
        } else if (deltaY > 0) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            for (int i = 0; i < deltaY; i++) {
                robot.stepForward();
            }
        }
    }
}
