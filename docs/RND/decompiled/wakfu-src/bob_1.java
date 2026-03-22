/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boB
 */
public class bob_1
implements aeh_2 {
    public static final String iQn = "bonusName";
    public static final String iQo = "bonusIcon";
    public static final String iQp = "doubleBonusIcons";
    public static final String iQq = "doubleBonusPopup";
    public static final String iQr = "isBonusDoubled";
    public static final String iQs = "ornamentStyle";
    public static final String iQt = "ornamentColor";
    public static final String[] iQu = new String[]{"bonusName", "bonusIcon", "doubleBonusIcons", "doubleBonusPopup", "isBonusDoubled", "ornamentStyle", "ornamentColor"};
    private static final Map<rd_0, ett_1> iQv = Map.of(rd_0.bjB, ett_1.opN, rd_0.bjC, ett_1.opP, rd_0.bjD, ett_1.opR);
    private static final Map<rd_0, ett_1> iQw = Map.of(rd_0.bjB, ett_1.opO, rd_0.bjC, ett_1.opQ, rd_0.bjD, ett_1.opS);
    public static final Comparator<bob_1> iQx = Comparator.comparingInt(bob_12 -> bob_12.iQC ? 0 : 1).thenComparing(bob_12 -> {
        String string = bob_12.dBd();
        return string == null ? "" : string;
    });
    private final int iQy;
    @Nullable
    private final exx_2 iQz;
    @NotNull
    private final List<boc_0> iQA;
    @NotNull
    private final String iQB;
    private final boolean iQC;
    private final rd_0 iQD;

    public bob_1(@NotNull fhg_0 fhg_02, @NotNull Set<ffS> set) {
        this.iQy = fhg_02.AK();
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(fhg_02.AK());
        this.iQz = bob_1.g(bgv_22);
        this.iQA = fhg_02.fYF().stream().map(ffS2 -> new boc_0((ffS)ffS2, set.contains(ffS2))).toList();
        this.iQB = bof_0.a(fhg_02);
        this.iQC = fhg_02.fYF().stream().anyMatch(set::contains);
        this.iQD = fhg_02.dBe();
    }

    @Nullable
    private static exx_2 g(@Nullable bgv_2 bgv_22) {
        pt_0 pt_02;
        Object object;
        if (bgv_22 == null) {
            return null;
        }
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(bgv_22.bcx().vK(0).avZ());
        if (ero_02 == null) {
            return null;
        }
        if (ero_02 instanceof eON) {
            object = (eON)ero_02;
            pt_02 = ((eot_0)object).fCY();
        } else if (ero_02 instanceof eok_0) {
            eok_0 eok_02 = (eok_0)ero_02;
            pt_02 = eok_02.fCY();
        } else {
            return null;
        }
        if (!(pt_02 instanceof exx_2)) {
            return null;
        }
        object = (exx_2)pt_02;
        return object;
    }

    @Nullable
    public exx_2 deY() {
        return this.iQz;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iQn -> this.dBd();
            case iQo -> {
                if (this.iQz == null) {
                    yield null;
                }
                yield biJ.imm.eu(this.iQz.name());
            }
            case iQp -> this.iQA;
            case iQq -> this.iQB;
            case iQr -> this.iQC;
            case iQs -> this.iQD.name() + "SlotOrnament";
            case iQt -> {
                ett_1 var4_4 = (this.iQC ? iQw : iQv).get(this.iQD);
                if (var4_4 == null) {
                    yield null;
                }
                yield new fhl_2(var4_4, this.iQC ? 0.8f : 1.0f);
            }
            default -> null;
        };
    }

    public int dBc() {
        return this.iQy;
    }

    @Override
    public String[] bxk() {
        return iQu;
    }

    @Nullable
    private String dBd() {
        return biK.a(this.iQz);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bob_1 bob_12 = (bob_1)object;
        return this.iQy == bob_12.iQy;
    }

    public int hashCode() {
        return Objects.hash(this.iQy);
    }

    public String toString() {
        return "EnchantmentSelectableBonusView{" + String.valueOf(this.iQz) + "}";
    }
}

