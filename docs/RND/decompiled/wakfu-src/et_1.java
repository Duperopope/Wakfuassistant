/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ET
 */
public final class et_1 {
    public static final int azw = 1;
    public static final int azx = 2;
    public static final int azy = 4;
    public static final int azz = 8;
    public static final int azA = 16;
    private byte azB;
    private byte azC = (byte)25;

    public void k(byte by) {
        this.azC = by;
    }

    public byte aJu() {
        return this.azB;
    }

    public void l(byte by) {
        this.azB = by;
    }

    public byte aJv() {
        return this.azC;
    }

    public boolean aJw() {
        return (this.azB & 1) != 0;
    }

    public boolean aJx() {
        return (this.azB & 2) != 0;
    }

    public void aJy() {
        this.azB = (byte)(this.azB | 2);
    }

    public boolean aJz() {
        return (this.azB & 4) == 4;
    }

    public void aJA() {
        this.azB = (byte)(this.azB | 4);
    }

    public boolean aJB() {
        return (this.azB & 0x10) == 16;
    }

    public void aJC() {
        this.azB = (byte)(this.azB | 0x10);
    }

    public boolean aIq() {
        return (this.azB & 8) == 8;
    }

    public void aJD() {
        this.azB = (byte)(this.azB | 8);
    }

    public void clear() {
        this.azB = 0;
        this.azC = 0;
    }
}

