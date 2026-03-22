/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBW
 */
public class fbw_2
extends faw_2 {
    private fis_1 tWS = null;
    private faa_2 tQJ = faa_2.tLK;
    private faa_2 tCX = faa_2.tLS;
    ftd_1 tWT;
    private fes_2 tWU;
    String tWV = null;
    boolean tWW = true;
    private boolean tWX = true;
    private boolean tWY = true;
    private int tWZ;
    private int tXa;
    public static final int tXb = 92903173;
    public static final int tXc = 1905963320;

    @Override
    public void eKI() {
        this.tWS = new fbx_2(this);
        fbj_1.getInstance().a(fzq_0.tJS, this.tWS, false);
        this.a(fzq_0.tJS, new fby_2(this), false);
        this.a(fzq_0.tJT, new fbz_1(this), false);
    }

    @Override
    public void gsh() {
        fbj_1.getInstance().b(fzq_0.tJS, this.tWS, false);
    }

    public void cDD() {
        if (!this.isVisible()) {
            this.setVisible(true);
            this.setSizeToPrefSize();
            this.setPositionToOptimal();
        }
    }

    @Override
    public void grg() {
        super.grg();
        this.setPositionToOptimal();
    }

    public void setPositionToOptimal() {
        if (this.tWT != null && this.tCX != null && this.tQJ != null) {
            int n = this.tWT.getDisplayX();
            int n2 = this.tWT.getDisplayY();
            faa_2 faa_22 = this.tCX;
            faa_2 faa_23 = this.tQJ;
            int n3 = n + faa_22.uS(this.tWT.getWidth()) - faa_23.uS(this.ukt.width);
            int n4 = n2 + faa_22.uT(this.tWT.getHeight()) - faa_23.uT(this.ukt.height);
            if (this.tWX && (n3 < 0 || n3 > this.uko.getAppearance().getContentWidth() - this.ukt.width)) {
                faa_22 = faa_22.gsd();
                faa_23 = faa_23.gsd();
            }
            if (this.tWY && (n4 < 0 || n4 > this.uko.getAppearance().getContentHeight() - this.ukt.height)) {
                faa_22 = faa_22.gse();
                faa_23 = faa_23.gse();
            }
            n3 = n + faa_22.uS(this.tWT.getWidth()) - faa_23.uS(this.ukt.width);
            n4 = n2 + faa_22.uT(this.tWT.getHeight()) - faa_23.uT(this.ukt.height);
            n3 = Math.max(0, Math.min(n3, this.uko.getAppearance().getContentWidth() - this.ukt.width));
            n4 = Math.max(0, Math.min(n4, this.uko.getAppearance().getContentHeight() - this.ukt.height));
            if (n >= n3 && n2 >= n4 && n < n3 + this.ukt.width && n2 < n4 + this.ukt.height) {
                n3 = n - this.ukt.width;
                n3 = Math.max(0, Math.min(n3, this.uko.getAppearance().getContentWidth() - this.ukt.width));
            }
            this.setPosition(n3 + this.tWZ, n4 + this.tXa);
        }
    }

    public void eKH() {
        this.setVisible(false);
        this.tWW = true;
    }

    public ftd_1 getClient() {
        return this.tWT;
    }

    public void setClient(ftd_1 ftd_12) {
        this.tWV = null;
        this.tWT = ftd_12;
        if (this.tWT != null) {
            fhs_2 fhs_22 = this.tWT.getElementMap();
            while (fhs_22.gAv() != null) {
                fhs_22 = fhs_22.gAv();
            }
            this.tWV = fhs_22.getId();
        }
    }

    public faa_2 getHotSpotPosition() {
        return this.tQJ;
    }

    public void setHotSpotPosition(faa_2 faa_22) {
        if (faa_22 != null) {
            this.tQJ = faa_22;
        }
    }

    public boolean getHideOnClick() {
        return this.tWW;
    }

    public void setHideOnClick(boolean bl) {
        this.tWW = bl;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    public void setXOffset(int n) {
        this.tWZ = n;
    }

    public void setYOffset(int n) {
        this.tXa = n;
    }

    public void setContent(fes_2 fes_22) {
        if (this.tWU != fes_22) {
            for (int i = this.tRe.size() - 1; i >= 0; --i) {
                ((fes_2)this.tRe.get(i)).gAD();
            }
            if (fes_22 != null) {
                fes_22 = (fes_2)fes_22.gAK();
                this.d(fes_22);
            }
            this.tWU = fes_22;
        }
    }

    public fes_2 getContent() {
        return this.tWU;
    }

    public boolean getEnableSwitchXAlign() {
        return this.tWX;
    }

    public void setEnableSwitchXAlign(boolean bl) {
        this.tWX = bl;
    }

    public boolean getEnableSwitchYAlign() {
        return this.tWY;
    }

    public void setEnableSwitchYAlign(boolean bl) {
        this.tWY = bl;
    }

    @Override
    public void aVI() {
        super.aVI();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        this.d(frp_12);
        this.setVisible(false);
        fyw_0.gqw().a(new fca_2(this));
        this.tWW = true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tCX = null;
        this.tQJ = null;
        this.tWV = null;
        this.tWS = null;
        this.tWU = null;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == 1905963320) {
            this.setHotSpotPosition(faa_2.tI(string));
        } else if (n == 466743410) {
            this.setVisible(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92903173) {
            this.setAlign((faa_2)((Object)object));
        } else if (n == 1905963320) {
            this.setHotSpotPosition((faa_2)((Object)object));
        } else if (n == 466743410) {
            this.setVisible(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

