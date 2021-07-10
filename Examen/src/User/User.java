package User;

public class User {
    private int id;
    private String name;
    static int counter = 1;

    public User(String name) {
        this.name = name;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }
}
