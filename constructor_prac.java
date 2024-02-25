
//practise on constructors

class constructor_prac{
    long salary;
    String name_of_the_employee;
    long worked_days;
    long finall;

    constructor_prac(long salary,String name_of_the_employee,long worked_days){
        this.salary = salary;
        this.name_of_the_employee = name_of_the_employee;
        this.worked_days = worked_days;
        System.out.println("the salary per day is "+ salary +"\n" + "the name of the employee is : "+ name_of_the_employee + "\n" +"the worked days is : "+ worked_days);
        calculate();

    }
    

    void calculate(){
        finall = salary*worked_days;
        System.out.println("this month salary for "+name_of_the_employee+" is "+finall);
    }

public static void main(String args[]){
    constructor_prac con = new constructor_prac(10000,"tharun karthi",20);
    
}
}