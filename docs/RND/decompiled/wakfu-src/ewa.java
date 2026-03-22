/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class ewa {
    private static final Logger oxN = Logger.getLogger(ewa.class);
    public static final byte oxO = 0;
    public static final byte oxP = 1;
    public static final byte oxQ = 2;

    public static ewa G(apl_1 apl_12) {
        byte by = apl_12.aIy();
        switch (by) {
            case 2: {
                return new ewc(apl_12);
            }
            case 1: {
                return new ewb(apl_12);
            }
        }
        return null;
    }

    public static void a(fs_0 fs_02, ewa ewa2) {
        if (ewa2 == null) {
            fs_02.g((byte)0);
            return;
        }
        fs_02.g(ewa2.chv() ? (byte)1 : 2);
        ewa2.b(fs_02);
    }

    public static ewa b(ewa ewa2) {
        if (ewa2 == null) {
            return null;
        }
        ewa ewa3 = null;
        ewa3 = ewa2.chv() ? new ewb() : new ewc();
        ewa3.d(ewa2);
        return ewa3;
    }

    public static boolean c(ewa ewa2) {
        return ewa2 != null && ewa2.chv();
    }

    public abstract boolean chv();

    public abstract void clear();

    public abstract void a(apl_1 var1);

    public abstract void b(fs_0 var1);

    protected abstract void d(ewa var1);
}

