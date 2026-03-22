/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vC
 */
final class vc_2 {
    private final us_1 afL = new us_1();
    final /* synthetic */ vb_2 afM;

    vc_2(vb_2 vb_22) {
        this.afM = vb_22;
    }

    public void avW() {
        this.afM.afK.acr = this.afL.acr;
        this.afM.afK.XQ = this.afL.XQ;
        this.afM.afK.aep.aau.clear();
        this.afM.afK.aep.aau.ensureCapacity(this.afL.aep.aau.size());
        this.afM.afK.aep.aau.addAll(this.afL.aep.aau);
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.afL.b(byteBuffer, 1);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 0x992323) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        return false;
    }
}

