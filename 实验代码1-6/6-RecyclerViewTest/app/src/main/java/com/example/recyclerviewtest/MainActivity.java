package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit like = new Fruit(getRandomLengthName("Like"), R.drawable.like_pic," click it to show like. balabalabalabalabalabalabalabalabalabalabalabalabala...");
            fruitList.add(like);
            Fruit talkWith = new Fruit(getRandomLengthName("TalkWith"), R.drawable.talk_pic," click it to talk with sb. balabala...");
            fruitList.add(talkWith);
            Fruit setting = new Fruit(getRandomLengthName("Setting"), R.drawable.set_pic," click it to edit the setting. balabalabalabalabalabalabala...");
            fruitList.add(setting);
            Fruit video = new Fruit(getRandomLengthName("Video"), R.drawable.video_pic," click it to watch video. balabalabalabalabalabala...");
            fruitList.add(video);
            Fruit voice = new Fruit(getRandomLengthName("Voice"), R.drawable.voice_pic," click it to turn on or off the sound. balabala...");
            fruitList.add(voice);
            Fruit markDown = new Fruit(getRandomLengthName("MarkDown"), R.drawable.write_pic," click it to mark down the message. balabalabalabalabalabala...");
            fruitList.add(markDown);
            Fruit call = new Fruit(getRandomLengthName("Call"), R.drawable.call_pic," click it to call on sb. balabala...");
            fruitList.add(call);
            Fruit flag = new Fruit(getRandomLengthName("Flag"), R.drawable.flag_pic," click flag. balabalabalabalabalabalabala...");
            fruitList.add(flag);
            Fruit letter = new Fruit(getRandomLengthName("Letter"), R.drawable.letter_pic," click it to send and receive the letter. balabalabalabalabalabala...");
            fruitList.add(letter);
            Fruit music = new Fruit(getRandomLengthName("Music"), R.drawable.music_pic," click it to listening music. balabalabalabala...");
            fruitList.add(music);
            Fruit garbage = new Fruit(getRandomLengthName("GarbageBin"), R.drawable.garbage_pic," deleted document in garbage bin. balabalabalabalabalabalabalabalabala...");
            fruitList.add(garbage);
            Fruit question = new Fruit(getRandomLengthName("Question"), R.drawable.question_pic," click it to ask for help. balabala...");
            fruitList.add(question);
            Fruit clock = new Fruit(getRandomLengthName("Clock"), R.drawable.clock_pic," click it to show time. balabalabalabalabalabalabalabalabalabalabalabala...");
            fruitList.add(clock);
            Fruit findOut = new Fruit(getRandomLengthName("FindOut"), R.drawable.find_pic," click it to find out file. balabalabalabala...");
            fruitList.add(findOut);
            Fruit house = new Fruit(getRandomLengthName("Home"), R.drawable.house_pic," click it to back home. balabalabalabalabalabalabalabalabalabala...");
            fruitList.add(house);
            Fruit img = new Fruit(getRandomLengthName("Image"), R.drawable.img_pic," click it to see the picture. balabala...");
            fruitList.add(img);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }

}
