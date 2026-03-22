/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSb
 */
public class fsb_1
extends fha_2 {
    public static final String TAG = "tooltip";
    public static axb_2 vcs = awx_2.dnG;
    public static axb_2 vct = new awx_2(1.0f, 1.0f, 1.0f, 0.7f);
    public static axb_2 vcu = new awx_2(0.06f, 0.04f, 0.03f, 0.4f);
    public static awh_2 vcv;
    public static float vcw;
    public String bKP = "";
    public int bRf = 0;
    public int bRg = 0;
    public float dlf = vcw;
    public int bMn = ahe.bzF();
    public float vcx = -1.0f;
    public axb_2 isS = vcs;
    public axb_2 vcy = vct;
    public axb_2 urJ = vcu;
    public awh_2 dln = vcv;
    public ahc vcz = ahc.cvA;
    public faa_2 tEW = faa_2.tLK;
    public static final int vcA = 3556653;
    public static final int vcB = 1287124693;
    public static final int vcC = 722830999;
    public static final int vcD;
    public static final int vcE = -1992012396;
    public static final int vcF = 967345036;
    public static final int vcG = 400381634;
    public static final int vcH = 0x2C929929;
    public static final int vcI;
    public static final int vcJ = 1485313835;
    public static final int vcK = -1922149780;

    @Override
    public void a(fhi_2 fhi_22) {
        fsb_1 fsb_12 = (fsb_1)fhi_22;
        super.a(fhi_22);
        fsb_12.bKP = this.bKP;
        fsb_12.bRf = this.bRf;
        fsb_12.bRg = this.bRg;
        fsb_12.bMn = this.bMn;
        fsb_12.vcx = this.vcx;
        fsb_12.setTextColor(this.isS);
        fsb_12.setBackgroundColor(this.vcy);
        fsb_12.setBorderColor(this.urJ);
        fsb_12.dln = this.dln;
        fsb_12.vcz = this.vcz;
        fsb_12.tEW = this.tEW;
        fsb_12.dlf = this.dlf;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setDuration(int n) {
        this.bMn = n * 1000;
    }

    public axb_2 getBackgroundColor() {
        return this.vcy;
    }

    public axb_2 getBorderColor() {
        return this.urJ;
    }

    public float getBorderWidth() {
        return this.dlf;
    }

    public int getDuration() {
        return this.bMn;
    }

    public awh_2 getFont() {
        return this.dln;
    }

    public ahc getHotPointPosition() {
        return this.vcz;
    }

    public float getMaxWidth() {
        return this.vcx;
    }

    public faa_2 getPosition() {
        return this.tEW;
    }

    public String getText() {
        return this.bKP;
    }

    public axb_2 getTextColor() {
        return this.isS;
    }

    public Integer getXOffset() {
        return this.bRf;
    }

    public int getYOffset() {
        return this.bRg;
    }

    public void setBackgroundColor(axb_2 axb_22) {
        if (this.vcy == axb_22) {
            return;
        }
        this.vcy = axb_22;
    }

    public void setBorderColor(axb_2 axb_22) {
        if (this.urJ == axb_22) {
            return;
        }
        this.urJ = axb_22;
    }

    public void setBorderWidth(float f2) {
        this.dlf = f2;
    }

    public void setHotPointPosition(ahc ahc2) {
        this.vcz = ahc2;
    }

    public void setMaxWidth(float f2) {
        this.vcx = f2;
    }

    public void setPosition(faa_2 faa_22) {
        this.tEW = faa_22;
    }

    public void setText(String string) {
        this.bKP = string;
    }

    public void setTextColor(axb_2 axb_22) {
        if (this.isS == axb_22) {
            return;
        }
        this.isS = axb_22;
    }

    public void setXOffset(int n) {
        this.bRf = n;
    }

    public void setYOffset(int n) {
        this.bRg = n;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 3556653) {
            this.setText(fic_12.a(string, this.nQt));
        } else if (n == 1287124693) {
            this.setBackgroundColor(fic_12.vm(string));
        } else if (n == 722830999) {
            this.setBorderColor(fic_12.vm(string));
        } else if (n == -1992012396) {
            this.setDuration(Bw.m(string));
        } else if (n == 967345036) {
            this.setHotPointPosition(ahc.eL(string));
        } else if (n == 400381634) {
            this.setMaxWidth(Bw.o(string));
        } else if (n == 0x2C929929) {
            this.setPosition(faa_2.tI(string));
        } else if (n == 1485313835) {
            this.setXOffset(Bw.m(string));
        } else if (n == -1922149780) {
            this.setYOffset(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 3556653) {
            this.setText(String.valueOf(object));
        } else if (n == 1287124693) {
            this.setBackgroundColor((axb_2)object);
        } else if (n == 722830999) {
            this.setBorderColor((axb_2)object);
        } else if (n == -1992012396) {
            this.setDuration(Bw.m(object));
        } else if (n == 967345036) {
            this.setHotPointPosition((ahc)((Object)object));
        } else if (n == 400381634) {
            this.setMaxWidth(Bw.o(object));
        } else if (n == 0x2C929929) {
            this.setPosition((faa_2)((Object)object));
        } else if (n == 1485313835) {
            this.setXOffset(Bw.m(object));
        } else if (n == -1922149780) {
            this.setYOffset(Bw.m(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.isS = null;
        this.vcy = null;
        this.urJ = null;
    }

    static {
        vcw = 1.5f;
        vcD = "borderWidth".hashCode();
        vcI = "textColor".hashCode();
    }
}

