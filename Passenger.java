public class Passenger {
    String name;
    String surname;
    String phone_number;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhone_number() {
        return phone_number;
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }


    public void isCalling(String car, String car_model, String type){
        System.out.println("A potential client with phone number "+phone_number + " is calling to get an offer about the price " + car_model + " " + type + ".\n");
    }
    public void getsToDestination(String car_model, String car_color , String FirstName) {
        System.out.println("Customer " +name + " is waiting for the " +car_color +" "+ car_model+ " and the driver " + FirstName+" \n");
    }
}