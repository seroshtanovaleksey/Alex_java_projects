package PhoneBook;

import java.util.Scanner;
import static PhoneBook.Person.*;

public class PhoneBook {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        initBD();

        for (;;){
            System.out.println("Для поиска по имени введите 1, по телефону 2, по почте 3: ");
            String searchType = in.nextLine();

            System.out.println("Введите поисковое значение: ");
            String searchString = in.nextLine();

            findPerson(searchType,searchString);

            System.out.println("\nПродолжить поиск? ");

            String exitString = in.nextLine();
            if (exitString.equals("выход")){
                break;
            }

        }

    }
}

class Person {
    private String name;
    private String phone;
    private String email;
    private static Person[] persons = new Person[10];

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
    public static void initBD(){
        persons[0] = new Person("Оля","89161111111","solfed@yandex.com");
        persons[1] = new Person("Леша","89162222222","sas1c@yandex.com");
        persons[2] = new Person("Вероника","89163333333","severonika@yandex.com");
        persons[3] = new Person("Саша","89164444444","saha1@yandex.com");
        persons[4] = new Person("Баба","89165555555","ninaiv@mail.com");
    }
    public String toString(){
        return "\n\nName: "+this.getName()+"\nPhone number: "+this.getPhone()+"\nEmail: "+this.getEmail();
    }

    public static void findPerson(String searchType,String searchString){
        System.out.println(findPersonData(searchType,searchString,persons));

//        switch (searchType) {
//            case "1":
//                // по имени
//                System.out.println(findName(searchString,persons));
//                break;
//            case "2":
//                // по телефону
//                System.out.println("по телефону");
//                break;
//            case "3":
//                // по почте
//                System.out.println("по почте");
//                break;
//            default:
//                break;
//        }
    }

//    public static Person findName(String name,Person[] persons){
//        for (Person person: persons){
//            if (person==null) continue;
//            if (person.getName().equals(name)){
//                return person;
//            }
//        }
//        System.out.println("Нет такого человека");
//        return null;
//    }

    public static Person findPersonData(String searchType, String searchString,Person[] persons){
        for (Person person: persons){
            if (person==null) continue;

            if (searchType.equals("1")){
                //по имени
                if (person.getName().equals(searchString)){
                    return person;
                }
            }
            else if (searchType.equals("2")){
                //по телефону
                if (person.getPhone().equals(searchString)){
                    return person;
                }
            }
            else if (searchType.equals("3")){
                //по почте
                if (person.getEmail().equals(searchString)){
                    return person;
                }
            }
        }
        System.out.println("Нет такого человека");
        return null;
    }


}