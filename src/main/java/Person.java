public class Person {
    private String name;
    private Mobile mobile;

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String call(String inputMsg) {
        return mobile.call(inputMsg);
    }
}
