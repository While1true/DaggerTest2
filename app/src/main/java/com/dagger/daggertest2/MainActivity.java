package com.dagger.daggertest2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.dagger.daggertest2.Util.Presents.MainPresent;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainPresent present1;
    @Inject
    MainPresent present2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.test1, R.id.test2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.test1:
                APP.getActivityComponent().getMain().build().inject(this);
               _show( present1.hashCode()+""+present1.getData());
               _show( present2.hashCode()+""+present2.getData());
                break;
            case R.id.test2:
                break;
        }
    }
    private void _show(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
