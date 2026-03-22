/*
 * Decompiled with CFR 0.152.
 */
public class fzs
extends fym_0 {
    public static final String TAG = "ToggleButtonAppearance";
    public static final String tFR = fzy_0.tGb.getName();
    public static final String tFS = fzy_0.tGd.getName();
    public static final String tFT = fzy_0.tGh.getName();
    public static final String tFU = fzy_0.tGf.getName();
    protected boolean jqv;

    @Override
    public String getTag() {
        return TAG;
    }

    public boolean isChecked() {
        return this.jqv;
    }

    public boolean grr() {
        this.jqv = !this.jqv;
        flv_2 flv_22 = new flv_2(this.tCV, this.jqv);
        boolean bl = this.tCV.h(flv_22);
        this.elr();
        return bl;
    }

    @Override
    protected void gqX() {
        if (this.jqv) {
            this.setEnabled(this.getEnableLabel(), true);
        } else {
            super.gqX();
        }
    }

    private String getEnableLabel() {
        if (!this.cHn) {
            return tFS;
        }
        if (!this.tDw) {
            return tFR;
        }
        if (!this.tDv) {
            return tFT;
        }
        return tFU;
    }

    @Override
    public void grv() {
        this.jqv = false;
        this.elr();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzs fzs2 = (fzs)fhi_22;
        super.a(fzs2);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.jqv = false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jqv = false;
    }
}

