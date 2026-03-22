/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xU
 */
public class xu_1
implements gs_0 {
    public final ti_1 akL = new ti_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.akL.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.akL.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.akL.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            xv_2 xv_22 = new xv_2(this);
            boolean bl = xv_22.b(byteBuffer, n);
            if (bl) {
                xv_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.akL.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.er(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void er(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("challenge=...\n");
        this.akL.bl(stringBuilder, string + "  ");
    }
}

