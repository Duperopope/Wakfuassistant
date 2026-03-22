/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from rT
 */
public class rt_1
implements gs_0 {
    public final yu_1 XD = new yu_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.XD.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.XD.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.XD.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10034001) {
            ru_1 ru_12 = new ru_1(this);
            boolean bl = ru_12.b(byteBuffer, n);
            if (bl) {
                ru_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.XD.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aB(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aB(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("stateRunningEffects=...\n");
        this.XD.eF(stringBuilder, string + "  ");
    }
}

