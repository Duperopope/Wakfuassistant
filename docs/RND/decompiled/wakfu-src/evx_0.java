/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eVx
 */
public final class evx_0 {
    public static byte[] b(eVw eVw2) {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(eVw2.fNh().aJr());
        azg_12.aF(eVw2.bcP());
        azg_12.aF(eVw2.fNi());
        azg_12.aF((byte)(eVw2.fNj() ? 1 : 0));
        azg_12.gK(eVw2.dOo());
        azg_12.aF((byte)(eVw2.fNk() ? 1 : 0));
        azg_12.gK(eVw2.fNl());
        return azg_12.bTe();
    }

    public static eVw eG(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte by = byteBuffer.get();
        byte by2 = byteBuffer.get();
        byte by3 = byteBuffer.get();
        boolean bl = byteBuffer.get() == 1;
        long l = byteBuffer.getLong();
        boolean bl2 = byteBuffer.get() == 1;
        long l2 = byteBuffer.getLong();
        eVw eVw2 = new eVw(by3, bl2, bl, l);
        eVw2.b(evv_0.fI(by));
        eVw2.a(l2, by2);
        return eVw2;
    }
}

