package com.example.c4_prototype;


import com.example.c4_prototype.demo.bean.Address;
import com.example.c4_prototype.demo.LoginSession;
import com.example.c4_prototype.demo.bean.User;
import com.example.c4_prototype.sample.WordDocument;

/**
 * @author ggz
 * @date 2020/6/27
 */
public class Client {
    public static void main(String[] args) {
        // ----------------------
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

        // ----------------------
        // 未优化：直接获取对象本体，更新信息，突破限制
        // 原型模式：修改无效
        User temp = LoginSession.getInstance().getLoginUser();
        temp.address = new Address("广州市", "花都区", "天贵路");
    }
}
