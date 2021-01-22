package com.example.uc_satgas.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

import com.example.uc_satgas.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMain() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_mainActivity2);
  }
}
