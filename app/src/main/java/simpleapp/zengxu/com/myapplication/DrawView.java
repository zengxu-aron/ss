package simpleapp.zengxu.com.myapplication;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zengxu on 2017/3/18.
 */
public class DrawView  extends View {

    public float currentX=40;
    public float getCurrentY=50;
        Paint p=new Paint();
    public DrawView(Context context){
        super(context);
    }
    public DrawView(Context context, AttributeSet set){
        super(context,set);
    }




}
