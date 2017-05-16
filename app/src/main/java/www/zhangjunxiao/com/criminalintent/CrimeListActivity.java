package www.zhangjunxiao.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by zjx on 5/16/2017.
 */

public class CrimeListActivity extends SingleFramgentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
