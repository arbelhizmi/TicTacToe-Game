package com.example.arbel.tictactoegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class TicTacToeActivity extends AppCompatActivity implements View.OnClickListener{
    private Button Square00; private Button Square01; private Button Square02;
    private Button Square10; private Button Square11; private Button Square12;
    private Button Square20; private Button Square21; private Button Square22;
    private TicTacToeGame gameManager;
    private Button NewGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        Square00 = (Button) findViewById(R.id.Square00);
        Square01 = (Button) findViewById(R.id.Square01);
        Square02 = (Button) findViewById(R.id.Square02);
        Square10 = (Button) findViewById(R.id.Square10);
        Square11 = (Button) findViewById(R.id.Square11);
        Square12 = (Button) findViewById(R.id.Square12);
        Square20 = (Button) findViewById(R.id.Square20);
        Square21 = (Button) findViewById(R.id.Square21);
        Square22 = (Button) findViewById(R.id.Square22);
        NewGame = (Button) findViewById(R.id.NewGame);
        gameManager = new TicTacToeGame(Square00, Square01, Square02, Square10, Square11, Square12, Square20, Square21, Square22);
        Square00.setOnClickListener(this);
        Square01.setOnClickListener(this);
        Square02.setOnClickListener(this);
        Square10.setOnClickListener(this);
        Square11.setOnClickListener(this);
        Square12.setOnClickListener(this);
        Square20.setOnClickListener(this);
        Square21.setOnClickListener(this);
        Square22.setOnClickListener(this);
        NewGame.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Square00:
                this.gameManager.allMove(this.Square00);
                printWinner();
                break;
            case R.id.Square01:
                this.gameManager.allMove(this.Square01);
                printWinner();
                break;
            case R.id.Square02:
                this.gameManager.allMove(this.Square02);
                printWinner();
                break;
            case R.id.Square10:
                this.gameManager.allMove(this.Square10);
                printWinner();
                break;
            case R.id.Square11:
                this.gameManager.allMove(this.Square11);
                printWinner();
                break;
            case R.id.Square12:
                this.gameManager.allMove(this.Square12);
                printWinner();
                break;
            case R.id.Square20:
                this.gameManager.allMove(this.Square20);
                printWinner();
                break;
            case R.id.Square21:
                this.gameManager.allMove(this.Square21);
                printWinner();
                break;
            case R.id.Square22:
                this.gameManager.allMove(this.Square22);
                printWinner();
                break;
            case R.id.NewGame:
                gameManager.createNewGame();
                break;
        }
    }

    // a method that print Toast of the winner in the game or print its Draw
    public void printWinner(){
        if(!this.gameManager.checkWin(gameManager.ticTacToe).equals("")){
            if(this.gameManager.checkWin(gameManager.ticTacToe).equals("Draw")){
                Toast.makeText(this, "No winner, it's a Draw", Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this, "player " + gameManager.checkWin(gameManager.ticTacToe) + " win", Toast.LENGTH_LONG).show();
            }
            gameManager.disable(false);
        }
    }
}
