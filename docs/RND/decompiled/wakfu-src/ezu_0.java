/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.annotations.SerializedName
 */
import com.google.common.collect.ImmutableList;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from ezU
 */
public class ezu_0 {
    @SerializedName(value="proxies")
    private final Collection<ezt_0> pva = new ArrayList<ezt_0>();

    public List<ezt_0> fnm() {
        return ImmutableList.copyOf(this.pva);
    }

    public String toString() {
        return "ProxyArray{m_proxies=" + this.pva.size() + "}";
    }
}

