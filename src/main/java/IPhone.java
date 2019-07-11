public class IPhone extends Mobile{

    @Override
    public String call(String inputMsg) {
        String result = "<iPhone>Message : " + inputMsg;
        System.out.println(result);
        return result;
    }
}
