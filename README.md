# Introduction to the Tic-Tac-Toe Program

This Java program implements a Tic-Tac-Toe (Noughts and Crosses) game for two players. The game is played on a 3x3 grid, where each player alternately places their marker (`O` for Player 1 and `X` for Player 2) on the board. The objective is to align three markers in a row, column, or diagonal before the opponent.

## Key Features

### Turn-Based Gameplay

Players take turns inputting their moves by specifying grid coordinates in the format `x,y`.
The game validates the input to ensure the move is valid (i.e., the cell is not already occupied).

### Dynamic Board Display

After every move, the grid is displayed, showing the current state of the game.
Symbols `O`, `X`, and `-` represent Player 1, Player 2, and empty cells, respectively.

### Winning and Draw Detection

The program checks for winning conditions after each move:
Three identical markers in a row, column, or diagonal result in a win.
If all cells are filled and no player has won, the game ends in a draw.

### Game Logic Separation

The game logic is modularized into three classes:
Main: Handles the main game loop, user input, and interaction.
Grid: Manages the grid display and layout.
Game: Contains the logic to check for winning conditions or a draw.

### Input Validation

The program ensures that players enter valid coordinates and retry if their input is invalid.

## How It Works

1. The game starts by displaying an empty 3x3 grid.
2. Players take turns entering their moves by providing coordinates `(x,y)`:
  `x` represents the row number (1-based).
  `y` represents the column number (1-based).
3. The program updates the grid after each move and checks for the following:
  A win for Player 1 or Player 2.
  A draw if all cells are occupied.
4. If a player wins or the game ends in a draw, the program displays the result and exits.
