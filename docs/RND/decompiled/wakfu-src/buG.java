/*
 * Decompiled with CFR 0.152.
 */
public class buG
implements aeh_2 {
    public static final String jqq = "name";
    public static final String jqr = "checked";
    public static final String jqs = "canBeEdited";
    public static final String[] jqt = new String[]{"name", "checked", "canBeEdited"};
    private final eyh_2 jqu;
    private boolean jqv;

    public buG(eyh_2 eyh_22) {
        this.jqu = eyh_22;
    }

    @Override
    public String[] bxk() {
        return jqt;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jqq)) {
            return aum_0.cWf().c(this.jqu.name(), new Object[0]);
        }
        if (string.equals(jqr)) {
            return this.jqv;
        }
        if (string.equals(jqs)) {
            return this.dJl();
        }
        return null;
    }

    private boolean dJl() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bjn_1 bjn_12 = bgt_02.dpI();
        ezz_1 ezz_12 = bjn_12.jP(bgt_02.Sn());
        if (ezz_12 == null) {
            return false;
        }
        fab fab2 = bjn_12.jR(ezz_12.Xm());
        if (fab2 == null) {
            return false;
        }
        return fab2.b(this.jqu);
    }

    public void gX(boolean bl) {
        this.jqv = bl;
        fse_1.gFu().a((aef_2)this, jqr);
    }

    public boolean isChecked() {
        return this.jqv;
    }

    public eyh_2 dJm() {
        return this.jqu;
    }
}

