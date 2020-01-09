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

package com.abranhe.cop3337.assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DirectorySortDemo {
   public static void main(String[] args) {
      String[] dirNames = { "dir12", "dir5", "dir9", "dir1", "dir4", "lab10", "lab2",
                            "lab7", "lab17", "lab8", "quiz8", "quiz10", "quiz11", "quiz12",
                            "dir11", "dir8", "dir7", "dir15", "dir3" };

      ArrayList<String> directories = new ArrayList<>(Arrays.asList(dirNames));

      System.out.println("Unsorted List:");
      System.out.println(directories);
      Collections.sort(directories, new DirectoryComparator());
      System.out.println();
      System.out.println("Sorted List:");
      System.out.println(directories);
   }
}
