class parent {
    int id;
    long phone_number;
    String name;
    int number_of_days;
    int salary;

    parent(int id,long phone_number,String name,int number_of_days,int salary){
        this.id = id;
        this.phone_number = phone_number;
        this.name = name;
        this.number_of_days = number_of_days;
        this.salary = salary;

    }
    void getSalary(String name){
        this.name=name;
        System.out.println("the salary is "+salary);
    }

    void workingDays(String name){
        this.name=name;
        System.out.println("working days : "+number_of_days);
    }

    public static void main(String args[]){
        child ch = new child(1234,9363325665l,"kumar",25,30000);
        ch.getDetails();
        ch.workingDays("kumar");
    }

    
}
class child extends parent{

    child(int id,long phone_number,String name,int number_of_days,int salary){
        super(id, phone_number, name, number_of_days, salary);
    }
    
    void getDetails(){
        
        System.out.println("name : "+name);
        System.out.println("id :"+id);
        System.out.println("phone number : "+phone_number);
        getSalary(name);
        workingDays(name);
    }

    
}


