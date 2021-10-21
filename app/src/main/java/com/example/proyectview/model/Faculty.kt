package com.example.proyectview.model

import android.os.Parcel
import android.os.Parcelable

class Faculty ( var name:String?, var state:String?) : Parcelable {

    var programs: ArrayList<Programs> = ArrayList()

    constructor(parcel: Parcel) : this (
        parcel.readString(),
        parcel.readString()
    ) {
        programs = parcel.createTypedArrayList(CREATOR) as ArrayList<Programs>
    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(state)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Faculty> {
        override fun createFromParcel(parcel: Parcel): Faculty {
            return Faculty(parcel)
        }

        override fun newArray(size: Int): Array<Faculty?> {
            return arrayOfNulls(size)
        }
    }
}