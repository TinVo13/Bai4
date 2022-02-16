package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    String regex = "^[0-9]{9}$";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText hoten = findViewById(R.id.et_hoten);
        EditText cmnd = findViewById(R.id.et_cmnd);
        Button btn_Gui = findViewById(R.id.btn_gui);
        CheckBox docbao = findViewById(R.id.chb_docbao);
        CheckBox docsach = findViewById(R.id.chb_docsach);
        CheckBox doccoding = findViewById(R.id.chb_doccoding);
        btn_Gui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hoten.length()<3||hoten.equals("")){
                    Toast.makeText(MainActivity.this, "Tên phải có ít nhất 3 ký tự và không được bỏ trống!", Toast.LENGTH_SHORT).show();
                }else if(Pattern.matches(regex,cmnd.getText().toString())==false){
                    Toast.makeText(MainActivity.this, "Chứng minh nhân dân chỉ được nhập kiểu số và phải có đúng 9 chữ số", Toast.LENGTH_SHORT).show();
                }else if(!(docbao.isChecked()||docsach.isChecked()||doccoding.isChecked())){
                    Toast.makeText(MainActivity.this, "Bạn chưa chọn sở thích!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Thành công!", Toast.LENGTH_SHORT).show();
                }
                //onCheckboxClicked(view);
            }
        });
    }
//    public void onCheckboxClicked(View view) {
//        // Is the view now checked?
//        boolean checked = ((CheckBox) view).isChecked();
//        if(checked==false){
//            Toast.makeText(MainActivity.this, "Bạn chưa chọn sở thích!", Toast.LENGTH_SHORT).show();
//        }
//    }
}