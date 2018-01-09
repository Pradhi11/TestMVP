package test.com.testmvp;

/**
 * Created by pradeep on 08/01/18.
 */

public interface TestPatternInterfac {

    public interface ViewInf{
        public void showMessage(String msg);
        public void showError(String error);
    }

    public interface PresenterInf{
        public void loadMessage();
        public void saveName(String s1,String s2);
    }
}
