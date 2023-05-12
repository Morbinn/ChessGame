package application;

import javafx.scene.layout.Pane;

public class Square extends Pane {
	
	int x,y;
    boolean occupied;
    String name;

    public Square(int x, int y){
        this.x = x;
        this.y = y;
        this.occupied = false;
    }

}
