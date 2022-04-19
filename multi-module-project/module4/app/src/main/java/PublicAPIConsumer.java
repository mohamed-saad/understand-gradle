public class PublicAPIConsumer {

    public static void main(String[] args) {
        MyPublicAPI m = null;
        m.doSomething(new MyPojo());

//        UtilityCode.doSomeUtility();    // I can't this code here

//        MyPublicAPI var = new MyPublicAPIImpl();  // I can't this code here
    }
}
