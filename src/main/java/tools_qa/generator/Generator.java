package tools_qa.generator;

import com.github.javafaker.Faker;
import tools_qa.data.Person;

import java.util.Locale;

public class Generator extends Person {
    Faker faker_eng = new Faker(new Locale("en_GB"));

    public String generatePerson(String value) {

        switch (value) {
            case "fullName":
                return fullName = faker_eng.name().firstName() + " " + faker_eng.name().lastName();

            case "firstName":
                return firstName = faker_eng.name().lastName();

            case "lastName":
                return lastName = faker_eng.name().lastName();

            case "age":
                return age = String.valueOf((18 + Math.random() * 80));

            case "salary":
                return salary = String.valueOf((50 + Math.random() * 5000));

            case "department":
                return department = String.valueOf(faker_eng.job());

            case "email":
                return email = faker_eng.internet().emailAddress();

            case "currentAddress":
                return currentAddress = faker_eng.address().fullAddress();

            case "permanentAddress":
                return permanentAddress = faker_eng.address().secondaryAddress();

            default:
                System.out.println("Wrong Data!");
                break;
        }
        return null;
    }
}
