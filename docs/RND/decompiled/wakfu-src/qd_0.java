/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from Qd
 */
public class qd_0 {
    public static final qd_0 bfh = new qd_0();
    private final TIntObjectHashMap<qb_0> bfi = new TIntObjectHashMap();

    private qd_0() {
    }

    public void a(qb_0 qb_02) {
        this.bfi.put(qb_02.d(), (Object)qb_02);
    }

    public <D extends qb_0> D ox(int n) {
        return (D)((qb_0)this.bfi.get(n));
    }

    public String toString() {
        return "DialogManager{m_dialogs=" + this.bfi.size() + "}";
    }
}

