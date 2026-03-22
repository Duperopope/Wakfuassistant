/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xA
 */
public class xa_2
implements gs_0 {
    public final uu_1 akd = new uu_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.akd.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.akd.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.akd.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10085001) {
            xb_1 xb_12 = new xb_1(this);
            boolean bl = xb_12.b(byteBuffer, n);
            if (bl) {
                xb_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.akd.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ee(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ee(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("persistantData=...\n");
        this.akd.cw(stringBuilder, string + "  ");
    }
}

