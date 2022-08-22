package sample;

import java.io.IOException;

public class Game  {

    private int key;

    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        System.out.println(c);
        GameMap gameMap = new GameMap();
        Game game = new Game();
        game.createMap(gameMap);
        game.addBarers(gameMap, game);
        gameMap.addPlayer(9, 0);
        game.showArray(gameMap);
        game.movingController(gameMap);
    }

    public void showArray(GameMap map) {
        for (char[] columns : map.map) {
            for (char row : columns) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public void createMap(GameMap map) {
        map.map = new char[10][10];
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                map.map[i][j] = '_';
            }
        }
    }

    public void addBarers(GameMap map, Game game) {
        for (int i = 0; i < map.map.length; i++) {
            for (int j = 0; j < map.map[i].length; j++) {
                if (game.getBarer()) {
                    map.map[i][j] = 'B';
                }
            }
        }
    }

    public boolean getBarer() {
        int random = (int) (Math.random() * 100);
        return random >= 80;
    }

    public void movingController(GameMap game) {
/*        switch (key) {
            case KeyEvent.VK_RIGHT: {
                game.moveToTheRight();
            }
            case KeyEvent.VK_LEFT: {
                game.moveToTheLeft();
            }
            case KeyEvent.VK_DOWN: {
                game.moveToTheDown();
            }
            case KeyEvent.VK_UP: {
                game.moveToTheUp();
            }
            default: {
                System.out.println("Bad button");
            }
        }*/
    }


}
