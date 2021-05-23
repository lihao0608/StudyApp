package com.example.studyapp.java;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

public class CloneTest {

    @NonNull
    @NotNull
    @Override
    protected CloneTest clone() throws CloneNotSupportedException {
        return (CloneTest) super.clone();
    }
}
