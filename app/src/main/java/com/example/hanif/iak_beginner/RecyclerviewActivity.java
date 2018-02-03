package com.example.hanif.iak_beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivity extends AppCompatActivity {

    private RecyclerView rv_recyclerview;
    private List<NewsPojo> newList = new ArrayList<>(); //ArrayList
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        rv_recyclerview = findViewById(R.id.rv_recyclerview);

        rv_recyclerview.setLayoutManager(new LinearLayoutManager(this,LinearLayout.VERTICAL,false));

        isiDummyData();
    }

    private void isiDummyData() {
        NewsPojo pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-editable-700x200.png",
                "Ini Bebek",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque.");

        newList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/11/blog-4-700x200.png",
                "Ini iPhone",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque."
        );

        newList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/11/blog-3-700x200.png",
                "Ini smartwatch",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque."
        );

        newList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-1-700x200.png",
                "Ini Topeng",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque."
        );

        newList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-5-700x200.png",
                "Ini Topeng",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque."
        );

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-5-700x200.png",
                "Ini Topeng",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque."
        );

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-5-700x200.png",
                "Ini Topeng",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque."
        );

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-5-700x200.png",
                "Ini Topeng",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Blandit turpis cursus in hac habitasse. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Proin sagittis nisl rhoncus mattis. Risus nec feugiat in fermentum posuere. Mauris commodo quis imperdiet massa tincidunt nunc pulvinar sapien. Pharetra massa massa ultricies mi quis hendrerit dolor magna. At consectetur lorem donec massa sapien faucibus et molestie. Sed ullamcorper morbi tincidunt ornare massa eget egestas. Morbi quis commodo odio aenean. Nullam ac tortor vitae purus faucibus. Purus viverra accumsan in nisl nisi scelerisque eu ultrices vitae. Nisl condimentum id venenatis a condimentum vitae sapien pellentesque.");

        newList.add(pojo);

        adapter = new RecyclerViewAdapter(newList);


        rv_recyclerview.setAdapter(adapter);
    }
}
