
class Employee{
    int id;
    int age;

    void printMyId(){
        System.out.println("employee id = "+id);
    }

    void printMyAge(){
        System.out.println("employee age = "+age);
    }

    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.age = 35;
        emp1.id = 1000;
        emp1.printMyAge();
        emp1.printMyId();

    }
}