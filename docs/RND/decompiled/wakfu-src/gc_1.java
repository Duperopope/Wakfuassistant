/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from Gc
 */
class gc_1 {
    @SerializedName(value="account")
    private final Long aCX;
    @SerializedName(value="character")
    private final Long aCY;
    @SerializedName(value="ip")
    private final String aCZ;

    gc_1(Long l, Long l2, String string) {
        this.aCX = l;
        this.aCY = l2;
        this.aCZ = string;
    }

    public Long aMh() {
        return this.aCX;
    }

    public Long aMi() {
        return this.aCY;
    }

    public String aMj() {
        return this.aCZ;
    }
}

