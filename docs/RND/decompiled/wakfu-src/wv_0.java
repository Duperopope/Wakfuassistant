/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Wv
 */
public class wv_0 {
    public static final short bNS = Short.MIN_VALUE;
    protected static final Logger bNT = Logger.getLogger(wv_0.class);

    private wv_0() {
    }

    public static short a(int n, int n2, @NotNull wt_0[] wt_0Array, short s, int n3) {
        if (n3 <= 0) {
            bNT.error((Object)"no moverHeight defined");
        }
        if (n2 <= 0) {
            bNT.error((Object)"can't get highest height : no data for this element");
        }
        if (n + n2 > wt_0Array.length) {
            bNT.error((Object)"cell elements index and count are out of bounds");
        }
        if (n2 == 1) {
            wt_0 wt_02 = wt_0Array[n];
            if (wt_02.bNr) {
                bNT.error((Object)"data invalid : we can move through, but this element is the only one");
                return Short.MIN_VALUE;
            }
            if (wt_02.bNP == -1) {
                return Short.MIN_VALUE;
            }
            if (wt_02.ban > s) {
                return Short.MIN_VALUE;
            }
            return wt_02.ban;
        }
        int n4 = Short.MAX_VALUE;
        for (int i = n + n2 - 1; i >= n; --i) {
            wt_0 wt_03 = wt_0Array[i];
            if (wt_03.bNr) continue;
            if (wt_03.bNP == -1) {
                n4 = (short)(wt_03.ban - wt_03.aXR);
                continue;
            }
            if (wt_03.ban > s) {
                n4 = (short)(wt_03.ban - wt_03.aXR);
                continue;
            }
            if (n3 > n4 - wt_03.ban) {
                n4 = (short)(wt_03.ban - wt_03.aXR);
                continue;
            }
            return wt_03.ban;
        }
        return Short.MIN_VALUE;
    }

    public static boolean a(int n, int n2, int n3, wt_0[] wt_0Array, int n4) {
        assert (n4 > 0) : "no moverHeight defined";
        assert (wt_0Array != null) : "cellData can't be null";
        assert (n2 >= 0 && n3 > 0 && n2 + n3 <= wt_0Array.length) : "invalid bounds : [" + n2 + ", " + (n2 + n3) + "]";
        assert (n >= n2 && n < n2 + n3) : "moverZIndex not within the given bounds";
        if (wt_0Array[n].bNP == -1 || wt_0Array[n].bNr) {
            return false;
        }
        if (n == n2 + n3 - 1 && !wt_0Array[n].bNr) {
            return true;
        }
        int n5 = wt_0Array[n].ban + n4;
        for (int i = n + 1; i < n2 + n3; ++i) {
            wt_0 wt_02 = wt_0Array[i];
            int n6 = wt_02.ban - wt_02.aXR;
            if (n6 >= n5) {
                return true;
            }
            if (wt_02.bNr) continue;
            return false;
        }
        return true;
    }

    public static short a(int n, int n2, wt_0[] wt_0Array, short s) {
        assert (n2 > 0) : "can't get index from z : no data for this element";
        assert (wt_0Array != null) : "can't get index from z : no data array provided";
        assert (n + n2 <= wt_0Array.length) : "cell elements index and count are out of bounds";
        for (int i = n + n2 - 1; i >= n; --i) {
            if (wt_0Array[i].ban != s) continue;
            return (short)(i - n);
        }
        return Short.MIN_VALUE;
    }
}

