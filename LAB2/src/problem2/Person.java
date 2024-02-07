package problem2;

class Person extends Contact {
    private String name;
    private int age;

    public Person(String number, String email, String name, int age) {
        super(number,email);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", " + super.toString() + "]";
    }

    public void getName() {
        System.out.println("Hello, my name is " + name);
    }
}