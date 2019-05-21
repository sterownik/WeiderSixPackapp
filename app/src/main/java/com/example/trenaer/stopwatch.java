package com.example.trenaer;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class stopwatch extends Fragment implements View.OnClickListener {
    private boolean running;
    private boolean wasRunning;
    private int mseconds=0;


    public stopwatch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View layout = inflater.inflate(R.layout.fragment_stopwatch,container,false);
        runTimer(layout);
        Button start = (Button)layout.findViewById(R.id.start_button);
        start.setOnClickListener(this);
        Button stop =(Button)layout.findViewById(R.id.stop_button);
        stop.setOnClickListener(this);
        Button reset = (Button)layout.findViewById(R.id.reset_button);
        reset.setOnClickListener(this);
        return layout;
    }

    public void onCreate(Bundle savedInstance) {

        super.onCreate(savedInstance);
        if(savedInstance!=null)
        {
            running=savedInstance.getBoolean("running",running);
            mseconds = savedInstance.getInt("mseconds",mseconds);
            wasRunning=savedInstance.getBoolean("wasRunning",wasRunning);
            if(wasRunning)
            {
                running=true;
            }
        }


    }
    public void onPause() {

        super.onPause();
        wasRunning=running;

        running=false;
    }

    public void onResume() {

        super.onResume();
        if(wasRunning)
        {
            running=true;
        }
    }

    public void onSaveInstanceState(Bundle savedInstance)
    {
        super.onSaveInstanceState(savedInstance);
        savedInstance.putInt("mseconds",mseconds);
        savedInstance.putBoolean("running",running);
    }

    public void onClickStart(View view)
    {
        running = true;
    }
    public void onClickStop(View view)
    {
        running = false;
    }
    public void onClickReset(View view)
    {
        running = false;
        mseconds=0;


    }

    public   void runTimer(View view)
    {


        final Handler handler = new Handler();
        final TextView timeview = (TextView)view.findViewById(R.id.time_view);

        handler.post(new Runnable() {//funkcja z tego wykonuje sie odrazu
            @Override
            public void run() {
                int hours = mseconds/36000;
                int minutes = (mseconds/600)%60;
                int secs = (mseconds/10)%60;
                int ms = mseconds%10;
                String time = String.format("%d:%02d:%02d:%d",hours,minutes,secs,ms);

                timeview.setText(time);
                if(running)
                {
                    mseconds++;
                }

                handler.postDelayed(this,100);//ile ma czekac
            }

        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.start_button:
                onClickStart(v);
                break;
            case R.id.stop_button:
                onClickStop(v);
                break;
            case R.id.reset_button:
                onClickReset(v);
                break;
        }
    }
}
