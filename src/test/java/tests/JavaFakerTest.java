package tests;

import com.github.javafaker.*;
import org.testng.annotations.*;

public class JavaFakerTest {

    Faker faker = new Faker();
    @Test
    public void test1(){

        System.out.println("faker.name().username() = " + faker.name().username());
        System.out.println("faker.name().prefix() = " + faker.name().prefix());

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        //System.out.println("faker.address().countyByZipCode() = " + faker.address().countyByZipCode("52317"));

        System.out.println("faker.app().version() = " + faker.app().version());

        System.out.println("faker.artist().name() = " + faker.artist().name());

    }
}
