package data;

import java.time.LocalDate;

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

    public static LocalDate getCreationDate() {
        return creationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NullPointerException {
        if (name != null && !name.isEmpty())
            this.name = name;
        else throw new NullPointerException();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }


    public long getHealth() {
        return health;
    }

    public void setHealth(long health) throws NullPointerException {
        throw new NullPointerException();
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) throws NullPointerException {
        if (achievements != null && !achievements.isEmpty())
            this.achievements = name;
        else throw new NullPointerException();
    }

    public AstartesCategory getCategory() {
        return category;
    }

    public void setCategory(AstartesCategory category) throws NullPointerException {
        if (category != null)
            this.category = category;
        else throw new NullPointerException();
    }

    public Weapon getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(Weapon weaponType) throws NullPointerException {
        if (weaponType != null)
            this.weaponType = weaponType;
        else throw new NullPointerException();
    }

    public void setChapter(Chapter chapter) throws NullPointerException {
        if (chapter != null)
            this.chapter = chapter;
        else throw new NullPointerException();
    }
    public Chapter getChapter() {
        return chapter;
    }

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

