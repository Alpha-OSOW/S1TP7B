package fr.doranco.flash.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.doranco.flash.R;
import fr.doranco.flash.databinding.FragmentPage1Binding;


public class Page1Fragment extends Fragment {


    public Page1Fragment() {
        // Required empty public constructor
    }
    // declaration de la variable
   private FragmentPage1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPage1Binding.inflate(inflater, container, false);
        // evenement
        binding.buttonPage1GoToHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_page1Fragment_to_homeFragment);
            }
        });
        binding.buttonPage1GoToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_page1Fragment_to_page2Fragment);
            }
        });
        return binding.getRoot();
    }
}