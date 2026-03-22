/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from cUf
 */
public class cuf_2
extends crp_2 {
    private static final cuf_2 nLs = new cuf_2();

    public static cuf_2 eRt() {
        return nLs;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17880: {
                dbk dbk2 = (dbk)aam_22;
                int n = dbk2.bCo();
                this.a(dbk2.faG(), dbk2.bCt(), n == 0 ? -1 : n, false);
                return false;
            }
        }
        return super.b(aam_22);
    }

    @Override
    protected String eoV() {
        return "effectAreaDetailDialog";
    }

    @Override
    public void ac(int n, int n2, short s) {
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.nDN.get(n);
        if (tIntObjectHashMap == null) {
            return;
        }
        bmf_1 bmf_12 = (bmf_1)tIntObjectHashMap.get(n2);
        if (bmf_12 == null) {
            return;
        }
        bmf_12.cg(s);
        fse_1.gFu().b("describedState", bmf_12, this.cN(bmf_12.eem()));
        fse_1.gFu().b("describedStateLevel", bmf_12.cmL(), this.cN(bmf_12.eem()));
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            super.a(aye_22, bl);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            super.b(aye_22, bl);
            cdv_0.euj().e(this);
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

