package com.example.evaluacioncontinua3;

import androidx.fragment.app.Fragment;

public interface NavigationHost{

    void navigateTo(Fragment fragment,boolean addBackstack);
}