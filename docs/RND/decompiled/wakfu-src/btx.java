/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class btx
implements aeh_2,
Comparable<btx> {
    public static final String jlA = "quantity";
    public static final String jlB = "isEnutrofPurseLoot";
    public static final String[] jlC = new String[]{"quantity", "isEnutrofPurseLoot"};
    private final short jlD;
    private final bgv_2 jlE;
    private final short jlF;
    private final fgj jlG;
    private final boolean jlH;

    public btx(int n, short s) {
        this.jlD = s;
        this.jlE = (bgv_2)fgD.fXh().Vd(n);
        this.jlF = this.jlE.cmL();
        this.jlG = this.jlE.dwg();
        this.jlH = false;
    }

    @Override
    public String[] bxk() {
        return jlC;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jlA)) {
            return this.jlD;
        }
        if (string.equals(jlB)) {
            return this.jlH;
        }
        return this.jlE.eu(string);
    }

    public bgv_2 duo() {
        return this.jlE;
    }

    public int a(@NotNull btx btx2) {
        if (btx2 == null) {
            return -1;
        }
        int n = fgj.fWS().compare(this.jlG, btx2.jlG);
        if (n != 0) {
            return n;
        }
        return Integer.signum(btx2.jlF - this.jlF);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((btx)object);
    }
}

