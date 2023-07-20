package fr.doranco.flash.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.doranco.flash.R;
import fr.doranco.flash.databinding.FragmentPage1Binding;
import fr.doranco.flash.databinding.FragmentPage2Binding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Page2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Page2Fragment extends Fragment {

    private FragmentPage2Binding binding;
    public Page2Fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPage2Binding.inflate(inflater, container, false);
        // evenement
        binding.buttonPage2GoToHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_page2Fragment_to_homeFragment);
            }
        });
        binding.buttonPage2GoToPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_page2Fragment_to_page3Fragment);
            }
        });
        return binding.getRoot();
    }
}