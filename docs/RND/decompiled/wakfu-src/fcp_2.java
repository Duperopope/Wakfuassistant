/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCp
 */
public class fcp_2
extends faw_2
implements fyo_0,
fyv_0,
fzc {
    public static final String TAG = "progressText";
    public static final String tYl = " / ";
    public static final String tYm = "\u00af";
    public static final String tYn = "%";
    fbv_2 tPW;
    fbv_2 tYo;
    fbv_2 tYp;
    private fzu_0 tOW = fzu_0.tKE;
    private axb_2 chO = null;
    private awx_1 cVs = null;
    boolean tMi = true;
    private fzh_0 tYq = fzh_0.tGY;
    private boolean tYr = true;
    public static final float tYs = 0.0f;
    public static final float tYt = 1.0f;
    private float tXw = 0.0f;
    private float tXx = 1.0f;
    private float awY = 0.0f;
    public static final int tYu = 1606398415;
    public static final int tYv = 3148879;
    public static final int tYw = 1387629604;
    public static final int tYx = 381182586;
    public static final int tYy = -1395014068;
    public static final int tYz = 404338535;
    public static final int tYA = 728975971;
    public static final int tYB = 111972721;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fzq;
    }

    @Override
    public fzq getAppearance() {
        return (fzq)this.uki;
    }

    public void setTextOrientation(fzu_0 fzu_02) {
        this.tOW = fzu_02;
        if (this.tPW != null) {
            this.tPW.setOrientation(fzu_02);
        }
        if (this.tYo != null) {
            this.tYo.setOrientation(fzu_02);
        }
        if (this.tYp != null) {
            this.tYp.setOrientation(fzu_02);
        }
    }

    @Override
    public void setFont(awx_1 awx_12) {
        if (this.tPW != null) {
            this.tPW.setFont(awx_12);
        }
        if (this.tYo != null) {
            this.tYo.setFont(awx_12);
        }
        if (this.tYp != null) {
            this.tYp.setFont(awx_12);
        }
        this.cVs = awx_12;
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.tPW != null) {
            this.tPW.setModulationColor(axb_22);
        }
        if (this.tYo != null) {
            this.tYo.setModulationColor(axb_22);
        }
        if (this.tYp != null) {
            this.tYp.setModulationColor(axb_22);
        }
    }

    @Override
    public axb_2 getModulationColor() {
        if (this.tPW != null) {
            return this.tPW.getModulationColor();
        }
        return null;
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || string.equalsIgnoreCase("text")) {
            if (this.chO == axb_22) {
                return;
            }
            this.chO = axb_22;
            if (this.tPW != null) {
                this.tPW.setColor(this.chO, null);
            }
            if (this.tYo != null) {
                this.tYo.setColor(this.chO, null);
            }
            if (this.tYp != null) {
                this.tYp.setColor(this.chO, null);
            }
        }
    }

    private void setText(String string) {
        this.setText(string, null);
    }

    private void setText(String object, String string) {
        if (!(this.tYr || object == null || ((String)object).isEmpty() || string == null || string.isEmpty())) {
            object = (String)object + tYl + string;
            if (this.tYo != null) {
                this.m((fhv_1)this.tYo);
                this.tYo = null;
            }
            if (this.tYp != null) {
                this.m((fhv_1)this.tYp);
                this.tYp = null;
            }
        }
        if (object == null || ((String)object).isEmpty()) {
            if (this.tPW != null) {
                this.m((fhv_1)this.tPW);
                this.tPW = null;
            }
            if (this.tYo != null) {
                this.m((fhv_1)this.tYo);
                this.tYo = null;
            }
            if (this.tYp != null) {
                this.m((fhv_1)this.tYp);
                this.tYp = null;
            }
            return;
        }
        if (this.tPW == null) {
            this.tPW = new fbv_2();
            this.tPW.aVI();
            this.ae(this.tPW);
            this.d(this.tPW);
        }
        this.tPW.setText((String)object);
        if (!this.tYr) {
            return;
        }
        if (string != null && !string.isEmpty()) {
            if (this.tYo == null) {
                this.tYo = new fbv_2();
                this.tYo.aVI();
                this.ae(this.tYo);
                this.d(this.tYo);
                this.tYo.setText(tYm);
            }
            if (this.tYp == null) {
                this.tYp = new fbv_2();
                this.tYp.aVI();
                this.ae(this.tYp);
                this.d(this.tYp);
            }
            this.tYp.setText(string);
        } else {
            if (this.tYo != null) {
                this.m((fhv_1)this.tYo);
                this.tYo = null;
            }
            if (this.tYp != null) {
                this.m((fhv_1)this.tYp);
                this.tYp = null;
            }
        }
    }

    private String getText() {
        if (this.tPW != null) {
            return this.tPW.getText();
        }
        return "";
    }

    public float getMinBound() {
        return this.tXw;
    }

    public void setMinBound(float f2) {
        this.tXw = f2;
        if (this.awY < this.tXw) {
            this.awY = this.tXw;
        }
        this.gtJ();
    }

    public float getMaxBound() {
        return this.tXx;
    }

    public void setMaxBound(float f2) {
        this.tXx = f2;
        if (this.awY > this.tXx) {
            this.awY = this.tXx;
        }
        this.gtJ();
    }

    public float getPercentage() {
        return (this.awY - this.tXw) / (this.tXx - this.tXw);
    }

    public float getValue() {
        return this.awY;
    }

    public void setValue(float f2) {
        if (f2 < this.tXw) {
            f2 = this.tXw;
        }
        if (f2 > this.tXx) {
            f2 = this.tXx;
        }
        this.awY = f2;
        this.gtJ();
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    public void setHorizontal(boolean bl) {
        if (this.tMi != bl) {
            this.tMi = bl;
        }
        this.gsm();
    }

    public boolean getSplitText() {
        return this.tYr;
    }

    public void setSplitText(boolean bl) {
        this.tYr = bl;
    }

    public fzh_0 getDisplayValue() {
        return this.tYq;
    }

    public void setDisplayValue(fzh_0 fzh_02) {
        this.tYq = fzh_02;
        this.gtJ();
    }

    private void ae(fbv_2 fbv_22) {
        fbv_22.setExpandable(false);
        fbv_22.setAlign(faa_2.tLO);
        fbv_22.setFont(this.cVs);
        fbv_22.setOrientation(this.tOW);
        fbv_22.setColor(this.chO, null);
    }

    @Override
    public void grg() {
        super.grg();
    }

    private void gtJ() {
        switch (this.tYq) {
            case tGV: {
                if ((double)this.awY - Math.floor(this.awY) != 0.0) {
                    this.setText(Float.toString(this.awY));
                    break;
                }
                this.setText(Integer.toString((int)this.awY));
                break;
            }
            case tGW: {
                this.setText(Integer.toString((int)(this.getPercentage() * 100.0f)) + tYn);
                break;
            }
            case tGX: {
                String string = (double)this.awY - Math.floor(this.awY) != 0.0 ? Float.toString(this.awY) : Integer.toString((int)this.awY);
                String string2 = (double)this.tXx - Math.floor(this.tXx) != 0.0 ? Float.toString(this.tXx) : Integer.toString((int)this.tXx);
                this.setText(string, string2);
                break;
            }
            default: {
                this.setText("");
            }
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fcp_2 fcp_22 = (fcp_2)fhi_22;
        fcp_22.setHorizontal(this.tMi);
        fcp_22.setValue(this.awY);
        fcp_22.setMaxBound(this.tXx);
        fcp_22.setMinBound(this.tXw);
        fcp_22.setSplitText(this.tYr);
        fcp_22.setTextOrientation(this.tOW);
        fcp_22.setText(this.getText(), this.tYp != null ? this.tYp.getText() : "");
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tOW = null;
        this.cVs = null;
        this.tPW = null;
        this.tYo = null;
        this.tYp = null;
        this.chO = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        fzq fzq2 = fzq.checkOut();
        fzq2.setWidget(this);
        this.d(fzq2);
        fcr_2 fcr_22 = new fcr_2(this);
        fcr_22.aVI();
        this.a(fcr_22);
        this.setNonBlocking(false);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1606398415) {
            this.setDisplayValue(fzh_0.tv(string));
        } else if (n == 381182586) {
            this.setMaxBound(Bw.o(string));
        } else if (n == -1395014068) {
            this.setMinBound(Bw.o(string));
        } else if (n == 3148879) {
            this.setFont(fic_12.vq(string));
        } else if (n == 1387629604) {
            this.setHorizontal(Bw.aK(string));
        } else if (n == 404338535) {
            this.setSplitText(Bw.aK(string));
        } else if (n == 728975971) {
            this.setTextOrientation(fzu_0.tC(string));
        } else if (n == 111972721) {
            this.setValue(Bw.o(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 1606398415) {
            this.setDisplayValue((fzh_0)((Object)object));
        } else if (n == 381182586) {
            this.setMaxBound(Bw.o(object));
        } else if (n == -1395014068) {
            this.setMinBound(Bw.o(object));
        } else if (n == 3148879) {
            this.setFont((awm_2)object);
        } else if (n == 1387629604) {
            this.setHorizontal(Bw.l(object));
        } else if (n == 404338535) {
            this.setSplitText(Bw.l(object));
        } else if (n == 728975971) {
            this.setTextOrientation((fzu_0)((Object)object));
        } else if (n == 111972721) {
            this.setValue(Bw.o(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

