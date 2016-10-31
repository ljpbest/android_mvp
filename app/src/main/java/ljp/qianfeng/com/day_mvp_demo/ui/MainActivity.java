package ljp.qianfeng.com.day_mvp_demo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ljp.qianfeng.com.day_mvp_demo.R;
import ljp.qianfeng.com.day_mvp_demo.model.bean.MainBean;
import ljp.qianfeng.com.day_mvp_demo.persenter.MainPersenter;
import ljp.qianfeng.com.day_mvp_demo.persenter.inter.MainCallback;

public class MainActivity extends AppCompatActivity implements MainCallback{
    private MainPersenter mainPersenter;
    private TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这是mvp
        initview();
        mainPersenter=new MainPersenter();
        mainPersenter.setMainCallback(this);
        mainPersenter.queryList("1");
    }
    void initview(){
        mainText = (TextView)findViewById(R.id.main_text);
    }
    @Override
    public void sucess(MainBean mainBean) {
        mainText.setText(mainBean.getList().get(0).getGname());
    }
}
