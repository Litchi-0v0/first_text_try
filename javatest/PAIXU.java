
        import java.util.Scanner;

        public class PAIXU{
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int m, n;
                char[][] grid;
                while (true) {
                    m = scanner.nextInt();
                    n = scanner.nextInt();
                    if (m == 0) break; // 输入结束
                    grid = new char[m][n];
                    for (int i = 0; i < m; i++) {
                        String row = scanner.next();
                        for (int j = 0; j < n; j++) {
                            grid[i][j] = row.charAt(j);
                        }
                    }
                    // 处理当前网格
                    // ...
                }
                scanner.close();
            }
        }
        

