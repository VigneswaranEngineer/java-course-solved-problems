public class aggregations {
    int id;
    String name;
    address add;
    final int b;

    aggregations(int id , String name,address add,final int b){
        this.b = b;
        this.id = id;
        this.name = name;
        this.add = add;
        getDetails();
    }


    void getDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(add.address);
        System.out.println(b);

        
    }

    public static void main(String args[]){
        address ad1 = new address("main road", 600042, "chennai");
        aggregations agg1 = new aggregations(123, "kumar",ad1,10);
        
    }
}

class address{
    String address;
    int pincode;
    String city;

    address(String address , int pincode , String city){
        this.address = address;
        this.pincode = pincode;
        this.city = city;
        
    }

    
}