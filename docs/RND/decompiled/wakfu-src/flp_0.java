/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from flp
 */
public class flp_0
extends fkl_0 {
    final /* synthetic */ fld_0 sEe;

    public flp_0(fld_0 fld_02) {
        this.sEe = fld_02;
    }

    @Override
    public void g(ByteBuffer byteBuffer, int n) {
        int n2 = byteBuffer.getInt();
        for (int i = 0; i < n2; ++i) {
            long l = byteBuffer.getLong();
            long l2 = byteBuffer.getLong();
            this.sEe.aL(l, l2);
        }
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("[NATION] Pas de s\u00e9rialization de la part VoteUpdatePart de base, cel\u00e0 ne se fait que dans le global");
    }

    @Override
    public int DN() {
        return 0;
    }
}

