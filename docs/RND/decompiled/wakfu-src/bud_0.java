/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from buD
 */
public class bud_0
implements aeh_2,
bdz_0 {
    private static final Logger jpX = Logger.getLogger(bud_0.class);
    public static final String jpY = "title";
    public static final String jpZ = "description";
    public static final String jqa = "gifts";
    public static final String jqb = "iconUrl";
    public static final String jqc = "guid";
    public static final String jqd = "collapsed";
    public static final String[] jqe = new String[]{"title", "description", "gifts", "collapsed"};
    private String jqf;
    private String jqg;
    private final ArrayList<buz_0> jqh = new ArrayList();
    private final byte jqi = 1;
    private boolean hFE;

    public ArrayList<buz_0> dJj() {
        return this.jqh;
    }

    public void a(us_2 us_22) {
        this.jqf = us_22.ade;
        this.jqg = us_22.adf;
        ArrayList<ut_1> arrayList = us_22.adg;
        for (ut_1 ut_12 : arrayList) {
            aeh_2 aeh_22;
            ur_2 ur_22 = ut_12.adh;
            try {
                aeh_22 = bub_0.a(ur_22);
            }
            catch (bua_0 bua_02) {
                jpX.warn((Object)("Unable to create gift " + String.valueOf(ur_22)), (Throwable)bua_02);
                aeh_22 = new buy_0();
            }
            this.jqh.add((buz_0)((Object)aeh_22));
        }
    }

    @Override
    public String[] bxk() {
        return jqe;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jpY)) {
            return this.jqf;
        }
        if (string.equals(jpZ)) {
            return this.jqg;
        }
        if (string.equals(jqa)) {
            return this.jqh;
        }
        if (string.equals(jqb)) {
            return auc_0.cVq().a("giftTypeIconPath", "defaultIconPath", (byte)1);
        }
        if (string.equals(jqc)) {
            return this.jqf;
        }
        if (string.equals(jqd)) {
            return this.hFE;
        }
        return null;
    }

    public boolean a(buz_0 buz_02, boolean bl) {
        int n = this.jqh.indexOf(buz_02);
        if (n == -1) {
            return false;
        }
        if (buz_02.gV(bl)) {
            this.jqh.remove(buz_02);
        }
        if (this.jqh.size() != 0) {
            fse_1.gFu().a((aef_2)this, jqa);
        }
        return this.jqh.size() == 0;
    }

    @Override
    public boolean dbK() {
        return this.hFE;
    }

    @Override
    public void fm(boolean bl) {
        this.hFE = bl;
        fse_1.gFu().a((aef_2)this, jqd);
    }
}

