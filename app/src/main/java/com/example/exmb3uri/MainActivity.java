package com.example.exmb3uri;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.g)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
            startActivity(i);
            return true;
        }
        if(item.getItemId() == R.id.f)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
            startActivity(i);
            return true;
        }
        if(item.getItemId() == R.id.r)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rvce.edu.in"));
            startActivity(i);
            return true;
        }
        if(item.getItemId() == R.id.q)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.quora.com"));
            startActivity(i);
            return true;
        }
        if(item.getItemId() == R.id.git)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.github.com/karthikRaiker"));
            startActivity(i);
            return true;
        }
        return false;
    }
}
