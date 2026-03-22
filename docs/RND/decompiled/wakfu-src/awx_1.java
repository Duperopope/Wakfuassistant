/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from awx
 */
public abstract class awx_1 {
    public static boolean dlU;
    private static final char[] dlV;
    private static final TIntHashSet dlW;

    public abstract String bNu();

    public abstract int bNv();

    public abstract awh_2 getFont();

    public abstract awh_2 b(int var1, float var2);

    public abstract int e(char var1);

    public abstract int f(char var1);

    public abstract int g(char var1);

    public abstract int bNw();

    public abstract int bNx();

    public abstract int e(String var1, int var2, int var3);

    public abstract int gj(String var1);

    public abstract int gk(String var1);

    public abstract int gp(String var1);

    public abstract boolean bNy();

    public awl_2 bNj() {
        return awl_2.dkI;
    }

    public abstract void c(float var1, float var2, float var3, float var4);

    public abstract void cd(int var1, int var2);

    public abstract void a(char[] var1, float var2, float var3);

    public abstract void a(char[] var1, float var2, float var3, float var4);

    public abstract void a(char[] var1, float var2, int var3, float var4, float var5);

    public abstract void a(char[] var1, float var2, int var3, float var4, float var5, float var6);

    public abstract void bNz();

    public abstract void bNA();

    public abstract void bNB();

    public int h(String string, int n) {
        return this.b(string, n, true);
    }

    public int b(String string, int n, boolean bl) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = string.length();
        while (n3 < n5) {
            char c2;
            int n6;
            int n7;
            while (n3 < n5) {
                ++n4;
                n7 = string.charAt(n3++);
                if (dlU) continue;
                n6 = 1;
                if (n3 < n5 && dlW.contains((int)(c2 = string.charAt(n3)))) {
                    n6 = 0;
                }
                if (n7 != 32 && n7 != 10 && n7 != 9 || n6 == 0) continue;
                break;
            }
            if (n4 == 0) {
                ++n4;
            }
            if ((n7 = this.e(string, n4, n)) < n4) {
                if (n2 != 0) {
                    return n2;
                }
                if (dlU || bl) {
                    if (n7 != n5) {
                        n6 = n7;
                        c2 = string.charAt(n7);
                        awc_2 awc_22 = awc_2.bOR();
                        while ((awc_22.h(c2) || dlW.contains((int)c2)) && n7 > 0) {
                            c2 = string.charAt(--n7);
                        }
                        if (n7 == 0 && n6 != 0) {
                            n7 = n6;
                        }
                    }
                    return n7;
                }
                return 0;
            }
            n2 = n4;
        }
        return n5;
    }

    public int i(String string, int n) {
        return this.c(string, n, true);
    }

    public int c(String string, int n, boolean bl) {
        String string2;
        int n2 = 0;
        int n3 = 0;
        int n4 = string.length();
        do {
            string2 = string.substring(n3);
            ++n2;
        } while ((n3 += this.h(string2, n)) < n4);
        return n2;
    }

    static {
        dlV = new char[]{'(', ')', '\'', '\"', '.', '?', '!', ':', ';', ',', '#', '$', '%', '&', '*', '+', '-', '/', '<', '=', '>', '@', '[', ']', '^', '`', '{', '|', '}', '~', '\u3002', '\u303c', '\u303d', '\u303e', '\u303f', '\uff01', '\uff02', '\uff05', '\uff07', '\uff08', '\uff09', '\uff0c', '\uff0d', '\uff0e', '\uff0f', '\uff1a', '\uff1b', '\uff1f'};
        dlW = new TIntHashSet();
        for (char c2 : dlV) {
            dlW.add((int)c2);
        }
    }
}

