/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRE
 */
public class fre_1
extends frc_1 {
    private fes_2 tCV;

    public fre_1(fes_2 fes_22) {
        this.tCV = fes_22;
    }

    @Override
    public int getValue() {
        if (this.tCV != null) {
            return this.tCV.getHeight();
        }
        return 0;
    }

    @Override
    public void setValue(int n) {
        this.tCV.setSize(this.tCV.ukt.width, n);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tCV = null;
    }
}

