package com.logical;

/**
 * find the coupon code which are unique
 * @author Sreelipta
 */

public class CouponNumber {
    public static void main(String[] args) {
        /*
         * char array to get characters for coupon
         */
        char[] chars = "abcdefghijklmnop".toCharArray();
        /*
         * length of coupon
         */
        int max = 100000000;
        /*
         * random value
         */
        double d = Math.random();
        int random = (int) (d * max);
        StringBuffer sb = new StringBuffer();

        while (random > 0) {
            sb.append(chars[random % chars.length]);
            random /= chars.length;
        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}
