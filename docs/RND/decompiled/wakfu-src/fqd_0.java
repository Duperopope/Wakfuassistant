/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TShortObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TShortObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fqd
 */
public final class fqd_0 {
    protected static final Logger sRT = Logger.getLogger(fqd_0.class);
    final short sRU;
    final short sRV;
    private final TShortObjectHashMap<ArrayList<fqf_0>> sRW = new TShortObjectHashMap();
    private int sRX = 0;

    public fqd_0(short s, short s2) {
        this.sRU = s;
        this.sRV = s2;
    }

    public void a(short s, int n, int n2, short s2, byte by, boolean bl, boolean bl2) {
        ArrayList<fqf_0> arrayList = (ArrayList<fqf_0>)this.sRW.get(s);
        if (arrayList == null) {
            arrayList = new ArrayList<fqf_0>();
            this.sRW.put(s, arrayList);
        }
        fqf_0 fqf_02 = new fqf_0(s, n, n2, s2, by, bl, bl2);
        arrayList.add(fqf_02);
        ++this.sRX;
    }

    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(6 + 4 * this.sRW.size() + 4 * this.sRX);
        azg_12.aG(this.sRU);
        azg_12.aG(this.sRV);
        azg_12.aG((short)this.sRW.size());
        this.sRW.forEachEntry((TShortObjectProcedure)new fqe_0(this, azg_12));
        return azg_12.bTe();
    }
}

