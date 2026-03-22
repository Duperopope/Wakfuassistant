/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vG
 */
public class vg_2
implements gs_0 {
    public byte afS = 0;
    public byte afT = 0;
    public static final int afU = 2;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.afS);
        byteBuffer.put(this.afT);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.afS = byteBuffer.get();
        this.afT = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.afS = 0;
        this.afT = 0;
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
        this.cQ(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void cQ(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("damageElements=").append(this.afS).append('\n');
        stringBuilder.append(string).append("resistanceElements=").append(this.afT).append('\n');
    }
}

