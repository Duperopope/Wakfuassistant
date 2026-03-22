/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class Go {
    @SerializedName(value="skin_color")
    private final String aDU;
    @SerializedName(value="hair_color")
    private final String aDV;
    @SerializedName(value="pupil_color")
    private final String aDW;
    @SerializedName(value="costume_color1")
    private final String aDX;
    @SerializedName(value="costume_color2")
    private final String aDY;
    @SerializedName(value="costume_color3")
    private final String aDZ;
    @SerializedName(value="costume_color4")
    private final String aEa;
    @SerializedName(value="costume_color5")
    private final String aEb;
    @SerializedName(value="costume_color6")
    private final String aEc;
    @SerializedName(value="cloth_index")
    private final int aEd;
    @SerializedName(value="face_index")
    private final int aEe;

    public Go(int n, int n2, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        this.aDU = string;
        this.aDV = string2;
        this.aDW = string3;
        this.aDX = string4;
        this.aDY = string5;
        this.aDZ = string6;
        this.aEa = string7;
        this.aEb = string8;
        this.aEc = string9;
        this.aEd = n;
        this.aEe = n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Go go = (Go)object;
        return this.hashCode() == go.hashCode();
    }

    public int hashCode() {
        return Objects.hash(this.aDU, this.aDV, this.aDW, this.aDX, this.aDY, this.aDZ, this.aEa, this.aEb, this.aEc, this.aEd, this.aEe);
    }
}

