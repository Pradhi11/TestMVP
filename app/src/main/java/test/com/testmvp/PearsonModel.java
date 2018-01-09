package test.com.testmvp;

/**
 * Created by pradeep on 09/01/18.
 */

public class PearsonModel {

    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


  public String getName(){
      return  firstName+" "+lastName;
  }

}
