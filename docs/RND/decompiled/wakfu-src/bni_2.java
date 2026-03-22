/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bNi
 */
public class bni_2
implements aeh_2 {
    private final fdK kAR;
    private final bbl_2 kAS;
    private final List<bnf_2> kAT;
    private final List<bng_2> kAU;
    private bne_2 kAV;
    public static final String kAW = "isActive";
    public static final String kAX = "name";
    public static final String kAY = "difficulties";
    public static final String kAZ = "difficultiesSelected";
    public static final String kBa = "rewardTiers";
    public static final String kBb = "difficultyWeightSum";
    public static final String kBc = "difficultyAvailable";
    public static final String kBd = "difficultyWeightNotSelected";
    public static final String kBe = "isPreview";
    public static final String kBf = "hasSelectedFreeRewards";
    public static final String kBg = "cost";
    public static final String kBh = "canPay";

    public bni_2(fdK fdK2, bbl_2 bbl_22, List<bng_2> list, List<bnf_2> list2) {
        this.kAS = bbl_22;
        this.kAR = fdK2;
        this.kAU = list;
        this.kAT = list2;
        this.kAV = new bne_2();
    }

    @Override
    public String[] bxk() {
        return new String[]{kAY, kAZ, kBa, kBc, kBb, kBg, kBh, kAX, kAW, kBd, kBe};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kAY)) {
            return this.kAT;
        }
        if (string.equals(kAZ)) {
            return this.kAT.stream().filter(bnf_2::bqr).toList();
        }
        if (string.equals(kBa)) {
            return this.kAU;
        }
        if (string.equals(kAX)) {
            return bnd_1.Dm(this.kAR.d());
        }
        if (string.equals(kBb)) {
            return this.efz();
        }
        if (string.equals(kBc)) {
            return this.efy();
        }
        if (string.equals(kBd)) {
            return this.efy() - this.efz();
        }
        if (string.equals(kBg)) {
            aum_0 aum_02 = aum_0.cWf();
            if (this.apo()) {
                return aum_02.c("stele.already.active", new Object[0]);
            }
            List<Integer> list = this.efB();
            if (!this.ab(list)) {
                Map<Integer, Integer> map = bnd_1.a(this.kAR, this.kAU, list);
                int n = map.values().stream().mapToInt(Integer::intValue).sum();
                return aum_02.c("stele.reward.remaining", n);
            }
            StringBuilder stringBuilder = new StringBuilder(aum_02.c("stele.pay", new Object[0])).append(' ');
            String string2 = this.kAV.dzt() > 0L ? this.kAV.dzt() + " $, " : "";
            String string3 = this.kAV.efr().entrySet().stream().map(entry -> aum_02.a(15, (long)((Integer)entry.getKey()).intValue(), new Object[0]) + " x" + String.valueOf(entry.getValue())).collect(Collectors.joining(", "));
            return stringBuilder.append(string2).append(string3).toString();
        }
        if (string.equals(kAW)) {
            return this.apo();
        }
        if (string.equals(kBh)) {
            bgt_0 bgt_02 = bvz_0.dLl();
            if (bgt_02 == null) {
                return false;
            }
            List<Integer> list = this.efB();
            if (list.isEmpty()) {
                return false;
            }
            if (!this.ab(list)) {
                return false;
            }
            return this.K(bgt_02);
        }
        if (string.equals(kBe)) {
            return this.efD();
        }
        if (string.equals(kBf)) {
            List<Integer> list = this.efB();
            return this.ab(list) && !list.isEmpty();
        }
        return null;
    }

    private int efy() {
        return this.kAT.stream().mapToInt(bnf_2::aXY).sum();
    }

    private boolean apo() {
        return this.kAS != null && this.kAS.bem() == 1;
    }

    private int efz() {
        int n = 0;
        for (bnf_2 bnf_22 : this.kAT) {
            if (!bnf_22.bqr()) continue;
            n += bnf_22.aXY();
        }
        return n;
    }

    public long efA() {
        return this.kAR.d();
    }

    public @Unmodifiable List<Integer> efB() {
        return this.kAT.stream().filter(bnf_2::bqr).map(bnf_2::efs).toList();
    }

    public @Unmodifiable List<Integer> efu() {
        int n = this.efz();
        return this.kAU.stream().filter(bng_22 -> bng_22.ayr() <= n).flatMap(bng_22 -> bng_22.efu().stream()).toList();
    }

    public void a(bnf_2 bnf_22, boolean bl) {
        if (this.apo()) {
            return;
        }
        if (this.efD()) {
            return;
        }
        bnf_22.setSelected(bl);
        this.efC();
        fse_1.gFu().a((aef_2)this, kAZ, kBb, kBd, kBf, kBc);
    }

    public void efC() {
        int n = this.efz();
        for (bng_2 bng_22 : this.kAU) {
            bng_22.setEnabled(bng_22.ayr() <= n);
        }
    }

    public void b(bnh_2 bnh_22) {
        if (this.efD()) {
            return;
        }
        if (this.apo()) {
            return;
        }
        for (bng_2 bng_22 : this.kAU) {
            if (!bng_22.a(bnh_22)) continue;
            bng_22.Ij(bnh_22.azt());
            fse_1.gFu().a((aef_2)this, kBf);
            return;
        }
    }

    private boolean efD() {
        return this.kAS == null;
    }

    public void efE() {
        bne_2 bne_22 = new bne_2();
        fdn_0 fdn_02 = this.kAR.fTY();
        bne_22.lQ(fdn_02.dzt());
        fdn_02.fUd().forEach(bne_22::dS);
        for (bng_2 bng_22 : this.kAU) {
            List<Integer> list = bng_22.efu();
            int n = bnd_1.a(this.kAR, bng_22.ayj());
            int n2 = list.size() - n;
            if (n2 <= 0) continue;
            this.a(bne_22, n2);
        }
        this.kAV = bne_22;
        fse_1.gFu().a((aef_2)this, kBg, kBh, kAW);
    }

    private void a(bne_2 bne_22, int n) {
        fdn_0 fdn_02 = this.kAR.fTZ();
        for (int i = 0; i < n; ++i) {
            bne_22.lP(fdn_02.dzt());
            fdn_02.fUd().forEach(bne_22::dS);
        }
    }

    public boolean K(bgt_0 bgt_02) {
        if (this.efD()) {
            return false;
        }
        if (bgt_02.dmi() < this.kAV.dzt()) {
            return false;
        }
        return this.kAV.efr().entrySet().stream().noneMatch(entry -> bgt_02.dno().Gn((Integer)entry.getKey()) < (Integer)entry.getValue());
    }

    public boolean ab(List<Integer> list) {
        int n = bnd_1.a(this.kAR, list);
        return bnd_1.a(n, this.kAU).noneMatch(bng_22 -> bnd_1.a(this.kAR, bng_22.ayj()) > bng_22.efu().size());
    }
}

