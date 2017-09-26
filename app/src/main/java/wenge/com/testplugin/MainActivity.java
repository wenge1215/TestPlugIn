package wenge.com.testplugin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void load(View view){
        Toast.makeText(this, "加载", Toast.LENGTH_SHORT).show();
    }

    public void jump(View view){
        Toast.makeText(this, "跳转", Toast.LENGTH_SHORT).show();
    }
}
