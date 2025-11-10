import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int n = park.length;
        int m = park[0].length;
        int maxSquare = 0;

        // 공원 내 가능한 정사각형 크기 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (park[i][j].equals("-1")) {
                    int size = getSquareSize(park, i, j);
                    maxSquare = Math.max(maxSquare, size);
                }
            }
        }

        // mats 중에서 maxSquare 이하인 가장 큰 크기
        int answer = 0;
        for (int mat : mats) {
            if (mat <= maxSquare) {
                answer = Math.max(answer, mat);
            }
        }

        return answer == 0 ? -1 : answer;
    }

    private int getSquareSize(String[][] park, int x, int y) {
        int n = park.length;
        int m = park[0].length;
        int size = 0;

        while (x + size < n && y + size < m) {
            for (int i = x; i <= x + size; i++) {
                for (int j = y; j <= y + size; j++) {
                    if (!park[i][j].equals("-1")) {
                        return size;
                    }
                }
            }
            size++;
        }
        return size;
    }
}