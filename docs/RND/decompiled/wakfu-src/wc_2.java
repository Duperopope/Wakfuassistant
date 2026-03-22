/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from wC
 */
public class wc_2
extends ox_1
implements gs_0 {
    public static final byte ahK = 4;
    public static final int ahL = 0;

    @Override
    public byte avV() {
        return 4;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder, "");
        return stringBuilder.toString();
    }

    @Override
    public final void a(StringBuilder stringBuilder, String string) {
    }
}

