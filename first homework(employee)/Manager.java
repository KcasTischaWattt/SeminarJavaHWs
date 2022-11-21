public class Manager extends Employee {

    public Manager(String name, int age) {
        super(name, age);
        wage = age * 3000;
        sum_wage += wage;
    }

    @Override
    public void doWork() {
        System.out.println("I'm working. Plz do not enter. I need to sack some Programmers");
    }

    @Override
    public final int wait_() {
        sum_age++;
        return ++age;
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}
