package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.prototype.demo.WordDocument;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Client
        clientCall();
    }

    private void clientCall() {
        WordDocument originDoc = new WordDocument();
        originDoc.setText("This is a Document");
        originDoc.addImage("picture 1");
        originDoc.addImage("picture 2");
        originDoc.addImage("picture 3");
        originDoc.showDocument();

        // 以原始文档为原型，拷贝一份副本
        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();

        doc2.setText("modified something");
        doc2.addImage("picture extra");
        doc2.showDocument();

        originDoc.showDocument();
    }
}
