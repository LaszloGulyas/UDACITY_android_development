package udacity.lgulyas.project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitter (View view){
        int totalSc = 0;

        //CHECKER - QUESTION 1
        EditText inputField1 = (EditText) findViewById(R.id.inputQ1);
        String input1 = inputField1.getText().toString();
        if (input1.equalsIgnoreCase("kungen")) {
            totalSc = totalSc +1;
        }
        //CHECKER - QUESTION 2
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio);
        int checkedId = rg.getCheckedRadioButtonId();
        View RadioButton = rg.findViewById(checkedId);
        int buttonIndex = rg.indexOfChild(RadioButton);
        RadioButton button1 = (RadioButton) rg.getChildAt(buttonIndex);
        String input2 = (String) button1.getText();
        if (input2.equalsIgnoreCase("shaman")) {
            totalSc = totalSc +1;
        }

        //CHECKER - QUESTION 3
        CheckBox inputField3A = (CheckBox) findViewById(R.id.inputQ3B1);
        CheckBox inputField3B = (CheckBox) findViewById(R.id.inputQ3B2);
        CheckBox inputField3C = (CheckBox) findViewById(R.id.inputQ3B3);
        CheckBox inputField3D = (CheckBox) findViewById(R.id.inputQ3B4);
        Boolean input3A = inputField3A.isChecked();
        Boolean input3B = inputField3B.isChecked();
        Boolean input3C = inputField3C.isChecked();
        Boolean input3D = inputField3D.isChecked();
        if (input3A == false) {
            ;
        } else if (input3C == false) {
            ;
        } else if (input3B == true) {
            ;
        } else if (input3D == true) {
            ;
        } else {
            totalSc = totalSc +1;
            }

        //CHECKER - QUESTION 4
        EditText inputField4 = (EditText) findViewById(R.id.inputQ4);
        String input4 = inputField4.getText().toString();
        if (input4.equalsIgnoreCase("70")) {
            totalSc = totalSc +1;
        }

        //CHECKER - QUESTION 5
        CheckBox inputField5A = (CheckBox) findViewById(R.id.inputQ5B1);
        CheckBox inputField5B = (CheckBox) findViewById(R.id.inputQ5B2);
        CheckBox inputField5C = (CheckBox) findViewById(R.id.inputQ5B3);
        CheckBox inputField5D = (CheckBox) findViewById(R.id.inputQ5B4);
        Boolean input5A = inputField5A.isChecked();
        Boolean input5B = inputField5B.isChecked();
        Boolean input5C = inputField5C.isChecked();
        Boolean input5D = inputField5D.isChecked();
        if (input5A == false) {
            ;
        } else if (input5D == false) {
            ;
        } else if (input5B == true) {
            ;
        } else if (input5C == true) {
            ;
        } else {
            totalSc = totalSc +1;
        }

        //RESULT DISPLAY
        Toast.makeText(this, "Your final score is: " + totalSc + " / 5", Toast.LENGTH_SHORT).show();
    }
}
