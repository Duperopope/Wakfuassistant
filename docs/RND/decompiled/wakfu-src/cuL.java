/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cuL
extends nr_0 {
    private final ArrayList<byte[]> mju = new ArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getShort() & 0xFFFF];
        byteBuffer.get(byArray2);
        ByteBuffer byteBuffer2 = ByteBuffer.wrap(byArray2);
        int n = byteBuffer2.getShort();
        for (int i = 0; i < n; ++i) {
            byte[] byArray3 = new byte[byteBuffer2.getShort() & 0xFFFF];
            byteBuffer2.get(byArray3);
            this.mju.add(byArray3);
        }
        return true;
    }

    @Override
    public int d() {
        return 13935;
    }

    public ArrayList<byte[]> evV() {
        return this.mju;
    }
}

