/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public final class eJU {
    public static int v(eJS eJS2) {
        byte[] byArray = BH.aP(eJS2.getName());
        pi_1 pi_12 = new pi_1();
        eJS2.dme().a(pi_12.Tl);
        return 30 + byArray.length + pi_12.DN() + 1 + 4 + 4 + 4;
    }

    public static byte[] w(eJS eJS2) {
        azg_1 azg_12 = eJU.x(eJS2);
        ByteBuffer byteBuffer = eJU.y(eJS2);
        azg_12.dH(byteBuffer.array());
        return azg_12.bTe();
    }

    public static azg_1 x(eJS eJS2) {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(eJS2.Sn());
        azg_12.aG(eJS2.aWP());
        azg_12.gK(eJS2.Xi());
        azg_12.gK(eJS2.pf());
        byte[] byArray = BH.aP(eJS2.getName());
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.aF((byte)(eJS2.efO() ? 1 : 0));
        azg_12.vC(eJS2.fmi());
        azg_12.vC(eJS2.fxw());
        azg_12.vC(eJS2.fxx());
        return azg_12;
    }

    public static ByteBuffer y(eJS eJS2) {
        fgd_0 fgd_02 = eJS2.dme();
        return eJU.a(fgd_02);
    }

    public static ByteBuffer a(fgd_0 fgd_02) {
        pi_1 pi_12 = new pi_1();
        fgd_02.a(pi_12.Tl);
        ByteBuffer byteBuffer = ByteBuffer.allocate(pi_12.DN());
        pi_12.aF(byteBuffer);
        return byteBuffer;
    }

    public static eJS fr(ByteBuffer byteBuffer) {
        eJS eJS2 = eJU.ft(byteBuffer);
        return eJU.a(byteBuffer, eJS2, exH.pdw);
    }

    public static eJS fs(ByteBuffer byteBuffer) {
        eJS eJS2 = eJU.ft(byteBuffer);
        int n = eJS2.fxx();
        return eJU.a(byteBuffer, eJS2, n);
    }

    public static eJS a(ByteBuffer byteBuffer, eJS eJS2, int n) {
        pi_1 pi_12 = new pi_1();
        pi_12.b(byteBuffer, n);
        eJS2.dme().a(new ejy_0(eJS2));
        eJS2.dme().b(pi_12.Tl);
        return eJS2;
    }

    public static eJS ft(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        short s = byteBuffer.getShort();
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        String string = BH.dc(byArray);
        boolean bl = byteBuffer.get() == 1;
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        int n3 = byteBuffer.getInt();
        eJS eJS2 = new eJS(s);
        eJS2.dC(l);
        eJS2.pi(l2);
        eJS2.ij(l3);
        eJS2.setName(string);
        eJS2.lD(bl);
        eJS2.OZ(n);
        eJS2.Qi(n2);
        eJS2.Qj(n3);
        return eJS2;
    }
}

