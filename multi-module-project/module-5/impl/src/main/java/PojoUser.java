public class PojoUser {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println(Class.forName("MyPojo").newInstance());

//      new MyPojo();                   // I can't this code here

//        UtilityCode.doSomeUtility();    // I can't this code here

//        MyPublicAPI var = new MyPublicAPIImpl();  // I can't this code here
    }
}
