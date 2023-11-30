package com.example.sergi_batle_exam;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.sergi_batle_exam.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;
    private TextView trainingTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        // Obtener el TextView usando findViewById
        trainingTextView = view.findViewById(R.id.training);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener el valor de 'selectedItem' pasado desde el FirstFragment
        Bundle bundle = getArguments();
        String selectedItem = bundle.getString("selectedItem");

        // Mostrar el valor de 'selectedItem' en el TextView
        trainingTextView.setText(selectedItem);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void setTrainingTextView(TextView trainingTextView) {
        this.trainingTextView = trainingTextView;
    }
}
