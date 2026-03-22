/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from tv
 */
public class tv_1
implements gs_0 {
    public int aaF = 0;
    public boolean aaG = true;
    public int aaH = 0;
    public int aaI = 0;
    public short aaJ = 0;
    public int[] aaK = null;

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.aaF);
        byteBuffer.put(this.aaG ? (byte)1 : 0);
        byteBuffer.putInt(this.aaH);
        byteBuffer.putInt(this.aaI);
        byteBuffer.putShort(this.aaJ);
        if (this.aaK != null) {
            if (this.aaK.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.aaK.length);
            for (int i = 0; i < this.aaK.length; ++i) {
                byteBuffer.putInt(this.aaK[i]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aaF = byteBuffer.getInt();
        this.aaG = byteBuffer.get() == 1;
        this.aaH = byteBuffer.getInt();
        this.aaI = byteBuffer.getInt();
        this.aaJ = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.aaK = new int[n];
            for (int i = 0; i < n; ++i) {
                this.aaK[i] = byteBuffer.getInt();
            }
        } else {
            this.aaK = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.aaF = 0;
        this.aaG = true;
        this.aaH = 0;
        this.aaI = 0;
        this.aaJ = 0;
        this.aaK = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        if (n < 10084000) {
            tw_2 tw_22 = new tw_2(this);
            boolean bl = tw_22.b(byteBuffer, n);
            if (bl) {
                tw_22.avW();
                return true;
            }
            return false;
        }
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 4;
        ++n;
        n += 4;
        n += 4;
        n += 2;
        n += 2;
        return n += this.aaK != null ? this.aaK.length * 4 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.bv(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void bv(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("activeCosmeticRefId=").append(this.aaF).append('\n');
        stringBuilder.append(string).append("hatVisible=").append(this.aaG).append('\n');
        stringBuilder.append(string).append("activeSprintRefId=").append(this.aaH).append('\n');
        stringBuilder.append(string).append("activeAuraRefId=").append(this.aaI).append('\n');
        stringBuilder.append(string).append("activeTitleRefId=").append(this.aaJ).append('\n');
        stringBuilder.append(string).append("activeFinisherRefIds=(").append(this.aaK.length).append(" bytes)\n");
    }
}

