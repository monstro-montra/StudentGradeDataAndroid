package com.javierlabs.studentgradedata;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //determine which menu items get selected
        if (item.getItemId() == R.id.view_all) {
            startActivity(new Intent(this, ViewAllActivity.class));

        } else if (item.getItemId() == R.id.add_edit) {
            startActivity(new Intent(this, StudentActivity.class));
        }
        return true;
    }
}