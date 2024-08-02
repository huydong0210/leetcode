package com.huydong.leetcode.medium.word_search;

import java.util.LinkedList;
import java.util.Queue;

public class WordSearchSolution {
    private class Position {
        int row;
        int column;
        String word;
        boolean[][] visited;


        public Position(int row, int column, char[][] board, String word) {
            this.row = row;
            this.column = column;
            this.word = word;
            visited = new boolean[board.length][board[0].length];
            visited[row][column] = true;
        }

        public Position(int row, int column, String word, boolean[][] visited) {
            this.row = row;
            this.column = column;
            this.word = word;
            this.visited = visited;
        }
    }

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (existFromPosition(new Position(i, j, board, board[i][j] + ""), board, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean existFromPosition(Position position, char[][] board, String word) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(position);
        while (!queue.isEmpty()) {
            Position index = queue.poll();
            if (index.word.equals(word)) {
                return true;
            }
            int x = index.row;
            int y = index.column;
            boolean[][] visited;
            Position top = new Position(x + 1, y, board, index.word + board[x + 1][y]);
        }
        return false;
    }

    private boolean isValidPosition(Position position, int maxRows, int maxColumn) {
        int x = position.row;
        int y = position.column;
        return x >= 0 && y >= 0 && x < maxRows && y < maxColumn && !position.visited[x][y];
    }
}
