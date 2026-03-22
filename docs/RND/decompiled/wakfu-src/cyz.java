/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class cyz
extends nr_0 {
    private int dvq;
    private int mmA;
    private final List<fpq_0> mmB = new ArrayList<fpq_0>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.dvq = byteBuffer.getInt();
        this.mmA = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mmB.add(new fpq_0(byteBuffer));
        }
        return true;
    }

    @Override
    public int d() {
        return 15447;
    }

    public int eEl() {
        return this.dvq;
    }

    public int eFz() {
        return this.mmA;
    }

    public List<fpq_0> eFA() {
        return this.mmB;
    }
}

