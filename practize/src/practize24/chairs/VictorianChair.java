package practize24.chairs;

class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Вы сидите на викторианском стуле, возраст которого: " + age);
    }
}