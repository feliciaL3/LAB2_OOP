public class  Accountant {
    String name;
    String surname;
    String task;


    public void manages(){
        
        if (task == "Salary") {
            System.out.println("The accountant "+name + " " + surname + " calculates the salary of employees of taxi comapany.\n");

        }
    }


    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getTask() {
        return task;
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setTask(String task) {
        this.task = task;
    }   
}
