/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from xv
 */
final class xv_1 {
    private final ArrayList<xr_1> ajS = new ArrayList(0);
    private xs_1 ajJ = null;
    private final ArrayList<xq_2> ajT = new ArrayList(0);
    final /* synthetic */ xp_1 ajU;

    xv_1(xp_1 xp_12) {
        this.ajU = xp_12;
    }

    public void avW() {
        this.ajU.ajI.clear();
        this.ajU.ajI.ensureCapacity(this.ajS.size());
        this.ajU.ajI.addAll(this.ajS);
        this.ajU.ajJ = this.ajJ;
        this.ajU.ajK.clear();
        this.ajU.ajK.ensureCapacity(this.ajT.size());
        this.ajU.ajK.addAll(this.ajT);
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

