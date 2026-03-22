/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fRI
 */
public class fri_1
extends frc_1 {
    private fes_2 tCV;

    public fri_1(fes_2 fes_22) {
        this.tCV = fes_22;
    }

    @Override
    public int getValue() {
        if (this.tCV != null) {
            return this.tCV.getWidth();
        }
        return 0;
    }

    @Override
    public void setValue(int n) {
        this.tCV.setSize(n, this.tCV.ukt.height);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tCV = null;
    }
}

