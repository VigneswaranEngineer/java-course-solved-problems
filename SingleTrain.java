class user_authentication {
    String[] id = {null};
    String[] password = {null};
    String[] email_id = {null};

    void register(String name , String passcode , int age , String user_email_id){
        if (age>=18){
            for (int i=0;i<id.length;i++){
                if (id[i]==null){
                    id[i] = name;
                    password[i] = passcode; 
                    email_id[i] = user_email_id;
                    System.out.println("Successfully Registered");
                }
                else
                    continue;
            }

        }
        else
            System.out.println("age must be 18 or greater than 18");
    }

    void userDetails(){
        for (int i=0;i<id.length;i++){
            if (id[i]!=null)
            System.out.println("User id : "+id[i]);
            System.out.println("email id : "+email_id[i]);
            
        }
    }

    void login(String login_id , String login_password){
        for (int i=0;i<id.length;i++){
            if (id[i]==login_id && password[i]==login_password){
                System.out.println("Logined Sucessfully");
            }
            else{
                System.out.println("user not found");
            }
        }

        
    }

    String[] available_seats_L = {"L1","L2","L3","L4","L5","L6","L7","L8","L9","L10","L11","L12","L13","L14","L15","L16","L17","L18","L19","L20"};
    String[] available_seats_A = {"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10","A11","A12","A13","A14","A15","A16","A17","A18","A19","A20"};
    String[] available_seats_U = {"U1","U2","U3","U4","U5","U6","U7","U8","U9","U10","U11","U12","U13","U14","U15","U16","U17","U18","U19","U20"};
    String[] seats_booked = {null};

    void checkSeat(String id1 , String check_coach , String check_seat){
        
        switch(check_coach){
            case "L":
                for (int i=0;i<available_seats_L.length;i++){
                    if (check_seat == available_seats_L[i]){
                        System.out.println("seat available");
                        available_seats_L[i] = null;
                        for (int j=0;j<id.length;j++){
                            if (id[j] == id1){
                                seats_booked[j] = check_seat;
                                System.out.println("seats booked");
                            }
                        }
                        break;
                    }
                    else{
                        System.out.println("seat unavailable");
                        break;
                    }
                }
                break;
            case "A":
                for (int i=0;i<available_seats_A.length;i++){
                    if (check_seat == available_seats_A[i]){
                        System.out.println("seat available");
                        available_seats_A[i] = null;
                        for (int j=0;j<id.length;j++){
                            if (id[j] == id1){
                                seats_booked[j] = check_seat;
                                System.out.println("seats booked");
                            }
                        }
                        break;
                    }
                    else{
                        System.out.println("seat unavailable");
                        break;
                    }
                }
                break;
            case "U":
                for (int i=0;i<available_seats_U.length;i++){
                    if (available_seats_U[i] == check_seat){
                        System.out.println("seat available");
                        available_seats_U[i] = null;
                        for (int j=0;j<id.length;j++){
                            if (id[j] == id1){
                                seats_booked[j] = check_seat;
                                System.out.println("seats booked");
                            }
                        }
                        break;
                    }
                    else{
                        continue;
                        
                    }
                }
                break;
            default : 
                System.out.println("coach unavailable");
                break;
        }
}



    void bookseat(String name , String coach , String seat){
        switch (coach){
            case "L":{
                for (int i=0;i<available_seats_L.length;i++){
                    if (available_seats_L[i] == seat){
                        for (int j=0;j<id.length;j++){
                            if (id[i] == name){
                                seats_booked[j] = seat; 
                                available_seats_L[i] = null;
                                System.out.println("ticket booked");
                            }
                            else
                                continue;
                        }
                    
                    }
                    else
                        continue;
                }
            }
            case "A":{
                for (int i=0;i<available_seats_A.length;i++){
                    if (available_seats_A[i] == seat){
                        for (int j=0;j<id.length;j++){
                            if (id[i] == name){
                                seats_booked[j] = seat; 
                                available_seats_A[i] = null;
                                System.out.println("ticket booked");
                            }
                            else
                                continue;
                        }
                    
                    }
                    else
                        continue;
                }
               
            }
            case "U":{
                for (int i=0;i<available_seats_U.length;i++){
                    if (available_seats_U[i] == seat){
                        for (int j=0;j<id.length;j++){
                            if (id[i] == name){
                                seats_booked[j] = seat; 
                                available_seats_U[i] = null;
                                System.out.println("ticket booked");
                            }
                            else
                                continue;
                        }
                    
                    }
                    else
                        continue;
                }
                
            }
        }
    }

    void getDetails(String det_name){
        for (int i=0;i<id.length;i++){
            if (id[i] == det_name){
                System.out.println("name : "+id[i]);
                System.out.println("email : "+email_id[i]);
                System.out.println("seats booked : "+seats_booked[i]);
            }
        }
    }
}





public class SingleTrain {
    

    public static void main(String[] args) {
        user_authentication u1 = new user_authentication();
        u1.register("vigneswaran", "vikki@3063", 21 , "vigneswaranengineer3063@gmail.com");
        u1.userDetails();
        u1.login("vigneswaran","vikki@3063");
        u1.checkSeat("vigneswaran","U","U11");
        u1.getDetails("vigneswaran");

    }
}
