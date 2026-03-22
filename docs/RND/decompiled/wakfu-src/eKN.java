/*
 * Decompiled with CFR 0.152.
 */
final class eKN
extends Enum<eKN> {
    public static final /* enum */ eKN qDL = new eKN();
    public static final /* enum */ eKN qDM = new eKN();
    public static final /* enum */ eKN qDN = new eKN();
    public static final /* enum */ eKN qDO = new eKN();
    private static final /* synthetic */ eKN[] qDP;

    public static eKN[] values() {
        return (eKN[])qDP.clone();
    }

    public static eKN valueOf(String string) {
        return Enum.valueOf(eKN.class, string);
    }

    public static eKN eV(byte by) {
        if (by == 0) {
            return qDO;
        }
        if (by == 1) {
            return qDL;
        }
        if (by == 2) {
            return qDM;
        }
        if (by == 3) {
            return qDN;
        }
        return null;
    }

    public static byte a(eKN eKN2) {
        switch (eKN2.ordinal()) {
            case 3: {
                return 0;
            }
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
        }
        return 0;
    }

    private static /* synthetic */ eKN[] fyO() {
        return new eKN[]{qDL, qDM, qDN, qDO};
    }

    static {
        qDP = eKN.fyO();
    }
}

