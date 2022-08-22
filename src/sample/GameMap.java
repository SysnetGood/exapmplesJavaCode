package sample;

public class GameMap {
    public char[][] map;

    int x = 9;
    int y = 0;

    public void addPlayer(int indexX, int indexY) {
        map[indexX][indexY] = 'P';
    }

    public void moveToTheRight() {
        if (map[x][y + 1] == 'S' || y + 1 > 9) {
            System.out.println("Сюда ходить нельзя!");
        } else {
            map[x][y + 1] = 'P';
            map[x][y] = '.';
            y++;
        }
    }

    public void moveToTheLeft() {

    }

    public void moveToTheUp() {

    }

    public void moveToTheDown() {

    }
}
