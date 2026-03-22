/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class czj
extends nr_0 {
    private final List<ftY> mna = new ArrayList<ftY>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int i = 0; i < n; ++i) {
            this.mna.add(new ftY());
            this.mna.get(i).eL(byteBuffer);
        }
        return false;
    }

    @Override
    public int d() {
        return 22484;
    }

    public List<ftY> eGb() {
        return this.mna;
    }
}

