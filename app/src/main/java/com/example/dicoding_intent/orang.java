package com.example.dicoding_intent;


import android.os.Parcel;
import android.os.Parcelable;

public class orang  implements Parcelable {

    private String nama;

    private int umur;
    private String alamat;

    public orang(String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    protected orang(Parcel in) {
        nama = in.readString();
        umur = in.readInt();
        alamat = in.readString();
    }

    public String getNama() {
        return nama;
    }

    public int getUmur(){
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public static final Creator<orang> CREATOR = new Creator<orang>() {
        @Override
        public orang createFromParcel(Parcel in) {
            return new orang(in);
        }

        @Override
        public orang[] newArray(int size) {
            return new orang[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeInt(umur);
        dest.writeString(alamat);
    }
}
