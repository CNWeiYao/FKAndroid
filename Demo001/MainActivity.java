package com.example.root.demo001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout show = (LinearLayout) findViewById(R.id.root);
        final DrawView draw = new DrawView(this);
        draw.setMinimumWidth(500);
        draw.setMinimumHeight(300);
        show.addView(draw);
        /*
        实际上可以在XML中管理布局文件将DrawView组件加到LinearLayout组件上可省去13-17行，代码如下
        <LinearLayout
        android:id="@+id/root"
        android:layout_width="368dp"
        android:layout_height="500dp"
        android:orientation="horizontal"
        tools:layout_editor_absoluteX="8dp"
        tools:layout_editor_absoluteY="8dp"
        tools:ignore="MissingConstraints">
    <com.example.root.demo001.DrawView
        android:layout_height="match_parent"
        android:layout_width="match_parent"></com.example.root.demo001.DrawView>
    </LinearLayout>
         */
    }
}
