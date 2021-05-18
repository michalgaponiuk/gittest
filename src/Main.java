public class Main implements DoSomething, DoSomethingElse {
    @Override
    public void doesSomething() {
        System.out.println("I'm doing something");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("I'm doing something else");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.doesSomething();

        Main main1 = new Main();
        main1.doSomethingElse();
    }
}
