/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from sU
 */
final class su_2 {
    private final ArrayList<ss_2> ZA = new ArrayList(0);
    final /* synthetic */ sr_1 ZB;

    su_2(sr_1 sr_12) {
        this.ZB = sr_12;
    }

    public void avW() {
        this.ZB.Zv.clear();
        this.ZB.Zv.ensureCapacity(this.ZA.size());
        this.ZB.Zv.addAll(this.ZA);
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

