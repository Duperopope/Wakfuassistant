/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xe
 */
public class xe_1
implements gs_0 {
    public final yk_1 ajm = new yk_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.ajm.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.ajm.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ajm.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xf_1 xf_12 = new xf_1(this);
            boolean bl = xf_12.b(byteBuffer, n);
            if (bl) {
                xf_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.ajm.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.dO(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void dO(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("tax=...\n");
        this.ajm.eN(stringBuilder, string + "  ");
    }
}

