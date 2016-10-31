package ljp.qianfeng.com.day_mvp_demo.persenter;

import ljp.qianfeng.com.day_mvp_demo.model.MainModel;
import ljp.qianfeng.com.day_mvp_demo.model.bean.MainBean;
import ljp.qianfeng.com.day_mvp_demo.persenter.inter.MainCallback;

/**
 * Created by Administrator on 2016/10/31 0031.
 */
public class MainPersenter implements MainCallback{
    private MainModel mainModel;
    private MainCallback mainCallback;

    public void setMainCallback(MainCallback mainCallback) {
        this.mainCallback = mainCallback;
    }

    public void queryList(String pageno){
        mainModel=new MainModel();
        mainModel.setMainCallback(this);
        mainModel.queryList(pageno);
    }

    @Override
    public void sucess(MainBean mainBean) {
        mainCallback.sucess(mainBean);
    }
}
