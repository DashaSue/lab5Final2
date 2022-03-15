package data;

/**
 * Класс с главой Chapter
 */
public class Chapter {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private String parentLegion;
    private long marinesCount; //Значение поля должно быть больше 0, Максимальное значение поля: 1000

    public Chapter() {
        this.name = name;
        this.parentLegion = parentLegion;
        this.marinesCount = marinesCount;
    }
    /**
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "часть{" +
                "имя: '" + name + '\'' +
                ", легион: '" + parentLegion + '\'' + ",количество кораблей в части: " + marinesCount+
                '}';
    }
    /**
     * @param name параметр сеттера имени
     */
    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    /**
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * @param parentLegion параметр сеттера для легион
     */
    public void setParentLegion(String parentLegion) {
        if (parentLegion != null)
            this.parentLegion = parentLegion;
    }

    /**
     * @return легион
     */
    public String getParentLegion() {
        return parentLegion;
    }
    /**
     * @param marinesCount параметр сеттера для количества кораблей
     */
    public void setMarinesCount(Long marinesCount){
        this.marinesCount = marinesCount;
    }

    /**
     * @return количество кораблей
     */
    public long getMarinesCount() {
        return marinesCount;
    }

}
