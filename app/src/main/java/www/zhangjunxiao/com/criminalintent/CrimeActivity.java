package www.zhangjunxiao.com.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import java.util.UUID;

public class CrimeActivity extends SingleFramgentActivity {

//    public static final String EXTRA_CRIME_ID="cn.1zpt.www.criminalintent.crime_id";
    private static final String EXTRA_CRIME_ID="cn.1zpt.www.criminalintent.crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId){
        Intent intent = new Intent(packageContext,CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID,crimeId);

        return intent;
    }
    @Override
    protected Fragment createFragment() {
//        return new CrimeFragment();
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return  CrimeFragment.newInstance(crimeId);
    }
}