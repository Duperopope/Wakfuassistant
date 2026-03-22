/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tQ
 */
public class tq_1
implements gs_0 {
    public byte abI = 0;
    public byte abJ = 0;
    public byte abK = 0;
    public static final int abL = 3;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.abI);
        byteBuffer.put(this.abJ);
        byteBuffer.put(this.abK);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.abI = byteBuffer.get();
        this.abJ = byteBuffer.get();
        this.abK = byteBuffer.get();
        return true;
    }

    @Override
    public void clear() {
        this.abI = 0;
        this.abJ = 0;
        this.abK = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bH(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bH(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("itemType=").append(this.abI).append('\n');
        stringBuilder.append(string).append("contentQuantity=").append(this.abJ).append('\n');
        stringBuilder.append(string).append("contentQuality=").append(this.abK).append('\n');
    }
}

