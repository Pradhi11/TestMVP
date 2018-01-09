package test.com.testmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TestPatternInterfac.ViewInf,View.OnClickListener{

    TextView mTextDisp;
    EditText mLname;
    EditText mFname;

    private SayHello mPresenterInf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextDisp=(TextView) findViewById(R.id.disp);
        mFname=findViewById(R.id.test_one);
        mLname=findViewById(R.id.test_two);

        findViewById(R.id.update).setOnClickListener(this);
        findViewById(R.id.msg_show).setOnClickListener(this);

        mPresenterInf=new SayHello(this);
    }

    @Override
    public void showMessage(String msg) {

        mTextDisp.setText(msg);

    }

    @Override
    public void showError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.update:
                   mPresenterInf.saveName(mFname.getText().toString(),mLname.getText().toString());

                break;

            case R.id.msg_show:

                  mPresenterInf.loadMessage();
                break;
        }

    }
}
