package www.zhangjunxiao.com.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/5/27.
 */

public class CrimePagerActivity extends FragmentActivity {

    private static final String EXTRA_CRIME_ID="cn.1zpt.www.criminalintent.crime_id";

    private ViewPager mViewPager;
    private List<Crime> mCrimes;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_pager);


        mViewPager = (ViewPager) findViewById(R.id.activity_crime_pager_view_pager);

        mCrimes = CrimeLab.get(this).getCrimes();
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                Crime crime = mCrimes.get(position);
                return CrimeFragment.newInstance(crime.getID());
            }

            @Override
            public int getCount() {
                return mCrimes.size();
            }
        });

        UUID crimeid = (UUID)getIntent().getSerializableExtra(EXTRA_CRIME_ID);

        for(int i=0; i < mCrimes.size();i++){
            if(mCrimes.get(i).getID().equals(crimeid)){
                mViewPager.setCurrentItem(i);
                break;
            }
        }
    }


    public static Intent newIntent(Context packageConetext, UUID crimeId){
        Intent intent = new Intent(packageConetext,CrimePagerActivity.class);
        intent.putExtra(EXTRA_CRIME_ID,crimeId);
        return intent;
    }
}
