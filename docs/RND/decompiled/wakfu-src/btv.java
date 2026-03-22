/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class btv {
    public static void eY(ByteBuffer byteBuffer) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dkZ();
        QR qR = bsj_02.bai();
        int n = byteBuffer.getInt();
        if (!bgt_02.dkN()) {
            bgt_02.dkK();
        }
        if (bgt_02.dpH().dkB().pc(n) == null) {
            bgt_02.d(n, (short)0);
        }
        int n2 = byteBuffer.getInt();
        eSS eSS2 = eTo.fIZ().iY(n2);
        for (int i = 0; i < 16; ++i) {
            Byte by = byteBuffer.get();
            Byte by2 = byteBuffer.get();
            Integer n3 = byteBuffer.getInt();
            etj_0 etj_02 = new etj_0(aym_2.bSE(), by.byteValue(), by2.byteValue(), 0, bsj_02.bbh(), 0L, null, 0, abi_1.dzt);
            bbl bbl2 = (bbl)eSS2.b(etj_02);
            bbl2.cZE().lc("" + n3);
            bbl2.a((int)by.byteValue(), by2.byteValue(), (short)0);
            qR.a(bbl2);
        }
        bsj_02.a(new btw(n, qR, bgt_02));
    }
}

