package practize24.chairs;

class FunctionChair implements Chair {
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public void sit() {
        System.out.println("Вы сидите на многофункциональном стуле.");
    }
}
