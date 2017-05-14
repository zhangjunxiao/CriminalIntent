package www.zhangjunxiao.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zjx on 5/11/2017.
 */

public class Crime {
    private UUID mID;
    private String mTittle;
    private Date mDate;
    private boolean mSolved;


    public Crime(){
        mID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }

    public void setID(UUID ID) {
        mID = ID;
    }

    public String getTittle() {
        return mTittle;
    }

    public void setTittle(String tittle) {
        mTittle = tittle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

}