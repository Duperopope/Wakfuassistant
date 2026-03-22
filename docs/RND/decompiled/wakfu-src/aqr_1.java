/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/*
 * Renamed from aqr
 */
class aqr_1
extends BufferedOutputStream {
    aqr_1(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        this.out = outputStream;
        this.count = 0;
    }
}

