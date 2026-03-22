/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSB
 */
public final class bsb_1
extends Enum<bsb_1>
implements aeh_2 {
    public static final /* enum */ bsb_1 lhn = new bsb_1(0, "options.languageDisplay.none");
    public static final /* enum */ bsb_1 lho = new bsb_1(1, "options.languageDisplay.onlyDefaultLanguage");
    public static final /* enum */ bsb_1 lhp = new bsb_1(2, "options.languageDisplay.allSelectedLanguages");
    private static final String lhq = "name";
    private final byte lhr;
    private final String lhs;
    private static final /* synthetic */ bsb_1[] lht;

    public static bsb_1[] values() {
        return (bsb_1[])lht.clone();
    }

    public static bsb_1 valueOf(String string) {
        return Enum.valueOf(bsb_1.class, string);
    }

    private bsb_1(byte by, String string2) {
        this.lhr = by;
        this.lhs = string2;
    }

    @Nullable
    public static bsb_1 Ju(int n) {
        for (bsb_1 bsb_12 : bsb_1.values()) {
            if (bsb_12.lhr != n) continue;
            return bsb_12;
        }
        return null;
    }

    public int d() {
        return this.lhr;
    }

    @Override
    public String[] bxk() {
        return new String[]{lhq};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (lhq.equals(string)) {
            return aum_0.cWf().c(this.lhs, new Object[0]);
        }
        return null;
    }

    public static String a(bsb_1 bsb_12, String string, vb_0 vb_02, List<Mv> list) {
        if (string == null) {
            return null;
        }
        if (bsb_12 == lho) {
            if (vb_02 == null || vb_02 == vb_0.bIT) {
                return string;
            }
            return String.format("[%s] %s", vb_02.aUXX().aUP().toUpperCase(), string);
        }
        if (bsb_12 == lhp) {
            if (list == null || list.isEmpty()) {
                return string;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (Mv mv : list) {
                stringBuilder.append('[').append(mv.aUP().toUpperCase()).append(']');
            }
            stringBuilder.append(' ').append(string);
            return stringBuilder.toString();
        }
        return string;
    }

    private static /* synthetic */ bsb_1[] emU() {
        return new bsb_1[]{lhn, lho, lhp};
    }

    static {
        lht = bsb_1.emU();
    }
}

