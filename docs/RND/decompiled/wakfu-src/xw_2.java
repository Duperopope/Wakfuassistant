/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xW
 */
final class xw_2 {
    private final ArrayList<xu_1> akO = new ArrayList(0);
    final /* synthetic */ xt_2 akP;

    xw_2(xt_2 xt_22) {
        this.akP = xt_22;
    }

    public void avW() {
        this.akP.akK.clear();
        this.akP.akK.ensureCapacity(this.akO.size());
        this.akP.akK.addAll(this.akO);
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

