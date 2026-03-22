/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sS
 */
public class ss_2
implements gs_0 {
    public int Zw = 0;
    public final so_1 Zx = new so_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Zw);
        boolean bl = this.Zx.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Zw = byteBuffer.getInt();
        boolean bl = this.Zx.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.Zw = 0;
        this.Zx.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 1) {
            st_1 st_12 = new st_1(this);
            boolean bl = st_12.b(byteBuffer, n);
            if (bl) {
                st_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        return n += this.Zx.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bb(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bb(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("actionUid=").append(this.Zw).append('\n');
        stringBuilder.append(string).append("action=...\n");
        this.Zx.aY(stringBuilder, string + "  ");
    }
}

