public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        // create driver objects
        Driver driver1 = new Driver();
        Driver driver2 = new Driver();
        Driver driver3 = new Driver();
        Driver driver4 = new Driver();

        // driver1 attributess
        driver1.setFirstName("Vasile");
        driver1.setLastName("Seen");
        driver1.setAge(24);
        driver1.setDriving_Years(2);
        driver1.sethasGeographicalSkills(true);
        driver1.setisAmable(true);
        driver1.setisProfessionist(false);
        driver1.setWork_exp(1);

        // driver2 attributes
        driver2.setFirstName("Taylor");
        driver2.setLastName("Teamt");
        driver2.setAge(33);
        driver2.setDriving_Years(10);
        driver2.setisAmable(true);
        driver2.setisProfessionist(true);
        driver2.sethasGeographicalSkills (false);
        driver2.setWork_exp(7);

        // driver3 attributes
        driver3.setFirstName("John");
        driver3.setLastName("Carl");
        driver3.setAge(21);
        driver3.setDriving_Years(1);
        driver3.setisProfessionist(true);
        driver2.setisAmable(false);
        driver3.sethasGeographicalSkills(true);
        driver3.setWork_exp(0);

        driver4.setFirstName("Sam");
        driver4.setLastName("Black");
        driver4.setAge(50);
        driver4.setDriving_Years(21);
        driver4.setisProfessionist(true);
        driver4.setisAmable(true);
        driver4.sethasGeographicalSkills(true);
        driver4.setWork_exp(20);

     
      
        // create passenger objects
        Passenger passenger1 = new Passenger();
        Passenger passenger2 = new Passenger();
        Passenger passenger3 = new Passenger();


        // passenger1 attributes
        passenger1.setName("Max");
        passenger1.setSurname("Bont");
        passenger1.setPhone_number("0545435343");

        // passenger2 attributes
        passenger2.setName("Mike");
        passenger2.setSurname("Corn");
        passenger2.setPhone_number("035243234");

        // passenger2 attributes
        passenger3.setName("Helsa");
        passenger3.setSurname("Mike");
        passenger3.setPhone_number("0129839293");



        // create car objects
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();


        // car1 attributes
        car1.setcar_model("Reanult" );
        car1.setType("hybrid");
        car1.setcar_color ("blue");
        // car2 attributes
        car2.setcar_model("Audi");
        car2.setType("electric");
        car2.setcar_color ("black");

        // car3 attributes
        car3.setcar_model("Toyota");
        car3.setType("electric");
        car3.setcar_color ("blue");

        // car4 attributes
        car4.setcar_model("Dacia");
        car4.setType("hybrid");
        car4.setcar_color ("white");


        // car method
        car1.isFree();
        car2.isDamaged();
        car3.isFull();
        car4.isParking();

        
        // create hr object
        HumanResources HumanResources = new HumanResources();
        // hr attributes
        HumanResources.setFirstName("Maria");
        HumanResources.setLastName("Moon");

      // initialize methods for drivers
      driver1.isBusy();
      driver2.isAtPause();
      driver3.isWaiting();
      driver4.isWaiting();



        // mechanic
        Mechanic mechanic1 = new Mechanic();
        mechanic1.setFirstName("John");
        mechanic1.setLastName("Bon");
        mechanic1.setAge(35);
        mechanic1.setPhone_number("032243424");
        mechanic1.repairs(car2.toString(), car2.getcar_model(), car2.getType());

        
         
        // accountant
        Accountant accountant1 = new Accountant();
        accountant1.setName("Mya");
        accountant1.setSurname("Jhonson");
        accountant1.setTask("Salary");
        accountant1.manages();

        driver1.isDriving(String.valueOf(car1), car1.getcar_model(), car1.getType());
        driver2.isDriving(String.valueOf(car2), car2.getcar_model(), car2.getType());
        driver3.isDriving(String.valueOf(car3), car3.getcar_model(), car3.getType());

        // marketolog
        Marketolog marketolog = new Marketolog();
        marketolog.setName("Bill");
        marketolog.setSurname("Grande");
        marketolog.promovates();

          // create operator object
          CustomerService operator1 = new CustomerService();
          CustomerService operator2 = new CustomerService();
          // operator attributes
          operator1.setName("Gode");
          operator1.setSurname("Brown");
          operator2.setName("Sasha");
          operator2.setSurname("Slet");
          // operator method
          operator1.answerToCalls(passenger1.toString(), passenger1.getPhone_number());
          operator2.answerToCalls(passenger2.toString(), passenger2.getPhone_number());

          // initialize method for passenger
        passenger1.isCalling(car1.toString(), car1.getcar_model(), car1.getType());
        passenger2.getsToDestination(car1.car_model, car1.car_color ,driver1.FirstName);

       
    }

}