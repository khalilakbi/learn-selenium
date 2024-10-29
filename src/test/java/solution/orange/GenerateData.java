package solution.orange;

import com.github.javafaker.Faker;

public class GenerateData {
    static Faker faker = new Faker();

    public static String firstName (){
        return faker.name().firstName();
    }
    public static String lastName(){
        return faker.name().lastName();
    }

    public static void main(String[] args) {
//        System.out.println(GenerateData.firstName());
    }
}
