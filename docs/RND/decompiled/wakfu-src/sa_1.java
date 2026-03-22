/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sa
 */
final class sa_1 {
    private final xs_2 XO = new xs_2();
    final /* synthetic */ ry_2 XP;

    sa_1(ry_2 ry_22) {
        this.XP = ry_22;
    }

    public void avW() {
        this.XP.XL.akH = this.XO.akH;
        this.XP.XL.akI = this.XO.akI;
        this.XP.XL.akJ.clear();
        this.XP.XL.akJ.ensureCapacity(this.XO.akJ.size());
        this.XP.XL.akJ.addAll(this.XO.akJ);
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 1) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        return false;
    }
}

