/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqo
 */
public class bqo_1 {
    private int hQx;
    @NotNull
    private bps_0 iVH;
    @NotNull
    private Map<buh_0, bug_0<bpb_1>> iTp;

    public int dfz() {
        return this.hQx;
    }

    public void BH(int n) {
        this.hQx = n;
    }

    @NotNull
    public bps_0 dCS() {
        return this.iVH;
    }

    public void b(@NotNull bps_0 bps_02) {
        this.iVH = bps_02;
    }

    @NotNull
    public Map<buh_0, bug_0<bpb_1>> dEg() {
        return Collections.unmodifiableMap(this.iTp);
    }

    public void v(@NotNull Map<buh_0, bug_0<bpb_1>> map) {
        this.iTp = new EnumMap<buh_0, bug_0<bpb_1>>(map);
    }

    public String toString() {
        return "EncyclopediaPanelState{m_currentPage=" + this.hQx + ", m_sortingType=" + String.valueOf((Object)this.iVH) + ", m_filters=" + String.valueOf(this.iTp) + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bqo_1 bqo_12 = (bqo_1)object;
        return this.hQx == bqo_12.hQx && this.iVH == bqo_12.iVH && Objects.equals(this.iTp, bqo_12.iTp);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.hQx, this.iVH, this.iTp});
    }
}

