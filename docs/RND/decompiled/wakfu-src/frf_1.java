/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRF
 */
public class frf_1
extends frc_1 {
    private frc_1 vaq;

    public frf_1(frc_1 frc_12) {
        if (frc_12 != null) {
            this.vaq = frc_12;
        } else {
            frc_1.vah.error((Object)"Le Spring pass\u00e9 en param\u00e8tre est null");
            this.vaq = frf_1.acc(0);
        }
    }

    @Override
    public int getValue() {
        return -this.vaq.getValue();
    }

    @Override
    public void setValue(int n) {
        this.vaq.setValue(n);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.vaq = null;
    }
}

