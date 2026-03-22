/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/*
 * Renamed from aqs
 */
final class aqs_1
extends DeflaterOutputStream {
    public aqs_1(OutputStream outputStream, Deflater deflater, int n) {
        super(outputStream, deflater, n);
    }

    public aqs_1(OutputStream outputStream, Deflater deflater) {
        super(outputStream, deflater);
    }

    public aqs_1(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        this.out = outputStream;
        this.buf = new byte[512];
        this.def.reset();
    }
}

