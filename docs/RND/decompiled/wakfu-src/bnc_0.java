/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from bnC
 */
public class bnc_0
implements aeh_2 {
    public static final String iJe = "time";
    public static final String iJf = "items";
    public static final String iJg = "playerName";
    public static final String iJh = "kamas";
    private final ux_0 iJi;
    private final String iJj;
    private final List<btx> iJk = new ArrayList<btx>();
    private final long iJl;
    public final String[] iJm = new String[]{"time", "items", "playerName", "kamas"};

    public bnc_0(ux_0 ux_02, String string, long l) {
        this.iJi = ux_02;
        this.iJj = string;
        this.iJl = l;
    }

    public void f(int n, short s) {
        this.iJk.add(new btx(n, s));
    }

    public int dzs() {
        return this.iJk.size();
    }

    @Override
    public String[] bxk() {
        return this.iJm;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iJe)) {
            return aum_0.cWf().u(this.iJi);
        }
        if (string.equals(iJf)) {
            return this.iJk;
        }
        if (string.equals(iJg)) {
            return this.iJj;
        }
        if (string.equals(iJh)) {
            return this.iJl;
        }
        return null;
    }

    public ux_0 bjc() {
        return this.iJi;
    }

    public long dzt() {
        return this.iJl;
    }
}

