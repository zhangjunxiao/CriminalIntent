package www.zhangjunxiao.com.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

public class CrimeActivity extends SingleFramgentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}