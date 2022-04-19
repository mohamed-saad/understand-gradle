
public class MySecondPublicAPIImpl extends MyPublicAPIImpl {

    @Override
    protected void someCustomCode() {
        System.out.println("more customization");
//        UtilityCode.doSomeUtility();   // I can't this code here
    }
}
