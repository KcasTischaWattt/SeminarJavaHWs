public final class Programmer extends Employee{
    public Programmer(String name, int age) {
        super(name, age);
        wage = age * 5000 + 999;
        sum_wage += wage;
    }

    @Override
    public void doWork() {
        System.out.println("I'm working. Plz do not enter. I need to google how to print Hello World");
    }

    @Override
    public int wait_() {
        return getAge() + 1;
    }

    @Override
    public String getRole() {
        return "Programmer";
    }
}

