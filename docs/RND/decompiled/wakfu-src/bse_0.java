/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsE
 */
public class bse_0
implements aeh_2 {
    private final fhy_0 jhS;
    private static final Map<Short, bse_0> jhT = new HashMap<Short, bse_0>();
    public static final bse_0 jhU = new bse_0(null);
    private static final String jhV = "name";
    private static final String[] jhW = new String[]{"name"};

    private bse_0(fhy_0 fhy_02) {
        this.jhS = fhy_02;
    }

    public fhy_0 dGh() {
        return this.jhS;
    }

    public static bse_0 c(fhy_0 fhy_02) {
        if (fhy_02 == null) {
            return jhU;
        }
        Short s = fhy_02.aIi();
        if (!jhT.containsKey(s)) {
            jhT.put(s, new bse_0(fhy_02));
        }
        return jhT.get(s);
    }

    @Override
    public String[] bxk() {
        return jhW;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jhV.equals(string)) {
            if (this.jhS == null) {
                return aum_0.cWf().c("exchange.machine.allType", new Object[0]);
            }
            return this.jhS.getName();
        }
        return null;
    }
}

