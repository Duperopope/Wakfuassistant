/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sM
 */
public class sm_1
extends go_0
implements gs_0 {
    public short Zn = 0;
    public short Zo = 0;
    private final fi_1 Zp = new sn_2(this);
    public static final int Zq = 4;

    @Override
    public fi_1 DM() {
        return this.Zp;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.Zn);
        byteBuffer.putShort(this.Zo);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Zn = byteBuffer.getShort();
        this.Zo = byteBuffer.getShort();
        return true;
    }

    @Override
    public void clear() {
        this.Zn = 0;
        this.Zo = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.aX(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aX(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("sightRadius=").append(this.Zn).append('\n');
        stringBuilder.append(string).append("aggroRadius=").append(this.Zo).append('\n');
    }
}

