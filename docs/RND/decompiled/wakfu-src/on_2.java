/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oN
 */
public class on_2
extends go_0
implements gs_0 {
    public final sx_2 RJ = new sx_2();
    private final fi_1 RK = new oo_2(this);

    @Override
    public fi_1 DM() {
        return this.RK;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.RJ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.RJ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.RJ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090003) {
            op_2 op_22 = new op_2(this);
            boolean bl = op_22.b(byteBuffer, n);
            if (bl) {
                op_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.RJ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.i(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void i(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bagContainer=...\n");
        this.RJ.bd(stringBuilder, string + "  ");
    }
}

