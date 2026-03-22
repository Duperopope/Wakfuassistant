/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vN
 */
public class vn_2
implements gs_0 {
    public final yd_2 agg = new yd_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.agg.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.agg.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.agg.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vo_2 vo_22 = new vo_2(this);
            boolean bl = vo_22.b(byteBuffer, n);
            if (bl) {
                vo_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.agg.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cU(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cU(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawShard=...\n");
        this.agg.ev(stringBuilder, string + "  ");
    }
}

