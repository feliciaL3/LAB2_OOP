public class HumanResources{
    String FirstName;
    String LastName;

    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }


    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    
    public void hiring(){
        System.out.println(FirstName+ " " + " is searching for new drivers.\n");
    }

}