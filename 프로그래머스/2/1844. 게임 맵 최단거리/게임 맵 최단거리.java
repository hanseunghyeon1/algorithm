import java.util.*;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {-1, 1, 0, 0}; // 상하좌우 방향으로 이동
        int[] dy = {0, 0, -1, 1};
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0, 1));
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            int count = node.count;
            
            if (x == n - 1 && y == m - 1) {
                return count;
            }
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1) {
                    maps[nx][ny] = 0;
                    queue.offer(new Node(nx, ny, count + 1));
                }
            }
        }
        
        return -1;
    }
}

class Node {
    int x;
    int y;
    int count;

    public Node(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }
}