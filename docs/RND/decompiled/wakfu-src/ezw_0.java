/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;

/*
 * Renamed from ezW
 */
public class ezw_0 {
    @SerializedName(value="uber")
    private ezv_0 pvd;

    public ezv_0 fnp() {
        return this.pvd;
    }

    public void a(ezv_0 ezv_02) {
        this.pvd = ezv_02;
    }

    public String toString() {
        return "ProxyServers{m_uber=" + String.valueOf(this.pvd) + "}";
    }
}

