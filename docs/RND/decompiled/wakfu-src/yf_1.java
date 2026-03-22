/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yf
 */
public class yf_1
implements gs_0 {
    public byte Tg = 0;
    public int alj = 0;
    public byte alk = 0;
    public int all = 0;
    public static final int alm = 10;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Tg);
        byteBuffer.putInt(this.alj);
        byteBuffer.put(this.alk);
        byteBuffer.putInt(this.all);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Tg = byteBuffer.get();
        this.alj = byteBuffer.getInt();
        this.alk = byteBuffer.get();
        this.all = byteBuffer.getInt();
        return true;
    }

    @Override
    public void clear() {
        this.Tg = 0;
        this.alj = 0;
        this.alk = 0;
        this.all = 0;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10064001) {
            yg_1 yg_12 = new yg_1(this);
            boolean bl = yg_12.b(byteBuffer, n);
            if (bl) {
                yg_12.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.ex(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void ex(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("position=").append(this.Tg).append('\n');
        stringBuilder.append(string).append("slottedItemId=").append(this.alj).append('\n');
        stringBuilder.append(string).append("slotColor=").append(this.alk).append('\n');
        stringBuilder.append(string).append("shardsAmount=").append(this.all).append('\n');
    }
}

