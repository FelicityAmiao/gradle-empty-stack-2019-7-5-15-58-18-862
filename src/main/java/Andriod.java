public class Andriod extends Mobile {

    @Override
    public String call(String inputMsg) {
        String result = "<Android>Message : " + inputMsg;
        System.out.println(result);
        return result;
    }
}
