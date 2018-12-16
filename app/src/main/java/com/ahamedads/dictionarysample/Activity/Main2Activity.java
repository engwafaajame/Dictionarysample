package com.ahamedads.dictionarysample.Activity;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ahamedads.dictionarysample.Adapter.AdapterWords;
import com.ahamedads.dictionarysample.Classess.Constant;
import com.ahamedads.dictionarysample.Classess.Words;
import com.ahamedads.dictionarysample.MainActivity;
import com.ahamedads.dictionarysample.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    int secondposition;

    private View root_view, parent_view;
    private Toolbar toolbar;
    List<Words> Questionlist=new ArrayList<>();
    private AdapterWords adapterQuesion;
    private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerView questioncyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        questioncyclerView= findViewById(R.id.recyclerView);
        Questionlist.add(new Words("يعرف","know"));
        //

        Questionlist.add(new Words("مفتاح","key"));
        Questionlist.add(new Words("باب","door"));
        Questionlist.add(new Words("سماء","sky"));

        Questionlist.add(new Words("كتاب","book"));

        Questionlist.add(new Words("قطة","cat"));

        Questionlist.add(new Words("موز","banana"));
        Questionlist.add(new Words("مفتاح","key"));
        Questionlist.add(new Words("باب","door"));
        Questionlist.add(new Words("سماء","sky"));

        Questionlist.add(new Words("كتاب","book"));

        Questionlist.add(new Words("قطة","cat"));

        Questionlist.add(new Words("موز","banana"));
        Questionlist.add(new Words("مفتاح","key"));
        Questionlist.add(new Words("باب","door"));
        Questionlist.add(new Words("سماء","sky"));

        Questionlist.add(new Words("كتاب","book"));

        Questionlist.add(new Words("قطة","cat"));
        Questionlist.add(new Words("يعرف","know"));

        Questionlist.add(new Words("موز","banana"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Main2Activity.this);
        adapterQuesion=new AdapterWords(Questionlist,Main2Activity.this);
        questioncyclerView.setLayoutManager(layoutManager);
        questioncyclerView.setAdapter(adapterQuesion);
        adapterQuesion.setiClickListener(new AdapterWords.IClickListener() {
            @Override
            public void onItemClick(int position, Words images) {
                Intent gotoknow=new Intent(Main2Activity.this,MainActivity.class);

               secondposition=position;
                gotoknow.putExtra(Constant.Englishword,Questionlist.get(position).getEnglishword());
                gotoknow.putExtra(Constant.Englishword2,Questionlist.get(secondposition).getEnglishword());
                startActivity(gotoknow);

            }
        });
    }
}
