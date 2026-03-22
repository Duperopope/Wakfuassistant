/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from px
 */
public class px_2
implements gs_0 {
    public final tl_1 SR = new tl_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.SR.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.SR.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.SR.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 0x99F9F8) {
            py_2 py_22 = new py_2(this);
            boolean bl = py_22.b(byteBuffer, n);
            if (bl) {
                py_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.SR.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.w(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void w(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bag=...\n");
        this.SR.bE(stringBuilder, string + "  ");
    }
}

