/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pO
 */
public class po_1
implements gs_0 {
    public final vy_1 TA = new vy_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.TA.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.TA.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.TA.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10056001) {
            pp_2 pp_22 = new pp_2(this);
            boolean bl = pp_22.b(byteBuffer, n);
            if (bl) {
                pp_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.TA.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.D(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void D(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("summon=...\n");
        this.TA.cM(stringBuilder, string + "  ");
    }
}

