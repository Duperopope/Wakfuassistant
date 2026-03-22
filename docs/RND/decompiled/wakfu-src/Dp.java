/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.io.LittleEndianDataOutputStream
 */
import com.google.common.base.Charsets;
import com.google.common.io.LittleEndianDataOutputStream;

public final class Dp
implements fp_0 {
    private final LittleEndianDataOutputStream axW;

    public Dp(LittleEndianDataOutputStream littleEndianDataOutputStream) {
        this.axW = littleEndianDataOutputStream;
    }

    @Override
    public void g(byte by) {
        this.axW.writeByte((int)by);
    }

    @Override
    public void k(short s) {
        this.axW.writeShort((int)s);
    }

    @Override
    public void mz(int n) {
        this.axW.writeInt(n);
    }

    @Override
    public void b(float f2) {
        this.axW.writeFloat(f2);
    }

    @Override
    public void bo(String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8.name());
        this.axW.write(byArray);
        this.axW.writeByte(0);
    }
}

