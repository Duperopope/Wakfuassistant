/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

public class fzq
extends fys_0 {
    public static final String TAG = "TextWidgetAppearance";
    public static final String tFC = "TextViewAppearance";
    public static final String tFD = "LabelAppearance";
    public static final String tFE = "text";
    private static final ObjectPool tFF = new ayv_2(new fzr());
    private faa_2 tCX;
    private awx_1 tFG;
    private axb_2 isS;
    private boolean tFH;
    private boolean tFI;
    private boolean tFJ;
    private boolean tFK;
    public static final int tFL = 92903173;
    public static final int tFM = 1767875043;
    public static final int tFN = -1249482096;
    public static final int tFO = 3148879;
    public static final int tFP = -1063571914;
    public static final int tFQ = 1153931755;

    public static fzq checkOut() {
        fzq fzq2;
        try {
            fzq2 = (fzq)tFF.borrowObject();
            fzq2.uth = tFF;
        }
        catch (Exception exception) {
            tDG.error((Object)"Probl\u00e8me au borrowObject.");
            fzq2 = new fzq();
            fzq2.aVI();
        }
        return fzq2;
    }

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setWidget(fes_2 fes_22) {
        if (this.tCX != null && fes_22 instanceof fyi_0) {
            ((fyi_0)((Object)fes_22)).setAlign(this.tCX);
        }
        if (this.tFG != null && fes_22 instanceof fyv_0) {
            ((fyv_0)((Object)fes_22)).setFont(this.tFG);
        }
        if (this.isS != null && fes_22 instanceof fyo_0) {
            ((fyo_0)((Object)fes_22)).setColor(this.isS, null);
        }
        if (this.tFI && this.tCV instanceof fgt_2) {
            ((fgt_2)((Object)this.tCV)).setUseHighContrast(this.tFH);
        }
        if (this.tFK && this.tCV instanceof fgt_2) {
            ((fgt_2)((Object)this.tCV)).setJustify(this.tFJ);
        }
        super.setWidget(fes_22);
    }

    public void setUseHighContrast(boolean bl) {
        this.tFH = bl;
        this.tFI = true;
        if (this.tCV != null && this.tCV instanceof fdz_1) {
            ((fdz_1)this.tCV).setUseHighContrast(this.tFH);
        }
    }

    public boolean getUseHighContrast() {
        return this.tFH;
    }

    public boolean getJustify() {
        return this.tFJ;
    }

    public void setJustify(boolean bl) {
        this.tFJ = bl;
        this.tFK = true;
        if (this.tCV != null && this.tCV instanceof fdz_1) {
            ((fdz_1)this.tCV).setJustify(bl);
        }
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
        if (this.tCX != null && this.tCV != null && this.tCV instanceof fyi_0) {
            ((fyi_0)((Object)this.tCV)).setAlign(faa_22);
        }
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    @Deprecated
    public void setAlignment(faa_2 faa_22) {
        this.setAlign(faa_22);
    }

    @Deprecated
    public faa_2 getAlignment() {
        fkp_1 fkp_12;
        int n;
        int n2 = this.tDS.size();
        for (n = 0; n < n2; ++n) {
            fkp_12 = (fkp_1)this.tDS.get(n);
            if (!(fkp_12 instanceof fyj_0) || !fkp_12.getState().equalsIgnoreCase(this.tDV)) continue;
            return ((fyj_0)fkp_12).getAlignment();
        }
        n2 = this.tDS.size();
        for (n = 0; n < n2; ++n) {
            fkp_12 = (fkp_1)this.tDS.get(n);
            if (!(fkp_12 instanceof fyj_0) || !fkp_12.getState().equalsIgnoreCase(tDM)) continue;
            return ((fyj_0)fkp_12).getAlignment();
        }
        return this.tCX;
    }

    public void setFont(awx_1 awx_12) {
        this.tFG = awx_12;
        if (this.tCV instanceof fyv_0) {
            ((fyv_0)((Object)this.tCV)).setFont(awx_12);
        }
    }

    public awx_1 getFont() {
        fkp_1 fkp_12;
        int n;
        int n2 = this.tDS.size();
        for (n = 0; n < n2; ++n) {
            fkp_12 = (fkp_1)this.tDS.get(n);
            if (!(fkp_12 instanceof fyW) || !fkp_12.getState().equalsIgnoreCase(this.tDV)) continue;
            return ((fyW)fkp_12).getRenderer();
        }
        n2 = this.tDS.size();
        for (n = 0; n < n2; ++n) {
            fkp_12 = (fkp_1)this.tDS.get(n);
            if (!(fkp_12 instanceof fyW) || !fkp_12.getState().equalsIgnoreCase(tDM)) continue;
            return ((fyW)fkp_12).getRenderer();
        }
        return this.tFG;
    }

    @Override
    public void setColor(axb_2 axb_22, String string) {
        if (string == null || tFE.equals(string)) {
            this.setTextColor(axb_22);
        } else {
            super.setColor(axb_22, string);
        }
    }

    public void setTextColor(axb_2 axb_22) {
        if (this.isS == axb_22) {
            return;
        }
        this.isS = axb_22;
        if (this.tCV instanceof fyo_0) {
            ((fyo_0)((Object)this.tCV)).setColor(axb_22, null);
        }
    }

    public axb_2 getTextColor() {
        fkp_1 fkp_12;
        int n;
        int n2 = this.tDS.size();
        for (n = 0; n < n2; ++n) {
            fkp_12 = (fkp_1)this.tDS.get(n);
            if (!(fkp_12 instanceof fyp_0) || !fkp_12.getState().equalsIgnoreCase(this.tDV)) continue;
            return ((fyp_0)fkp_12).getColor();
        }
        n2 = this.tDS.size();
        for (n = 0; n < n2; ++n) {
            fkp_12 = (fkp_1)this.tDS.get(n);
            if (!(fkp_12 instanceof fyp_0) || !fkp_12.getState().equalsIgnoreCase(tDM)) continue;
            return ((fyp_0)fkp_12).getColor();
        }
        return this.isS;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tCX = null;
        this.tFG = null;
        this.isS = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tFH = false;
        this.tFI = false;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzq fzq2 = (fzq)fhi_22;
        super.a(fzq2);
        if (this.tCX != null) {
            fzq2.setAlign(this.tCX);
        }
        if (this.tFG != null) {
            fzq2.setFont(this.tFG);
        }
        if (this.isS != null) {
            fzq2.setTextColor(this.isS);
        }
        if (this.tFI) {
            fzq2.setUseHighContrast(this.tFH);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173 || n == 1767875043) {
            this.setAlign(faa_2.tI(string));
        } else if (n == -1249482096) {
            this.setJustify(Bw.aK(string));
        } else if (n == 3148879) {
            this.setFont(fic_12.vq(string));
        } else if (n == -1063571914) {
            this.setTextColor(fic_12.vm(string));
        } else if (n == 1153931755) {
            this.setUseHighContrast(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1063571914) {
            this.setTextColor((axb_2)object);
        } else if (n == 92903173 || n == 1767875043) {
            this.setAlign((faa_2)((Object)object));
        } else if (n == -1249482096) {
            this.setJustify(Bw.l(object));
        } else if (n == 3148879) {
            this.setFont((awm_2)object);
        } else if (n == 1153931755) {
            this.setUseHighContrast(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

