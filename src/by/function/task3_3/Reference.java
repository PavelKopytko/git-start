package by.function.task3_3;

import java.util.function.Function;

public class Reference {
    public static void main(String[] args) {

        referenceStaticMethod();

        referenceConstructor();

        referenceInstanceMethod();

        referenceInstanceMethodOfObject();


    }

    private static void referenceStaticMethod() {

        System.out.println("Ссылка на статический метод имеет вид \n ClassName :: staticMethodName");

        Function<String, Integer> parser = Integer::parseInt;

        int n1 = parser.apply("200"); // 200
//        int n2 = parser.apply("abc");

        Function<String, Integer> parser2 = str -> Integer.parseInt(str);
        int n2 = parser.apply("200"); // 200

        System.out.println(n1);
        System.out.println(n2 + "\n");
    }

    private static void referenceConstructor() {

        System.out.println("Ссылка на конструктор имеет вид \n ClassName :: new");

        Function<String, User> generator = User::new;

        User user = generator.apply("admin111");

        Function<String, User> generator2 = login -> new User(login);
        User user2 = generator2.apply("admin111");

        System.out.println(user);
        System.out.println(user2 + "\n");
    }

    private static void referenceInstanceMethod() {

        System.out.println("Ссылка на на метод экземпляра объекта имеет вид \n objectName :: instanceMethodName");

        String address = "11522 Shawnee Road, Greenwood DE 19950";

//        Function<String, Integer> indexing = address::indexOf;
        Function<String, Boolean> indexing = s -> address.contains(s);

        System.out.println(indexing.apply("115"));   // 0
        System.out.println(indexing.apply("Green")); // 20
        System.out.println(indexing.apply("Blue"));
    }

    private static void referenceInstanceMethodOfObject() {

        System.out.println("Ссылка на на метод экземпляра объекта определенного типа" +
                " имеет вид \n ClassName :: instanceMethodName");

        Function<Long, Double> converter = Long::doubleValue;

        Function<Long, Double> converter2 = val -> val.doubleValue();

        converter.apply(300L); // the result is 300.0d
        converter.apply(500L); // the result is 500.0d

        System.out.println(converter.apply(300L));   // 0
        System.out.println(converter.apply(500L)); // 20
    }
}


class User {
    String login;

    public User(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                '}';
    }
}