/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from qa
 */
public class qa_1
extends go_0
implements gs_0 {
    public long TL = 0L;
    public long TZ = 0L;
    public int[] Ua = null;
    private final fi_1 Ub = new qb_1(this);

    @Override
    public fi_1 DM() {
        return this.Ub;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.TL);
        byteBuffer.putLong(this.TZ);
        if (this.Ua != null) {
            if (this.Ua.length > 65535) {
                return false;
            }
            byteBuffer.putShort((short)this.Ua.length);
            for (int i = 0; i < this.Ua.length; ++i) {
                byteBuffer.putInt(this.Ua[i]);
            }
        } else {
            byteBuffer.putShort((short)0);
        }
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.TL = byteBuffer.getLong();
        this.TZ = byteBuffer.getLong();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (n > 0) {
            this.Ua = new int[n];
            for (int i = 0; i < n; ++i) {
                this.Ua[i] = byteBuffer.getInt();
            }
        } else {
            this.Ua = null;
        }
        return true;
    }

    @Override
    public void clear() {
        this.TL = 0L;
        this.TZ = 0L;
        this.Ua = null;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer, int n) {
        return this.aG(byteBuffer);
    }

    @Override
    public int DN() {
        int n = 0;
        n += 8;
        n += 8;
        n += 2;
        return n += this.Ua != null ? this.Ua.length * 4 : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.J(stringBuilder, "");
        return stringBuilder.toString();
    }

    public final void J(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("guildId=").append(this.TL).append('\n');
        stringBuilder.append(string).append("authorisations=").append(this.TZ).append('\n');
        stringBuilder.append(string).append("activeBuffs=(").append(this.Ua.length).append(" bytes)\n");
    }
}

