/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aze
 */
public class aze_2<V extends azd_2> {
    protected static final Logger duQ = Logger.getLogger(aze_2.class);
    protected V duR;
    protected long duS;

    public aze_2() {
        this.reset();
    }

    public void a(V v) {
        this.duR = v;
        this.duS = v != null ? v.Sn() : 0L;
    }

    public void reset() {
        this.duR = null;
        this.duS = 0L;
    }

    public boolean bSH() {
        if (this.duR == null) {
            return false;
        }
        if (this.duS == 0L) {
            return false;
        }
        return this.duR.Sn() == this.duS;
    }

    public V bSY() {
        return this.duR;
    }

    public long bSZ() {
        return this.duS;
    }
}

