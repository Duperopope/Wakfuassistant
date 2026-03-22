/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bzd
 */
public class bzd_0
extends bCA
implements aeh_2 {
    public static final float jDx = 0.001f;
    protected static final Logger jDy = Logger.getLogger(bzd_0.class);
    public static final String jDz = "taxPercentage";

    @Override
    public void aVI() {
        super.aVI();
        this.ht(true);
        this.bf(false);
        this.bi(true);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("ie.dimensionalBagLogConsole", new Object[0]);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    protected fi_1 bey() {
        return fi_1.oX;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        return rw_02 == rw_0.bkJ;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public cpm_1[] dNh() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = bgt_02.dnw() == bgt_02.dnx();
        Object a2 = cps_1.niQ.eLI();
        ((cpm_1)a2).setEnabled(bl);
        return new cpm_1[]{a2};
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jDz)) {
            return String.format("%.2f%%", Float.valueOf(0.1f));
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    static /* synthetic */ void a(bzd_0 bzd_02, ayv_2 ayv_22) {
        bzd_02.a(ayv_22);
    }
}

