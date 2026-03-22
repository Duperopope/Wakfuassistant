/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fdN
 */
public class fdn_0 {
    @SerializedName(value="items")
    @NotNull
    private final Map<Integer, Integer> rXU = new HashMap<Integer, Integer>();
    @SerializedName(value="kamas")
    private final long rXV;

    public fdn_0(@Nullable Map<Integer, Integer> map, long l) {
        if (map != null) {
            this.rXU.putAll(map);
        }
        this.rXV = l;
    }

    @NotNull
    @Generated
    public Map<Integer, Integer> fUd() {
        return this.rXU;
    }

    @Generated
    public long dzt() {
        return this.rXV;
    }

    @Generated
    public String toString() {
        return "StelePrice(m_items=" + String.valueOf(this.fUd()) + ", m_kamas=" + this.dzt() + ")";
    }
}

