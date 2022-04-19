
public class MyPublicAPIImpl extends SomeAbstractClass implements MyPublicAPI{

    @Override
    public void doSomething(MyPojo var) {
        System.out.println("do something");
        UtilityCode.doSomeUtility();
    }

    @Override
    protected void someCustomCode() {
        System.out.println("some customization");
    }
}
