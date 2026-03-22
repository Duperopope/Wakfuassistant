/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from xZ
 */
public class xz_2
implements gs_0 {
    public final xj_2 akT = new xj_2();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.akT.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.akT.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.akT.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            ya_2 ya_22 = new ya_2(this);
            boolean bl = ya_22.b(byteBuffer, n);
            if (bl) {
                ya_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.akT.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.et(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void et(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("scenario=...\n");
        this.akT.ei(stringBuilder, string + "  ");
    }
}

