class students {
    int subject_mark_1;
    int subject_mark_2;
    int subject_mark_3;
    int subject_mark_4;
    int subject_mark_5;
    int id;
    String name;
    int year_of_study;

    void getTotal(){
        int total = subject_mark_1+subject_mark_2+subject_mark_3+subject_mark_4+subject_mark_5;
        System.out.println("total marks = "+total);
    }
    void getAverage(){
        int total = subject_mark_1+subject_mark_2+subject_mark_3+subject_mark_4+subject_mark_5;
        float average = total/5;
        System.out.println(" average = "+average+"%");
    }
    void getCGPA(){
        int total = subject_mark_1+subject_mark_2+subject_mark_3+subject_mark_4+subject_mark_5;
        float average = total/5;
        System.out.println("CGPA = "+average+"%");
    }
    void getInfor(){
        System.out.println("NAME :"+name);
        System.out.println("ID  :"+id );
        System.out.println("year of study :"+year_of_study);
        int total = subject_mark_1+subject_mark_2+subject_mark_3+subject_mark_4+subject_mark_5;
        float average = total/5;
        System.out.println("CGPA = "+average+"%");

    }

    public static void main(String args[]){
            students stu1 = new students();
            stu1.subject_mark_1=78;
            stu1.subject_mark_2=89;
            stu1.subject_mark_3=92;
            stu1.subject_mark_4=91;
            stu1.subject_mark_5=95;
            stu1.id = 504040;
            stu1.name = "vigneswaran";
            stu1.year_of_study = 2021;

            stu1.getTotal();
            stu1.getAverage();
            stu1.getCGPA();
            stu1.getInfor();
            

    }
    
}
