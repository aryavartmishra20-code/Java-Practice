class Employee{
String name;
int year;
int salary;

//constructor
Employee(String n, int y, int s){
  name = n;
  year = y;
  salary = s;
}

//display method
void display(){
System.out.println("name is "+ name);
System.out.println("year of joining is "+ year);
System.out.println("salary  is "+ salary);
}
}


public class EmployeeData{
  public static void main(String[] args){
    Employee e1 = new Employee("amit", 2022, 20000);
    Employee e2 = new Employee("ram", 2012, 800000);
    Employee e3 = new Employee("pippo", 1857, 20);

    e1.display();
    e2.display();
    e3.display();
  }
}