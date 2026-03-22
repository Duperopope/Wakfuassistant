/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTS
 */
public class fts_2
implements ftw_1 {
    private int bap;
    private int baq;
    private fzo_0 uwG;
    private String awN;
    private boolean bXs = false;

    public fts_2(int n, int n2, fzo_0 fzo_02, String string) {
        this.bap = n;
        this.baq = n2;
        this.uwG = fzo_02;
        this.awN = string;
        this.bXs = true;
    }

    public fts_2(apd_1 apd_12) {
        if (!apd_12.getName().equalsIgnoreCase("cursor") || apd_12.fq("path") == null) {
            return;
        }
        apd_1 apd_13 = apd_12.fq("path");
        if (apd_13 != null) {
            apd_1 apd_14 = apd_12.fq("x");
            apd_1 apd_15 = apd_12.fq("y");
            apd_1 apd_16 = apd_12.fq("type");
            this.bap = apd_14 == null ? 0 : apd_14.bCo();
            this.baq = apd_15 == null ? 0 : apd_15.bCo();
            this.uwG = apd_16 == null ? fzo_0.tHq : fzo_0.valueOf(apd_16.bCt().toUpperCase());
            this.awN = apd_13.bCt();
            this.bXs = true;
        }
    }

    @Override
    public void k(fhq_2 fhq_22) {
        if (this.bXs) {
            fhq_22.a(this.awN, this.uwG, this.bap, this.baq);
        }
    }

    @Override
    public void a(ftj_1 ftj_12) {
        if (!this.bXs) {
            return;
        }
        ftj_12.E(fzo_0.class);
        String string = ftj_12.gHu();
        ftj_12.a(new ftd_2(null, "loadCursor", string, "\"" + this.awN + "\"", fzo_0.class.getSimpleName() + "." + this.uwG.name(), String.valueOf(this.bap), String.valueOf(this.baq)));
    }

    @Override
    public boolean isInitialized() {
        return this.bXs;
    }
}

