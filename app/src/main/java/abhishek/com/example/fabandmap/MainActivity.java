package abhishek.com.example.fabandmap;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Abhishek on 11-07-2015.
 */
public class MainActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.activity_main,container,false);


        final FloatingActionButton button_hospital = (FloatingActionButton) view.findViewById(R.id.button_hospital);
        button_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_hospital.setTitle("Hospital clicked");
            }
        });

        final FloatingActionButton button_venue = (FloatingActionButton) view.findViewById(R.id.button_venue);
        button_venue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_venue.setTitle("Venue clicked");
            }
        });

        final FloatingActionButton button_atm = (FloatingActionButton) view.findViewById(R.id.button_atm);
        button_atm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_atm.setTitle("ATM clicked");
            }
        });

        final FloatingActionButton button_hostel = (FloatingActionButton) view.findViewById(R.id.button_hostel);
        button_hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_hostel.setTitle("Hostel clicked");
            }
        });


        return view;
    }

}
