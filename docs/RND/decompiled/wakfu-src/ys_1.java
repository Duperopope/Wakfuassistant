/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ys
 */
final class ys_1 {
    private final ym_1 alJ = new ym_1();
    final /* synthetic */ yr_1 alK;

    ys_1(yr_1 yr_12) {
        this.alK = yr_12;
    }

    public void avW() {
        this.alK.alI.ZC = this.alJ.ZC;
        this.alK.alI.alB = this.alJ.alB;
        this.alK.alI.Xr = this.alJ.Xr;
    }

    private boolean cx(ByteBuffer byteBuffer) {
        boolean bl = this.alJ.b(byteBuffer, 1);
        return bl;
    }

    private boolean dt(ByteBuffer byteBuffer) {
        boolean bl = this.alJ.b(byteBuffer, 10048002);
        return bl;
    }

    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            return false;
        }
        if (n < 10048002) {
            boolean bl = this.cx(byteBuffer);
            return bl;
        }
        if (n < 10056001) {
            boolean bl = this.dt(byteBuffer);
            return bl;
        }
        return false;
    }
}

