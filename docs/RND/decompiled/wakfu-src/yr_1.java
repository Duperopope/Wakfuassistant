/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yr
 */
public class yr_1
implements gs_0 {
    public final ym_1 alI = new ym_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.alI.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.alI.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.alI.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            ys_1 ys_12 = new ys_1(this);
            boolean bl = ys_12.b(byteBuffer, n);
            if (bl) {
                ys_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.alI.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.eE(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void eE(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("spellLevel=...\n");
        this.alI.eB(stringBuilder, string + "  ");
    }
}

