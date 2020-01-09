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
