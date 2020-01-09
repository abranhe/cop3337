/**
 * This is free and unencumbered software released into the public domain.
 * <p>
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * <p>
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * <p>
 * For more information, please refer to <http://unlicense.org>
 */

package com.abranhe.cop3337.assignment2;

public class RestroomTester1 {
    public static void main(String[] args) {
        int STALLS = 12;
        Restroom wc = new Restroom(STALLS);
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("______X_____");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("___X__X_____");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("___X__X__X__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X__X__X__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X_XX__X__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X_XX_XX__");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("_X_X_XX_XX_X");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("XX_X_XX_XX_X");
        wc.addOccupant();
        System.out.println(wc.getStalls());
        System.out.println("XXXX_XX_XX_X");
    }
}

