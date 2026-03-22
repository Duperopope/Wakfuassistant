/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Collection;

public class fhf
implements evv_2 {
    private fhg soa;

    @Override
    public byte[] fej() {
        azg_1 azg_12 = new azg_1();
        Collection<fhe> collection = this.soa.fXH();
        azg_12.vC(collection.size());
        for (fhe fhe2 : collection) {
            byte[] byArray = fhj.c(fhe2);
            azg_12.vC(byArray.length);
            azg_12.gK(fhe2.KU());
            azg_12.dH(byArray);
        }
        return azg_12.bTe();
    }

    @Override
    public void a(long l, ByteBuffer byteBuffer) {
        this.soa = new fhg();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            byte[] byArray = new byte[byteBuffer.getInt()];
            long l2 = byteBuffer.getLong();
            byteBuffer.get(byArray);
            this.soa.b(l2, fhj.e(l2, byArray));
        }
    }

    @Override
    public eva_1 fek() {
        return eva_1.ows;
    }

    public void a(fhg fhg2) {
        this.soa = fhg2;
    }

    public fhg fXG() {
        return this.soa;
    }
}

