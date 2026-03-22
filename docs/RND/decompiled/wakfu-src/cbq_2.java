/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from cbQ
 */
public class cbq_2
extends cbp_2 {
    @SerializedName(value="popup_id")
    private String lKZ;
    @SerializedName(value="click_type")
    private String lLa;

    @Override
    protected void e(Object[] objectArray) {
        this.lKZ = (String)objectArray[0];
        this.lLa = (String)objectArray[1];
    }
}

