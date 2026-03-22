/*
 * Decompiled with CFR 0.152.
 */
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/*
 * Renamed from NB
 */
public class nb_1
extends nr_0 {
    private short aYK;
    private ByteBuffer aYz;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYK = byteBuffer.getShort();
        this.aYz = byteBuffer;
        return true;
    }

    @Override
    public int d() {
        return 353;
    }

    public short aWr() {
        return this.aYK;
    }

    public boolean aWd() {
        if (this.aYz.remaining() < 1) {
            dwV.error((Object)("cannot extract a boolean from the buffer : " + this.aYz.remaining() + " bytes remaining, 8 necessary"));
            return false;
        }
        return this.aYz.get() != 0;
    }

    public byte aWe() {
        if (this.aYz.remaining() < 1) {
            dwV.error((Object)("cannot extract a boolean from the buffer : " + this.aYz.remaining() + " bytes remaining, 8 necessary"));
            return 0;
        }
        return this.aYz.get();
    }

    public short aWg() {
        if (this.aYz.remaining() < 2) {
            dwV.error((Object)("cannot extract a boolean from the buffer : " + this.aYz.remaining() + " bytes remaining, 16 necessary"));
            return 0;
        }
        return this.aYz.getShort();
    }

    public int aWc() {
        if (this.aYz.remaining() < 4) {
            dwV.error((Object)("cannot extract a long from the buffer : " + this.aYz.remaining() + " bytes remaining, 4 necessary"));
            return 0;
        }
        return this.aYz.getInt();
    }

    public long aWf() {
        if (this.aYz.remaining() < 8) {
            dwV.error((Object)("cannot extract a long from the buffer : " + this.aYz.remaining() + " bytes remaining, 8 necessary"));
            return 0L;
        }
        return this.aYz.getLong();
    }

    public String aWb() {
        if (this.aYz.remaining() < 2) {
            dwV.error((Object)("cannot extract the string size from the buffer : " + this.aYz.remaining() + " bytes remaining, 2 necessary"));
            return null;
        }
        try {
            return BH.eD(this.aYz);
        }
        catch (BufferUnderflowException bufferUnderflowException) {
            dwV.error((Object)"cannot extract a string from the buffer, the specified size is larger than the remaining size", (Throwable)bufferUnderflowException);
            return null;
        }
    }
}

