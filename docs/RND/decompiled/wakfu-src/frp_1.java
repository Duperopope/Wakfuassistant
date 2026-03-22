/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRP
 */
public class frp_1
extends frr_1 {
    public static final String TAG = "StaticLayoutData";
    public static final String vaM = "sld";
    private fsm_1 joh;
    private fzw_0 nhL;
    private int bap = 0;
    private int baq = 0;
    private ftc_1 vaN;
    private ftc_1 vaO;
    private int bRf = 0;
    private int bRg = 0;
    private boolean vaP = false;
    private boolean vaQ = false;
    private boolean vaR = false;
    private boolean vaS = false;
    private boolean uZR = false;
    private boolean bmh = true;
    private fes_2 vaT = null;
    private String vaU = null;
    private boolean vaV = false;
    public static final int vaW = 92903173;
    public static final int vaX = 1767875043;
    public static final int vaY = 196702412;
    public static final int vaZ = 2049815893;
    public static final int vba = -266541503;
    public static final int vbb = 3530753;
    public static final int vbc = -836164360;
    public static final int vbd = 120;
    public static final int vbe = 1485313835;
    public static final int vbf = 113306494;
    public static final int vbg = 121;
    public static final int vbh = -1922149780;
    public static final int vbi = 114230015;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isInitValue() {
        return this.uZR;
    }

    public void setInitValue(boolean bl) {
        this.uZR = bl;
        this.bmh = true;
    }

    @Deprecated
    public void setResizeOnce(boolean bl) {
        this.setInitValue(bl);
    }

    public boolean isAutoPositionable() {
        return this.vaT != null;
    }

    public boolean isCascadePositionable() {
        return this.vaV;
    }

    public fes_2 getReferentWidget() {
        return this.vaT;
    }

    public void setReferentWidget(fes_2 fes_22) {
        this.vaT = fes_22;
    }

    public void setCascadeMethodEnabled(boolean bl) {
        this.vaV = bl;
    }

    public String getControlGroup() {
        return this.vaU;
    }

    public void setControlGroup(String string) {
        this.vaU = string;
    }

    public int getX() {
        return this.bap;
    }

    public ftc_1 getXPerc() {
        return this.vaN;
    }

    public void setXPerc(ftc_1 ftc_12) {
        this.vaN = ftc_12;
    }

    public ftc_1 getYPerc() {
        return this.vaO;
    }

    public void setYPerc(ftc_1 ftc_12) {
        this.vaO = ftc_12;
    }

    public void setX(int n) {
        this.vaP = true;
        this.bap = n;
    }

    public boolean isXInit() {
        return this.vaP;
    }

    public int getY() {
        return this.baq;
    }

    public void setY(int n) {
        this.vaQ = true;
        this.baq = n;
    }

    public boolean isYInit() {
        return this.vaQ;
    }

    public int getXOffset() {
        return this.bRf;
    }

    public void setXOffset(int n) {
        this.vaR = true;
        this.bRf = n;
    }

    public int getYOffset() {
        return this.bRg;
    }

    public void setYOffset(int n) {
        this.vaS = true;
        this.bRg = n;
    }

    public boolean isXOffsetInit() {
        return this.vaR;
    }

    public boolean isYOffsetInit() {
        return this.vaS;
    }

    public fsm_1 getSize() {
        return this.joh;
    }

    public void setSize(fsm_1 fsm_12) {
        this.joh = fsm_12;
    }

    public fzw_0 getAlignment() {
        return this.nhL;
    }

    public void setAlignment(fzw_0 fzw_02) {
        this.nhL = fzw_02;
    }

    public void setAlign(fzw_0 fzw_02) {
        this.nhL = fzw_02;
    }

    public void setUsable(boolean bl) {
        this.bmh = bl;
    }

    public boolean isUsable() {
        return !this.uZR || this.bmh;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bap = 0;
        this.baq = 0;
        this.bRf = 0;
        this.bRg = 0;
        this.vaP = false;
        this.vaQ = false;
        this.vaR = false;
        this.vaS = false;
        this.uZR = false;
        this.vaV = false;
        this.bmh = true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.vaT = null;
        this.joh = null;
        this.nhL = null;
        this.vaU = null;
        this.vaN = null;
        this.vaO = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        frp_1 frp_12 = (frp_1)fhi_22;
        super.a(frp_12);
        frp_12.nhL = this.nhL;
        if (this.joh != null) {
            frp_12.joh = (fsm_1)this.joh.clone();
        }
        if (this.vaP) {
            frp_12.setX(this.bap);
        }
        if (this.vaQ) {
            frp_12.setY(this.baq);
        }
        if (this.vaR) {
            frp_12.setXOffset(this.bRf);
        }
        if (this.vaS) {
            frp_12.setYOffset(this.bRg);
        }
        if (this.vaN != null) {
            frp_12.setXPerc((ftc_1)this.vaN.clone());
        }
        if (this.vaO != null) {
            frp_12.setYPerc((ftc_1)this.vaO.clone());
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173 || n == 1767875043) {
            this.setAlign(fzw_0.tE(string));
        } else if (n == 196702412) {
            this.setCascadeMethodEnabled(Bw.aK(string));
        } else if (n == 2049815893 || n == -266541503) {
            this.setInitValue(Bw.aK(string));
        } else if (n == 3530753) {
            this.setSize(fic_12.vn(string));
        } else if (n == -836164360) {
            this.setUsable(Bw.aK(string));
        } else if (n == 120) {
            this.setX(Bw.m(string));
        } else if (n == 1485313835) {
            this.setXOffset(Bw.m(string));
        } else if (n == 113306494) {
            this.setXPerc(fic_12.vr(string));
        } else if (n == 121) {
            this.setY(Bw.m(string));
        } else if (n == -1922149780) {
            this.setYOffset(Bw.m(string));
        } else if (n == 114230015) {
            this.setYPerc(fic_12.vr(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92903173 || n == 1767875043) {
            this.setAlign((fzw_0)((Object)object));
        } else if (n == 113306494) {
            this.setXPerc((ftc_1)object);
        } else if (n == 114230015) {
            this.setYPerc((ftc_1)object);
        } else if (n == 3530753) {
            this.setSize((fsm_1)object);
        } else if (n == 1485313835) {
            this.setXOffset((Integer)object);
        } else if (n == -1922149780) {
            this.setYOffset((Integer)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

