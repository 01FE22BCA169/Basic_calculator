

/**
 * The Calculator class provides methods for performing addition, subtraction, multiplication, and
 * division operations on floating-point numbers.
 */
class Calculator extends extendedCalculator{
    float addition(float operant_1,float operant_2){
        return(operant_1 + operant_2);
    }

    

    /**
     * The function "subtraction" takes two float numbers as input and returns their difference.
     * 
     * @param operant_1 The first operand for subtraction. It is a floating-point number.
     * @param operant_2 The second operand in the subtraction operation.
     * @return the result of subtracting operant_2 from operant_1.
     */
    /**
     * The function "subtraction" takes two float numbers as input and returns their difference.
     * 
     * @param operant_1 The first operand for subtraction. It is a floating-point number.
     * @param operant_2 The second operand in the subtraction operation.
     * @return the result of subtracting operant_2 from operant_1.
     */
    /**
     * The function "subtraction" takes two float numbers as input and returns their difference.
     * 
     * @param operant_1 The first operand for subtraction. It is a floating-point number.
     * @param operant_2 The second operand in the subtraction operation.
     * @return the result of subtracting operant_2 from operant_1.
     */
    float subtraction(float operant_1,float operant_2){
        return(operant_1 - operant_2);
    }

    /**
     * The function "multiplication" takes two float numbers as input and returns their product.
     * 
     * @param operant_1 The first operand for multiplication.
     * @param operant_2 The second operand in the multiplication operation.
     * @return the product of operant_1 and operant_2.
     */
    float multiplication(float operant_1,float operant_2){
        return(operant_1 * operant_2);
    }

    /**
     * The function "division" takes two float operands and returns their division.
     * 
     * @param operant_1 The first operand of the division operation.
     * @param operant_2 The second operand in the division operation.
     * @return The division of operant_1 by operant_2.
     */
    float division(float operant_1,float operant_2){
        return(operant_1 / operant_2);
    }

    
public static void main(String[] args ) {
    Calculator cal=new Calculator();
    float operant_1=10;
    float operant_2=5;

    float add_result=cal.addition(operant_1,operant_2);
    System.out.println("add result is:" +add_result);

    float sub_result=cal.subtraction(operant_1,operant_2);
    System.out.println("sub result is:" +sub_result);

    float mul_result=cal.multiplication(operant_1,operant_2);
    System.out.println("mul result is:" +mul_result);

    float div_result=cal.division(operant_1,operant_2);
    System.out.println("div result is:" +div_result);

    float square_result =cal.square(operant_1);
    System.out.println("square of number is:"+square_result);

    float cube_result =cal.cube(operant_1);
    System.out.println("square of number is:"+cube_result);

    float modules_result =cal.modules(operant_1,operant_2);
    System.out.println("square of number is:"+modules_result);



    
    
}
}


    

