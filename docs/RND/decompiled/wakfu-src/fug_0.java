/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fug
 */
public class fug_0 {
    public static boolean fP(short s) {
        switch (s) {
            case -1: 
            case 1: 
            case 2: 
            case 16: 
            case 20: 
            case 33: {
                return false;
            }
        }
        return true;
    }

    public static boolean uX(long l) {
        if (!fcK.rUe.sp(l)) {
            return true;
        }
        Object t = fcI.so(l);
        return t == null || fug_0.fP(((exP)t).fhv());
    }

    public static boolean fQ(short s) {
        return fug_0.fP(s) && s != 27;
    }

    public static boolean aw(long l, int n) {
        Object t = fcI.sh(l);
        if (t == null) {
            return false;
        }
        return ((exP)t).fhv() == n;
    }
}

