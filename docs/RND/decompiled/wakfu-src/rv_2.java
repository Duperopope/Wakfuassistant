/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rV
 */
public class rv_2
extends go_0
implements gs_0 {
    public final yu_1 XG = new yu_1();
    private final fi_1 XH = new rw_1(this);

    @Override
    public fi_1 DM() {
        return this.XH;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.XG.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.XG.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.XG.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10034001) {
            rx_2 rx_22 = new rx_2(this);
            boolean bl = rx_22.b(byteBuffer, n);
            if (bl) {
                rx_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.XG.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aC(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aC(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("stateRunningEffects=...\n");
        this.XG.eF(stringBuilder, string + "  ");
    }
}

