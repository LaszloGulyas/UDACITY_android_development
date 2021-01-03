package udacity.lgulyas.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int team1 = 0;
    int team2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset (View view){
        team1 = 0;
        team2 = 0;
        pointerT1(team1);
        pointerT2(team2);
    }

    public void addPointT1 (View view) {
        Button counter = (Button)view;
        team1 = team1 + Character.getNumericValue(counter.getText().charAt(0));
        pointerT1(team1);
    }

    public void addPointT2 (View view) {
        Button counter = (Button)view;
        team2 = team2 + Character.getNumericValue(counter.getText().charAt(0));
        pointerT2(team2);
    }

    private void pointerT1 (int number){
        TextView point = (TextView) findViewById(
                R.id.team1score);
        point.setText(""+ number);
    }

    private void pointerT2 (int number){
        TextView point = (TextView) findViewById(
                R.id.team2score);
        point.setText(""+ number);
    }
}
