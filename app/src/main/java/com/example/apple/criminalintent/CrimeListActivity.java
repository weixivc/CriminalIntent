package com.example.apple.criminalintent;

/**
 * Created by apple on 10/8/15.
 */
import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
