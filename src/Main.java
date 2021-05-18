public class Main implements DoSomething {
    @Override
    public void doesSomething() {
        System.out.println("I'm doing something");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.doesSomething();

        Main main1 = new Main();
        main1.doesSomething();
    }
}
