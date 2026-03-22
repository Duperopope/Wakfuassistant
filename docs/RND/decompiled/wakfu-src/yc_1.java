/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from yc
 */
final class yc_1 {
    private xx_1 akH = null;
    private xt_2 akI = null;
    private final ArrayList<yb_1> akZ = new ArrayList(0);
    final /* synthetic */ xs_2 ala;

    yc_1(xs_2 xs_22) {
        this.ala = xs_22;
    }

    public void avW() {
        this.ala.akH = this.akH;
        this.ala.akI = this.akI;
        this.ala.akJ.clear();
        this.ala.akJ.ensureCapacity(this.akZ.size());
        this.ala.akJ.addAll(this.akZ);
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

