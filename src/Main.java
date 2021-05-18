public class Main implements DoSomething, DoSomethingElse {
    @Override
    public void doesSomething() {
        System.out.println("POSSIBLE CONFLICT");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("POSSIBLE CONFLICT");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.doesSomething();

        Main main1 = new Main();
        main1.doSomethingElse();
    }
}
