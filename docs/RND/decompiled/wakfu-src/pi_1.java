/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pI
 */
public class pi_1
extends go_0
implements gs_0 {
    public final vu_1 Tl = new vu_1();
    private final fi_1 Tm = new pj_2(this);

    @Override
    public fi_1 DM() {
        return this.Tm;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.Tl.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.Tl.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.Tl.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090001) {
            pk_2 pk_22 = new pk_2(this);
            boolean bl = pk_22.b(byteBuffer, n);
            if (bl) {
                pk_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.Tl.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.B(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void B(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("equipment=...\n");
        this.Tl.cK(stringBuilder, string + "  ");
    }
}

