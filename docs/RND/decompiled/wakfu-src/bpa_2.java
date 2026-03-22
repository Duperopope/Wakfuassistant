/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.THashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bPA
 */
public final class bpa_2
extends Enum<bpa_2> {
    public static final /* enum */ bpa_2 kRg = new bpa_2(0, "OGR", null, false);
    @Deprecated
    public static final /* enum */ bpa_2 kRh = new bpa_2(1, "KRZ", null, false);
    public static final /* enum */ bpa_2 kRi = new bpa_2(2, "USD", "USD", true);
    public static final /* enum */ bpa_2 kRj = new bpa_2(3, "EUR", "EUR", true);
    public static final /* enum */ bpa_2 kRk = new bpa_2(4, "GBP", "GBP", true);
    public static final /* enum */ bpa_2 kRl = new bpa_2(5, "BRL", "BRL", true);
    public static final /* enum */ bpa_2 kRm = new bpa_2(6, "RUB", "RUB", true);
    public static final /* enum */ bpa_2 kRn = new bpa_2(7, "AUD", "AUD", true);
    public static final /* enum */ bpa_2 kRo = new bpa_2(8, "CAD", "CAD", true);
    public static final /* enum */ bpa_2 kRp = new bpa_2(9, "IDR", "IDR", true);
    public static final /* enum */ bpa_2 kRq = new bpa_2(10, "JPY", "JPY", true);
    public static final /* enum */ bpa_2 kRr = new bpa_2(11, "MYR", "MYR", true);
    public static final /* enum */ bpa_2 kRs = new bpa_2(12, "MXN", "MXN", true);
    public static final /* enum */ bpa_2 kRt = new bpa_2(13, "NZD", "NZD", true);
    public static final /* enum */ bpa_2 kRu = new bpa_2(14, "NOK", "NOK", true);
    public static final /* enum */ bpa_2 kRv = new bpa_2(15, "PHP", "PHP", true);
    public static final /* enum */ bpa_2 kRw = new bpa_2(16, "SGD", "SGD", true);
    public static final /* enum */ bpa_2 kRx = new bpa_2(17, "KRW", "KRW", true);
    public static final /* enum */ bpa_2 kRy = new bpa_2(18, "THB", "THB", true);
    public static final /* enum */ bpa_2 kRz = new bpa_2(19, "TRY", "TRY", true);
    public static final /* enum */ bpa_2 kRA = new bpa_2(20, "UAH", "UAH", true);
    public static final /* enum */ bpa_2 kRB = new bpa_2(21, "CHF", "CHF", true);
    public static final /* enum */ bpa_2 kRC = new bpa_2(22, "AED", "AED", true);
    public static final /* enum */ bpa_2 kRD = new bpa_2(23, "BDT", "BDT", true);
    public static final /* enum */ bpa_2 kRE = new bpa_2(24, "PLN", "PLN", true);
    public static final /* enum */ bpa_2 kRF = new bpa_2(25, "BGN", "BGN", true);
    public static final /* enum */ bpa_2 kRG = new bpa_2(26, "SEK", "SEK", true);
    public static final /* enum */ bpa_2 kRH = new bpa_2(27, "COP", "COP", true);
    public static final /* enum */ bpa_2 kRI = new bpa_2(28, "CLP", "CLP", true);
    public static final /* enum */ bpa_2 kRJ = new bpa_2(29, "DKK", "DKK", true);
    public static final /* enum */ bpa_2 kRK = new bpa_2(30, "CRC", "CRC", true);
    public static final /* enum */ bpa_2 kRL = new bpa_2(31, "PEN", "PEN", true);
    public static final /* enum */ bpa_2 kRM = new bpa_2(32, "CZK", "CZK", true);
    public static final /* enum */ bpa_2 kRN = new bpa_2(33, "DZD", "DZD", true);
    public static final /* enum */ bpa_2 kRO = new bpa_2(34, "ILS", "ILS", true);
    public static final /* enum */ bpa_2 kRP = new bpa_2(35, "HKD", "HKD", true);
    public static final /* enum */ bpa_2 kRQ = new bpa_2(36, "HUF", "HUF", true);
    public static final /* enum */ bpa_2 kRR = new bpa_2(37, "ISK", "ISK", true);
    public static final /* enum */ bpa_2 kRS = new bpa_2(38, "KES", "KES", true);
    public static final /* enum */ bpa_2 kRT = new bpa_2(39, "MWK", "MWK", true);
    public static final /* enum */ bpa_2 kRU = new bpa_2(40, "QAR", "QAR", true);
    public static final /* enum */ bpa_2 kRV = new bpa_2(41, "RON", "RON", true);
    public static final /* enum */ bpa_2 kRW = new bpa_2(42, "SAR", "SAR", true);
    public static final /* enum */ bpa_2 kRX = new bpa_2(43, "TWD", "TWD", true);
    public static final /* enum */ bpa_2 kRY = new bpa_2(44, "UYU", "UYU", true);
    public static final /* enum */ bpa_2 kRZ = new bpa_2(45, "VND", "VND", true);
    public static final /* enum */ bpa_2 kSa = new bpa_2(46, "MAD", "MAD", true);
    public static final /* enum */ bpa_2 kSb = new bpa_2(47, "MMK", "MMK", true);
    private static final Map<String, bpa_2> kSc;
    private static final Map<String, bpa_2> kSd;
    private final byte kSe;
    private final String kSf;
    private final String kSg;
    private final boolean kSh;
    private static final /* synthetic */ bpa_2[] kSi;

    public static bpa_2[] values() {
        return (bpa_2[])kSi.clone();
    }

    public static bpa_2 valueOf(String string) {
        return Enum.valueOf(bpa_2.class, string);
    }

    private bpa_2(@Nullable int n2, String string2, String string3, boolean bl) {
        this.kSg = string3;
        this.kSh = bl;
        this.kSe = GC.ct(n2);
        this.kSf = string2;
    }

    public byte aJr() {
        return this.kSe;
    }

    @NotNull
    public String eiE() {
        return this.kSf;
    }

    public String byf() {
        return auc_0.cVq().a("currencyIconUrl", "defaultIconPath", this.kSe);
    }

    public String eiF() {
        return this.kSg;
    }

    public boolean eiG() {
        return this.kSh;
    }

    public String getDescription() {
        return "";
    }

    @Nullable
    public static bpa_2 nn(String string) {
        return kSc.get(string);
    }

    @Nullable
    public static bpa_2 no(String string) {
        return bpa_2.D(string, true);
    }

    public static bpa_2 D(String string, boolean bl) {
        bpa_2 bpa_22 = kSd.get(string);
        return bpa_22 != null || bl ? bpa_22 : kRi;
    }

    private static /* synthetic */ bpa_2[] eiH() {
        return new bpa_2[]{kRg, kRh, kRi, kRj, kRk, kRl, kRm, kRn, kRo, kRp, kRq, kRr, kRs, kRt, kRu, kRv, kRw, kRx, kRy, kRz, kRA, kRB, kRC, kRD, kRE, kRF, kRG, kRH, kRI, kRJ, kRK, kRL, kRM, kRN, kRO, kRP, kRQ, kRR, kRS, kRT, kRU, kRV, kRW, kRX, kRY, kRZ, kSa, kSb};
    }

    static {
        kSi = bpa_2.eiH();
        kSc = new THashMap();
        kSd = new THashMap();
        for (bpa_2 bpa_22 : bpa_2.values()) {
            kSc.put(bpa_22.kSf, bpa_22);
            if (bpa_22.kSg == null) continue;
            kSd.put(bpa_22.kSg, bpa_22);
        }
    }
}

