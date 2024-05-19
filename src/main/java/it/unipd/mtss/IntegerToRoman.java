////////////////////////////////////////////////////////////////////
// [SAMUELE] [CORRADIN] [2068235]
// [RICCARDO] [PIVA] [2079241]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        String stringRoman = "";
        int[] numeriInt = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numeriString = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i = 0; i < numeriInt.length; i++){
            while (number >= numeriInt[i]){
                number = number - numeriInt[i];
                stringRoman += numeriString[i];
            }
        }
        return stringRoman;
    }
}
