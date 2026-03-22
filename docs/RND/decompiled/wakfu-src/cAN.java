/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

public final class cAN
extends Enum<cAN> {
    public static final /* enum */ cAN mpo = new cAN(0, new ago_1("music", 1), new ahd_2("music", 0), new agu_1("ambiance_music", 0), new long[]{200L, 210L, 220L, 230L, 290L, 702L}, false);
    public static final /* enum */ cAN mpp = new cAN(1, new ago_1("sound_amb_2d", 1), new ahd_2("sound_amb_2d", 1, 1), new agu_1("sound_amb_2d", 1), new long[]{700L, 701L, 703L, 704L, 705L, 706L, 707L, 710L, 720L}, true);
    public static final /* enum */ cAN mpq = new cAN(2, null, null, new agu_1("sound_amb_3d", 3, 2), new long[]{800L}, true);
    public static final /* enum */ cAN mpr = new cAN(3, new ago_1("sound_fight", 2, 3), null, new agu_1("soundFight3D", 2, 3), new long[]{100L, 300L}, true);
    public static final /* enum */ cAN mps = new cAN(4, new ago_1("gui", 0, 4), null, null, new long[]{600L}, false);
    public static final /* enum */ cAN mpt = new cAN(5, new ago_1("voices", 4, 5), null, new agu_1("voices3D", 4, 5), new long[]{900L, 910L, 920L, 930L}, true);
    public static final /* enum */ cAN mpu = new cAN(6, new ago_1("sfx", 2, 6), null, new agu_1("sfx3d", 2, 6), new long[]{501L, 502L, 530L}, true);
    public static final /* enum */ cAN mpv = new cAN(7, new ago_1("particles2D", 1, 7), null, new agu_1("particles", 1, 7), new long[]{400L, 410L, 420L}, true);
    public static final /* enum */ cAN mpw = new cAN(8, new ago_1("foleys2D", 2, 8), null, new agu_1("foleys", 2, 8), new long[]{110L, 111L, 120L, 130L, 310L, 320L, 330L}, true);
    private final byte mpx;
    private final long[] mpy;
    private final ahd_2 mpz;
    private final ago_1 mpA;
    private final agu_1 mpB;
    private final boolean mpC;
    private static final /* synthetic */ cAN[] mpD;

    public static cAN[] values() {
        return (cAN[])mpD.clone();
    }

    public static cAN valueOf(String string) {
        return Enum.valueOf(cAN.class, string);
    }

    private cAN(byte by, ago_1 ago_12, ahd_2 ahd_22, agu_1 agu_12, long[] lArray, boolean bl) {
        this.mpx = by;
        this.mpy = lArray;
        this.mpz = ahd_22;
        this.mpA = ago_12;
        this.mpB = agu_12;
        this.mpC = bl;
    }

    public byte eGR() {
        return this.mpx;
    }

    public ahd_2 eGS() {
        return this.mpz;
    }

    public ago_1 eGT() {
        return this.mpA;
    }

    public agu_1 eGU() {
        return this.mpB;
    }

    public boolean nM(long l) {
        for (long l2 : this.mpy) {
            if (l != l2) continue;
            return true;
        }
        return false;
    }

    public static cAN dR(byte by) {
        for (cAN cAN2 : cAN.values()) {
            if (cAN2.mpx != by) continue;
            return cAN2;
        }
        return null;
    }

    public static cAN c(agk_1 agk_12) {
        for (cAN cAN2 : cAN.values()) {
            if (cAN2.mpA != agk_12 && cAN2.mpB != agk_12 && cAN2.mpz != agk_12) continue;
            return cAN2;
        }
        return null;
    }

    public static cAN nN(long l) {
        for (cAN cAN2 : cAN.values()) {
            if (!ArrayUtils.contains((long[])cAN2.mpy, (long)l)) continue;
            return cAN2;
        }
        return null;
    }

    public boolean eGV() {
        return this.mpC;
    }

    public void eGW() {
        this.setEnabled(true);
    }

    public void eGX() {
        this.setEnabled(false);
    }

    private void setEnabled(boolean bl) {
        if (this.mpC) {
            if (this.mpA != null) {
                this.mpA.setEnabled(bl);
            }
            if (this.mpz != null) {
                this.mpz.setEnabled(bl);
            }
            if (this.mpB != null) {
                this.mpB.setEnabled(bl);
            }
        }
    }

    private static /* synthetic */ cAN[] eGY() {
        return new cAN[]{mpo, mpp, mpq, mpr, mps, mpt, mpu, mpv, mpw};
    }

    static {
        mpD = cAN.eGY();
    }
}

