/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.List;

/*
 * Renamed from bts
 */
public class bts_1
implements eVf {
    private static final float jlt = 8.33333E-4f;

    @Override
    public void dHN() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bml_1 bml_12 = bgt_02.dmz();
        List<QD> list = bml_12.oJ(1200);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (QD qD : list) {
            byte[] byArray = qD.bcf();
            if (byArray == null) continue;
            byte[] byArray2 = fum_0.fa(byArray);
            byte[] byArray3 = fum_0.b(byArray2, fum_0.uY(bgt_02.bqo()));
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray3);
            byte by = byteBuffer.get();
            eun_0 eun_02 = eun_0.fD(by);
            switch (eun_02) {
                case ruk: {
                    btv.eY(byteBuffer);
                }
            }
        }
    }
}

