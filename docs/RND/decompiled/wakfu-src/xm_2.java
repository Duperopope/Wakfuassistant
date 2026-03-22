/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xM
 */
final class xm_2 {
    private int aai = 0;
    private final sr_1 akw = new sr_1();
    final /* synthetic */ xl_2 akx;

    xm_2(xl_2 xl_22) {
        this.akx = xl_22;
    }

    public void avW() {
        this.akx.aai = this.aai;
        this.akx.akv.Zv.clear();
        this.akx.akv.Zv.ensureCapacity(this.akw.Zv.size());
        this.akx.akv.Zv.addAll(this.akw.Zv);
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

