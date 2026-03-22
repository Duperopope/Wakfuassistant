/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from ffy
 */
public abstract class ffy_0 {
    protected static final Logger sfz = Logger.getLogger(fgD.class);
    private final TLongObjectHashMap<RS> sfA = new TLongObjectHashMap();

    protected ffy_0() {
    }

    public void a(long l, RS rS) {
        this.sfA.put(l, (Object)rS);
    }

    public TLongObjectHashMap<RS> fVn() {
        return this.sfA;
    }

    public RS tg(long l) {
        return (RS)this.sfA.get(l);
    }

    public RS th(long l) {
        return (RS)this.sfA.remove(l);
    }

    public void fVo() {
        this.sfA.clear();
    }
}

