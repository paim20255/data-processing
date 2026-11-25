public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String display() {
        return String.format("""
                First name: %s
                Last name: %s
                age: %d
                """, this.firstName, this.lastName, this.age);
    }
}

