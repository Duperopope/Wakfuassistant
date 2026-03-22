/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from pr
 */
public class pr_1
extends go_0
implements gs_0 {
    public final tg_1 SI = new tg_1();
    private final fi_1 SJ = new ps_1(this);

    @Override
    public fi_1 DM() {
        return this.SJ;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.SI.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.SI.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.SI.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10086002) {
            pt_2 pt_22 = new pt_2(this);
            boolean bl = pt_22.b(byteBuffer, n);
            if (bl) {
                pt_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.SI.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.u(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void u(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bag=...\n");
        this.SI.bB(stringBuilder, string + "  ");
    }
}

