/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fTR
 */
public class ftr_2
implements ftw_1 {
    private boolean crD;
    private String cHc;
    private axb_2 chO;
    private String vgW;

    public ftr_2(apd_1 apd_12, String string) {
        if (!apd_12.getName().equalsIgnoreCase("color") || apd_12.fq("color") == null || apd_12.fq("id") == null) {
            return;
        }
        apd_1 apd_13 = apd_12.fq("color");
        this.cHc = apd_12.fq("id").bCt();
        this.chO = fic_1.gBr().vm(apd_13.bCt());
        this.vgW = string;
        this.crD = true;
    }

    @Override
    public void k(fhq_2 fhq_22) {
        if (this.crD) {
            fhq_22.d(this.cHc, this.chO);
        }
    }

    @Override
    public void a(ftj_1 ftj_12) {
        String string;
        String string2;
        if (!this.crD) {
            return;
        }
        if (BH.aU(this.vgW)) {
            return;
        }
        String string3 = ftj_12.gHu();
        if (this.chO instanceof fhl_2) {
            string2 = fhl_2.class.getSimpleName();
            fhl_2 fhl_22 = (fhl_2)this.chO;
            string = fhl_22.gzQ() != null ? String.format("\"%s\", %sf", fhl_22.getName(), fhl_22.gzQ()) : String.format("\"%s\"", fhl_22.getName());
        } else {
            string2 = awx_2.class.getSimpleName();
            string = String.format("%sf, %sf, %sf, %sf", Float.valueOf(this.chO.aIU()), Float.valueOf(this.chO.aIV()), Float.valueOf(this.chO.aIW()), Float.valueOf(this.chO.aIX()));
        }
        ftj_12.a(new ftd_2(null, "loadColor", string3, this.vgW + "." + this.cHc.toUpperCase(), String.format("new %s(%s)", string2, string)));
    }

    @Override
    public boolean isInitialized() {
        return this.crD;
    }

    public void a(@NotNull ftm_2 ftm_22) {
        if (!this.crD) {
            return;
        }
        ftm_22.wv(this.cHc);
    }
}

