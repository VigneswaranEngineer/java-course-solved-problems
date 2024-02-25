abstract class salaryy {
    abstract void getSalary(int a);
    abstract void getProfile();
    abstract void get_working_days();

    public static void main(String[] args) {
        Departmental_store d1 = new Departmental_store();
        String name = d1.getClass().getName();
        System.out.println("the department name is : "+name);
        d1.getProfile();
        d1.getSalary(22);
        System.out.println("-----------------------------------------------");

        
        store_manager s1 = new store_manager();
        String name1 = s1.getClass().getName();
        System.out.println("the department name is : "+name1);
        s1.getProfile();
        s1.getSalary(22);
        System.out.println("-----------------------------------------------");
        
       
        
        Nontech_staff n1 = new Nontech_staff();
        String name3 = n1.getClass().getName();
        System.out.println("the department name is : "+name3);
        n1.getProfile();
        n1.getSalary(22);
        System.out.println("-----------------------------------------------");
        
        office o1 = new office();
        String name4 = o1.getClass().getName();
        System.out.println("the department name is : "+name4);
        o1.getProfile();
        o1.getSalary(22);
        
    }
    
    
}

class Departmental_store extends salaryy{
    int worked_days;
    int salary;
    int salary_per_day = 500;
    protected int working_days = 15;

    
    public void getSalary(int worked_days){
        this.worked_days=worked_days;
        salary = worked_days*salary_per_day;
        System.out.println("the salary is : "+salary);
    }

    public void getProfile(){
        
        get_working_days();
        System.out.println("the number of users : 100");
        
    }

    public void get_working_days(){
        System.out.println("the  default working days is : "+working_days);
        
    }

    
}

class Nontech_staff extends salaryy{
    int worked_days;
    int salary;
    int salary_per_day = 200;
    protected int working_days = 20;

    
    public void getSalary(int worked_days){
        this.worked_days=worked_days;
        salary = worked_days*salary_per_day;
        System.out.println("the salary is : "+salary);
    }

    public void getProfile(){
        
        get_working_days();
        System.out.println("the number of users : 100");
    }

    public void get_working_days(){
        System.out.println("the default working days "+working_days);
        
    }

    
}

class office extends salaryy{
    int worked_days;
    int salary;
    int salary_per_day = 700;
    protected int working_days = 25;

    
    public void getSalary(int worked_days){
        this.worked_days=worked_days;
        salary = worked_days*salary_per_day;
        System.out.println("the salary is : "+salary);
    }

    public void getProfile(){
        
        get_working_days();
        System.out.println("the number of users : 200");
    }

    public void get_working_days(){
        System.out.println("the default working days is : "+working_days);
        
    }

    
}

class store_manager extends salaryy{
    int worked_days;
    int salary;
    int salary_per_day = 300;
    protected int working_days = 27;

    
    public void getSalary(int worked_days){
        this.worked_days=worked_days;
        salary = worked_days*salary_per_day;
        System.out.println("the salary is : "+salary);
    }

    public void getProfile(){
        
        get_working_days();
        System.out.println("the number of users : 150");
    }

    public void get_working_days(){
        System.out.println(working_days);
        
    }

    
}