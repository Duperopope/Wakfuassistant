/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;

/*
 * Renamed from crw
 */
public class crw_0
extends nr_0 {
    private long aZj;
    private int bfF;
    private exj_1 mgj;
    private final HashMap<String, Object> mgk = new HashMap();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aZj = byteBuffer.getLong();
        this.bfF = byteBuffer.getInt();
        this.mgj = exj_1.fP(byteBuffer.get());
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.mgk.put(BH.dc(byArray2), byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int d() {
        return 13500;
    }

    public long fD() {
        return this.aZj;
    }

    public int avZ() {
        return this.bfF;
    }

    public exj_1 ezX() {
        return this.mgj;
    }

    public HashMap<String, Object> ezY() {
        return this.mgk;
    }
}

