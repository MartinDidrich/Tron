
import java.awt.Color;

/**
 *
 * @author Leon
 */
public class PlayerStartConfig {

    private Color color;
    private int x, y, matrix, leftcode, rightcode, upcode, downcode;
    private String name;
    private boolean twoKeyColtrol;
    private Bike.Orientation or;

    public PlayerStartConfig(String name, int x, int y, int matrix, int rightcode, int leftcode, int upcode, int downcode, Color c, boolean twoKeyMode, Bike.Orientation or) {
        this.color = c;
        this.x = x;
        this.y = y;
        this.matrix = matrix;
        this.leftcode = leftcode;
        this.rightcode = rightcode;
        this.upcode = upcode;
        this.downcode = downcode;
        this.name = name;
        this.twoKeyColtrol = twoKeyMode;
        this.or = or;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMatrix() {
        return matrix;
    }

    public int getLeftcode() {
        return leftcode;
    }

    public int getRightcode() {
        return rightcode;
    }

    public int getUpcode() {
        return upcode;
    }

    public int getDowncode() {
        return downcode;
    }

    public String getName() {
        return name;
    }

    public Bike.Orientation getOr() {
        return or;
    }

    public boolean isTwoKeyColtrol() {
        return twoKeyColtrol;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMatrix(int matrix) {
        this.matrix = matrix;
    }

    public void setLeftcode(int leftcode) {
        this.leftcode = leftcode;
    }

    public void setRightcode(int rightcode) {
        this.rightcode = rightcode;
    }

    public void setUpcode(int upcode) {
        this.upcode = upcode;
    }

    public void setDowncode(int downcode) {
        this.downcode = downcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTwoKeyColtrol(boolean twoKeyColtrol) {
        this.twoKeyColtrol = twoKeyColtrol;
    }

    public void setOr(Bike.Orientation or) {
        this.or = or;
    }

}
