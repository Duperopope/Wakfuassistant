/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vp
 */
public class vp_2
implements gs_0 {
    public final yd_2 afm = new yd_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afm.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afm.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afm.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            vq_1 vq_12 = new vq_1(this);
            boolean bl = vq_12.b(byteBuffer, n);
            if (bl) {
                vq_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afm.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cH(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cH(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawShard=...\n");
        this.afm.ev(stringBuilder, string + "  ");
    }
}

