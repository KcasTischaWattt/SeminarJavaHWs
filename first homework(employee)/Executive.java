public final class Executive extends Manager{

    public Executive(String name, int age) {
        super(name, age);
        wage = age * 4000;
        sum_wage+=wage;
    }

    @Override
    public void doWork() {
        System.out.println("I'm working. Plz do not enter. I need to sack some Managers");
    }

    @Override
    public String getRole() {
        return "SuperManager";
    }

    public void buildAStratagy(int money) {
        System.out.println("Oh, I've wasted all these money.. Could you give me more plz?");
    }
}
