/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class csq
extends nr_0 {
    private final ArrayList<byte[]> mhf = new ArrayList();
    private final ArrayList<double[]> mhg = new ArrayList();
    private boolean bmT = false;
    private final ArrayList<Long[]> mhh = new ArrayList();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            short s = byteBuffer.getShort();
            byte[] byArray2 = new byte[s];
            byteBuffer.position(byteBuffer.position() - 2);
            byteBuffer.get(byArray2);
            this.mhf.add(byArray2);
            double d2 = byteBuffer.getDouble();
            double d3 = byteBuffer.getDouble();
            double d4 = byteBuffer.getDouble();
            this.mhg.add(new double[]{d2, d3, d4});
            this.bmT = byteBuffer.getShort() != 0;
            int n2 = byteBuffer.getInt();
            Long[] longArray = new Long[n2];
            for (int j = 0; j < n2; ++j) {
                longArray[i] = byteBuffer.getLong();
            }
            this.mhh.add(longArray);
        }
        return true;
    }

    @Override
    public int d() {
        return 12801;
    }

    public ArrayList<byte[]> eAR() {
        return this.mhf;
    }

    public ArrayList<double[]> eAS() {
        return this.mhg;
    }

    public boolean wa() {
        return this.bmT;
    }

    public ArrayList<Long[]> eAT() {
        return this.mhh;
    }
}

