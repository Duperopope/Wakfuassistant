/*
 * Decompiled with CFR 0.152.
 */
public class bTi
implements aeh_2 {
    public static final String lmZ = "iconUrl";
    public static final String lna = "description";
    private final bJC lnb;

    public bTi(bJC bJC2) {
        this.lnb = bJC2;
    }

    @Override
    public String[] bxk() {
        return null;
    }

    private boolean app() {
        bcd_2 bcd_22 = aue_0.cVJ().cVK().dpy();
        return !bcd_22.ob(this.lnb.ctD()) || bcd_22.oc(this.lnb.ctD());
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lmZ)) {
            return this.app() ? auc_0.cVq().a("protectorSecretIconUrl", "defaultIconPath", this.lnb.ctF()) : auc_0.cVq().a("protectorSecretIconUrl", "defaultIconPath", this.lnb.ctE());
        }
        if (string.equals(lna)) {
            return this.app() ? aum_0.cWf().a(95, (long)this.lnb.eaQ(), new Object[0]) : aum_0.cWf().c("protector.secret.notFound", new Object[0]);
        }
        return null;
    }
}

