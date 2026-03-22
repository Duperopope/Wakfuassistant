/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tS
 */
public class ts_2
implements gs_0 {
    public final vy_2 abP = new vy_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.abP.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.abP.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.abP.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            tt_2 tt_22 = new tt_2(this);
            boolean bl = tt_22.b(byteBuffer, n);
            if (bl) {
                tt_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.abP.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bI(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bI(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("shelfItem=...\n");
        this.abP.db(stringBuilder, string + "  ");
    }
}

