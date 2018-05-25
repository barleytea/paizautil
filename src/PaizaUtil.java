package barleytea.paizautil;

import java.util.*;

public class PaizaUtil {

    public static class IOUtil {
        /**
         * format input data in List of List(inferrence of matrix)
         * @param nCol the number of rows of input data
         * @return List of Integer Lists that has "nCol" items
         */
        public static List<List<Integer>> getIntInputList(int nCol) {
            final Scanner sc = new Scanner(System.in);
            final List<List<Integer>> result = new ArrayList<List<Integer>>();
            while (sc.hasNext()) {
                final List<Integer> row = new ArrayList<Integer>();
                final String[] line  = sc.nextLine().split(" ");
                for (int i = 0; i < nCol; i ++) {
                    row.add(Integer.parseInt(line[i]));
                }
                result.add(row);
            }
            return result;
        }
    }

    public static class Holder<T> {

        private T value;

        public Holder(T value) {
            this.value = value;
        }

        /**
         * get the value set to Holder
         * @return value set to Holder
         */
        public T get() {
            return this.value;
        }

        /**
         * set a value to Holder and remove the old value
         * @param value the value you want to replace the old value already set to Holder with
         */
        public void set(T value) {
            this.value = value;
        }
    }
}
