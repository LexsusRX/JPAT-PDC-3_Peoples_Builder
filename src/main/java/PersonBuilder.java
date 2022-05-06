public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = -1;
    protected String adress;

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Empty field <name>, fill in the Name field");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Empty field <surname>, fill in the Surname field");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("The age cannot be negative, enter the correct age");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.adress = address;
        return this;
    }

    public Person build() {
        return new Person(name, surname, age, adress);

    }
}