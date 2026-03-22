/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aPv
 */
public final class apv_0
extends Enum<apv_0>
implements aeh_2 {
    public static final /* enum */ apv_0 eyU = new apv_0("small.f", 14);
    public static final /* enum */ apv_0 eyV = new apv_0("little.f", 16);
    public static final /* enum */ apv_0 eyW = new apv_0("medium.f", 18);
    public static final /* enum */ apv_0 eyX = new apv_0("high.f", 20);
    public static final String eyY = "index";
    public static final String eyZ = "name";
    public static final String eza = "list";
    public static final String[] ezb;
    private final String ezc;
    private final int ezd;
    private static final /* synthetic */ apv_0[] eze;

    public static apv_0[] values() {
        return (apv_0[])eze.clone();
    }

    public static apv_0 valueOf(String string) {
        return Enum.valueOf(apv_0.class, string);
    }

    private apv_0(String string2, int n2) {
        this.ezc = string2;
        this.ezd = n2;
    }

    @Override
    public String[] bxk() {
        return ezb;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(eyY)) {
            return this.ordinal();
        }
        if (string.equals(eyZ)) {
            return this.getName();
        }
        if (string.equals(eza)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (apv_0 apv_02 : apv_0.values()) {
                arrayList.add(apv_02.getName());
            }
            return arrayList;
        }
        return null;
    }

    public int cAC() {
        return this.ezd;
    }

    public String getName() {
        return aum_0.cWf().c(this.ezc, new Object[0]);
    }

    public static apv_0 ji(String string) {
        for (apv_0 apv_02 : apv_0.values()) {
            if (!apv_02.getName().equals(string)) continue;
            return apv_02;
        }
        return null;
    }

    private static /* synthetic */ apv_0[] cAD() {
        return new apv_0[]{eyU, eyV, eyW, eyX};
    }

    static {
        eze = apv_0.cAD();
        ezb = new String[]{eyY, eyZ, eza};
    }
}

