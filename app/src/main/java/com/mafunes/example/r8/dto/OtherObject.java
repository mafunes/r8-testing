package com.mafunes.example.r8.dto;

import androidx.annotation.NonNull;

public final class OtherObject {
    private final String value;

    public OtherObject(@NonNull final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}


