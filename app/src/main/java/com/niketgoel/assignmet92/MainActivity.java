package com.niketgoel.assignmet92;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int MENU_COMPUTER =1;
    private final int MENU_GAMEPAD =2;
    private final int MENU_CAMERA = 3;
    private final int MENU_VIEDO = 4;
    private final int MENU_EMAIL = 5;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * creating menu programatically
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0,MENU_COMPUTER,0,R.string.menu_item_1);
        menu.add(0,MENU_GAMEPAD,0,R.string.menu_item_2);
        menu.add(0,MENU_CAMERA,0,R.string.menu_item_31);
        menu.add(0,MENU_VIEDO,0,R.string.menu_item_4);
        menu.add(0,MENU_EMAIL,0,R.string.menu_item_5);
        return true;
    }

    /**
     * clicking event to display Toast
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case MENU_COMPUTER:
                Toast.makeText(getApplicationContext(), R.string.menu_item_1, Toast.LENGTH_LONG).show();
                return true;
            case MENU_GAMEPAD:
                Toast.makeText(getApplicationContext(), R.string.menu_item_2, Toast.LENGTH_LONG).show();
                return true;
            case MENU_CAMERA:
                Toast.makeText(getApplicationContext(), R.string.menu_item_31, Toast.LENGTH_LONG).show();
                return true;
            case MENU_VIEDO:
                Toast.makeText(getApplicationContext(), R.string.menu_item_4, Toast.LENGTH_LONG).show();
                return true;
            case MENU_EMAIL:
                Toast.makeText(getApplicationContext(), R.string.menu_item_5, Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}
