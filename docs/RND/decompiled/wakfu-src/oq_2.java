/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oQ
 */
public class oq_2
extends go_0
implements gs_0 {
    public short RO = 0;
    private final fi_1 RP = new or_2(this);
    public static final int RQ = 2;

    @Override
    public fi_1 DM() {
        return this.RP;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.RO);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.RO = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.RO = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.j(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void j(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("breedId=").append(this.RO).append('\n');
    }
}

