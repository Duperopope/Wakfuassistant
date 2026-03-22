/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from fpJ
 */
public class fpj_0
extends fpO {
    private short aZk;

    public fpj_0(ByteBuffer byteBuffer) {
        this.eL(byteBuffer);
    }

    public fpj_0(int n, int n2, short s) {
        super(n, n2);
        this.aZk = s;
    }

    public short aWP() {
        return this.aZk;
    }

    @Override
    void e(azg_1 azg_12) {
        super.e(azg_12);
        azg_12.aG(this.aZk);
    }

    @Override
    final void eL(ByteBuffer byteBuffer) {
        super.eL(byteBuffer);
        this.aZk = byteBuffer.getShort();
    }

    @Override
    public fpl_0 ghm() {
        return fpl_0.sQG;
    }

    public String toString() {
        return "EntriesByBreed{m_breedId=" + this.aZk + "}";
    }
}

