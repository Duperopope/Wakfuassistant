/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vd
 */
public class vd_2
implements gs_0 {
    public final vg_2 aeT = new vg_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.aeT.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.aeT.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.aeT.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10036004) {
            ve_2 ve_22 = new ve_2(this);
            boolean bl = ve_22.b(byteBuffer, n);
            if (bl) {
                ve_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.aeT.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cB(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cB(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawItemElements=...\n");
        this.aeT.cQ(stringBuilder, string + "  ");
    }
}

