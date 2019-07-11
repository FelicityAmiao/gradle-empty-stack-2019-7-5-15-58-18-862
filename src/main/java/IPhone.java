public class IPhone extends Mobile{

    @Override
    public String call(String inputMsg) {
        String result = "<iPhone>Message : " + inputMsg;
        result = this.exceedsLength(inputMsg)? "<iPhone> Message cannot be sent": result;
        System.out.println(result);
        return result;
    }

    @Override
    public boolean exceedsLength(String inputMsg) {
        return inputMsg.length() > 25;
    }
}
