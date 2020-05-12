package org.example;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

//Animal= Employee
//Dog = SalesPerson
//Dog = SystemDeveloper

        Employee SD = new Employee(1,"Shafeeq Tahir", 25000);
//Animal janwar = new Animal("app name Animal",34);


         SalesPerson markter1 = new SalesPerson(2,"Amer Rasheed", 25000, "Maxi",0);
                  //Dog kutta1 = new Dog("first",15, 2,1,20);
      //  System.out.println(markter1.getName());

        SystemDeveloper developer1 = new SystemDeveloper(3,"Faheem Mustafa",25000, "Project Management", "Java");
        //Dog kutta1 = new Dog("first",15, 2,1,20);

      Employee tester = new SystemDeveloper(4,"Arif Alvi", 25000, "QA workshop","Test Scripting");
        //Animal janwar = new Horse("app name Animal",34);
SD.calculateSalary();
markter1.calculateSalary();
developer1.calculateSalary();



       // System.out.println(markter1);
    }
}
