public final class Secretary extends Employee{
    public Secretary(String name, int age) {
        super(name, age);
        wage = age * 1000 - 1;
        sum_wage += wage;
    }

    @Override
    public void doWork() {
        System.out.println("I'm working. Plz do not enter. I need to google how to clean WC!");
    }

    @Override
    public int wait_() {
        return age+=2;
    }

    @Override
    public String getRole() {
        return "Secretary";
    }
}
