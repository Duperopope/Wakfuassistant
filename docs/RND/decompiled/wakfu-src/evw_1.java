/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

/*
 * Renamed from evW
 */
final class evw_1
extends Enum<evw_1> {
    public static final /* enum */ evw_1 oxz = new evw_1(EnumSet.noneOf(evv_1.class));
    public static final /* enum */ evw_1 oxA = new evw_1(EnumSet.of(evv_1.owZ, new evv_1[]{evv_1.oxa, evv_1.oxc, evv_1.oxd, evv_1.oxe, evv_1.oxf, evv_1.oxg, evv_1.oxh, evv_1.oxi, evv_1.oxj}));
    public static final /* enum */ evw_1 oxB = new evw_1(EnumSet.of(evv_1.owZ, new evv_1[]{evv_1.oxa, evv_1.oxb, evv_1.oxc, evv_1.oxd, evv_1.oxe, evv_1.oxf, evv_1.oxg, evv_1.oxh, evv_1.oxi, evv_1.oxj, evv_1.oxk, evv_1.oxl, evv_1.oxm, evv_1.oxn, evv_1.oxo, evv_1.oxp, evv_1.oxq, evv_1.oxr, evv_1.oxs, evv_1.oxt, evv_1.oxu, evv_1.oxv, evv_1.oxw}));
    private final EnumSet<evv_1> oxC;
    private static final /* synthetic */ evw_1[] oxD;

    public static evw_1[] values() {
        return (evw_1[])oxD.clone();
    }

    public static evw_1 valueOf(String string) {
        return Enum.valueOf(evw_1.class, string);
    }

    private evw_1(EnumSet<evv_1> enumSet) {
        this.oxC = enumSet.clone();
    }

    public EnumSet<evv_1> feG() {
        return this.oxC.clone();
    }

    public boolean b(evv_1 evv_12) {
        return this.oxC.contains((Object)evv_12);
    }

    public static void main(String ... stringArray) {
        for (evw_1 evw_12 : evw_1.values()) {
            System.out.println((Object)evw_12);
            for (evv_1 evv_12 : evw_12.oxC) {
                System.out.println("\t" + evv_12.name());
            }
        }
    }

    private static /* synthetic */ evw_1[] feH() {
        return new evw_1[]{oxz, oxA, oxB};
    }

    static {
        oxD = evw_1.feH();
    }
}

