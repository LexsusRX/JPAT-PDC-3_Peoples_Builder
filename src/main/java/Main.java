public class Main {

    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Mariya")
                .setAge(15)
                .setAddress("Sydney")
                .build();
        System.out.println("A card has been created for " + mom);
        Person son = mom.newChildBuilder()
                .setName("Artem")
                .build();
        System.out.println(mom + " has a son: " + son);


        // при запуске блоков ниже соответствующие ошибки выходят
//        try {
//            // Не хватает обяхательных полей
//            new PersonBuilder().build();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
    }
}

