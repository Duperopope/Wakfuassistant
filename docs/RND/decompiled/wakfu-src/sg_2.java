/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from sg
 */
public class sg_2
extends go_0
implements gs_0 {
    public boolean XY = false;
    public boolean XZ = false;
    private final fi_1 Ya = new sh_1(this);
    public static final int Yb = 2;

    @Override
    public fi_1 DM() {
        return this.Ya;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.XY ? (byte)1 : 0);
        byteBuffer.put(this.XZ ? (byte)1 : 0);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.XY = byteBuffer.get() == 1;
        this.XZ = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public void clear() {
        this.XY = false;
        this.XZ = false;
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
        this.aH(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void aH(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("afkState=").append(this.XY).append('\n');
        stringBuilder.append(string).append("dndState=").append(this.XZ).append('\n');
    }
}

