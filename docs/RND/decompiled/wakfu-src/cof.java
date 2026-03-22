/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cof
extends nr_0 {
    private long mcA;
    private abj_2 lVi;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length < 19) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcA = byteBuffer.getLong();
        this.lVi = abj_2.eV(byteBuffer);
        return this.lVi != null;
    }

    @Override
    public int d() {
        return 12621;
    }

    public long evP() {
        return this.mcA;
    }

    public abj_2 evt() {
        return this.lVi;
    }
}

