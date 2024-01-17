

class Calculator{
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
    float subtraction(float operant_1,float operant_2){
        return(operant_1 - operant_2);
    }

    float multiplication(float operant_1,float operant_2){
        return(operant_1 * operant_2);
    }

    float division(float operant_1,float operant_2){
        return(operant_1 / operant_2);
    }


public static void name(String[] args ) {
    Calculator cal=new Calculator();
    float operant_1=10;
    float operant_2=5;

    float add_result=cal.addition(operant_1,operant_2);
    System.out.print("result is:" +add_result);

    float sub_result=cal.subtraction(operant_1,operant_2);
    System.out.print("result is:" +sub_result);

    float mul_result=cal.multiplication(operant_1,operant_2);
    System.out.print("result is:" +mul_result);

    float div_result=cal.division(operant_1,operant_2);
    System.out.print("result is:" +div_result);
}
}


    

