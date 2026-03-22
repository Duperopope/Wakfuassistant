/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fTZ
 */
public class ftz_1
implements ftw_1 {
    private float dlf;
    private axb_2 kib;
    private axb_2 isS;
    private axb_2 urJ;
    private String vhl;
    private boolean crD = false;

    public ftz_1(float f2, axb_2 axb_22, axb_2 axb_23, axb_2 axb_24, String string) {
        this.dlf = f2;
        this.kib = axb_22;
        this.isS = axb_23;
        this.urJ = axb_24;
        this.vhl = string;
        this.crD = true;
    }

    public ftz_1(apd_1 apd_12, fhq_2 fhq_22) {
        axb_2 axb_22;
        if (!apd_12.getName().equalsIgnoreCase("tooltip")) {
            return;
        }
        this.dlf = fsb_1.vcw;
        apd_1 apd_13 = apd_12.fq("borderWidth");
        if (apd_13 != null) {
            this.dlf = apd_13.bCs();
        }
        this.kib = fsb_1.vct;
        apd_13 = apd_12.fq("backgroundColor");
        if (apd_13 != null) {
            axb_22 = this.kib;
            this.kib = fhq_22.uy(apd_13.bCt());
            if (this.kib == null) {
                this.kib = fic_1.gBr().b(axb_2.class, apd_13.bCt());
            }
            if (this.kib == null) {
                this.kib = axb_22;
            }
        }
        this.isS = fsb_1.vcs;
        apd_13 = apd_12.fq("textColor");
        if (apd_13 != null) {
            axb_22 = this.isS;
            this.isS = fhq_22.uy(apd_13.bCt());
            if (this.isS == null) {
                this.isS = fic_1.gBr().b(axb_2.class, apd_13.bCt());
            }
            if (this.isS == null) {
                this.isS = axb_22;
            }
        }
        this.urJ = fsb_1.vcu;
        apd_13 = apd_12.fq("borderColor");
        if (apd_13 != null) {
            axb_22 = this.urJ;
            this.urJ = fhq_22.uy(apd_13.bCt());
            if (this.urJ == null) {
                this.urJ = fic_1.gBr().b(axb_2.class, apd_13.bCt());
            }
            if (this.urJ == null) {
                this.urJ = axb_22;
            }
        }
        this.vhl = null;
        apd_13 = apd_12.fq("font");
        if (apd_13 != null) {
            this.vhl = apd_13.bCt();
        }
        this.crD = true;
    }

    @Override
    public void k(fhq_2 fhq_22) {
        if (this.crD) {
            fhq_22.a(this.dlf, this.kib, this.isS, this.urJ, this.vhl);
        }
    }

    public String a(fhq_2 fhq_22, ftf_2 ftf_22) {
        if (!this.crD) {
            return "";
        }
        return "InitLoaderManager.getInstance().addLoader(new TooltipInitLoader(" + this.dlf + "f, new " + awx_2.class.getSimpleName() + "(" + this.kib.aIU() + "f, " + this.kib.aIV() + "f, " + this.kib.aIW() + "f, " + this.kib.aIX() + "f), new " + awx_2.class.getSimpleName() + "(" + this.isS.aIU() + "f, " + this.isS.aIV() + "f, " + this.isS.aIW() + "f, " + this.isS.aIX() + "f), new " + awx_2.class.getSimpleName() + "(" + this.urJ.aIU() + "f, " + this.urJ.aIV() + "f, " + this.urJ.aIW() + "f, " + this.urJ.aIX() + "f), \"" + this.vhl + "\"));";
    }

    @Override
    public void a(ftj_1 ftj_12) {
        if (!this.crD) {
            return;
        }
        String string = ftj_12.gHu();
        ftj_12.a(new ftd_2(null, "loadTooltip", string, this.dlf + "f", "new " + awx_2.class.getSimpleName() + "(" + this.kib.aIU() + "f, " + this.kib.aIV() + "f, " + this.kib.aIW() + "f, " + this.kib.aIX() + "f)", "new " + awx_2.class.getSimpleName() + "(" + this.isS.aIU() + "f, " + this.isS.aIV() + "f, " + this.isS.aIW() + "f, " + this.isS.aIX() + "f)", "new " + awx_2.class.getSimpleName() + "(" + this.urJ.aIU() + "f, " + this.urJ.aIV() + "f, " + this.urJ.aIW() + "f, " + this.urJ.aIX() + "f)", "\"" + this.vhl + "\""));
    }

    @Override
    public boolean isInitialized() {
        return this.crD;
    }
}

