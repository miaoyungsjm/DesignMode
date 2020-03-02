package com.example.ggz.factory;

import android.os.Bundle;

import com.example.ggz.factory.demo1.ConcreteFactoryA;
import com.example.ggz.factory.demo2.ConcreteFactory;
import com.example.ggz.factory.demo2.ConcreteProductB;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.example.ggz.factory.demo1.Factory factory1 = new ConcreteFactoryA();
        com.example.ggz.factory.demo1.Product product1 = factory1.createProduct();
        product1.method();

        com.example.ggz.factory.demo2.Factory factory2 = new ConcreteFactory();
        com.example.ggz.factory.demo2.Product product2 = factory2.createProduct(ConcreteProductB.class);
        product2.method();
    }
}
