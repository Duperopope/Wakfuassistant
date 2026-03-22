/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from uv
 */
public class uv_2
implements gs_0 {
    public final uy_2 adl = new uy_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.adl.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.adl.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.adl.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            uw_1 uw_12 = new uw_1(this);
            boolean bl = uw_12.b(byteBuffer, n);
            if (bl) {
                uw_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.adl.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ce(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ce(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("compartment=...\n");
        this.adl.cf(stringBuilder, string + "  ");
    }
}

