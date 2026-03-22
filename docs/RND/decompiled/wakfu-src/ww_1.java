/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ww
 */
public class ww_1
extends ox_1
implements gs_0 {
    public final wa_2 ahy = new wa_2();
    public static final byte ahz = 1;

    @Override
    public byte avV() {
        return 1;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.ahy.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.ahy.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ahy.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10069001) {
            wx_2 wx_22 = new wx_2(this);
            boolean bl = wx_22.b(byteBuffer, n);
            if (bl) {
                wx_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.ahy.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=...\n");
        this.ahy.dc(stringBuilder, string + "  ");
    }
}

