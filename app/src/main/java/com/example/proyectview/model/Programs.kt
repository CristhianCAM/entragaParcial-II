package com.example.proyectview.model

import android.os.Parcel
import android.os.Parcelable

class Programs (var name:String?): Parcelable{
    constructor(parcel: Parcel) : this(parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Programs> {
        override fun createFromParcel(parcel: Parcel): Programs {
            return Programs(parcel)
        }

        override fun newArray(size: Int): Array<Programs?> {
            return arrayOfNulls(size)
        }
    }


}