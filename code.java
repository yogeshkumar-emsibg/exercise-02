
import java.util.Scanner;
class TriangleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Side One value: ");
        int sideOne = sc.nextInt();
        System.out.println("Enter the Side Two value: ");
        int sideTwo = sc.nextInt();
        System.out.println("Enter the Side Three value: ");
        int sideThree = sc.nextInt();
        
        boolean result = isTriangle(sideOne,sideTwo,sideThree);
        System.out.println("\nResult: " );
        System.out.print(result);
        if(result){
            System.out.println("\nIt can form a triangle!");
            if(sideOne == sideTwo && sideOne == sideThree){
                System.out.println("And it is a equilateral triangle!");
            }
        }
        else{
            System.out.println("It cannot form a triangle!");
        }
    }
    
    public static boolean isTriangle(int sideA,int sideB,int sideC){
        if(sideA < 0 || sideB < 0 || sideC < 0){
            
            return false;
        }
        
        if(sideA + sideB > sideC && sideB + sideC > sideA && sideC + sideA > sideA ){
            return true;
        }
        
        return false;
    }
}