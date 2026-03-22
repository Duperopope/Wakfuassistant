/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pf
 */
public class pf_1
extends go_0
implements gs_0 {
    public final tu_2 Sn = new tu_2();
    private final fi_1 So = new pg_2(this);

    @Override
    public fi_1 DM() {
        return this.So;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.Sn.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.Sn.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.Sn.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10084000) {
            ph_1 ph_12 = new ph_1(this);
            boolean bl = ph_12.b(byteBuffer, n);
            if (bl) {
                ph_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.Sn.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.p(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void p(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("cosmeticsInventoryHandler=...\n");
        this.Sn.bu(stringBuilder, string + "  ");
    }
}

