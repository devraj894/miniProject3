import java.util.Scanner;
class Base{
    String name;
    int age;
    void getData1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you name : ");
        name = sc.next();
        System.out.print("Enter your age : ");
        age = sc.nextInt();
    }
    void showData1(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class miniProject4 extends Base{
    String branch;
    int semester;
    void getData2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your brach : ");
        branch = sc.next();
        System.out.print("Enter you semester : ");
        semester = sc.nextInt(); 
    }
    void showData2(){
        System.out.println("Branch : "+branch);
        System.out.println("Semester : "+semester);
    }
    public static void main(String[] args){
        miniProject4 m=new miniProject4();
        m.getData1();
        m.showData1();
        System.out.print("\n");
        m.getData2();
        m.showData2();
    }
}
