public abstract class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile() {

    }

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String call(String inputMsg) {
        String result = "Message : " + inputMsg;
        System.out.println(result);
        return result;
    }

    public String getBasicInformation() {
        String result = "name: "+ this.name +", color: "+ this.color +", brand: "+ this.brand;
        System.out.println(result);
        return result;
    }

    public abstract boolean exceedsLength(String inputMsg);

}