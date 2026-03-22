/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.util.HashMap;
import java.util.Map;
import lombok.Generated;

/*
 * Renamed from bNe
 */
public class bne_2 {
    private long iJl = 0L;
    private final Map<Integer, Integer> kAr = new HashMap<Integer, Integer>();

    public void dS(int n, int n2) {
        this.kAr.merge(n, n2, Integer::sum);
    }

    public void lP(long l) {
        this.iJl += l;
    }

    @Generated
    public long dzt() {
        return this.iJl;
    }

    @Generated
    public Map<Integer, Integer> efr() {
        return this.kAr;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bne_2)) {
            return false;
        }
        bne_2 bne_22 = (bne_2)object;
        if (!bne_22.C(this)) {
            return false;
        }
        if (this.dzt() != bne_22.dzt()) {
            return false;
        }
        Map<Integer, Integer> map = this.efr();
        Map<Integer, Integer> map2 = bne_22.efr();
        return !(map == null ? map2 != null : !((Object)map).equals(map2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof bne_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        long l = this.dzt();
        n2 = n2 * 59 + (int)(l >>> 32 ^ l);
        Map<Integer, Integer> map = this.efr();
        n2 = n2 * 59 + (map == null ? 43 : ((Object)map).hashCode());
        return n2;
    }

    @Generated
    public void lQ(long l) {
        this.iJl = l;
    }
}

