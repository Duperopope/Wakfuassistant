/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUM
 */
public class cum_1
implements adi_1 {
    public static final cum_1 nNA = new cum_1();
    private fkf_2 nNB = fkf_2.uFy;
    private float nNC;
    private float nND;
    private float nNE;
    private float nNF;
    private long nNG;
    private float nNH;
    private float nNI;
    private float nNJ;
    private float nNK;
    private float axp;
    private float axq;
    private float axr;
    private float ayP;
    private long nNL;
    private long nNM;
    private boolean nNN;
    private afx_1 nNO;
    private String nNP;
    private afq_2[] nNQ;
    private final alx_2 nNR = new cun_2(this);
    private String nNS;

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().a(this.nNR);
            fhv_1 fhv_12 = ccj_2.g("focusDialog", 139280L);
            fkh_2 fkh_22 = (fkh_2)fhv_12.getElementMap().uH("focus");
            fkh_22.setCenter(this.nNC, this.nND, this.nNE, this.nNF);
            fkh_22.setTarget(this.nNB);
            fkh_22.setColor(this.axp, this.axq, this.axr);
            fkh_22.setAlpha(this.ayP);
            fkh_22.setFadeInDuration(this.nNL);
            fkh_22.setFadeOutDuration(this.nNM);
            fkh_22.setMouseBlocked(this.nNN);
            fad_1 fad_12 = (fad_1)fhv_12.getElementMap().uH("button");
            if (this.nNS != null) {
                fad_12.setVisible(true);
                fad_12.setText(aum_0.cWf().c(this.nNS, new Object[0]));
            } else {
                fad_12.setVisible(false);
            }
            fyw_0.gqw().d("wakfu.focus", cej_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.nNR);
            if (fyw_0.gqw().to("focusDialog")) {
                fyw_0.gqw().tl("focusDialog");
            }
            fyw_0.gqw().tc("wakfu.focus");
        }
    }

    public void setCenter(float f2, float f3, float f4, float f5) {
        this.nNC = f2;
        this.nND = f3;
        this.nNE = f4;
        this.nNF = f5;
        fhv_1 fhv_12 = fyw_0.gqw().th("focusDialog");
        if (fhv_12 != null) {
            fkh_2 fkh_22 = (fkh_2)fhv_12.getElementMap().uH("focus");
            fkh_22.setCenter(this.nNC, this.nND, this.nNE, this.nNF);
        }
    }

    public void setMovePosition(long l, float f2, float f3, float f4, float f5) {
        this.nNG = l;
        this.nNH = f2;
        this.nNI = f3;
        this.nNJ = f4;
        this.nNK = f5;
        fhv_1 fhv_12 = fyw_0.gqw().th("focusDialog");
        if (fhv_12 != null) {
            fkh_2 fkh_22 = (fkh_2)fhv_12.getElementMap().uH("focus");
            fkh_22.setMovePosition(this.nNG, this.nNH, this.nNI, this.nNJ, this.nNK);
        }
    }

    public void setColor(float f2, float f3, float f4) {
        this.axp = f2;
        this.axq = f3;
        this.axr = f4;
    }

    public void setAlpha(float f2) {
        this.ayP = f2;
    }

    public void setFadeInDuration(long l) {
        this.nNL = l;
    }

    public void setFadeOutDuration(long l) {
        this.nNM = l;
    }

    public void setMouseBlocked(boolean bl) {
        this.nNN = bl;
    }

    public void setTarget(fkf_2 fkf_22) {
        this.nNB = fkf_22;
    }

    public void qA(String string) {
        this.nNS = string;
        fhv_1 fhv_12 = fyw_0.gqw().th("focusDialog");
        if (fhv_12 != null) {
            fad_1 fad_12 = (fad_1)fhv_12.getElementMap().uH("button");
            if (this.nNS.trim().isEmpty()) {
                fad_12.setVisible(false);
            } else {
                fad_12.setVisible(true);
                fad_12.setText(aum_0.cWf().c(this.nNS, new Object[0]));
            }
        }
    }

    public void g(afx_1 afx_12) {
        this.nNO = afx_12;
    }

    public void qB(String string) {
        this.nNP = string;
    }

    public void c(afq_2 ... afq_2Array) {
        this.nNQ = afq_2Array;
    }

    public void reset() {
        this.nNC = 0.0f;
        this.nND = 0.0f;
        this.nNE = 0.0f;
        this.nNF = 0.0f;
        this.nNG = 0L;
        this.nNH = 0.0f;
        this.nNI = 0.0f;
        this.nNJ = 0.0f;
        this.nNK = 0.0f;
        this.axp = 0.0f;
        this.axq = 0.0f;
        this.axr = 0.0f;
        this.ayP = 0.75f;
        this.nNL = 0L;
        this.nNM = 0L;
        this.nNN = false;
        this.nNB = fkf_2.uFy;
        this.nNS = null;
        this.nNP = null;
        this.nNQ = null;
        this.nNO = null;
    }

    public void eRk() {
        aue_0.cVJ().b(this);
        if (this.nNP != null) {
            this.nNO.a(this.nNP, this.nNQ, new afp_2[0]);
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

