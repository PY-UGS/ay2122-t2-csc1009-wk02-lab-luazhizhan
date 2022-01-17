public class Person {

    private String name;

    public static void main(String[] args) {
        System.out.println("What is this class?");
        System.out.println("This is class Person");

        Person peter = new Person();
        System.out.println(peter.getName());

        peter = new Person();
        System.out.println(peter.getName());

    }

    Person() {
        this.name = "John Doe";
    }

    Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
