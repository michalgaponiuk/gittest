public interface DoSomething {
    public default void doesSomething() {
        System.out.println("I'm doing something");
    }
}
