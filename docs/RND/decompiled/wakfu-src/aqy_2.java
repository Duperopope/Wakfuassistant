/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/*
 * Renamed from aqy
 */
final class aqy_2
extends InflaterInputStream {
    public aqy_2(InputStream inputStream, Inflater inflater, int n) {
        super(inputStream, inflater, n);
    }

    public aqy_2(InputStream inputStream, Inflater inflater) {
        super(inputStream, inflater);
    }

    public aqy_2(InputStream inputStream) {
        super(inputStream);
    }

    public void gT(InputStream inputStream) {
        this.in = inputStream;
        this.inf.reset();
    }
}

