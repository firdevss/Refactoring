public class PersonRefactored {
    private String name;
    private int age;

    public PersonRefactored(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // New behavior: Method to check if the person is an adult
    public boolean isAdult() {
        return age >= 18;
    }

    // New behavior: Method to greet the person
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }



}
