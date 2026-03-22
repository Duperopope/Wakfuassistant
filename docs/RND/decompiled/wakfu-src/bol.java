/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bol
implements aeh_2 {
    public static final String iNQ = "item";
    public static final String iNR = "quantity";
    private final int iNS;
    private final AS iNT;
    private final Ab iNU;

    public bol(int n, AS aS, Ab ab) {
        this.iNS = n;
        this.iNT = aS;
        this.iNU = ab;
    }

    @Override
    public String[] bxk() {
        return new String[]{iNQ, iNR};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iNQ)) {
            Object r = fgD.fXh().Vd(GC.cw(this.iNS));
            return new beg_1((fhc_0)r);
        }
        if (string.equals(iNR)) {
            return this.iNU.aBF();
        }
        return null;
    }

    public AS aDK() {
        return this.iNT;
    }

    public int acs() {
        return this.iNS;
    }

    public Ab aEv() {
        return this.iNU;
    }
}

