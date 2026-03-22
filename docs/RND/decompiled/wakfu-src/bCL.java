/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bCL {
    private static final Logger jJO = Logger.getLogger(bCL.class);

    @Nullable
    public static bCJ a(int n, fdS fdS2) {
        if (fdS2 == null) {
            jJO.error((Object)"Impossible de cr\u00e9er une action de generic \u00e0 partir d'une constante 'null'", (Throwable)new IllegalArgumentException());
            return null;
        }
        switch (fdS2) {
            case rYo: {
                return new bCT(n);
            }
            case rYp: {
                return new bCK(n);
            }
            case rYq: {
                return new bCX(n);
            }
            case rYy: 
            case rYr: {
                return new bCO(n);
            }
            case rYs: {
                return new bCP(n);
            }
            case rYt: {
                return new bCW(n);
            }
            case rYu: {
                return new bCN(n);
            }
            case rYv: {
                return new bCV(n);
            }
            case rYw: {
                return new bCQ(n);
            }
            case rYx: {
                return new bCR(n);
            }
            case rYz: {
                return new bcu_0(n);
            }
            case rYA: {
                return new bCS(n);
            }
        }
        return null;
    }

    public static bCJ d(fdd fdd2) {
        bCJ bCJ2 = bCL.a(fdd2.avZ(), fdd2.fTd());
        if (bCJ2 != null) {
            bCJ2.a(fdd2);
        }
        return bCJ2;
    }
}

