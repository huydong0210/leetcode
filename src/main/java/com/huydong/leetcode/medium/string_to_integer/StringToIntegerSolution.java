package com.huydong.leetcode.medium.string_to_integer;

import java.util.Objects;

public class StringToIntegerSolution {
    public int myAtoi(String s) {
        int i = 0;
        Long resultLong = null;
        Integer sign = null;
        boolean isNonDigit = false;
        while (i < s.length()) {
            switch (s.charAt(i)) {
                case ' ': {
                    if (sign == null && resultLong == null) {
                        i++;
                    } else {
                        isNonDigit = true;
                    }
                    break;

                }
                case '-': {
                    if (resultLong == null && sign == null) {
                        sign = -1;
                        i++;
                        break;
                    } else {
                        isNonDigit = true;
                        break;
                    }
                }
                case '+': {
                    if (resultLong == null && sign == null) {
                        sign = 1;
                        i++;
                        break;
                    } else {
                        isNonDigit = true;
                        break;
                    }
                }
                default: {
                    Integer index = getIntFromCharacter(s.charAt(i));
                    if (Objects.isNull(index)) {
                        isNonDigit = true;
                        break;
                    } else {
                        resultLong = resultLong == null ? 0 : resultLong;
                        resultLong = resultLong * 10 + index;
                        i++;
                    }
                }
            }
            if (isNonDigit) {
                break;
            }
            long check = resultLong == null ? 0 : resultLong * (sign == null ? 1 : sign);
            if (check < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if (check > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

        }
        resultLong = resultLong == null ? 0 : resultLong * (sign == null ? 1 : sign);
        if (resultLong < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (resultLong > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return resultLong.intValue();
        }
    }

    public Integer getIntFromCharacter(Character character) {
        switch (character) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return null;
        }
    }

}
