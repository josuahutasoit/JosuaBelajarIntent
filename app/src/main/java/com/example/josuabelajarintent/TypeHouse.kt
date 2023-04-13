package com.example.josuabelajarintent

import android.os.Parcel
import android.os.Parcelable

data class TypeHouse(
    val ukuran: String,
    val tipe: Int,
    val lokasi: String
    ): Parcelable {constructor(parcel: Parcel) : this(
    parcel.readString()!!,
    parcel.readInt(),
    parcel.readString().toString()
) {
}

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(ukuran)
        parcel.writeInt(tipe)
        parcel.writeString(lokasi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TypeHouse> {
        override fun createFromParcel(parcel: Parcel): TypeHouse {
            return TypeHouse(parcel)
        }

        override fun newArray(size: Int): Array<TypeHouse?> {
            return arrayOfNulls(size)
        }
    }
}