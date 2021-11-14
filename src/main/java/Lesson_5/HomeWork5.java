package Lesson_5;

public class HomeWork5 {
    public static void main(String[] args){
        Employee employee1 = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com","89151234556", "30000", "30");
        employee1.name = "Ivanov Ivan";
        employee1.position = "Engineer";
        employee1.mail = "ivivan@mailbox.com";
        employee1.PhoneNumber = "89151234556";
        employee1.salary = "30000";
        employee1.age = "30";

        System.out.println(employee1.name);
        System.out.println(employee1.position);
        System.out.println(employee1.mail);
        System.out.println(employee1.PhoneNumber);
        System.out.println(employee1.salary);
        System.out.println(employee1.age);

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", "30000", "30");
        persArray[1] = new Employee("Sidorov Roman", " Accountant", "sidorovri@mailbox.com", "89159876654", "45000", "45");
        persArray[2] = new Employee(" Petrov Nikita", "Economist", "petrovnn@mailbox.com", "89263456723", "50000", "53");
        persArray[3] = new Employee("Zaharova Elena", "Manager", "zaharovaen@mailbox.com", "89161239087", "55000", "43");
        persArray[4] = new Employee("Horev Zahar", "Programmer", "horevzi@mailbox.com", "899158761289", "70000", "32" );


       // for (int i = age; i > 40; i+) {
         //   System.out.println(i);

        }


        }



