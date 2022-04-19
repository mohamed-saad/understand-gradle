public class APIConsumer {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyPublicAPI var = (MyPublicAPI)Class.forName("MyPublicAPIImpl").newInstance();
        System.out.println(var);

//        UtilityCode.doSomeUtility();    // I can't this code here

//        MyPublicAPI var = new MyPublicAPIImpl();  // I can't this code here
    }
}
