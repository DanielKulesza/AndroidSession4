package scs2682.session4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import scs2682.session4.ui.BackStackFragment;
import scs2682.session4.ui.BackStackSupportFragment;
import scs2682.session4.ui.HeadlessFragment;
import scs2682.session4.ui.SupportFragment;

public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appactivity);

        // add a fragment
        if(savedInstanceState == null){
            // the app is starting for the first time
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.appActivity, new SupportFragment(), SupportFragment.NAME)
                    .commit();

            getFragmentManager().beginTransaction()
                    .add(R.id.appActivity, new HeadlessFragment(), HeadlessFragment.NAME)
                    .commit();

            findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getFragmentManager().popBackStack();
                    getSupportFragmentManager().popBackStack();

                    getSupportFragmentManager().beginTransaction()
                            .add(R.id.appActivity, new BackStackSupportFragment(), BackStackSupportFragment.NAME)
                            .addToBackStack(null)
                            .commit();

                    getFragmentManager().beginTransaction()
                            .add(R.id.appActivity, new BackStackFragment(),BackStackFragment.NAME)
                            .addToBackStack(null)
                            .commit();
                }
            });
        }
    }
}