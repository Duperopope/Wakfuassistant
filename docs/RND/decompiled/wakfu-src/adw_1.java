/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDW
 */
public class adw_1 {
    private final long dEv;
    private final long dEw;
    private final byte dEx;
    private final byte dEy;
    private final int dEz;

    public adw_1(long l) {
        this.dEv = l;
        this.dEz = (int)(this.dEv % 1000L);
        long l2 = this.dEv / 1000L;
        this.dEy = (byte)(l2 % 60L);
        long l3 = this.dEv / 1000L / 60L;
        this.dEx = (byte)(l3 % 60L);
        this.dEw = this.dEv / 1000L / 60L / 60L;
    }

    public long bYU() {
        return this.dEv;
    }

    public long bYV() {
        return this.dEw;
    }

    public byte bYW() {
        return this.dEx;
    }

    public byte bYX() {
        return this.dEy;
    }

    public int bYY() {
        return this.dEz;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.dEw != 0L) {
            stringBuilder.append(this.dEw).append("h ");
        }
        if (this.dEx != 0) {
            stringBuilder.append(this.dEx).append("min ");
        }
        if (this.dEy != 0) {
            stringBuilder.append(this.dEy).append("sec ");
        }
        stringBuilder.append(this.dEz).append("ms");
        return stringBuilder.toString();
    }
}

