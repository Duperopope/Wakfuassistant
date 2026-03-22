/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class VH
extends Enum<VH> {
    public static final /* enum */ VH bJB = new VH("config.properties", new String[0]);
    private final String bJC;
    private final Set<String> bJD;
    private static final /* synthetic */ VH[] bJE;

    public static VH[] values() {
        return (VH[])bJE.clone();
    }

    public static VH valueOf(String string) {
        return Enum.valueOf(VH.class, string);
    }

    private VH(String string2, String ... stringArray) {
        this.bJC = string2;
        this.bJD = ImmutableSet.copyOf((Object[])stringArray);
    }

    public static VH dy(String string) {
        for (VH vH : VH.values()) {
            if (!vH.bJD.contains(string)) continue;
            return vH;
        }
        return bJB;
    }

    public String bkE() {
        return this.bJC;
    }

    private static /* synthetic */ VH[] bkF() {
        return new VH[]{bJB};
    }

    static {
        bJE = VH.bkF();
    }
}

