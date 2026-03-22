/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vb
 */
public class vb_1
implements gs_0 {
    public final tt_1 aeQ = new tt_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeQ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeQ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeQ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10029000) {
            vc_1 vc_12 = new vc_1(this);
            boolean bl = vc_12.b(byteBuffer, n);
            if (bl) {
                vc_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeQ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cA(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cA(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawCompanionInfo=...\n");
        this.aeQ.bt(stringBuilder, string + "  ");
    }
}

