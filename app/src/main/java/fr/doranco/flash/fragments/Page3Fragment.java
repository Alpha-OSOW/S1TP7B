package fr.doranco.flash.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.doranco.flash.R;
import fr.doranco.flash.databinding.FragmentPage2Binding;
import fr.doranco.flash.databinding.FragmentPage3Binding;


public class Page3Fragment extends Fragment {

    private FragmentPage3Binding binding;

    public Page3Fragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPage3Binding.inflate(inflater, container, false);
        // evenement
        binding.buttonPage3GoToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_page3Fragment_to_page2Fragment);
            }
        });

        return binding.getRoot();
    }
}