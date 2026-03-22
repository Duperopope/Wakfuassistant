/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cxx
 */
public class cxx_0
extends nr_0 {
    private final List<bmz_2> mlQ = new ArrayList<bmz_2>();
    private int iLl;
    private int mlR;
    private int iGe;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iLl = byteBuffer.getInt();
        this.mlR = byteBuffer.getInt();
        this.iGe = byteBuffer.getInt();
        for (int i = byteBuffer.getInt(); i > 0; --i) {
            short s = byteBuffer.getShort();
            byte[] byArray2 = new byte[s];
            byteBuffer.get(byArray2);
            String string = BH.dc(byArray2);
            int n = byteBuffer.getInt();
            vb_0 vb_02 = vb_0.pS(n);
            List<Mv> list = Mv.A(byteBuffer.get());
            short s2 = byteBuffer.getShort();
            short s3 = byteBuffer.getShort();
            byte[] byArray3 = new byte[s3];
            byteBuffer.get(byArray3);
            dn_2 dn_22 = dn_2.X(byArray3);
            boolean bl = byteBuffer.get() == 1;
            boolean bl2 = byteBuffer.get() == 1;
            this.mlQ.add(new bmz_2(string, vb_02, list, s2, dn_22, bl, bl2));
        }
        return true;
    }

    public List<bmz_2> dxX() {
        return this.mlQ;
    }

    @Override
    public int d() {
        return 14918;
    }

    public int eEO() {
        return this.iGe;
    }

    public int eEP() {
        return this.mlR;
    }

    public int eEQ() {
        return this.iLl;
    }
}

