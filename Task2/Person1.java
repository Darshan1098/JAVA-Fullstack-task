class Person1 {
  protected String name;
    protected int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
