
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PersonBuilderTest {

    @Test
    public void PersonHappyBirthdayTest() {
        String name = "Sandra";
        String surname = "Ivanova";
        int correctAge = 36;
        String address = "Syzran";

        Person next = new PersonBuilder()
                .setName(name)
                .setSurname(surname)
                .setAge(correctAge)
                .setAddress(address)
                .build();
        int expectedAge = next.getAge() + 1;

        next.happyBirthday();
        int actualAge = next.getAge();

        assertEquals(expectedAge, actualAge);
    }

    @org.junit.jupiter.api.Test
    public void personBuilderTestAgeNotCorrect() {
        int notCorrectAge = -25;
        PersonBuilder next = new PersonBuilder()
                .setName("Names")
                .setSurname("Long");
        assertThrows(IllegalArgumentException.class, () -> next.setAge(notCorrectAge));
    }
}