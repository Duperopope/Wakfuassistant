/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class OB
extends nr_0 {
    private String[] aZT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        this.aZT = new String[n];
        for (int i = 0; i < n; ++i) {
            byte[] byArray2 = new byte[byteBuffer.get()];
            byteBuffer.get(byArray2);
            this.aZT[i] = BH.dc(byArray2);
        }
        return true;
    }

    public String[] aXe() {
        return this.aZT;
    }

    @Override
    public int d() {
        return 1139;
    }
}

