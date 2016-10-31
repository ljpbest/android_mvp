package ljp.qianfeng.com.day_mvp_demo.model;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import ljp.qianfeng.com.day_mvp_demo.model.bean.MainBean;
import ljp.qianfeng.com.day_mvp_demo.model.http.URLConstants;
import ljp.qianfeng.com.day_mvp_demo.persenter.inter.MainCallback;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
public class MainModel {
    private MainCallback mainCallback=null;

    public void setMainCallback(MainCallback mainCallback) {
        this.mainCallback = mainCallback;
    }

    public void queryList(String page){
        RequestParams requestParams=new RequestParams(URLConstants.MAIN_LIST_URL);
        requestParams.addBodyParameter("pageno",page);
        x.http().post(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                MainBean mainBean = gson.fromJson(result, MainBean.class);
                mainCallback.sucess(mainBean);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
