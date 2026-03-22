/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bjE
 */
public final class bje_2
extends Enum<bje_2>
implements aoq_1 {
    public static final /* enum */ bje_2 ipd = new bje_2(0, "Ne peut \u00eatre obtenu que dans un donjon");
    public static final /* enum */ bje_2 ipe = new bje_2(1, "Ne peut pas \u00eatre obtenu dans un donjon");
    public static final /* enum */ bje_2 ipf = new bje_2(2, "Ne peut pas \u00eatre obtenu dans une Br\u00e8che Dimensionnelle");
    public static final /* enum */ bje_2 ipg = new bje_2(3, "Pr\u00e9requis : niveau de Stasis niveau >= X");
    public static final /* enum */ bje_2 iph = new bje_2(4, "Pr\u00e9requis : score >= X");
    public static final /* enum */ bje_2 ipi = new bje_2(5, "Peut-\u00eatre obtenu dans une st\u00e8le");
    public static final /* enum */ bje_2 ipj = new bje_2(6, "N'a pas d\u00e9j\u00e0 obtenu ou appris cet objet");
    public static final /* enum */ bje_2 ipk = new bje_2(7, "Ne peut \u00eatre obtenu que dans un donjon en mode comp\u00e9titif (modul\u00e9 / \u00e0 niveau)");
    public static final /* enum */ bje_2 ipl = new bje_2(8, "Ne peut \u00eatre obtenu que sur les N\u00e9o-serveurs");
    private static final bje_2[] ipm;
    private final int ipn;
    private final String ipo;
    private static final /* synthetic */ bje_2[] ipp;

    public static bje_2[] values() {
        return (bje_2[])ipp.clone();
    }

    public static bje_2 valueOf(String string) {
        return Enum.valueOf(bje_2.class, string);
    }

    private bje_2(int n2, String string2) {
        this.ipn = n2;
        this.ipo = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.ipn);
    }

    @Override
    public String aXB() {
        return this.ipo;
    }

    @Override
    public String aXC() {
        return this.ipo;
    }

    @Nullable
    public static bje_2 Dw(int n) {
        for (bje_2 bje_22 : ipm) {
            if (bje_22.ipn != n) continue;
            return bje_22;
        }
        return null;
    }

    private static /* synthetic */ bje_2[] drN() {
        return new bje_2[]{ipd, ipe, ipf, ipg, iph, ipi, ipj, ipk, ipl};
    }

    static {
        ipp = bje_2.drN();
        ipm = bje_2.values();
    }
}

