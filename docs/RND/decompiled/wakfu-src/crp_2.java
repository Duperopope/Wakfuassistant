/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from cRP
 */
public abstract class crp_2
implements adi_1 {
    protected String nDM;
    private alx_2 ikv;
    protected final TIntObjectHashMap<TIntObjectHashMap<bmg_0>> nDN = new TIntObjectHashMap();

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
        return true;
    }

    public void a(bmg_0 bmg_02, String string, int n, boolean bl) {
        short s = bmg_02.eem();
        String string2 = this.cN(s);
        if (fyw_0.gqw().to(string2)) {
            int n2 = fse_1.gFu().aV("describedStateLevel", string2);
            if (n2 == bmg_02.cmL()) {
                fyw_0.gqw().tl(string2);
            } else {
                fse_1.gFu().b("describedState", bmg_02, string2);
                fse_1.gFu().b("describedStateLevel", bmg_02.cmL(), string2);
            }
        } else {
            fyw_0.gqw().a(string2, ccj_2.pe("stateDetailDialog"), this.nDM == null ? string : this.nDM, string, "stateDetailDialog");
            if (bl) {
                fyw_0.gqw().a(new crq_2(this, string, string2));
            }
            this.nDM = string2;
            if (n != -1) {
                TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.nDN.get(n);
                if (tIntObjectHashMap == null) {
                    tIntObjectHashMap = new TIntObjectHashMap();
                    this.nDN.put(n, (Object)tIntObjectHashMap);
                }
                if (!tIntObjectHashMap.containsKey((int)s)) {
                    tIntObjectHashMap.put((int)s, (Object)bmg_02);
                }
            }
            fse_1.gFu().b("describedState", bmg_02, string2);
            fse_1.gFu().b("describedStateLevel", bmg_02.cmL(), string2);
        }
    }

    public void eMX() {
        this.nDN.clear();
    }

    protected String cN(short s) {
        return this.eoV() + s;
    }

    protected abstract String eoV();

    public abstract void ac(int var1, int var2, short var3);

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new crr_2(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.stateDetails", chg_1.class);
        }
    }

    void cO(short s) {
        TIntObjectIterator tIntObjectIterator = this.nDN.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((TIntObjectHashMap)tIntObjectIterator.value()).remove((int)s);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            this.eMX();
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

