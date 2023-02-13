package lang.print.gaps.task6;

import java.util.Scanner;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        System.out.println(Math.round(numberToBeRounded));
    }
    public void main(String[] args){
        float floatNumber;
        Scanner input=new Scanner(System.in);
        floatNumber=input.nextFloat();
       roundNumber(floatNumber);
    }
}


