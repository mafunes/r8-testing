package com.mafunes.example.r8.dto;

import androidx.annotation.NonNull;

public final class SomeObject {

    private final OtherObject otherObject;
    private final String aString;

    public SomeObject(@NonNull final OtherObject otherObject, final String aString) {
        this.otherObject = otherObject;
        this.aString = aString;
    }

    public OtherObject getOtherObject() {
        return otherObject;
    }

    public String getAString() {
        return aString;
    }
}
