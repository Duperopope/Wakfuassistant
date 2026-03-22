/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vI
 */
public class vi_1
implements gs_0 {
    public final tt_1 afZ = new tt_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.afZ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.afZ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.afZ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10030002) {
            vj_2 vj_22 = new vj_2(this);
            boolean bl = vj_22.b(byteBuffer, n);
            if (bl) {
                vj_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.afZ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.cS(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cS(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("rawCompanion=...\n");
        this.afZ.bt(stringBuilder, string + "  ");
    }
}

