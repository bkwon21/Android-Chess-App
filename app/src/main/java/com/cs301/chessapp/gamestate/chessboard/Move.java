package com.cs301.chessapp.gamestate.chessboard;

/**
 * Move
 * <p>
 * This class represents a move in a chess game. It contains the x and y
 * coordinates of the starting and ending positions of the piece that is being
 * moved. The coordinates are immutable after the object is created.
 *
 * @author Bryce Kwon
 * @version March 17, 2023
 */
public class Move {
    private final int _x1;
    private final int _x2;
    private final int _y1;
    private final int _y2;

    /**
     * Move constructor
     * <p>
     * This constructor creates a new Move object starting x y coordinates
     * and ending x y coordinates.
     *
     * @param x1        x coordinate of starting position
     * @param x2        x coordinate of ending position
     * @param y1        y coordinate of starting position
     * @param y2        y coordinate of ending position
     */
    public Move(int x1, int x2, int y1, int y2) {
        this._x1 = x1;
        this._x2 = x2;
        this._y1 = y1;
        this._y2 = y2;
    }

    /**
     * getStart1
     * <p>
     * This method returns the x coordinate of the starting position.
     *
     * @return      x coordinate of starting position
     */
    public int getStartX() {
        return _x1;
    }

    /**
     * getEndX
     * <p>
     * This method returns the x coordinate of the ending position.
     *
     * @return      x coordinate of ending position
     */
    public int getEndX() {
        return _x2;
    }

    /**
     * getStartY
     * <p>
     * This method returns the y coordinate of the starting position.
     *
     * @return      y coordinate of starting position
     */
    public int getStartY() {
        return _y1;
    }

    /**
     * getEndY
     * <p>
     * This method returns the y coordinate of the ending position.
     *
     * @return      y coordinate of ending position
     */
    public int getEndY() {
        return _y2;
    }
}