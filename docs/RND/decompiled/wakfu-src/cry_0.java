/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cry
 */
public class cry_0
extends nr_0 {
    private final ArrayList<us_2> mgm = new ArrayList();
    private boolean mgn;

    public ArrayList<us_2> eAa() {
        return this.mgm;
    }

    public boolean eAb() {
        return this.mgn;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort() & 0xFFFF;
        for (int i = 0; i < n; ++i) {
            us_2 us_22 = new us_2();
            us_22.aG(byteBuffer);
            this.mgm.add(us_22);
        }
        this.mgn = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12046;
    }
}

