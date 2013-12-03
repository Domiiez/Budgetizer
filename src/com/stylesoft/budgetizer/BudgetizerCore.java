package com.stylesoft.budgetizer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BudgetizerCore extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budgetizer_core);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.budgetizer_core, menu);
        return true;
    }
    
}
