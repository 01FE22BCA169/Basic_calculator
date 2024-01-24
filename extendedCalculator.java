/**
 * The extendedCalculator class provides methods to calculate the square, cube, and modulus of given
 * operands.
 */
class extendedCalculator{
    
    /**
     * The function "square" takes a float number as input and returns the square of that number.
     * 
     * @param operant_1 The parameter "operant_1" is a float type variable that represents the operand
     * for which we want to calculate the square.
     * @return the square of the operand.
     */
    float square(float operant_1){
        return(operant_1*operant_1);
    }

    /**
     * The function "cube" takes a float number as input and returns the cube of that number.
     * 
     * @param operant_1 The parameter "operant_1" is a float variable that represents the number for
     * which we want to calculate the cube.
     * @return The cube of the operand_1 value.
     */
    float cube (float operant_1){
        return(operant_1*operant_1*operant_1);
    }

   // The `modules` method is calculating the remainder when `operant_1` is divided by `operant_2`. It
   // uses the modulus operator `%` to perform the calculation and returns the result.
    float modules (float operant_1,float operant_2){
        return(operant_1%operant_2);
    }
    }





