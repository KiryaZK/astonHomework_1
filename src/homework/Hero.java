package homework;

public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy() {
        int index = getClass().getName().lastIndexOf(".");
        String className = getClass().getName().substring(index + 1);
        System.out.println(className + " " + getName() + " атакует врага!");
    }

}
