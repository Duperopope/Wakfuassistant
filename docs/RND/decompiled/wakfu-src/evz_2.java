/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/*
 * Renamed from evz
 */
public final class evz_2
extends Enum<evz_2> {
    public static final /* enum */ evz_2 ovX = new evz_2(eva_1.owq, eva_1.owr, eva_1.owt, eva_1.ows, eva_1.owv, eva_1.oww, eva_1.owy, eva_1.owA, eva_1.owB, eva_1.owE, eva_1.owu, eva_1.owC, eva_1.owD, eva_1.owG, eva_1.owF, eva_1.owz);
    public static final /* enum */ evz_2 ovY = new evz_2(eva_1.values());
    public static final /* enum */ evz_2 ovZ = new evz_2(eva_1.owv);
    public static final /* enum */ evz_2 owa = new evz_2(eva_1.owq, eva_1.owr);
    public static final /* enum */ evz_2 owb = new evz_2(eva_1.owr);
    public static final /* enum */ evz_2 owc = new evz_2(eva_1.oww);
    public static final /* enum */ evz_2 owd = new evz_2(eva_1.owx);
    public static final /* enum */ evz_2 owe = new evz_2(eva_1.owy);
    public static final /* enum */ evz_2 owf = new evz_2(eva_1.owA);
    public static final /* enum */ evz_2 owg = new evz_2(eva_1.owB);
    public static final /* enum */ evz_2 owh = new evz_2(eva_1.owC);
    public static final /* enum */ evz_2 owi = new evz_2(eva_1.owD);
    public static final /* enum */ evz_2 owj = new evz_2(eva_1.owu);
    public static final /* enum */ evz_2 owk = new evz_2(eva_1.owF);
    public static final /* enum */ evz_2 owl = new evz_2(eva_1.owH);
    public static final /* enum */ evz_2 owm = new evz_2(eva_1.owz);
    public static final /* enum */ evz_2 own = new evz_2(eva_1.owy, eva_1.owz);
    private final EnumSet<eva_1> owo = EnumSet.noneOf(eva_1.class);
    private static final /* synthetic */ evz_2[] owp;

    public static evz_2[] values() {
        return (evz_2[])owp.clone();
    }

    public static evz_2 valueOf(String string) {
        return Enum.valueOf(evz_2.class, string);
    }

    private evz_2(eva_1 ... eva_1Array) {
        this.owo.addAll(Arrays.asList(eva_1Array));
    }

    Set<eva_1> fes() {
        return Collections.unmodifiableSet(this.owo);
    }

    private static /* synthetic */ evz_2[] fet() {
        return new evz_2[]{ovX, ovY, ovZ, owa, owb, owc, owd, owe, owf, owg, owh, owi, owj, owk, owl, owm, own};
    }

    static {
        owp = evz_2.fet();
    }
}

