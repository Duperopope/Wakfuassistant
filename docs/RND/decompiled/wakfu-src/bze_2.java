/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bZE
 */
public class bze_2
extends afn<bze_2> {
    private static final TObjectProcedure<ni_1> lDF = new bzf_2();
    private static final TLongProcedure lDG = new bzg_2();
    private final TLongProcedure lDH = new bzh_2(this);
    protected static final Logger lDI = Logger.getLogger(bze_2.class);
    protected final TLongObjectHashMap<bKV> lDJ = new TLongObjectHashMap();
    protected final TLongObjectHashMap<ni_1> lDK = new TLongObjectHashMap();
    protected final TLongObjectHashMap<bsi_0> lDL = new TLongObjectHashMap();
    private final List<bze_2> lDM = new ArrayList<bze_2>(5);

    bze_2(int n, int n2, int n3, int n4, boolean bl) {
        this.h(n, n2, n3, n4);
        if (bl) {
            this.a(new bze_2[9]);
        }
    }

    @Override
    public void aPg() {
        Object object;
        Object object2;
        super.aPg();
        short s = (short)this.bap;
        short s2 = (short)this.baq;
        TIntObjectIterator<bsS> tIntObjectIterator = bsU.dHk().dHl();
        block0: while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            object2 = (bsS)tIntObjectIterator.value();
            if (!(object2 instanceof bsi_0)) continue;
            object = (bsi_0)object2;
            for (azx_1<Short, Short> azx_12 : ((bsi_0)object).dGA()) {
                if (s != azx_12.getFirst() || s2 != azx_12.aHI()) continue;
                this.k((bsi_0)object);
                continue block0;
            }
        }
        object2 = (ajo_0)adk.buy().x(s, s2);
        if (object2 == null) {
            return;
        }
        object = ((adh)object2).buv();
        if (object != null) {
            bzd_2.a(this, (adq[])object);
            bzd_2.b(this, (adq[])object);
        }
    }

    void a(bKV bKV2) {
        if (!this.lDJ.containsKey(bKV2.Sn())) {
            this.lDJ.put(bKV2.Sn(), (Object)bKV2);
        } else {
            lDI.error((Object)("Impossible d'ajouter une resource d'ID=" + bKV2.Sn() + " \u00e0 la partition " + String.valueOf(this) + " qui la contient d\u00e9j\u00e0."));
        }
    }

    public void aVI() {
    }

    public void aVH() {
        this.lDJ.clear();
        this.lDL.clear();
        this.lDK.clear();
    }

    void i(bsi_0 bsi_02) {
        this.lDL.remove((long)bsi_02.d());
    }

    void p(bKV bKV2) {
        this.lDJ.remove(bKV2.Sn());
    }

    boolean j(bsi_0 bsi_02) {
        return this.lDL.contains((long)bsi_02.d());
    }

    boolean q(bKV bKV2) {
        return this.lDJ.contains(bKV2.Sn());
    }

    void mw(long l) {
        ni_1 ni_12 = (ni_1)this.lDK.remove(l);
        if (ni_12 != null) {
            ni_12.aVS();
        }
    }

    void c(ni_1 ni_12) {
        this.lDK.remove(ni_12.Sn());
        ni_12.aVS();
    }

    void d(ni_1 ni_12) {
        try {
            if (!this.lDK.containsKey(ni_12.Sn())) {
                this.lDK.put(ni_12.Sn(), (Object)ni_12);
                ni_12.aVR();
            } else {
                lDI.error((Object)("Impossible d'ajouter un \u00e9l\u00e9ments interactif d'ID=" + ni_12.Sn() + " \u00e0 la partition " + String.valueOf(this) + " qui le contient d\u00e9j\u00e0."));
            }
        }
        catch (Exception exception) {
            lDI.error((Object)"", (Throwable)exception);
        }
    }

    boolean mx(long l) {
        return this.lDK.contains(l);
    }

    public void x(TObjectProcedure<ni_1> tObjectProcedure) {
        this.lDK.forEachValue(tObjectProcedure);
    }

    ni_1 my(long l) {
        return (ni_1)this.lDK.get(l);
    }

    void k(bsi_0 bsi_02) {
        if (!this.lDL.contains((long)bsi_02.d())) {
            bsi_02.bGY();
            this.lDL.put((long)bsi_02.d(), (Object)bsi_02);
        } else {
            lDI.error((Object)("Impossible d'ajouter un item d'ID=" + bsi_02.d() + " \u00e0 la partition " + String.valueOf(this) + " qui le contient d\u00e9j\u00e0."));
        }
    }

    @Override
    protected void clear() {
        super.clear();
        this.lDJ.clear();
        this.lDK.clear();
        this.lDL.clear();
    }

    @Override
    public void bxJ() {
        super.bxJ();
        this.lDJ.forEachKey(lDG);
        this.lDL.forEachKey(this.lDH);
        bzd_2.ed(this.bap, this.baq);
        this.lDK.forEachValue(lDF);
        this.clear();
    }

    private static bze_2 a(bze_2 bze_22, int n, int n2) {
        bze_2 bze_23 = new bze_2(bze_22.getX() + n, bze_22.getY() + n2, 18, 18, false);
        bze_23.aPg();
        return bze_23;
    }

    private void JI(int n) {
        bze_2[] bze_2Array = (bze_2[])this.blg();
        bze_2 bze_22 = bze_2Array[4];
        switch (n) {
            case 7: {
                bze_2Array[7] = bze_2.a(bze_22, 0, 1);
                break;
            }
            case 1: {
                bze_2Array[1] = bze_2.a(bze_22, 0, -1);
                break;
            }
            case 3: {
                bze_2Array[3] = bze_2.a(bze_22, -1, 0);
                break;
            }
            case 5: {
                bze_2Array[5] = bze_2.a(bze_22, 1, 0);
                break;
            }
            case 0: {
                bze_2Array[0] = bze_2.a(bze_22, -1, -1);
                break;
            }
            case 2: {
                bze_2Array[2] = bze_2.a(bze_22, 1, -1);
                break;
            }
            case 8: {
                bze_2Array[8] = bze_2.a(bze_22, 1, 1);
                break;
            }
            case 6: {
                bze_2Array[6] = bze_2.a(bze_22, -1, 1);
                break;
            }
            default: {
                lDI.error((Object)"Tentative de renew d'une LocalPartition inexistante");
            }
        }
    }

    void JJ(int n) {
        bze_2[] bze_2Array = (bze_2[])this.blg();
        switch (n) {
            case 7: {
                this.lDM.add(bze_2Array[1]);
                this.lDM.add(bze_2Array[0]);
                this.lDM.add(bze_2Array[2]);
                bze_2Array[1] = bze_2Array[4];
                bze_2Array[0] = bze_2Array[3];
                bze_2Array[2] = bze_2Array[5];
                bze_2Array[4] = bze_2Array[7];
                bze_2Array[3] = bze_2Array[6];
                bze_2Array[5] = bze_2Array[8];
                this.JI(7);
                this.JI(6);
                this.JI(8);
                break;
            }
            case 1: {
                this.lDM.add(bze_2Array[7]);
                this.lDM.add(bze_2Array[6]);
                this.lDM.add(bze_2Array[8]);
                bze_2Array[7] = bze_2Array[4];
                bze_2Array[6] = bze_2Array[3];
                bze_2Array[8] = bze_2Array[5];
                bze_2Array[4] = bze_2Array[1];
                bze_2Array[3] = bze_2Array[0];
                bze_2Array[5] = bze_2Array[2];
                this.JI(1);
                this.JI(0);
                this.JI(2);
                break;
            }
            case 3: {
                this.lDM.add(bze_2Array[5]);
                this.lDM.add(bze_2Array[2]);
                this.lDM.add(bze_2Array[8]);
                bze_2Array[5] = bze_2Array[4];
                bze_2Array[2] = bze_2Array[1];
                bze_2Array[8] = bze_2Array[7];
                bze_2Array[4] = bze_2Array[3];
                bze_2Array[1] = bze_2Array[0];
                bze_2Array[7] = bze_2Array[6];
                this.JI(0);
                this.JI(3);
                this.JI(6);
                break;
            }
            case 5: {
                this.lDM.add(bze_2Array[3]);
                this.lDM.add(bze_2Array[0]);
                this.lDM.add(bze_2Array[6]);
                bze_2Array[3] = bze_2Array[4];
                bze_2Array[0] = bze_2Array[1];
                bze_2Array[6] = bze_2Array[7];
                bze_2Array[4] = bze_2Array[5];
                bze_2Array[1] = bze_2Array[2];
                bze_2Array[7] = bze_2Array[8];
                this.JI(2);
                this.JI(5);
                this.JI(8);
                break;
            }
            case 0: {
                this.lDM.add(bze_2Array[5]);
                this.lDM.add(bze_2Array[2]);
                this.lDM.add(bze_2Array[8]);
                this.lDM.add(bze_2Array[7]);
                this.lDM.add(bze_2Array[6]);
                bze_2Array[8] = bze_2Array[4];
                bze_2Array[4] = bze_2Array[0];
                bze_2Array[5] = bze_2Array[1];
                bze_2Array[7] = bze_2Array[3];
                this.JI(1);
                this.JI(2);
                this.JI(0);
                this.JI(3);
                this.JI(6);
                break;
            }
            case 2: {
                this.lDM.add(bze_2Array[0]);
                this.lDM.add(bze_2Array[3]);
                this.lDM.add(bze_2Array[6]);
                this.lDM.add(bze_2Array[7]);
                this.lDM.add(bze_2Array[8]);
                bze_2Array[6] = bze_2Array[4];
                bze_2Array[3] = bze_2Array[1];
                bze_2Array[7] = bze_2Array[5];
                bze_2Array[4] = bze_2Array[2];
                this.JI(0);
                this.JI(1);
                this.JI(2);
                this.JI(5);
                this.JI(8);
                break;
            }
            case 8: {
                this.lDM.add(bze_2Array[2]);
                this.lDM.add(bze_2Array[1]);
                this.lDM.add(bze_2Array[0]);
                this.lDM.add(bze_2Array[3]);
                this.lDM.add(bze_2Array[6]);
                bze_2Array[0] = bze_2Array[4];
                bze_2Array[1] = bze_2Array[5];
                bze_2Array[3] = bze_2Array[7];
                bze_2Array[4] = bze_2Array[8];
                this.JI(2);
                this.JI(5);
                this.JI(8);
                this.JI(7);
                this.JI(6);
                break;
            }
            case 6: {
                this.lDM.add(bze_2Array[0]);
                this.lDM.add(bze_2Array[1]);
                this.lDM.add(bze_2Array[2]);
                this.lDM.add(bze_2Array[5]);
                this.lDM.add(bze_2Array[8]);
                bze_2Array[1] = bze_2Array[3];
                bze_2Array[2] = bze_2Array[4];
                bze_2Array[4] = bze_2Array[6];
                bze_2Array[5] = bze_2Array[7];
                this.JI(0);
                this.JI(3);
                this.JI(6);
                this.JI(7);
                this.JI(8);
                break;
            }
            default: {
                lDI.error((Object)"Translation d'une LocalPartition dans une direction invalide, bizarre...");
            }
        }
        int n2 = this.lDM.size();
        for (int i = 0; i < n2; ++i) {
            this.lDM.get(i).bxJ();
        }
        this.lDM.clear();
    }

    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }

    void W(int n, int n2, short s) {
        if (this.lDK.isEmpty()) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (!bgt_02.dmX()) {
            return;
        }
        acd_1 acd_12 = new acd_1();
        this.lDK.forEachValue((TObjectProcedure)new bzi_2(this, acd_12, n, n2, s, bgt_02));
    }
}

