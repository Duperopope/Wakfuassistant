/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

/*
 * Renamed from ezR
 */
public final class ezr_0 {
    private final TByteObjectHashMap<ftO> puS = new TByteObjectHashMap();

    public void a(byte by, long l, short s) {
        this.puS.put(by, (Object)new ftO(l, s));
    }

    public void g(byte by, long l) {
        this.puS.put(by, (Object)new ftO(l, 0));
    }

    public boolean aJG() {
        return this.puS.isEmpty();
    }

    public TByteObjectHashMap<ftO> fne() {
        return this.puS;
    }
}

