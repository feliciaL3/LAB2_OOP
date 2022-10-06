public class CustomerService {
    String name;
    String surname;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }


    public <phone_number> void answerToCalls(String passenger, String phone_number){
        System.out.println("The dispatcher " + name +" " + surname + " answers to " + phone_number + "  and try to find a free car for the customer.\n ") ;
    }
}