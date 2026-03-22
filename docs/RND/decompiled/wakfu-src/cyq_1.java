/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from cYq
 */
public class cyq_1
extends crp_2 {
    private static final cyq_1 nYl = new cyq_1();

    public static cyq_1 eXS() {
        return nYl;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18001: {
                dbo dbo2 = (dbo)aam_22;
                int n = dbo2.bCo();
                this.a(dbo2.eft(), dbo2.bCt(), n == 0 ? -1 : n, dbo2.faI());
                return false;
            }
        }
        return super.b(aam_22);
    }

    @Override
    protected String eoV() {
        return "stateDetailDialog";
    }

    @Override
    public void ac(int n, int n2, short s) {
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.nDN.get(n);
        if (tIntObjectHashMap == null) {
            return;
        }
        bmq_0 bmq_02 = (bmq_0)tIntObjectHashMap.get(n2);
        if (bmq_02 == null) {
            return;
        }
        bmq_02.cg(s);
        fse_1.gFu().b("describedState", bmq_02, this.cN(bmq_02.gjy()));
        fse_1.gFu().b("describedStateLevel", bmq_02.cmL(), this.cN(bmq_02.gjy()));
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

