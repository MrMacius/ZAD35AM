package com.example.zad35am;

import androidx.fragment.app.Fragment;


public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new TaskListFragment();
    }
}