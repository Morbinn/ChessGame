package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Board {
	
	
	
	public Scene makeBoard() throws IOException{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("board.fxml"));
		GridPane chessBoard = fxmlLoader.load();
		for(int r = 0; r < 8; r++) {
			for(int c = 0; c < 8; c++) {
				Square square = new Square(c,r);
				//Pane square = new Pane();
				int row = r;
				int col = c;
		        square.setStyle((r + c) % 2 == 0 ? "-fx-background-color: #fce7cf;" : "-fx-background-color: #f09a65;"); // set the color of the square
		        square.setOnMouseClicked(event -> {
		            System.out.println("Square clicked: row=" + row + ", col=" + col);
		        });
		        // add the square to the grid
		        chessBoard.add(square, c, r);
			}
		}
		Scene scene = new Scene(chessBoard);
		return scene;
	}
}

