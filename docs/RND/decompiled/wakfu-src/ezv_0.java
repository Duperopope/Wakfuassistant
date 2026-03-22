/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/*
 * Renamed from ezV
 */
public class ezv_0 {
    @SerializedName(value="address")
    private String pvb;
    @SerializedName(value="ports")
    private int[] pvc;

    public String fnn() {
        return this.pvb;
    }

    public int[] fno() {
        return (int[])this.pvc.clone();
    }

    public void rR(String string) {
        this.pvb = string;
    }

    public void L(int ... nArray) {
        this.pvc = nArray;
    }

    public String toString() {
        return "ProxyServer{m_address='" + this.pvb + "', m_ports=" + Arrays.toString(this.pvc) + "}";
    }
}

