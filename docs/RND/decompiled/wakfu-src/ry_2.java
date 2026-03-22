/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rY
 */
public class ry_2
extends go_0
implements gs_0 {
    public final xs_2 XL = new xs_2();
    private final fi_1 XM = new rz_2(this);

    @Override
    public fi_1 DM() {
        return this.XM;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.XL.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.XL.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.XL.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            sa_1 sa_12 = new sa_1(this);
            boolean bl = sa_12.b(byteBuffer, n);
            if (bl) {
                sa_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.XL.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aD(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aD(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("scenarioManager=...\n");
        this.XL.ep(stringBuilder, string + "  ");
    }
}

