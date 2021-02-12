package com.app.shopwithus.presentation.ui.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.app.shopwithus.R;
import com.app.shopwithus.data.model.Product;
import com.app.shopwithus.databinding.FragmentDetailBinding;

public class DetailFragment  extends Fragment {
    private DetailViewModel detailViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        detailViewModel= new ViewModelProvider(getActivity(),new DetailViewModelFactory()).get(DetailViewModel.class);
        FragmentDetailBinding binding= DataBindingUtil.inflate(inflater, R.layout.fragment_detail,container,false);
        binding.setViewmodel(detailViewModel);
        binding.setProduct(detailViewModel.getProduct());
        return binding.getRoot();
    }
}
