/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from vV
 */
public class vv_1
implements gs_0 {
    public int Vd = 0;
    public long Ve = 0L;
    public int Vg = 0;
    public long agu = 0L;
    public static final int agv = 24;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Vd);
        byteBuffer.putLong(this.Ve);
        byteBuffer.putInt(this.Vg);
        byteBuffer.putLong(this.agu);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Vd = byteBuffer.getInt();
        this.Ve = byteBuffer.getLong();
        this.Vg = byteBuffer.getInt();
        this.agu = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.Vd = 0;
        this.Ve = 0L;
        this.Vg = 0;
        this.agu = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            vw_2 vw_22 = new vw_2(this);
            boolean bl = vw_22.b(byteBuffer, n);
            if (bl) {
                vw_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 24;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.da(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void da(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lockId=").append(this.Vd).append('\n');
        stringBuilder.append(string).append("lockDate=").append(this.Ve).append('\n');
        stringBuilder.append(string).append("currentLockValue=").append(this.Vg).append('\n');
        stringBuilder.append(string).append("currentLockValueLastChange=").append(this.agu).append('\n');
    }
}

