/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteByteHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TByteByteHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from PS
 */
public abstract class ps_0<T extends pv_0>
implements ayx_2,
gq_0<wi_1> {
    protected static final Logger beO = Logger.getLogger(ps_0.class);
    protected final TByteByteHashMap beP = new TByteByteHashMap();

    @Override
    public void aVI() {
        this.beP.clear();
    }

    @Override
    public void aVH() {
        this.beP.clear();
    }

    @Override
    public boolean a(T t) {
        Byte by = this.beP.get(t.aJr());
        return by != null && by != 0;
    }

    public byte b(T t) {
        Byte by = this.beP.get(t.aJr());
        if (by == null) {
            return 0;
        }
        return by;
    }

    public void a(T t, byte by) {
        this.beP.put(t.aJr(), by);
    }

    public byte c(T t) {
        if (this.beP.containsKey(t.aJr())) {
            byte by = (byte)(this.beP.get(t.aJr()) + 1);
            this.beP.put(t.aJr(), by);
            return by;
        }
        this.beP.put(t.aJr(), (byte)1);
        return 1;
    }

    public byte[] aYU() {
        return this.beP.keys();
    }

    public byte d(T t) {
        if (this.beP.containsKey(t.aJr())) {
            byte by = (byte)(this.beP.get(t.aJr()) - 1);
            if (by <= 0) {
                this.beP.remove(t.aJr());
                return 0;
            }
            this.beP.put(t.aJr(), by);
            return by;
        }
        return 0;
    }

    public void e(T t) {
        this.beP.remove(t.aJr());
    }

    public void reset() {
        this.beP.clear();
    }

    public TByteByteHashMap aYV() {
        return this.beP;
    }

    public boolean aJG() {
        return this.beP.isEmpty();
    }
}

