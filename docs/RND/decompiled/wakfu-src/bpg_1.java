/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpG
 */
public class bpg_1
extends bpb_1 {
    private static final Logger iXg = Logger.getLogger(bpg_1.class);
    public static final String iXh = "illustrationUrl";
    public static final String iXi = "levelDescription";
    public static final String iXj = "lootsPreview";
    public static final String iXk = "remainingLoots";
    public static final String iXl = "hasMoreLootsThanPreview";
    public static final String iXm = "allLoots";
    public static final String iXn = "actor";
    public static final String iXo = "actorScale";
    public static final String iXp = "monsterType";
    public static final String iXq = "hasFamily";
    public static final String iXr = "monsterFamily";
    public static final String iXs = "territoryLabel";
    public static final String iXt = "territories";
    public static final String iXu = "pageLevelRange";
    public static final String iXv = "displayLevelSlider";
    public static final String iXw = "levelSliderNumValues";
    public static final String iXx = "levelSliderValue";
    public static final String iXy = "isCapturable";
    public static final String iXz = "hasCollectableItems";
    public static final String iXA = "collectableItems";
    public static final String iXB = "charac";
    public static final String[] iXC = new String[]{"id", "name", "illustrationUrl", "levelDescription", "lootsPreview", "remainingLoots", "hasMoreLootsThanPreview", "allLoots", "actor", "actorScale", "monsterType", "hasFamily", "monsterFamily", "territoryLabel", "territories", "pageLevelRange", "displayLevelSlider", "levelSliderNumValues", "levelSliderValue", "isCapturable", "hasCollectableItems", "collectableItems"};
    private static final int iXD = 6;
    private static final String iXE = "---";
    @NotNull
    private final bjz_1 iXF;
    @NotNull
    private final EnumSet<ezj_0> iXG;
    @NotNull
    private final EnumSet<exe_1> iXH;
    @NotNull
    private final List<bpf_1> iXI;
    @NotNull
    private final List<bgv_2> iXJ;
    @NotNull
    private final Set<Integer> iXK;
    @NotNull
    private final EnumMap<exx_2, bjb_1> iXL;
    @Nullable
    private bdj_2 hKX = null;
    @Nullable
    private Integer iXM = null;

    public bpg_1(@NotNull bjz_1 bjz_12) {
        this.iXF = bjz_12;
        this.iXG = Arrays.stream(bjz_12.fhO()).mapToObj(ezj_0::Pl).collect(Collectors.toCollection(() -> EnumSet.noneOf(ezj_0.class)));
        this.iXH = Arrays.stream(bjz_12.fhN()).mapToObj(exe_1::Te).collect(Collectors.toCollection(() -> EnumSet.noneOf(exe_1.class)));
        this.iXK = new HashSet<Integer>();
        Collection<bjt_2> collection = bpu.a(bjz_12.drC());
        this.iXI = new ArrayList<bpf_1>(collection.size());
        for (bjt_2 object : collection) {
            bgv_2 bgv_23;
            if (bpu.a(object) || (bgv_23 = (bgv_2)bEm.dSb().Vd(object.avr())) == null || !bpm_1.dCG().i(bgv_23)) continue;
            this.iXI.add(new bpf_1(object, bgv_23));
            this.iXK.add(bgv_23.d());
        }
        this.iXI.sort(Comparator.comparingDouble(bpf_1::cmK).reversed());
        this.iXJ = new ArrayList<bgv_2>(bjz_12.fhM().length);
        bpu.e(this.iXF).forEach(bgv_22 -> {
            this.iXJ.add((bgv_2)bgv_22);
            this.iXK.add(bgv_22.d());
        });
        exd_2 exd_22 = bjz_12.fhP();
        this.iXL = new EnumMap(exx_2.class);
        for (exx_2 exx_22 : bjb_1.ioU) {
            int n = exd_22.b(exx_22, bjz_12.cqz());
            int n2 = exd_22.b(exx_22, bjz_12.cqA());
            this.iXL.put(exx_22, new bjb_1(exx_22, n, n2));
        }
    }

    @NotNull
    public bjz_1 dDw() {
        return this.iXF;
    }

    public Set<ezj_0> dDx() {
        return Collections.unmodifiableSet(this.iXG);
    }

    public boolean b(@NotNull exe_1 exe_12) {
        return this.iXH.contains(exe_12);
    }

    @Override
    public int d() {
        return this.iXF.aWP();
    }

    @Override
    public String dDp() {
        return this.iXF.getName();
    }

    @Override
    public String a(Mt mt, Mv mv) {
        return mt.a(mv, 7, this.iXF.aWP(), new Object[0]);
    }

    @Override
    public String dDq() {
        return this.iXF.dah();
    }

    @Override
    public short aVf() {
        return this.iXF.cqz();
    }

    @Override
    public short aVe() {
        return this.iXF.cqA();
    }

    public void g(Consumer<Integer> consumer) {
        this.iXI.forEach(bpf_12 -> consumer.accept(bpf_12.duo().d()));
    }

    public void h(Consumer<Integer> consumer) {
        this.iXJ.forEach(bgv_22 -> consumer.accept(bgv_22.d()));
    }

    public void Fd(int n) {
        if (n == 0) {
            this.O(null);
        } else {
            this.O(this.iXF.cqz() + n - 1);
        }
    }

    public void O(@Nullable Integer n) {
        if (Objects.equals(this.iXM, n)) {
            return;
        }
        Integer n2 = this.iXM = n == null ? null : Integer.valueOf(GC.a((int)n, (int)this.iXF.cqz(), (int)this.iXF.cqA()));
        if (this.iXM == null) {
            this.iXL.values().forEach(bjb_12 -> bjb_12.x(null));
        } else {
            exd_2 exd_22 = this.iXF.fhP();
            this.iXL.forEach((exx_22, bjb_12) -> bjb_12.x(exd_22.b((exx_2)exx_22, this.iXM)));
        }
        fse_1.gFu().a((aef_2)this, iXu);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        Object object;
        Object object2 = super.eu(string);
        if (object2 != null) {
            return object2;
        }
        String string2 = string;
        Objects.requireNonNull(string2);
        String string3 = string2;
        int n = 0;
        block23: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iXh, iXi, iXj, iXk, iXl, iXm, iXn, iXo, iXp, iXq, iXr, iXs, iXt, iXu, iXv, iXw, iXx, iXy, iXz, iXA, String.class}, (Object)string3, n)) {
                case 0: {
                    object = this.dDy();
                    break block23;
                }
                case 1: {
                    short s = this.iXF.cqz();
                    short s2 = this.iXF.cqA();
                    Object object3 = s == s2 ? Short.valueOf(s) : s + " - " + s2;
                    object = aum_0.cWf().c("levelShort.custom", object3);
                    break block23;
                }
                case 2: {
                    object = this.iXI.subList(0, Math.min(6, this.iXI.size()));
                    break block23;
                }
                case 3: {
                    if (this.iXI.size() <= 6) {
                        object = null;
                        break block23;
                    }
                    object = this.iXI.subList(6, this.iXI.size());
                    break block23;
                }
                case 4: {
                    object = this.iXI.size() > 6;
                    break block23;
                }
                case 5: {
                    object = this.iXI;
                    break block23;
                }
                case 6: {
                    if (this.hKX == null) {
                        this.hKX = this.dDz();
                    }
                    object = this.hKX;
                    break block23;
                }
                case 7: {
                    if (this.hKX == null) {
                        this.hKX = this.dDz();
                    }
                    short s = this.hKX.aKu();
                    float f2 = this.hKX.bqd().getScale();
                    object = Float.valueOf(bsz_0.c(s, f2));
                    break block23;
                }
                case 8: {
                    object = bqe_0.a(this.iXG).gP(false);
                    break block23;
                }
                case 9: {
                    object = this.iXF.drD();
                    break block23;
                }
                case 10: {
                    if (this.iXF.drD()) {
                        object = aum_0.cWf().a(38, (long)this.iXF.cqy(), new Object[0]);
                        break block23;
                    }
                    object = iXE;
                    break block23;
                }
                case 11: {
                    object = aum_0.cWf().c("encyclopedia.monster.territory.label", bpm_1.dCG().EW(this.iXF.cqy()).size());
                    break block23;
                }
                case 12: {
                    object = bpm_1.dCG().EW(this.iXF.cqy()).stream().map(bph_1::new).toList();
                    break block23;
                }
                case 13: {
                    short s;
                    if (this.iXM != null) {
                        object = this.iXM;
                        break block23;
                    }
                    short s3 = this.iXF.cqz();
                    if (s3 == (s = this.iXF.cqA())) {
                        object = s3;
                        break block23;
                    }
                    object = s3 + bpu.dCT() + s;
                    break block23;
                }
                case 14: {
                    object = this.iXF.cqA() > this.iXF.cqz();
                    break block23;
                }
                case 15: {
                    object = this.iXF.cqA() - this.iXF.cqz() + 2;
                    break block23;
                }
                case 16: {
                    if (this.iXM == null) {
                        object = 0;
                        break block23;
                    }
                    object = 1 + this.iXM - this.iXF.cqz();
                    break block23;
                }
                case 17: {
                    object = this.iXH.contains(exe_1.rDO);
                    break block23;
                }
                case 18: {
                    object = !this.iXJ.isEmpty();
                    break block23;
                }
                case 19: {
                    object = this.iXJ;
                    break block23;
                }
                case 20: {
                    String string4 = string3;
                    if (!string4.startsWith(iXB)) {
                        n = 21;
                        continue block23;
                    }
                    exx_2 exx_22 = exx_2.valueOf(string.substring(iXB.length()).toUpperCase());
                    object = this.iXL.get(exx_22);
                    break block23;
                }
                default: {
                    object = null;
                    break block23;
                }
            }
            break;
        }
        return object;
    }

    @Nullable
    private String dDy() {
        int n;
        int n2 = n = this.iXF.csk() > 0 ? this.iXF.csk() : this.iXF.aGs();
        if (auc_0.cVq().zu(n)) {
            return auc_0.cVq().zv(n);
        }
        try {
            return auc_0.kG("defaultMonsterIllustrationPath");
        }
        catch (fu_0 fu_02) {
            iXg.warn((Object)("Unable to load default monster illustration: " + fu_02.getMessage()));
            return null;
        }
    }

    @NotNull
    private bdj_2 dDz() {
        bhx_0 bhx_02 = bhx_0.doA();
        bhx_02.fR(false);
        bhx_02.a((byte)1);
        bhx_02.c(this.iXF);
        bhx_02.aPg();
        return new bdj_2(bhx_02);
    }

    @NotNull
    public String dDA() {
        StringBuilder stringBuilder = new StringBuilder();
        this.iXI.forEach(bpf_12 -> stringBuilder.append(bEm.dSb().Gq(bpf_12.duo().d())).append(' '));
        this.iXJ.forEach(bgv_22 -> stringBuilder.append(bEm.dSb().Gq(bgv_22.d())).append(' '));
        return stringBuilder.toString();
    }

    public boolean P(Integer n) {
        return this.iXK.contains(n);
    }

    @Override
    public String[] bxk() {
        return iXC;
    }

    public String toString() {
        return "EncyclopediaMonsterView{" + this.iXF.aWP() + ":" + this.iXF.getName() + "}";
    }
}

