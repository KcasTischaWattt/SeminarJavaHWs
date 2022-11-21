public abstract class Employee {
    protected String name;
    protected int wage;
    protected int age;

    private static int amount = 0;

    protected static int sum_wage = 0;
    protected static int sum_age = 0; // Чисто вспомогательная переменная, получить доступ к ней извне нельзя

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        sum_age += age;
        amount++;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
        return age;
    }

    public static int Amount() {
        return amount;
    }

    public static int SumWage() {
        return sum_wage;
    }

    public static double AvgAge() {
        return sum_age / (double) amount;
    }

    public static double AvgWage() {
        return sum_wage / (double) amount;
    }

    public abstract void doWork();

    public abstract int wait_();

    public abstract String getRole();

    @Override
    public String toString(){
        return "This is " + getRole() + " " + getName() + ", " + getAge() + " y.o.";
    }
}

