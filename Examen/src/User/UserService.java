package User;

import UserRepository.UserRepository;

import java.util.Scanner;

public class UserService {
    static Scanner input = new Scanner(System.in);
    public static void isReal() {
        System.out.println("Введите искомое имя: ");
        String name = input.nextLine();
        boolean isFind = false;
        for (User i : UserRepository.userArr) {
            if (i.getName().equals(name)){
                isFind = true;
                break;
            }
        }
        if (isFind) {
            System.out.println("Имя найдено");
        }
        else {
            System.out.println("Имя не найдено");
        }
    }
}
