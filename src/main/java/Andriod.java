public class Andriod extends Mobile {

    @Override
    public String call(String inputMsg) {
        String result = "<Android>Message : " + inputMsg;
        result = this.exceedsLength(result)? "<Andriod> Message cannot be sent": result;
        System.out.println(result);
        return result;
    }

    public boolean exceedsLength(String inputMsg) {
        return inputMsg.length() > 10;
    }
}
