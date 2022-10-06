public class Marketolog{
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


   public void promovates() {
    System.out.println("The marketolog " + name + " " + surname + " makes different offers for loyal customers\n");
}
}