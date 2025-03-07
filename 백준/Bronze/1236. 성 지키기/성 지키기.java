
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);

        boolean[] rowSecured = new boolean[N];
        boolean[] colSecured = new boolean[M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowSecured[i] = true;
                    colSecured[j] = true;
                }
            }
        }

        // 경비원이 없는 행과 열의 개수를 각각 세기
        int rowCount = 0;
        int colCount = 0;

        for (boolean secured : rowSecured) {
            if (!secured) rowCount++;
        }

        for (boolean secured : colSecured) {
            if (!secured) colCount++;
        }

        // 행과 열 중에서 더 큰 값이 최소 추가해야 하는 경비원 수
        bw.write(String.valueOf(Math.max(rowCount, colCount)));
        bw.flush();
        bw.close();
    }
}
