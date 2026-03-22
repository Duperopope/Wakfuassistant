/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tI
 */
public class ti_2
implements gs_0 {
    public final xz_1 abn = new xz_1();

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.abn.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.abn.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.abn.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10085001) {
            tj_1 tj_12 = new tj_1(this);
            boolean bl = tj_12.b(byteBuffer, n);
            if (bl) {
                tj_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.abn.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bC(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bC(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("room=...\n");
        this.abn.ed(stringBuilder, string + "  ");
    }
}

