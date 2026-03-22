/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bcv
 */
public abstract class bcv_1
extends bcx_2 {
    public static final String hEM = "goals";
    public static final String hEN = "additionalInfos";
    public static final String hEO = "rewards";
    protected final int hEP;
    protected final ArrayList<bcw_1> hEQ = new ArrayList();

    public bcv_1(int n) {
        this.hEP = n;
        this.hEQ.add(new bco_1(n));
    }

    @Override
    public Object eu(String string) {
        if (string.equals("isCompleted")) {
            return this.daJ();
        }
        if (string.equals("isFailed")) {
            return this.daI();
        }
        if (string.equals(hEO)) {
            return this.daK();
        }
        if (string.equals(hEM)) {
            Object object = "";
            for (bcw_1 bcw_12 : this.hEQ) {
                object = (String)object + bcw_12.getDescription() + "\n";
            }
            return ((String)object).substring(0, ((String)object).length() - 1);
        }
        if (string.equals(hEN)) {
            if (!aum_0.cWf().e(142, this.hEP)) {
                return null;
            }
            String string2 = aum_0.cWf().a(142, (long)this.hEP, new Object[0]);
            if (string2.isEmpty()) {
                return null;
            }
            return string2;
        }
        return super.eu(string);
    }

    protected abstract boolean daI();

    protected abstract boolean daJ();

    public abstract String daK();

    @Override
    protected String dbq() {
        return null;
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(140, (long)this.hEP, new Object[0]);
    }

    @Override
    protected String byf() {
        ewp_1 ewp_12 = ewu_1.rCG.Tb(this.hEP);
        int n = ewp_12 != null ? ewp_12.aVt() : -1;
        return auc_0.cVq().a("fightChallengeIconsPath", "defaultIconPath", n);
    }

    @Override
    public int aeV() {
        return 3;
    }

    @Override
    public int d() {
        return this.hEP;
    }

    @Override
    protected String dbr() {
        return null;
    }

    @Override
    protected ArrayList<bcw_1> dbs() {
        return this.hEQ;
    }

    @Override
    protected String dbt() {
        return null;
    }

    @Override
    protected String getStyle() {
        return null;
    }

    public void dbu() {
        bco_1 bco_12 = (bco_1)this.hEQ.get(0);
        bco_12.dbu();
        fse_1.gFu().a((aef_2)this, "isCompleted", "isFailed");
    }
}

