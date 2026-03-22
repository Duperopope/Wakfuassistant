/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataOutputStream;
import java.io.OutputStream;

/*
 * Renamed from aqq
 */
final class aqq_2
extends DataOutputStream {
    private final aqr_1 cQD = new aqr_1(null);

    aqq_2() {
        super(null);
        this.out = this.cQD;
    }

    public final void a(OutputStream outputStream) {
        this.cQD.a(outputStream);
        this.written = 0;
    }

    @Override
    public void close() {
        this.cQD.close();
    }
}

