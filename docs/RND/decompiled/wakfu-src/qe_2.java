/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qE
 */
public class qe_2
implements gs_0 {
    public int Vd = 0;
    public long Ve = 0L;
    public long Vf = 0L;
    public int Vg = 0;
    public long Vh = 0L;
    public static final int Vi = 32;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.Vd);
        byteBuffer.putLong(this.Ve);
        byteBuffer.putLong(this.Vf);
        byteBuffer.putInt(this.Vg);
        byteBuffer.putLong(this.Vh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.Vd = byteBuffer.getInt();
        this.Ve = byteBuffer.getLong();
        this.Vf = byteBuffer.getLong();
        this.Vg = byteBuffer.getInt();
        this.Vh = byteBuffer.getLong();
        return true;
    }

    @Override
    public void clear() {
        this.Vd = 0;
        this.Ve = 0L;
        this.Vf = 0L;
        this.Vg = 0;
        this.Vh = 0L;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10028001) {
            qf_2 qf_22 = new qf_2(this);
            boolean bl = qf_22.b(byteBuffer, n);
            if (bl) {
                qf_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        return 32;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.X(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void X(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("lockId=").append(this.Vd).append('\n');
        stringBuilder.append(string).append("lockDate=").append(this.Ve).append('\n');
        stringBuilder.append(string).append("unlockDate=").append(this.Vf).append('\n');
        stringBuilder.append(string).append("currentLockValue=").append(this.Vg).append('\n');
        stringBuilder.append(string).append("currentLockValueLastModification=").append(this.Vh).append('\n');
    }
}

