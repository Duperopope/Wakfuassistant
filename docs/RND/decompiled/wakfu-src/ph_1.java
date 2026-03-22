/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ph
 */
final class ph_1 {
    private final tu_2 Sq = new tu_2();
    final /* synthetic */ pf_1 Sr;

    ph_1(pf_1 pf_12) {
        this.Sr = pf_12;
    }

    public void avW() {
        this.Sr.Sn.aaE = this.Sq.aaE;
    }

    private boolean cF(ByteBuffer byteBuffer) {
        return true;
    }

    private boolean da(ByteBuffer byteBuffer) {
        boolean bl = this.Sq.b(byteBuffer, 10048007);
        return bl;
    }

    private boolean db(ByteBuffer byteBuffer) {
        boolean bl = this.Sq.b(byteBuffer, 10075002);
        return bl;
    }

    private boolean dc(ByteBuffer byteBuffer) {
        boolean bl = this.Sq.b(byteBuffer, 10076001);
        return bl;
    }

    private boolean dd(ByteBuffer byteBuffer) {
        boolean bl = this.Sq.b(byteBuffer, 10079000);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0) {
            return false;
        }
        if (n < 10048007) {
            boolean bl = this.cF(byteBuffer);
            return bl;
        }
        if (n < 10075002) {
            boolean bl = this.da(byteBuffer);
            return bl;
        }
        if (n < 10076001) {
            boolean bl = this.db(byteBuffer);
            return bl;
        }
        if (n < 10079000) {
            boolean bl = this.dc(byteBuffer);
            return bl;
        }
        if (n < 10084000) {
            boolean bl = this.dd(byteBuffer);
            return bl;
        }
        return false;
    }
}

