package org.livinggoods.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import org.livinggoods.myapp.Branches.Budadiri;
import org.livinggoods.myapp.Branches.Kira;
import org.livinggoods.myapp.Branches.Masajja;

public class ChooseBranch extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public Spinner spinner;
    public Button budadiri,kiira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_branch);

        spinner = (Spinner)findViewById(R.id.branchspin);
        spinner.setOnItemSelectedListener(this);


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.branches_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        switch (position) {
            case 1:
                // Whatever you want to happen when the second item gets selected
                Intent intent1 = new Intent(ChooseBranch.this,Kira.class);
                startActivity(intent1);

                break;
            case 2:
                Intent intent2 = new Intent(ChooseBranch.this,Masajja.class);
                startActivity(intent2);


                break;
            case 3:

                break;
            case 4:
                Intent intent4 = new Intent(ChooseBranch.this,Budadiri.class);
                startActivity(intent4);

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
            case 15:

                break;
            case 16:

                break;
            case 17:

                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

                break;
            case 21:

                break;

        }

    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
