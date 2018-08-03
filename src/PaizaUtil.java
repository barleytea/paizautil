import java.util.*;
import java.io.*;

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

    public class FastScanner {
        private final InputStream in = System.in;
            private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
            }

            private int readByte() {
            if (hasNextByte()) {
                return buffer[ptr++];
            } else {
                return -1;
            }
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) {
            throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while(true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}
