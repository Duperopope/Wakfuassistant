/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public final class euz
extends Enum<euz> {
    public static final /* enum */ euz oqX = new euz(new euz[0]);
    public static final /* enum */ euz oqY = new euz(oqX);
    public static final /* enum */ euz oqZ = new euz(oqX, oqY);
    private final List<euz> ora;
    private static final /* synthetic */ euz[] orb;

    public static euz[] values() {
        return (euz[])orb.clone();
    }

    public static euz valueOf(String string) {
        return Enum.valueOf(euz.class, string);
    }

    private euz(euz ... euzArray) {
        this.ora = Arrays.asList(euzArray);
    }

    public List<euz> fdd() {
        return this.ora;
    }

    public static euz rw(String string) {
        String string2 = string.toUpperCase();
        for (euz euz2 : euz.values()) {
            if (!euz2.name().equals(string2)) continue;
            return euz2;
        }
        return null;
    }

    private static /* synthetic */ euz[] fde() {
        return new euz[]{oqX, oqY, oqZ};
    }

    static {
        orb = euz.fde();
    }
}

