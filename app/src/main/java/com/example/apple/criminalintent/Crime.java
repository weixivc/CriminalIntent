package com.example.apple.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by apple on 10/6/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() { mId = UUID.randomUUID();  }
    public UUID getId() { return mId;  }
    public String getTitle() { return mTitle;}
    public void setTitle(String title) { mTitle = title;}
    public Date getDate() {return mDate;}
    public void setDate(Date date) {mDate = date;}
    public boolean isSolved() {  return mSolved;}
    public void setSolved(boolean solved) { mSolved = solved;  }

}
