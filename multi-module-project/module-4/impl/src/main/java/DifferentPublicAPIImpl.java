public class DifferentPublicAPIImpl implements MyPublicAPI{

    @Override
    public void doSomething(MyPojo var) {
        System.out.println("different API implementation");

//        UtilityCode.doSomeUtility();    // I can't this code here

//        MyPublicAPI var = new MyPublicAPIImpl();  // I can't this code here
    }
}
