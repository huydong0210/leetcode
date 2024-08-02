package com.huydong.leetcode.medium.integer_to_roman;

public class IntegerToRomanSolution {

    public String intToRoman(int num) {

        StringBuilder result = new StringBuilder();
        num = appendResult(num,result, 1000);
        num = appendResult(num,result, 900);
        num = appendResult(num,result, 500);
        num = appendResult(num,result, 400);
        num = appendResult(num,result, 100);
        num = appendResult(num,result, 90);
        num = appendResult(num,result, 50);
        num = appendResult(num,result, 40);
        num = appendResult(num,result, 10);
        num = appendResult(num,result, 9);
        num = appendResult(num,result, 5);
        num = appendResult(num,result, 4);
        num = appendResult(num,result, 1);
        return result.toString();
    }
    private int appendResult(int num, StringBuilder result , int comparison ){
        int count = num/comparison;
        for (int i = 1; i<=count; i++){
            result.append(getRoman(comparison));
            num-=comparison;
        }
        return num;
    }
    private String getRoman(int num) {
        switch (num) {
            case 1:
                return "I";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 900:
                return "CM";
            case 1000:
                return "M";
            default:
                return "";
        }
    }
}
