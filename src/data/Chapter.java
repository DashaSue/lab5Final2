package data;

public class Chapter {
        private String name; //Поле не может быть null, Строка не может быть пустой
    private String parentLegion;
    private long marinesCount; //Значение поля должно быть больше 0, Максимальное значение поля: 1000

    public Chapter(String name, String parentLegion) {
        this.name = name;
        this.parentLegion = parentLegion;
        this.marinesCount = marinesCount;
    }
    @Override
    public String toString() {
        return "глава{" +
                "имя=: '" + name + '\'' +
                ", легион: '" + parentLegion + '\'' + ",количество морской флота: '" + marinesCount+
                '}';
    }
    public void setName(String name) {
        if (name != null)
            this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setParentLegion(String parentLegion) {
        if (parentLegion != null)
            this.parentLegion = parentLegion;
    }
    public String getParentLegion(String parentLegion) {
        return parentLegion;
    }
    public void setMarinesCount(){
        this.marinesCount = marinesCount;
    }

    public long getMarinesCount() {
        return marinesCount;
    }
}
