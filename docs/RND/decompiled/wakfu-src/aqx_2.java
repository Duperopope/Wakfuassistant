/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/*
 * Renamed from aqx
 */
class aqx_2
extends aqt_1 {
    private final Deflater cQJ = new Deflater(1);
    private final Inflater cQK = new Inflater();

    aqx_2(aqw_2 aqw_22) {
    }

    @Override
    public DataOutputStream b(OutputStream outputStream) {
        this.cQJ.reset();
        this.cQH.a(new DeflaterOutputStream(outputStream, this.cQJ));
        return this.cQH;
    }

    @Override
    public DataInputStream b(FileInputStream fileInputStream) {
        this.cQK.reset();
        this.cQI.gT(new InflaterInputStream(fileInputStream, this.cQK));
        return this.cQI;
    }

    @Override
    public void aVI() {
    }

    @Override
    public void aVH() {
    }
}

