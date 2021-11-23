package com.example.football;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.football.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int player1FaulTeamA = 0;
    int player2FaulTeamA = 0;
    int player3FaulTeamA = 0;
    int player4FaulTeamA = 0;
    int player5FaulTeamA = 0;

    int player1FaulTeamB = 0;
    int player2FaulTeamB = 0;
    int player3FaulTeamB = 0;
    int player4FaulTeamB = 0;
    int player5FaulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textViewPlayer1TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 1", "Team A");
            }
        });

        binding.textViewPlayer2TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 2", "Team A");
            }
        });

        binding.textViewPlayer3TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 3", "Team A");
            }
        });

        binding.textViewPlayer4TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 4", "Team A");
            }
        });

        binding.textViewPlayer5TeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 5", "Team A");
            }
        });

        binding.textViewPlayer1TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 1", "Team B");
            }
        });

        binding.textViewPlayer2TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 2", "Team B");
            }
        });

        binding.textViewPlayer3TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 3", "Team B");
            }
        });

        binding.textViewPlayer4TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 4", "Team B");
            }
        });

        binding.textViewPlayer5TeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFaul("Player 5", "Team B");
            }
        });

        binding.buttonEndGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareViaWhatsapp();
                toastResults(scoreTeamA, scoreTeamB, player1FaulTeamA, player2FaulTeamA, player3FaulTeamA, player4FaulTeamA, player5FaulTeamA,
                        player1FaulTeamB, player2FaulTeamB, player3FaulTeamB, player4FaulTeamB, player5FaulTeamB);
            }
        });

    }

    private void addFaul(String player, String team) {
        if (player == "Player 1" && team == "Team A") {
            if (player1FaulTeamA < 5) {
                player1FaulTeamA = player1FaulTeamA + 1;
                binding.textViewPlayer1FaulTeamA.setText("" + player1FaulTeamA);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 2" && team == "Team A") {
            if (player2FaulTeamA < 5) {
                player2FaulTeamA = player2FaulTeamA + 1;
                binding.textViewPlayer2FaulTeamA.setText("" + player2FaulTeamA);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 3" && team == "Team A") {
            if (player3FaulTeamA < 5) {
                player3FaulTeamA = player3FaulTeamA + 1;
                binding.textViewPlayer3FaulTeamA.setText("" + player3FaulTeamA);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 4" && team == "Team A") {
            if (player4FaulTeamA < 5) {
                player4FaulTeamA = player4FaulTeamA + 1;
                binding.textViewPlayer4FaulTeamA.setText("" + player4FaulTeamA);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 5" && team == "Team A") {
            if (player5FaulTeamA < 5) {
                player5FaulTeamA = player5FaulTeamA + 1;
                binding.textViewPlayer5FaulTeamA.setText("" + player5FaulTeamA);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 1" && team == "Team B") {
            if (player1FaulTeamB < 5) {
                player1FaulTeamB = player1FaulTeamB + 1;
                binding.textViewPlayer1FaulTeamB.setText("" + player1FaulTeamB);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 2" && team == "Team B") {
            if (player2FaulTeamB < 5) {
                player2FaulTeamB = player2FaulTeamB + 1;
                binding.textViewPlayer2FaulTeamB.setText("" + player2FaulTeamB);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 3" && team == "Team B") {
            if (player3FaulTeamB < 5) {
                player3FaulTeamB = player3FaulTeamB + 1;
                binding.textViewPlayer3FaulTeamB.setText("" + player3FaulTeamB);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 4" && team == "Team B") {
            if (player4FaulTeamB < 5) {
                player4FaulTeamB = player4FaulTeamB + 1;
                binding.textViewPlayer4FaulTeamB.setText("" + player4FaulTeamB);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        if (player == "Player 5" && team == "Team B") {
            if (player5FaulTeamB < 5) {
                player5FaulTeamB = player5FaulTeamB + 1;
                binding.textViewPlayer5FaulTeamB.setText("" + player5FaulTeamB);
            } else {
                Toast.makeText(this, "Maximum Fauls", Toast.LENGTH_SHORT).show();
                return;
            }
        }

    }

    private void addOne(String teamName, String score) {
        if (teamName == "Team A" && score == "one") {
            scoreTeamA = scoreTeamA + 1;
            binding.textViewScoreTeamA.setText("" + scoreTeamA);
        }

        if (teamName == "Team B" && score == "one") {
            scoreTeamB = scoreTeamB + 1;
            binding.textViewScoreTeamB.setText("" + scoreTeamB);
        }

        if (teamName == "Team A" && score == "two") {
            scoreTeamA = scoreTeamA + 2;
            binding.textViewScoreTeamA.setText("" + scoreTeamA);
        }

        if (teamName == "Team B" && score == "two") {
            scoreTeamB = scoreTeamB + 2;
            binding.textViewScoreTeamB.setText("" + scoreTeamB);
        }

        if (teamName == "Team A" && score == "three") {
            scoreTeamA = scoreTeamA + 3;
            binding.textViewScoreTeamA.setText("" + scoreTeamA);
        }

        if (teamName == "Team B" && score == "three") {
            scoreTeamB = scoreTeamB + 3;
            binding.textViewScoreTeamB.setText("" + scoreTeamB);
        }
    }

    private void shareViaWhatsapp() {
        String phoneNum = "+254718866683" +
                "";
        String whatsappUrl = "https://api.whatsapp.com/send?phone=" + phoneNum;
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(whatsappUrl + "&text=" + dataToBeSent(
                scoreTeamA, scoreTeamB, player1FaulTeamA, player2FaulTeamA, player3FaulTeamA, player4FaulTeamA, player5FaulTeamA,
                player1FaulTeamB, player2FaulTeamB, player3FaulTeamB, player4FaulTeamB, player5FaulTeamB
        )));
        startActivity(intent);
    }

    private void toastResults(
            int scoreTeamA,
            int scoreTeamB,
            int player1FaulTeamA,
            int player2FaulTeamA,
            int player3FaulTeamA,
            int player4FaulTeamA,
            int player5FaulTeamA,

            int player1FaulTeamB,
            int player2FaulTeamB,
            int player3FaulTeamB,
            int player4FaulTeamB,
            int player5FaulTeamB
    ) {

        Toast.makeText(this,
                "Team A.................\n" +
                        "Score: " + scoreTeamA + "\n" +
                        "Fauls.................." + "\n" +
                        "Player 1: " + player1FaulTeamA + "\n" +
                        "Player 2: " + player2FaulTeamA + "\n" +
                        "Player 3: " + player3FaulTeamA + "\n" +
                        "Player 4: " + player4FaulTeamA + "\n" +
                        "Player 5: " + player5FaulTeamA + "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Team B.................\n" +
                        "Score: " + scoreTeamB + "\n" +
                        "Fauls.................." + "\n" +
                        "Player 1: " + player1FaulTeamB + "\n" +
                        "Player 2: " + player2FaulTeamB + "\n" +
                        "Player 3: " + player3FaulTeamB + "\n" +
                        "Player 4: " + player4FaulTeamB + "\n" +
                        "Player 5: " + player5FaulTeamB + "\n"
                , Toast.LENGTH_LONG).show();

    }

    private String dataToBeSent(
            int scoreTeamA,
            int scoreTeamB,
            int player1FaulTeamA,
            int player2FaulTeamA,
            int player3FaulTeamA,
            int player4FaulTeamA,
            int player5FaulTeamA,

            int player1FaulTeamB,
            int player2FaulTeamB,
            int player3FaulTeamB,
            int player4FaulTeamB,
            int player5FaulTeamB
    ) {
        return "Team A.................\n" +
                "Score: " + scoreTeamA + "\n" +
                "Fauls.................." + "\n" +
                "Player 1: " + player1FaulTeamA + "\n" +
                "Player 2: " + player2FaulTeamA + "\n" +
                "Player 3: " + player3FaulTeamA + "\n" +
                "Player 4: " + player4FaulTeamA + "\n" +
                "Player 5: " + player5FaulTeamA + "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Team B.................\n" +
                "Score: " + scoreTeamB + "\n" +
                "Fauls.................." + "\n" +
                "Player 1: " + player1FaulTeamB + "\n" +
                "Player 2: " + player2FaulTeamB + "\n" +
                "Player 3: " + player3FaulTeamB + "\n" +
                "Player 4: " + player4FaulTeamB + "\n" +
                "Player 5: " + player5FaulTeamB + "\n";
    }

    public void a1(View view) {
        addOne("Team A", "one");
    }

    public void a2(View view) {
        addOne("Team A", "two");
    }

    public void a3(View view) {
        addOne("Team A", "three");
    }

    public void b1(View view) {
        addOne("Team B", "one");
    }

    public void b2(View view) {
        addOne("Team B", "two");
    }

    public void b3(View view) {
        addOne("Team B", "three");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.training, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.red:
                binding.main.setBackgroundColor(getResources().getColor(R.color.red));
                return true;
            case R.id.green:
                binding.main.setBackgroundColor(getResources().getColor(R.color.green));
                return true;
            case R.id.blue:
                binding.main.setBackgroundColor(getResources().getColor(R.color.blue));
                return true;
            case R.id.newGame:
                binding.startGameLayout.setVisibility(View.VISIBLE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}