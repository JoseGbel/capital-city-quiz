package com.example.capitalcityquizktx.Database

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class Continent(
    val numberOfCountries: Int,
    val countries: List<Country>? = null,
    val shape: String? = null
) : Parcelable {

//
//    constructor(parcel: Parcel) : this(
//        parcel.readInt(),
//        parcel.createTypedArrayList(Country),
//        parcel.readString()
//    )
//
//    override fun writeToParcel(dest: Parcel?, flags: Int) {
//        dest!!.writeInt(numberOfCountries)
//        dest?.writeTypedList(countries)
//        dest?.writeString(shape)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Continent> {
//        override fun createFromParcel(parcel: Parcel): Continent {
//            return Continent(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Continent?> {
//            return arrayOfNulls(size)
//        }
//    }
}