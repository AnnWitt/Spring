package annwitt.module.home;

public class PersonDto {


    //dto - data transfer  obcejt - wystawimy na zwenatrz do kontrolera
    private final String name;
    private final String surname;
    private final int age;

    public PersonDto(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
