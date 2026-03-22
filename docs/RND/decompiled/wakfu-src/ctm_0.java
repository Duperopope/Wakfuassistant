/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from ctM
 */
public class ctm_0
extends nr_0 {
    private final ArrayList<fkH> miF = new ArrayList();

    public Iterator<fkH> eCC() {
        return this.miF.iterator();
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            fkL fkL2 = fkL.ue(byteBuffer.getLong());
            long l = byteBuffer.getLong();
            byte[] byArray2 = new byte[byteBuffer.getShort()];
            byteBuffer.get(byArray2);
            String string = BH.dc(byArray2);
        }
        return true;
    }

    @Override
    public int d() {
        return 14953;
    }
}

