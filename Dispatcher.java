public class Dispatcher {
    String firstname;
    String lastname;
    String phone_number;

    public String getFirstName() {
        return firstname;
    }
    public String getLastName() {
        return lastname;
    }
    public String getPhone_number() {
        return phone_number;
    }


    public void setFirstName (String firstname){
        this.firstname = firstname;
    }
    public void setLastName (String lastname){
        this.firstname = lastname;
    }
    public void setPhone_Number (String phone_number){
        this.phone_number = phone_number;
    }

    
    public void contactingDriver(){
        System.out.println(firstname + " "+ lastname+ " is now contacting the driver\n");
    }

}