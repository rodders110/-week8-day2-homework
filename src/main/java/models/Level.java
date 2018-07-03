package models;

public enum Level {

    BENG("Bachelor of Engineering"),
    BSC("Bachelor of Science"),
    BA("Bachelor of Arts"),
    MENG("Master of Engineering"),
    MSC("Master of Science"),
    MA("Master of Arts");

    private String name;

    Level(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
