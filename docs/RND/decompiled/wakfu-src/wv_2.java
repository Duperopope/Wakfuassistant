/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wv
 */
public class wv_2
extends ox_1
implements gs_0 {
    public final te_2 ahw = new te_2();
    public static final byte ahx = 3;

    @Override
    public byte avV() {
        return 3;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        boolean bl = this.ahw.aF(byteBuffer);
        return bl;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        boolean bl = this.ahw.aG(byteBuffer);
        return bl;
    }

    @Override
    public void clear() {
        this.ahw.clear();
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        return n += this.ahw.DN();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("content=...\n");
        this.ahw.bi(stringBuilder, string + "  ");
    }
}

