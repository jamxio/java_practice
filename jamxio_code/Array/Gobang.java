
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gobang {

    private static int BOARD_SIZE = 15;

    private String[][] board;//二维数组棋板

    public void initBoard() {
        board = new String[BOARD_SIZE][BOARD_SIZE];//正方形的棋板
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "＋";
            }
        }
    }

    public void printBoard() {
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

    /**
     * 主函数
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        var gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        //获取键盘输入
        var br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        while ((inputStr = br.readLine()) != null) {
            String[] posStrArr = inputStr.split(",");//获取输入的位置信息
            var xPos = Integer.parseInt(posStrArr[0]);//x轴位置
            var yPos = Integer.parseInt(posStrArr[1]);//y轴位置
            gb.board[yPos - 1][xPos - 1] = "●";
            gb.printBoard();
            System.out.println("请输入您下棋的坐标，应以x,y的格式：");
        }
    }
}
