/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cyj
extends nr_0 {
    private List<faa_0> mmt = new ArrayList<faa_0>();
    private int jwd;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jwd = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mmt.add(faa_0.fO(byteBuffer));
        }
        return true;
    }

    public List<faa_0> eFs() {
        return Collections.unmodifiableList(this.mmt);
    }

    public int eFt() {
        return this.jwd;
    }

    @Override
    public int d() {
        return 1149;
    }
}

