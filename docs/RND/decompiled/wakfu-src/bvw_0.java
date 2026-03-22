/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bvW
 */
public class bvw_0 {
    private final TIntObjectHashMap<fbu> jvN = new TIntObjectHashMap();
    public static final bvw_0 jvO = new bvw_0();

    public fbu FQ(int n) {
        fbu fbu2 = (fbu)this.jvN.get(n);
        if (fbu2 == null && (fbu2 = this.FR(n)) != null) {
            this.jvN.put(n, (Object)fbu2);
        }
        return fbu2;
    }

    private fbu FR(int n) {
        fbx fbx2 = (fbx)fbw.rRs.pU(n);
        if (fbx2 instanceof fba_0) {
            return new fbb_0((fba_0)fbx2);
        }
        if (fbx2 instanceof fbi_0) {
            return new fbh_0((fbi_0)fbx2);
        }
        if (fbx2 instanceof fbf_0) {
            return new fbe_0((fbf_0)fbx2);
        }
        if (fbx2 instanceof fbd_0) {
            return new fbc_0((fbd_0)fbx2);
        }
        return null;
    }
}

