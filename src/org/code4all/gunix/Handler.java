package org.code4all.gunix;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Handler implements MouseHandler {
    Mouse mouse;
    public Handler(){
        this.mouse = new Mouse(this);
    }

    @Override
    public void mouseClicked(MouseEvent click) {
        int correctedY = (int) ((click.getY()-30));
        int correctedX = (int) ((click.getX())-8);

        /* test click location

        Rectangle test = new Rectangle(correctedX,correctedY,2,2);
        test.setColor(Color.RED);
        test.fill();
        */

        int gridX = (int) Math.floor((double) (correctedX - Game.PADDING) /Game.cellSize);
        int gridY = (int) Math.floor((double) (correctedY - Game.PADDING) /Game.cellSize);

        String key = gridX + "," + gridY;
        Rectangle clicked = (Rectangle) Game.gridID.get(key);

        System.out.println(gridX+","+gridY);

        if (clicked != null) {
            clicked.fill(); // Fill the clicked rectangle
        }
    }

    @Override
    public void mouseMoved(MouseEvent moved) {
        System.out.println("keep still to color");
    }
}
