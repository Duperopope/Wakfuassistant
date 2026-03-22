/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fpK
 */
public class fpk_0
extends fpO {
    private long aDL;

    public fpk_0(ByteBuffer byteBuffer) {
        this.eL(byteBuffer);
    }

    public fpk_0(int n, int n2, long l) {
        super(n, n2);
        this.aDL = l;
    }

    public long Ya() {
        return this.aDL;
    }

    @Override
    void e(azg_1 azg_12) {
        super.e(azg_12);
        azg_12.gK(this.aDL);
    }

    @Override
    final void eL(ByteBuffer byteBuffer) {
        super.eL(byteBuffer);
        this.aDL = byteBuffer.getLong();
    }

    @Override
    public fpl_0 ghm() {
        return fpl_0.sQH;
    }

    public String toString() {
        return "EntriesByGuild{m_guildId=" + this.aDL + "}";
    }
}

