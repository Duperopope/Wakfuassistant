/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sY
 */
public class sy_2
implements gs_0 {
    public final sv_2 ZJ = new sv_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.ZJ.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.ZJ.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ZJ.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10090003) {
            sz_2 sz_22 = new sz_2(this);
            boolean bl = sz_22.b(byteBuffer, n);
            if (bl) {
                sz_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.ZJ.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.be(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void be(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bag=...\n");
        this.ZJ.bc(stringBuilder, string + "  ");
    }
}

