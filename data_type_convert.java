public class data_type_convert {
    

    public String intToRoman(int num){
        String[] thousands = {"","M","MM","MMM"};
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return thousands[(num/1000)]+hundreds[(num%1000)/100]+tens[(num%100)/10]+units[(num%10)];

    }

    public String intToBinary(int num){
        String str = "";
        int value;
        while(num>1){
            value = num%2;
            str = str+""+value;
            num = num/2;
        }
        str = str+""+num;
        str = toReverse(str);
        return str;
    }

    public String intToOctal(int num){
        String oct = "";
        int val;
        while(num>1){
            val = num%8;
            oct = oct+""+val;
            num = num/8;
        }
        oct = oct+""+num;
        oct = toReverse(oct);
        return oct;
    }

    public String toReverse(String str){
        str.toCharArray();
        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
            rev = rev+""+str.charAt(i);

        }
        return rev;
    }

    public String intToHexadecimal(int num){
        String[] value = {"A","B","C","D","E","F"};
        String hex = "";
        int val;
        if(num<16){
            if(num>9){
                val = num-9;
                hex = hex+""+value[val-1];
                return hex;
            }
            hex = hex+""+num;
            return hex;
        }
        while(num>16){
            val = num%16;
            if(val>9){
                val = val-9;
                hex = hex+""+value[val];
            }
            else{
                hex = hex+""+val;
            }
        }
        hex = hex+""+num;
        hex = toReverse(hex);
        return hex;
    }


    public static void main(String[] args){
        int number = 12;
        data_type_convert d = new data_type_convert();
        System.err.println("integer to roman : " + d.intToRoman(number));
        System.out.println("integer to binary : "+ d.intToBinary(number));
        System.out.println("integer to octal : "+d.intToOctal(number));
        System.out.println("integer to hexadecimal : "+d.intToHexadecimal(number));
    }
}
