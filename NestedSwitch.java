package practice_pack.basics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID:");
        int empID = sc.nextInt();
        // OLD SWITCH_CASE IMPLEMENTATION
//        switch (empID){
//            case 1:
//                System.out.println("Uddharsh Vasili");
//                break;
//            case 2:
//                System.out.println("XYZ");
//                break;
//            case 3:
//                System.out.println("Employee #3:");
//                System.out.println("Enter department of employee:");
//                String dept = sc.next();
//                switch (dept){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Pre-Sales":
//                        System.out.println("Pre-Sales Department");
//                        break;
//                    default:
//                        System.out.println("Invalid Department");
//                }
//                break;
//            default:
//                System.out.println("Invalid Employee ID");
//        }
        //ENHANCED SWITCH-CASE IMPLEMENTATION
        switch (empID){
            case 1:
                System.out.println("Uddharsh Vasili");
                break;
            case 2:
                System.out.println("XYZ");
                break;
            case 3:
                System.out.println("Employee #3:");
                System.out.println("Enter department of employee:");
                String dept = sc.next();
                switch (dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Pre-Sales":
                        System.out.println("Pre-Sales Department");
                        break;
                    default:
                        System.out.println("Invalid Department");
                }
                break;
            default:
                System.out.println("Invalid Employee ID");
        }
    }
}
