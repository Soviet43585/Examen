package UserRepository;

import User.User;

import java.util.ArrayList;

public class UserRepository {
    public static ArrayList<User> userArr = new ArrayList<>();
    static {
        userArr.add(new User("Олег"));
        userArr.add(new User ("Наташа"));
        userArr.add(new User ("Вика"));
        userArr.add(new User ("Дима"));
        userArr.add(new User ("Оля"));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
