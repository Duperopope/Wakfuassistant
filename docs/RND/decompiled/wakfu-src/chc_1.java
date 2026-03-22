/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from cHC
 */
class chc_1
implements ftl_1 {
    final /* synthetic */ faw_2 mZZ;
    final /* synthetic */ cie_1 naa;
    final /* synthetic */ fey_2 nab;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    chc_1(faw_2 faw_22, cie_1 cie_12, fey_2 fey_22) {
        this.mZZ = faw_22;
        this.naa = cie_12;
        this.nab = fey_22;
    }

    @Override
    public void epr() {
        int n = this.mZZ.getWidth() / 2;
        int n2 = Math.max(0, Math.min(this.naa.getWidth() - this.mZZ.getWidth(), chb_2.mZW - n));
        int n3 = Math.min(this.naa.getHeight() - this.mZZ.getHeight(), chb_2.mZX + 15);
        this.mZZ.setPosition(new Point(n2, n3));
        this.mZZ.setVisible(true);
        this.nab.b(this);
        cAY.eHc().nP(600072L);
    }
}

