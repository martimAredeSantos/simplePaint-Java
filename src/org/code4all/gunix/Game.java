package org.code4all.gunix;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.HashMap;

public class Game {
    Rectangle background;// my background is actually my grid :P
    public static int PADDING=10; // extra space from top left and left side
    static int cols; // start pos
    static int rows; // start pos
    public static int cellSize; // size
    public static HashMap gridID = new HashMap<String,Rectangle>();
    public void init(int cols,int rows,int cellSize){ // creates a background ( the grid is the background )
        this.cols=cols;
        this.rows=rows;
        this.cellSize=cellSize;

        String recID;

        for(int iX=0;iX<cols;iX++){ //draws the line in X
            for(int iY=0;iY<rows;iY++){ // draws that line per col
                recID= iX +","+iY;
                gridID.put(recID,new Rectangle(PADDING+(iX* cellSize),PADDING+(iY* cellSize), cellSize, cellSize));

                Rectangle use2Draw = (Rectangle) (gridID.get(recID));

                use2Draw.draw();
            }
        }


    }
}
