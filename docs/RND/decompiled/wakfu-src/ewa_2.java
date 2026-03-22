/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eWa
 */
public final class ewa_2 {
    private static final int rAG = 0;

    public static byte[] f(eSS eSS2) {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(eSS2.Sn());
        azg_12.vC(eSS2.bcC());
        azg_12.vC(eSS2.bcD());
        azg_12.aG(eSS2.bcE());
        qu_0 qu_02 = eSS2.bci();
        azg_12.gK(qu_02 != null ? qu_02.Sn() : 0L);
        azg_12.aG(eSS2.cmL());
        azg_12.vC(eSS2.bcB().wp());
        azg_12.aF(eSS2.bcQ());
        return azg_12.bTe();
    }

    public static etj_0 a(ByteBuffer byteBuffer, ety_0 ety_02) {
        long l = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        short s = byteBuffer.getShort();
        long l2 = byteBuffer.getLong();
        qu_0 qu_02 = ety_02.dg(l2);
        short s2 = byteBuffer.getShort();
        int n3 = byteBuffer.getInt();
        byte by = byteBuffer.get();
        etj_0 etj_02 = new etj_0(l, n, n2, s, ety_02.bbh(), l2, qu_02, s2, abi_1.wG(n3));
        etj_02.N(by);
        return etj_02;
    }

    public static byte[] g(eSS eSS2) {
        return eSS2.fIz();
    }

    public static void a(eSS eSS2, ByteBuffer byteBuffer) {
        eSS2.fz(byteBuffer);
    }
}

