/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ayL
 */
public final class ayl_2 {
    public static final ayl_2 dtT = new ayl_2("RAW");
    public static final ayl_2 dtU = new ayl_2("TGA");
    public static final ayl_2 dtV = new ayl_2("TGAM");
    public static final ayl_2 dtW = new ayl_2("PNG");
    public static final ayl_2 dtX = new ayl_2("BMP");
    public static final ayl_2 dtY = new ayl_2("JPG");
    private final int dtZ;

    public ayl_2(int n) {
        this.dtZ = n;
    }

    public ayl_2(String string) {
        this.dtZ = ayl_2.gR(string);
    }

    public static int gR(String string) {
        byte[] byArray = string.getBytes();
        int n = 0;
        if (byArray.length == 0) {
            return n;
        }
        if (byArray.length >= 1) {
            n |= ayj_2.aD(byArray[0]);
        }
        if (byArray.length >= 2) {
            n |= ayj_2.aD(byArray[1]) << 8;
        }
        if (byArray.length >= 3) {
            n |= ayj_2.aD(byArray[2]) << 16;
        }
        if (byArray.length >= 4) {
            n |= ayj_2.aD(byArray[3]) << 24;
        }
        return n;
    }

    public static String vy(int n) {
        byte[] byArray = new byte[4];
        byArray[3] = (byte)(n >> 24);
        byArray[2] = (byte)(n >> 16 & 0xFF);
        byArray[1] = (byte)(n >> 8 & 0xFF);
        byArray[0] = (byte)(n & 0xFF);
        return new String(byArray);
    }

    public String toString() {
        return ayl_2.vy(this.dtZ);
    }

    public int bLb() {
        return this.dtZ;
    }
}

