import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String adress;

    public Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return adress != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getAddress() {
        return hasAddress();
    }

    public void setAddress(String address) {
        this.adress = address;
    }

    public int getAge() {
        return hasAge() ? age : -1;
    }

    public void happyBirthday() {
        if (hasAge()) age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && Objects.equals(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getAddress());
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setName(name)
                .setSurname(surname)
                .setAge(0)
                .setAddress(adress);
    }
}