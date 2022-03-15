package data;

import java.time.LocalDate;

/**
 * Класс SpaceMarine, объектами которого заполняется коллекция
 */
public class SpaceMarine {
    public int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    public String name; //Поле не может быть null, Строка не может быть пустой
    public Coordinates coordinates;//Поле не может быть null
    public static LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    public Long health; //Поле не может быть null, Значение поля должно быть больше 0
    public String achievements; //Поле не может быть null
    public AstartesCategory category; //Поле может быть null
    public Weapon weaponType; //Поле не может быть null
    public Chapter chapter; //Поле не может быть null

    /**
     * Конструктор
     */
    public SpaceMarine() {
        this.creationDate = LocalDate.now();
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.health = health;
        this.achievements = achievements;
        this.category = category;
        this.weaponType = weaponType;
        this.chapter = chapter;
    }

    /**
     * @return дата
     */
    public static LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id SpaceMarine
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return имя SpaceMarine
     */
    public String getName() {
        return name;
    }

    /**
     * @param name SpaceMarine
     * @throws NullPointerException если не указано имя
     */
    public void setName(String name) throws NullPointerException {
        if (name != null && !name.isEmpty())
            this.name = name;
        else throw new NullPointerException();
    }

    /**
     * @return координаты
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates координаты SpaceMarine
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return здоровье
     */
    public long getHealth() {
        return health;
    }

    /**
     * @param health здоровье SpaceMarine
     * @throws NullPointerException выбрасывает исключение NullPointerException
     */
    public void setHealth(long health) throws NullPointerException {
        throw new NullPointerException();
    }

    /**
     * @return достижения
     */
    public String getAchievements() {
        return achievements;
    }

    /**
     * @param achievements достижения SpaceMarine
     * @throws NullPointerException если не ввели значение
     */
    public void setAchievements(String achievements) throws NullPointerException {
        if (achievements != null && !achievements.isEmpty())
            this.achievements = name;
        else throw new NullPointerException();
    }

    /**
     * @return категория
     */
    public AstartesCategory getCategory() {
        return category;
    }

    /**
     * @param category категория SpaceMarine
     * @throws NullPointerException если значение null
     */
    public void setCategory(AstartesCategory category) throws NullPointerException {
        if (category != null)
            this.category = category;
        else throw new NullPointerException();
    }

    /**
     * @return вид оружия SpaceMarine
     */
    public Weapon getWeaponType() {
        return weaponType;
    }

    /**
     * @param weaponType вид оружия SpaceMarine
     * @throws NullPointerException если значение null
     */
    public void setWeaponType(Weapon weaponType) throws NullPointerException {
        if (weaponType != null)
            this.weaponType = weaponType;
        else throw new NullPointerException();
    }

    /**
     * @param chapter глава SpaceMarine
     * @throws NullPointerException если значение null
     */
    public void setChapter(Chapter chapter) throws NullPointerException {
        if (chapter != null)
            this.chapter = chapter;
        else throw new NullPointerException();
    }

    /**
     * @return глава
     */
    public Chapter getChapter() {
        return chapter;
    }

    /**
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Космический корабль{ " +
                "id: " + id +
                ", имя: '" + name + '\'' +
                ", " + "коодинаты: x = "+coordinates.getX() + ", y = "+coordinates.getY()+
                ", дата создания: " + creationDate +
                ", здоровье: " + health +
                ", достижения: " + achievements +
                ", категория: " + category +
                ", тип оружия: " + weaponType +
                ", " + chapter +
                "}\n";
    }

}

