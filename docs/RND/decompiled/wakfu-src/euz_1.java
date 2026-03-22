/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eUz
 */
public final class euz_1
extends Enum<euz_1> {
    public static final /* enum */ euz_1 rwp = new euz_1(true);
    public static final /* enum */ euz_1 rwq = new euz_1(false);
    public static final /* enum */ euz_1 rwr = new euz_1(false);
    public static final /* enum */ euz_1 rws = new euz_1(false);
    public static final /* enum */ euz_1 rwt = new euz_1(true);
    public static final /* enum */ euz_1 rwu = new euz_1(true);
    private final boolean rwv;
    private static final /* synthetic */ euz_1[] rww;

    public static euz_1[] values() {
        return (euz_1[])rww.clone();
    }

    public static euz_1 valueOf(String string) {
        return Enum.valueOf(euz_1.class, string);
    }

    private euz_1(boolean bl) {
        this.rwv = bl;
    }

    @Nullable
    public static euz_1 SC(int n) {
        for (euz_1 euz_12 : euz_1.values()) {
            if (euz_12.ordinal() != n) continue;
            return euz_12;
        }
        return null;
    }

    public boolean fMv() {
        return this.rwv;
    }

    private static /* synthetic */ euz_1[] fMw() {
        return new euz_1[]{rwp, rwq, rwr, rws, rwt, rwu};
    }

    static {
        rww = euz_1.fMw();
    }
}

