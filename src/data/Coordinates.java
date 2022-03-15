package data;

/**
 * Класс с координатами SpaceMarine
 */
public class Coordinates {
    public double x; //Поле не может быть null
    public long y; //Максимальное значение поля: 494

    /**
     * @return x
     */
    public Double getX() {
        return x;
    }

    /**
     * @param x the x
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * @return y
     */
    public Long getY() {
        return y;
    }

    /**
     * @param y the y
     */
    public void setY(Long y) {
        this.y = y;
    }
}
