public class Main {
    public static void main(String[] args) {
        //object creation
        Employee Employee1 = new Employee(1, "Larry", "Homes", "LM",46500,"Home Affairs",6.67,"Permanent");
       Employee Employee2 = new Employee(2, "James", "Dunn", "JD",57475,"Marketing",7.21,"Contract");
      Employee  Employee3 = new Employee(3, "Moose", "Hopper", "MH",47584,"Advertising",8.4,"Permanent");
       Employee Employee4 = new Employee(4, "Luke", "Skywalker", "LS",68596,"Finance",7.67,"Permanent");
        Employee Employee5 = new Employee(5, "Henry", "Adams", "HA",45854,"Human resources",9.67,"Contract");

        //print out each employee's details
        Employee1.MyMethod();
        Employee2.MyMethod();
        Employee3.MyMethod();
        Employee4.MyMethod();
        Employee5.MyMethod();

    }
}