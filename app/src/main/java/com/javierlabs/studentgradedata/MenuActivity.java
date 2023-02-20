package com.javierlabs.studentgradedata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        //determine which menu items get selected
        switch (item.getItemId()){
            case R.id.view_all:
                startActivity(new Intent(this, ViewAllActivity.class));
                return true;
            case R.id.add_edit:
                startActivity(new Intent(this, StudentActivity.class));
                return true;
        }
        return true;
    }
}