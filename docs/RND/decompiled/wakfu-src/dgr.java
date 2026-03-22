/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class dgr
extends dgh {
    private static final Logger oky = Logger.getLogger(dgr.class);

    public dgr() {
        super(dgx.okJ, false, "messageContainer3");
    }

    @Override
    protected void a(boolean bl, String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 == null) {
            return;
        }
        int n = this.okj;
        this.okj = bl ? 1000 : this.okj;
        this.d((fes_2)fhs_22.uH("container1"), bl);
        this.d((fes_2)fhs_22.uH("text"), bl);
        if (bl) {
            this.okj = 1000;
        }
        this.d((fes_2)fhs_22.uH("bannerImage"), bl);
        this.okj = n;
    }

    @Override
    public void a(dgv dgv2) {
        dgs dgs2 = (dgs)dgv2;
        super.a(dgv2);
        try {
            String string = auc_0.i("bannerImageLocalizedFilePath", dgs2.aVt(), aum_0.cWf().aUXX().aUP());
            if (bl_0.bl(string)) {
                fse_1.gFu().b("bannerImageIconUrl", (Object)string, this.okl);
            } else {
                String string2 = auc_0.i("bannerImageFilePath", dgs2.aVt());
                fse_1.gFu().b("bannerImageIconUrl", (Object)string2, this.okl);
            }
        }
        catch (fu_0 fu_02) {
            oky.warn((Object)fu_02.getMessage());
        }
    }

    @Override
    protected void rs(String string) {
    }
}

