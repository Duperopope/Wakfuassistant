/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Nu
 */
public class nu_1
extends nr_0 {
    protected short aYs;
    protected ByteBuffer aYz;

    public short aVZ() {
        return this.aYs;
    }

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 4, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYs = byteBuffer.getShort();
        int n = byteBuffer.getShort() & 0xFFFF;
        if (!this.h(byArray.length - 4, n, true)) {
            return false;
        }
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.aYz = ByteBuffer.wrap(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 336;
    }

    public String aWb() {
        if (this.aYz.remaining() < 2) {
            dwV.error((Object)("extractStringParameter() impossible d'extraire la taille de la cha\u00eene : " + this.aYz.remaining() + " bytes restant dans le buffer (2 requis)"));
            return null;
        }
        int n = this.aYz.getShort() & 0xFFFF;
        byte[] byArray = new byte[n];
        if (this.aYz.remaining() < n) {
            dwV.error((Object)("extractStringParameter() impossible d'extraire la cha\u00eene : " + this.aYz.remaining() + " bytes restant dans le buffer (" + n + " requis)"));
            return null;
        }
        this.aYz.get(byArray);
        return BH.dc(byArray);
    }

    public int aWc() {
        if (this.aYz.remaining() < 4) {
            dwV.error((Object)("extractIntParameter() impossible d'extraire l'Integer : " + this.aYz.remaining() + " bytes restant dans le buffer (4 requis)"));
            return 0;
        }
        return this.aYz.getInt();
    }

    public boolean nY(int n) {
        return this.aYz.remaining() >= n;
    }

    public boolean aWd() {
        if (this.aYz.remaining() < 1) {
            dwV.error((Object)("extractBooleanParameter() impossible d'extraire le Boolean : " + this.aYz.remaining() + " bytes restant dans le buffer (1 requis)"));
            return false;
        }
        return this.aYz.get() != 0;
    }

    public byte aWe() {
        if (this.aYz.remaining() < 1) {
            dwV.error((Object)("extractByteParameter() impossible d'extraire le Byte : " + this.aYz.remaining() + " bytes restant dans le buffer (1 requis)"));
            return 0;
        }
        return this.aYz.get();
    }

    public long aWf() {
        if (this.aYz.remaining() < 8) {
            dwV.error((Object)("extractLongParameter() impossible d'extraire le Long : " + this.aYz.remaining() + " bytes restant dans le buffer (8 requis)"));
            return 0L;
        }
        return this.aYz.getLong();
    }

    public short aWg() {
        if (this.aYz.remaining() < 2) {
            dwV.error((Object)("extractShortParameter() impossible d'extraire le Short : " + this.aYz.remaining() + " bytes restant dans le buffer (2 requis)"));
            return 0;
        }
        return this.aYz.getShort();
    }

    public float aWh() {
        if (this.aYz.remaining() < 4) {
            dwV.error((Object)("extractFloatParameter() impossible d'extraire le Float : " + this.aYz.remaining() + " bytes restant dans le buffer (4 requis)"));
            return 0.0f;
        }
        return this.aYz.getFloat();
    }

    public byte[] aWi() {
        short s = this.aWg();
        if (s < this.aYz.remaining()) {
            dwV.error((Object)("[Moderation] Cannot extract byte array from result message: expected " + s + " bytes in buffer but found " + this.aYz.remaining()));
            return new byte[0];
        }
        byte[] byArray = new byte[s];
        this.aYz.get(byArray);
        return byArray;
    }
}

