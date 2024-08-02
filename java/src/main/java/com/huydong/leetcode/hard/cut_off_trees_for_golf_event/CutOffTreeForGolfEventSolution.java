package com.huydong.leetcode.hard.cut_off_trees_for_golf_event;

import java.util.*;

public class CutOffTreeForGolfEventSolution {
    private class Point {
        int row;
        int col;
        int dist;

        public Point(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int cutOffTree(List<List<Integer>> forest) {
        Map<Integer, Point> hashPoint = new HashMap<>();
        for (int row = 0; row < forest.size(); row++) {
            for (int col = 0; col < forest.get(row).size(); col++) {
                int height = forest.get(row).get(col);
                if (height != 0 && height != 1) {
                    hashPoint.put(height, new Point(row, col));
                }

            }
        }
        int count = -1;
        int[] arr = new int[hashPoint.keySet().size()];
        for (int key : hashPoint.keySet()) {
            count++;
            arr[count] = key;
        }
        Arrays.sort(arr);
        int result = 0;
        for (int i = -1; i < arr.length - 1; i++) {
            int distance = 0;
            if (i == -1) {
                distance = findMinimumDistance(forest, new Point(0, 0), hashPoint.get(arr[i + 1]));
            } else {
                distance = findMinimumDistance(forest, hashPoint.get(arr[i]), hashPoint.get(arr[i + 1]));
            }
            if (distance == -1) {
                return -1;
            } else {
                result += distance;
            }
        }
        return result;
    }

    private int findMinimumDistance(List<List<Integer>> forest, Point start, Point end) {
        boolean[][] visited = new boolean[forest.size()][forest.get(0).size()];
        Queue<Point> pointQueue = new LinkedList<>();
        pointQueue.add(new Point(start.row, start.col, 0));
        visited[start.row][start.col] = true;
        while (!pointQueue.isEmpty()) {
            Point currentPoint = pointQueue.poll();
            if (currentPoint.row == end.row && currentPoint.col == end.col) {
                return currentPoint.dist;
            }
            //top
            Point topMove = new Point(currentPoint.row - 1, currentPoint.col, currentPoint.dist + 1);
            Point botMove = new Point(currentPoint.row + 1, currentPoint.col, currentPoint.dist + 1);
            Point rightMove = new Point(currentPoint.row, currentPoint.col + 1, currentPoint.dist + 1);
            Point leftMove = new Point(currentPoint.row, currentPoint.col - 1, currentPoint.dist + 1);
            if (isValidPosition(forest, topMove, visited)) {
                visited[topMove.row][topMove.col] = true;
                pointQueue.add(topMove);
            }
            if (isValidPosition(forest, botMove, visited)) {
                visited[botMove.row][botMove.col] = true;
                pointQueue.add(botMove);
            }
            if (isValidPosition(forest, rightMove, visited)) {
                visited[rightMove.row][rightMove.col] = true;
                pointQueue.add(rightMove);
            }
            if (isValidPosition(forest, leftMove, visited)) {
                visited[leftMove.row][leftMove.col] = true;
                pointQueue.add(leftMove);
            }
        }
        return -1;
    }

    private boolean isValidPosition(List<List<Integer>> forest, Point point, boolean[][] visited) {
        return point.row < forest.size() && point.row >= 0
                && point.col < forest.get(0).size() && point.col >= 0
                && forest.get(point.row).get(point.col) != 0 && !visited[point.row][point.col];
    }

}
