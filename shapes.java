import java.util.Scanner;

    class rectangle {
        double length;
        double breadth;
        
        void rect(){
            double area = length*breadth;
            System.out.println("the area of rectage is "+area);
            }
    }
    class triangle{
        float breath;
        float heigh;

        void tri(){
        
            double area = 0.5*breath*heigh;
            System.out.println("the area is : "+area);

        }
    }
    class circle{
        float radius;

        void cir(){
        
        double area = 3.14*3.14*radius;
        System.out.println("the area is : "+area);

        }
    }

public class shapes{
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("enter the shape (1.triangle \t 2.rectangle \t 3.circle ) : ");
            int swi = s.nextInt();
            s.close();
            
            switch (swi) {
                case 1:
                    triangle t1 = new triangle();
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("enter the breadth : ");
                    t1.breath = sc1.nextInt();
                    sc1.nextLine();
                    System.out.println("enter the height : ");
                    t1.heigh = sc1.nextInt();
                    t1.tri();
                    sc1.close();
                    break;

                case 2:
                    Scanner sc = new Scanner(System.in);
                    rectangle r1 = new rectangle();
                    System.out.println("enter the breadth :");
                    r1.breadth = sc.nextDouble();
                    System.out.println("enter the length :");
                    r1.length = sc.nextInt();
                    
                    r1.rect();
                    sc.close();

                case 3:
                    circle c1 = new circle();
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("enter the radius : ");
                    c1.radius = sc2.nextInt();
                    c1.cir();
                    sc2.close();
            
                default:
                    System.out.println("enter the correct operation!!!");
                    break;
            }
            
            
            
            

            
        }
    }