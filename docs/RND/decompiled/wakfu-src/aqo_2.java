/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.InputStream;

/*
 * Renamed from aqo
 */
final class aqo_2
extends DataInputStream {
    private final aqp_2 cQC = new aqp_2(null);

    public aqo_2() {
        super(null);
        this.in = this.cQC;
    }

    public final void gT(InputStream inputStream) {
        this.cQC.gT(inputStream);
    }

    @Override
    public void close() {
        this.cQC.close();
    }
}

