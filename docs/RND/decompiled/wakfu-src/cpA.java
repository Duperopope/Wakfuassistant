/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class cpA
extends nr_0 {
    private fm_1 iwu;
    private List<Integer> mdY;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.iwu = fm_1.ce(byteBuffer.getInt());
        this.mdY = new ArrayList<Integer>();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mdY.add(byteBuffer.getInt());
        }
        return false;
    }

    public List<Integer> exs() {
        return this.mdY;
    }

    public fm_1 duf() {
        return this.iwu;
    }

    @Override
    public int d() {
        return 12721;
    }
}

