package kr.tjeit.listview_20181222_02;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvent();
    public abstract void bindviews();
    public abstract void setValues();


}
