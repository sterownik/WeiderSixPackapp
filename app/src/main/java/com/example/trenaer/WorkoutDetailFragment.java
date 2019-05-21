package com.example.trenaer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


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
        if(workoutId!=6) {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            stopwatch stopwatchfragment = new stopwatch();
            ft.replace(R.id.stopwatch_cotainer, stopwatchfragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        return  inflater.inflate(R.layout.fragment_workout_detail,container,false);
    }

    public void onStart() {

        super.onStart();

        View view=getView();
        if(view !=null)
        {
            TextView title = (TextView)view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());
            TextView description = (TextView)view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());
            ImageView img = (ImageView)view.findViewById(R.id.imageView);
            img.setImageResource(workout.getFotka());
        }
    }

    public void setWorkoutId(long id) {
        this.workoutId = id;
    }
}
