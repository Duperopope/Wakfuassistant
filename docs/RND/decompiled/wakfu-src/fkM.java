/*
 * Decompiled with CFR 0.152.
 */
public class fkM {
    public static boolean a(fkL fkL2, fkL fkL3) {
        if (fkL2 == null || fkL3 == null) {
            return false;
        }
        if (fkL2 == fkL.sCr) {
            return fkL3 != fkL.sCr;
        }
        if (fkL2 == fkL.sCs) {
            return fkL3 != fkL.sCr && fkL3 != fkL.sCs;
        }
        return false;
    }

    public static boolean b(fkL fkL2, fkL fkL3) {
        if (fkL2 == null || fkL3 == null) {
            return false;
        }
        if (fkL2 == fkL3) {
            return true;
        }
        if (fkL2 == fkL.sCr) {
            return true;
        }
        if (fkL2 == fkL.sCs) {
            return fkL3 != fkL.sCr;
        }
        return false;
    }

    public static boolean f(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: 
            case sCx: 
            case sCw: 
            case sCv: 
            case sCA: {
                return true;
            }
        }
        return false;
    }

    public static boolean g(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: 
            case sCx: {
                return true;
            }
        }
        return false;
    }

    public static boolean h(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: 
            case sCA: {
                return true;
            }
        }
        return false;
    }

    public static boolean i(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: 
            case sCw: {
                return true;
            }
        }
        return false;
    }

    public static boolean j(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: 
            case sCw: {
                return true;
            }
        }
        return false;
    }

    public static boolean k(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: 
            case sCv: {
                return true;
            }
        }
        return false;
    }

    public static boolean l(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: {
                return true;
            }
        }
        return false;
    }

    public static boolean m(fkL fkL2) {
        if (fkL2 == null) {
            return false;
        }
        switch (fkL2) {
            case sCr: 
            case sCs: {
                return true;
            }
        }
        return false;
    }
}

