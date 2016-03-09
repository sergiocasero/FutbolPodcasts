package com.sergiocasero.podcast.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

import lombok.Data;

/**
 * Created by sergiocasero on 25/2/16.
 */
@Data
public class Radio implements Parcelable {
    private int id;

    private String name;

    private String logo;

    private String url;

    public Radio() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.logo);
        dest.writeString(this.url);
    }

    protected Radio(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.logo = in.readString();
        this.url = in.readString();
    }

    public static final Creator<Radio> CREATOR = new Creator<Radio>() {
        public Radio createFromParcel(Parcel source) {
            return new Radio(source);
        }

        public Radio[] newArray(int size) {
            return new Radio[size];
        }
    };
}
