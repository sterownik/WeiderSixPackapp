package com.example.trenaer;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.PatternSyntaxException;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {


    private long workoutId;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if(savedInstanceState!=null)
        {
            workoutId=savedInstanceState.getLong("workoutId");
        }
        else {
            if (workoutId != 6) {
                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                stopwatch stopwatchfragment = new stopwatch();
                ft.replace(R.id.stopwatch_cotainer, stopwatchfragment);
                ft.addToBackStack(null);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }
        return  inflater.inflate(R.layout.fragment_workout_detail,container,false);
    }

    public void onStart() {
        List<String> list2 = new ArrayList<String>();


        super.onStart();


        View view=getView();
        final Spinner list = (Spinner)view.findViewById(R.id.lista);
        list.setVisibility(View.INVISIBLE);


        if(view !=null)
        {
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView)view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());

            ImageView img = (ImageView)view.findViewById(R.id.imageView);
            img.setImageResource(workout.getFotka());
            if(workoutId==6)
            {
                description.setVisibility(View.INVISIBLE);


                img.setVisibility(View.INVISIBLE);
                list.setVisibility(View.VISIBLE);
                String dni = workout.getDescription();
                String[] str = dni.split("\n");
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_spinner_item,str);
                adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                list.setAdapter(adapter);



            }
        }
    }

    public void setWorkoutId(long id) {
        this.workoutId = id;
    }




}
