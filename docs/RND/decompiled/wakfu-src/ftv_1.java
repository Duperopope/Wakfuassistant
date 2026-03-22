/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTV
 */
public class ftv_1
implements ftw_1 {
    private String cHc;
    private String vhk;
    private String vhl;
    private String vhm;
    private boolean crD = false;

    public ftv_1(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("font") || apd_12.fq("font") == null || apd_12.fq("id") == null) {
            return;
        }
        if (apd_12.fq("modifier") != null) {
            this.vhm = apd_12.fq("modifier").bCt();
        }
        this.vhk = apd_12.fq("definition").bCt();
        this.vhl = apd_12.fq("font").bCt();
        this.cHc = apd_12.fq("id").bCt();
        this.crD = true;
    }

    @Override
    public void k(fhq_2 fhq_22) {
        if (this.crD) {
            fhq_22.a(this.cHc, this.vhk, this.vhl, this.vhm);
        }
    }

    @Override
    public void a(ftj_1 ftj_12) {
        if (!this.crD) {
            return;
        }
        String string = ftj_12.gHu();
        ftj_12.a(new ftd_2(null, "loadFont", string, new String[]{"\"" + this.cHc + "\"", "\"" + this.vhk + "\"", "\"" + this.vhl + "\"", this.vhm == null ? "null" : "\"" + this.vhm + "\""}));
    }

    @Override
    public boolean isInitialized() {
        return true;
    }
}

