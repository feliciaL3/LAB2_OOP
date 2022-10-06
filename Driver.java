public class Driver {
     String FirstName;
     String LastName;
     int age;
     int driving_years; 
     boolean isAmable;
     boolean isProfessionist;
     boolean hasGeographicalSkills;
     int work_exp; 
     
     public void setFirstName(String FirstName){
          this.FirstName = FirstName;
     }
     public void setLastName(String LastName) {
          this.LastName = LastName;
     }
     public void setAge(int age) {
          this.age = age;
     }
     public void setDriving_Years(int driving_years) {
          this.driving_years = driving_years;
     }
     public void setisAmable(boolean isAmable) {
          this.isAmable = isAmable;
     }
     public void setisProfessionist(boolean isProfessionist) {
          this.isProfessionist = isProfessionist;
     }
     public void sethasGeographicalSkills(boolean hasGeographicalSkills) {
          this.hasGeographicalSkills = hasGeographicalSkills;
     }
     public void setWork_exp(int work_exp) {
          this.work_exp = work_exp;
     }


     public String getFirstName() {
          return FirstName;
     }
     public int getAge() {
          return age;
     }
     public int getDriving_years() {
          return driving_years;
     }
     public boolean isAmable() {
          return isAmable;
     }
     public boolean isProfessionist() {
          return isProfessionist;
     }
     public boolean hasGeographicalSkiils() {
          return hasGeographicalSkills;
     }
     public int getWork_exp() {
          return work_exp;
     }



     public void isDriving(String car, String car_model, String type   ){  
          System.out.println( "The driver " + getFirstName()+ " "  + " drives a " + type+ " " + car_model + ".\n");
     }
     public void isBusy(){
          System.out.println("\nThe driver " + FirstName + " " +LastName+ " is driving the car.\n");
     }
     public void isWaiting(){
          System.out.println("The driver " +FirstName + " " +LastName + " is waiting for a client\n");
     }
     public void isAtPause(){
          System.out.println( "The driver "+ FirstName + " " +LastName+ " is taking a pause.\n");
     }
}