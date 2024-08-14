public class Question3238 {
  public static void main(String[] args) {
    int n = 4;
    //int[][] pick = new int[][]{{0,0},{1,0},{1,0},{2,1},{2,1},{2,0}};
    //int[][] pick = new int[][]{{1,1},{1,2},{1,3},{1,4}};
    // int[][] pick = new int[][]{{1,1},{2,4},{2,4},{2,4}};
    // int[][] pick = new int[][]{{1,1},{1,2},{1,3},{1,4}};
    int[][] pick = new int[][]{{0,0},{1,0},{1,0},{2,1},{2,1},{2,0},{3,8},{3,8},{3,8},{3,7},{3,7},{3,7},{3,8}};
    System.out.println(winningPlayerCount(n, pick));
  }

  


  
  // n = 5, pick = [[1,1],[1,2],[1,3],[1,4]]
  // n = 5, pick = [[1,1],[2,4],[2,4],[2,4]]
  // 2 <= n <= 10
  // 1 <= pick.length <= 100, the # row (player)
  // pick[i].length == 2, the # column (color)
  // 0 <= xi <= n - 1
  // 0 <= yi <= 10


  public static int winningPlayerCount(int n, int[][] pick) {
    int[][] countPlayerColor = new int[n][11]; // 0 <= yi <= 10
    int player = -1, color = -1;
    for (int i = 0; i < pick.length; i++) { // pick.length = n
        player = pick[i][0]; // 1st element in each element is player
        color = pick[i][1]; // 2nd element in each element is color
        countPlayerColor[player][color]++; // record each element
    }
    // Solve
    int winnerCount = 0;
    for (int i = 0; i < countPlayerColor.length; i++) { // countPlayerColor.length = n
        for (int j = 0; j < countPlayerColor[i].length; j++) {
            System.out.println("i=" + i + "---j=" + j + "---picked " + countPlayerColor[i][j]);
            if (countPlayerColor[i][j] > i) {
                System.out.println("i=" + i + "-->j=>>" + j + "-->picked " + countPlayerColor[i][j] + "> " + i);
                winnerCount++;
                break;
            }
        }
    }
    
    return winnerCount;
 }

}
// [
//     [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], // player = 0
//     [2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], // player = 1
//     [1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0], // player = 2
//     [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] // player = 3
// ]