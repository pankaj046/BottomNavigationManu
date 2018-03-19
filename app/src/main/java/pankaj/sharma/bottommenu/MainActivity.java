package pankaj.sharma.bottommenu;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, new OneFragment()).commit();

        bottomNavigationView = findViewById(R.id.NavBottom);

        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item)
                    {
                        Fragment selectedFragment = null;
                        switch (item.getItemId())
                        {
                            case R.id.m1:
                                fragmentManager.beginTransaction().replace(R.id.container, new OneFragment()).commit();
                                break;
                            case R.id.m2:
                                fragmentManager.beginTransaction().replace(R.id.container, new TwoFragment()).commit();
                                break;
                            case R.id.m3:
                                fragmentManager.beginTransaction().replace(R.id.container, new ThreeFragment()).commit();
                                break;
                            case R.id.m4:
                                fragmentManager.beginTransaction().replace(R.id.container, new FourFragment()).commit();
                                break;
                            case R.id.m5:
                                fragmentManager.beginTransaction().replace(R.id.container, new FiveFragment()).commit();
                                break;
                        }
                        return true;
                    }
        });
    }
}
