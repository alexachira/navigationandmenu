package com.reen.navigationandmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//intents
    public void home(View view) {
        Intent x = new Intent(this, HomeActivity.class);
        startActivity(x);//trigger
    }
    public void products(View view) {
        Intent x = new Intent(this, ProductsActivity.class);
        startActivity(x);//trigger

        }

    public void sevices(View view) {
        Intent x = new Intent(this, ServicesActivity.class);
        startActivity(x);//trigger

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle().toString().equalsIgnoreCase("help"))
        {
            Toast.makeText(this, "help", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().toString().equalsIgnoreCase("logout"))
        {
            Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
        }
        else if(item.getTitle().toString().equalsIgnoreCase("settings"))
        {
            Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
        }



        return super.onOptionsItemSelected(item);
    }
}
