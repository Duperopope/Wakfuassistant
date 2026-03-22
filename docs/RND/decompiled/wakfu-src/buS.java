/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class buS
implements aeh_2 {
    public static final String jqR = "name";
    public static final String jqS = "opened";
    public static final String jqT = "bonuses";
    private boolean bqK = false;
    private final ArrayList<buT> jqU;
    private final int jqV;

    public buS(int n, ArrayList<buT> arrayList) {
        this.jqV = n;
        this.jqU = arrayList;
        this.bqK = n == 1;
    }

    public int tL() {
        return this.jqV;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jqR)) {
            return aum_0.cWf().c("levelParam", this.jqV);
        }
        if (string.equals(jqS)) {
            return this.bqK;
        }
        if (string.equals(jqT)) {
            return this.jqU;
        }
        return null;
    }

    public void dJz() {
        this.bqK = !this.bqK;
        fse_1.gFu().a((aef_2)this, jqS);
    }
}

