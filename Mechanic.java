public class Mechanic {
    String FirstName;
    String LastName;
    int age;
    String phone_number;

    public void repairs(String car, String car_model, String type) {
        System.out.println(FirstName +" " + LastName + " is working at  " + car_model + " " + type+".\n");
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    

    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone_number() {
        return phone_number;
    }

   
}