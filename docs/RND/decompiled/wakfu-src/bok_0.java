/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boK
 */
public class bok_0
implements aeh_2 {
    public static final String iRv = "isWhite";
    public static final String iRw = "backgroundStyle";
    public static final String iRx = "status";
    public static final String iRy = "selectableBonuses";
    public static final String iRz = "slotBonusType";
    public static final String iRA = "shardStyle";
    public static final String iRB = "startingCharacteristics";
    public static final String iRC = "removeBonusLevelText";
    public static final String iRD = "currentBonus";
    public static final String iRE = "currentBonusLevel";
    public static final String iRF = "firstCurrentCharacteristic";
    public static final String iRG = "secondCurrentCharacteristic";
    public static final String iRH = "isCurrentBonusDoubled";
    public static final String iRI = "canDecreaseLevel";
    public static final String iRJ = "canIncreaseLevel";
    public static final String iRK = "decreaseButtonPopup";
    public static final String iRL = "increaseButtonPopup";
    public static final String iRM = "shardsToNextLevel";
    public static final String iRN = "currentShardCost";
    public static final String iRO = "currentShardCostFormatted";
    public static final String iRP = "canChangeBonus";
    public static final String iRQ = "changeBonusPopup";
    public static final String[] iRR = new String[]{"isWhite", "backgroundStyle", "status", "selectableBonuses", "slotBonusType", "shardStyle", "startingCharacteristics", "removeBonusLevelText", "isCurrentBonusDoubled", "firstCurrentCharacteristic", "secondCurrentCharacteristic", "currentBonus", "currentBonusLevel", "canDecreaseLevel", "canIncreaseLevel", "decreaseButtonPopup", "increaseButtonPopup", "shardsToNextLevel", "currentShardCost", "currentShardCostFormatted", "canChangeBonus", "changeBonusPopup"};
    private static final String[] iRS = new String[]{"shardStyle", "currentBonusLevel", "firstCurrentCharacteristic", "secondCurrentCharacteristic", "canDecreaseLevel", "canIncreaseLevel", "decreaseButtonPopup", "increaseButtonPopup", "shardsToNextLevel", "currentShardCost", "currentShardCostFormatted", "canChangeBonus", "changeBonusPopup"};
    @NotNull
    private final rd_0 iRT;
    private final LinkedHashMap<Integer, bob_1> iRU = new LinkedHashMap();
    @Nullable
    private boj_0 iRV;
    @NotNull
    private final fho_0 iRW;
    private final List<boo_1> iRX;
    @NotNull
    private fho_0 iRY;
    private List<boo_1> iRZ;
    private final List<fho_0> iSa = new ArrayList<fho_0>();
    private final Runnable iSb;
    @NotNull
    private bol_0 iSc;

    public bok_0(@Nullable fhn_0 fhn_02, Runnable runnable) {
        this.iRT = fhn_02 == null ? rd_0.bjA : fhn_02.dBe();
        this.iRW = fho_0.i(fhn_02);
        this.iRX = boo_1.a(this.iRW, bok_0.a(this.iRW));
        this.iRY = this.iRW;
        this.dBp();
        if (this.iRT == rd_0.bjA) {
            this.iSc = bol_0.iSd;
        } else {
            this.dBm();
        }
        this.iSb = runnable;
    }

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iRv -> this.iRT == rd_0.bjE;
            case iRw -> this.iSc.dBE();
            case iRx -> this.iSc.name();
            case iRy -> {
                if (this.iRV == null) {
                    yield this.iRU.values();
                }
                yield this.iRU.values().stream().filter(bob_12 -> this.iRV.i(bob_12.deY())).toList();
            }
            case iRz -> this.iRV == null ? 0 : this.iRV.d();
            case iRA -> {
                String var4_4 = bES.a(this.iRT, !this.iRY.aJG());
                if (var4_4 != null) {
                    yield var4_4;
                }
                yield "";
            }
            case iRB -> this.iRX;
            case iRC -> aum_0.cWf().c("enchantment.remove.bonus.level.text", this.iRW.tL());
            case iRD -> this.iRU.get(this.iRY.dBc());
            case iRE -> aum_0.cWf().c("longLevelParam", this.iRY.tL());
            case iRF -> {
                if (this.iRZ.isEmpty()) {
                    yield null;
                }
                yield this.iRZ.get(0);
            }
            case iRG -> {
                if (this.iRZ.size() < 2) {
                    yield null;
                }
                yield this.iRZ.get(1);
            }
            case iRH -> bok_0.a(this.iRY);
            case iRI -> this.dBv();
            case iRJ -> this.dBw();
            case iRK -> {
                if (bok_0.dBB()) {
                    yield aum_0.cWf().c("impossible.during.fight.or.trade", new Object[0]);
                }
                if (cui_1.eRA() || this.dBv()) {
                    yield aum_0.cWf().c("enchantment.decrease.level.popup", new Object[0]);
                }
                yield aum_0.cWf().c("enchantment.must.have.occupation", new Object[0]);
            }
            case iRL -> {
                if (bok_0.dBB()) {
                    yield aum_0.cWf().c("impossible.during.fight.or.trade", new Object[0]);
                }
                if (this.iRY.fZa()) {
                    yield aum_0.cWf().c("maxLevel", new Object[0]);
                }
                ffV var4_5 = cui_1.eRw().dBU();
                OptionalInt var5_7 = this.iRY.fZb();
                if (var5_7.isEmpty()) {
                    yield null;
                }
                if (var5_7.getAsInt() <= var4_5.cmL()) {
                    yield aum_0.cWf().c("enchantment.increase.level.popup", new Object[0]);
                }
                yield aum_0.cWf().c("enchantment.increase.level.popup.max.level", var5_7.getAsInt());
            }
            case iRM -> this.iRY.fZc().orElse(0);
            case iRN -> this.dBr();
            case iRO -> {
                int var4_6 = this.dBr();
                yield (var4_6 < 0 ? "+" : "") + aum_0.cWf().c("enchantment.shard.cost", Math.abs(var4_6));
            }
            case iRP -> this.dBo();
            case iRQ -> {
                if (this.dBo()) {
                    yield aum_0.cWf().c("enchantment.actions.group.popup", new Object[0]);
                }
                if (bok_0.dBB()) {
                    yield aum_0.cWf().c("impossible.during.fight.or.trade", new Object[0]);
                }
                yield aum_0.cWf().c("enchantment.must.have.occupation", new Object[0]);
            }
            default -> null;
        };
    }

    public void x(@NotNull ffV ffV2) {
        this.iRU.clear();
        if (this.iRT == rd_0.bjA) {
            return;
        }
        HashSet hashSet = Sets.newHashSet((Object[])ffV2.fWi().fZq());
        fhh_0.spN.g(this.iRT).stream().map(fhg_02 -> new bob_1((fhg_0)fhg_02, hashSet)).sorted(bob_1.iQx).forEach(bob_12 -> this.iRU.put(bob_12.dBc(), (bob_1)bob_12));
        this.u(iRy);
    }

    public void dBk() {
        this.u(iRI, iRP, iRQ);
    }

    @NotNull
    public bol_0 dBl() {
        return this.iSc;
    }

    public final void dBm() {
        bol_0 bol_02 = this.iRW.aJG() ? (this.iRY.aJG() ? bol_0.iSe : bol_0.iSh) : (this.iRY.aJG() ? bol_0.iSf : (this.iRW.equals(this.iRY) ? bol_0.iSi : bol_0.iSh));
        this.a(bol_02);
    }

    public void dBn() {
        if (!this.dBo()) {
            return;
        }
        this.a(bol_0.iSg);
    }

    private void a(bol_0 bol_02) {
        if (bol_02 == this.iSc) {
            return;
        }
        this.iSc = bol_02;
        this.u(iRx, iRw);
    }

    private boolean dBo() {
        if (bok_0.dBB()) {
            return false;
        }
        if (cui_1.eRA()) {
            return true;
        }
        return this.iRW.aJG();
    }

    public void c(bob_1 bob_12) {
        if (this.iRY.dBc() == bob_12.dBc()) {
            this.dBm();
        } else {
            ffV ffV2 = cui_1.eRw().dBU();
            fhg_0 fhg_02 = fhh_0.spN.VC(bob_12.dBc());
            int n = fhg_02.VA(ffV2.cmL());
            int n2 = this.iRY.tL() == 0 ? 1 : this.iRY.tL();
            this.b(fho_0.fT(bob_12.dBc(), Math.min(n2, n)));
            this.u(iRR);
        }
    }

    private void dBp() {
        this.iRZ = boo_1.a(this.iRY, bok_0.a(this.iRY));
    }

    private static boolean a(fho_0 fho_02) {
        Optional<fhg_0> optional = fho_02.fYW();
        if (optional.isEmpty()) {
            return false;
        }
        ffS[] ffSArray = cui_1.eRw().dBU().fWi().fZq();
        return Arrays.stream(ffSArray).anyMatch(ffS2 -> ((fhg_0)optional.get()).fYF().contains(ffS2));
    }

    private void b(@NotNull fho_0 fho_02) {
        this.iSa.add(this.iRY);
        this.iRY = fho_02;
        this.dBm();
        this.dBp();
        this.iSb.run();
    }

    public void dBq() {
        if (this.iSa.isEmpty()) {
            return;
        }
        this.iRY = this.iSa.removeLast();
        this.dBm();
        this.dBp();
        this.u(iRR);
    }

    public int dBr() {
        return fhk_0.a(this.iRW, this.iRY);
    }

    public void dBs() {
        this.b(fho_0.sqd);
        this.u(iRR);
    }

    public void dBt() {
        this.b(this.iRW);
        this.u(iRR);
    }

    public boolean dBu() {
        return !this.iRW.equals(this.iRY);
    }

    public void a(@Nullable boj_0 boj_02) {
        if (this.iRV == boj_02) {
            return;
        }
        this.iRV = boj_02;
        this.u(iRy, iRD, iRz);
    }

    private boolean dBv() {
        if (cui_1.eRA()) {
            return true;
        }
        if (bok_0.dBB()) {
            return false;
        }
        return this.iRY.tL() > this.iRW.tL();
    }

    private boolean dBw() {
        if (bok_0.dBB()) {
            return false;
        }
        if (this.iRY.fZa()) {
            return false;
        }
        ffV ffV2 = cui_1.eRw().dBU();
        OptionalInt optionalInt = this.iRY.fZb();
        return optionalInt.isPresent() && optionalInt.getAsInt() <= ffV2.cmL();
    }

    public void dBx() {
        if (!this.dBw()) {
            return;
        }
        this.b(this.iRY.VJ(this.iRY.tL() + 1));
        this.u(iRS);
    }

    public void dBy() {
        if (!this.dBw()) {
            return;
        }
        OptionalInt optionalInt = this.iRY.fYZ();
        OptionalInt optionalInt2 = this.iRY.VK(cui_1.eRw().dBU().cmL());
        int n = Math.min(optionalInt.orElse(Integer.MAX_VALUE), optionalInt2.orElse(Integer.MAX_VALUE));
        if (n == Integer.MAX_VALUE) {
            return;
        }
        this.b(this.iRY.VJ(n));
        this.u(iRS);
    }

    public void dBz() {
        if (bok_0.dBB()) {
            return;
        }
        if (cui_1.eRA()) {
            this.dBs();
        } else {
            this.b(this.iRY.VJ(this.iRW.tL()));
            this.u(iRS);
        }
    }

    public void dBA() {
        if (!this.dBv()) {
            return;
        }
        if (this.iRY.tL() == 1) {
            this.dBs();
            return;
        }
        OptionalInt optionalInt = this.iRY.VK(cui_1.eRw().dBU().cmL());
        int n = optionalInt.isPresent() ? Math.min(optionalInt.getAsInt(), this.iRY.tL() - 1) : this.iRY.tL() - 1;
        this.b(this.iRY.VJ(n));
        this.u(iRS);
    }

    private static boolean dBB() {
        return aue_0.cVJ().cVK().djU() || aue_0.cVJ().cVK().fhv() == 24;
    }

    @Override
    public String[] bxk() {
        return iRR;
    }

    @NotNull
    @Generated
    public fho_0 dBC() {
        return this.iRW;
    }

    @NotNull
    @Generated
    public fho_0 dBD() {
        return this.iRY;
    }
}

