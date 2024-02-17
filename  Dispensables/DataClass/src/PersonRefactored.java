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

    // New behavior: Check if the person is eligible to vote
    public boolean isEligibleToVote() {
        return age >= 18;
    }


}
