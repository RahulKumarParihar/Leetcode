package com.rahulkumarpariharmailbox.Medium;

public class IntegerToRoman implements com.rahulkumarpariharmailbox.IntefaceMedium.IntegerToRoman {
    @Override
    public String intToRoman(int num) {
        int[] returnArray = new int[3];
        StringBuilder sb = new StringBuilder();
        returnArray[0] = num;
        while(returnArray[0] >= 900){
            returnArray = helper(returnArray, 1000, 1);
            stringHelper(sb,returnArray[2] == 1 ?"CM" : "M",returnArray[1]);
        }
        while(returnArray[0] >= 400){
            returnArray = helper(returnArray, 500, 1);
            stringHelper(sb,returnArray[2] == 1 ?"CD" : "D",returnArray[1]);
        }
        while(returnArray[0] >= 90){
            returnArray = helper(returnArray, 100, 2);
            stringHelper(sb,returnArray[2] == 1 ?"XC" : "C",returnArray[1]);
        }
        while(returnArray[0] >= 40){
            returnArray = helper(returnArray, 50, 2);
            stringHelper(sb,returnArray[2] == 1 ?"XL" : "L",returnArray[1]);
        }
        while(returnArray[0] > 8){
            returnArray = helper(returnArray, 10, 3);
            stringHelper(sb,returnArray[2] == 1 ?"IX" : "X",returnArray[1]);
        }
        while(returnArray[0] > 3){
            returnArray = helper(returnArray, 5, 3);
            stringHelper(sb,returnArray[2] == 1 ?"IV":"V",returnArray[1]);
        }
        //returnArray[0] = helper(returnArray, 1);
        stringHelper(sb,"I",returnArray[0]);

        return sb.toString();
    }

    int[] helper(int[] returnArray, int div, int id){
        returnArray[1] = 0;
        returnArray[2] = 0;
        int q = (int)Math.floor(returnArray[0] / div);
        int check = div - returnArray[0];
        if(q == 0 && ((check == 1 && returnArray[0] < 10 && id == 3) || (check <= 10 && returnArray[0] < 100 && id == 2) || (check <= 100 && returnArray[0] < 1000 && id == 1))){
            if(id == 3){
                returnArray[0] = 0;
            }else if(id == 2){
                returnArray[0] -= (div - 10);
            }else{
                returnArray[0] -= (div - 100);
            }

            returnArray[1] = 1;
            returnArray[2] = 1;
        }
        else if(q != 0){
            returnArray[0] %= div;
            returnArray[1] = q;
        }
        return returnArray;
    }

    void stringHelper(StringBuilder sb, String StringToAppend,int numberOfTimes){
        for(int i = 0; i < numberOfTimes; i++){
            sb.append(StringToAppend);
        }
    }
}
