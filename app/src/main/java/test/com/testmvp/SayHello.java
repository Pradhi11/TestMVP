package test.com.testmvp;

/**
 * Created by pradeep on 09/01/18.
 */

public class SayHello implements TestPatternInterfac.PresenterInf {

    private PearsonModel pearsonModel;
    private TestPatternInterfac.ViewInf viewInf;

    public SayHello(TestPatternInterfac.ViewInf viewInf){
        this.pearsonModel=new PearsonModel();
        this.viewInf=viewInf;
    }





    @Override
    public void loadMessage() {

        if(pearsonModel.getFirstName()==null && pearsonModel.getLastName()==null ){
            viewInf.showError("No pearson name found");
            return;
        }

        String msg="hi"+pearsonModel.getName();
        viewInf.showMessage(msg);

    }

    @Override
    public void saveName(String s1, String s2) {

           pearsonModel.setFirstName(s1);
           pearsonModel.setLastName(s2);

    }
}
