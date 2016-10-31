package ljp.qianfeng.com.day_mvp_demo.tool;

import android.util.Log;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
public class LogUtils {
    public static final boolean MVC_LOG=true;
    public static final String TAG="mvc_demo";
    public static void log(Class cla,String result){
        if(MVC_LOG){
            Log.i(TAG,cla.getName()+"=="+result);
        }
    }
}
