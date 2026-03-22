/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from boz
 */
public class boz_0
implements aeh_2 {
    public static final String iPS = "similarItemsList";
    public static final String iPT = "itemToSacrifice";
    public static final String iPU = "currentAction";
    public static final String iPV = "addChargesDescriptionText";
    public static final String iPW = "selectableSlots";
    public static final String iPX = "selectedSlot";
    public static final String iPY = "selectedNewColor";
    public static final String iPZ = "canChangeToRed";
    public static final String iQa = "canChangeToGreen";
    public static final String iQb = "canChangeToBlue";
    public static final String iQc = "canRunAction";
    public static final String iQd = "actionButtonText";
    public static final String iQe = "shortDescriptionText";
    public static final String[] iQf = new String[]{"similarItemsList", "itemToSacrifice", "currentAction", "addChargesDescriptionText", "selectableSlots", "selectedSlot", "canChangeToRed", "canChangeToGreen", "canChangeToBlue", "selectedNewColor", "canRunAction", "actionButtonText", "shortDescriptionText"};
    @NotNull
    private final bor_1 iQg;
    @Nullable
    private ffV iQh;
    @NotNull
    private rb_0 iQi;
    @NotNull
    private final List<bod_0> iQj;
    @Nullable
    private bod_0 iQk;
    @Nullable
    private rd_0 iQl;

    public boz_0(@NotNull ffV ffV2, @Nullable boz_0 boz_02) {
        this.iQg = new bor_1(ffV2, this::dAX);
        this.iQg.dCb();
        this.iQh = this.iQg.dCf().orElse(null);
        this.iQj = boz_0.r(ffV2);
        this.iQi = boz_02 != null ? boz_02.iQi : rb_0.bjq;
    }

    private static List<bod_0> r(@NotNull ffV ffV2) {
        if (!ffV2.dXg()) {
            return List.of();
        }
        return ffV2.eAZ().dTS().entrySet().stream().sorted(Map.Entry.comparingByKey()).map(entry -> {
            Byte by = (Byte)entry.getKey();
            fhn_0 fhn_02 = (fhn_0)entry.getValue();
            boe_0 boe_02 = fhn_02.dBe() == rd_0.bjE ? boe_0.iQU : (fhn_02.dSU() > 0 ? boe_0.iQT : (fhk_0.a(ffV2.eAZ(), by) ? boe_0.iQS : boe_0.iQR));
            return new bod_0(fhn_02, by.byteValue(), boe_02);
        }).toList();
    }

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    @NotNull
    public bor_1 dAW() {
        return this.iQg;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iPS, iPT, iPU, iPV, iPW, iPX, iPZ, iQa, iQb, iPY, iQc, iQd, iQe}, (Object)string2, n)) {
            case 0 -> this.iQg;
            case 1 -> this.iQh;
            case 2 -> this.iQi.ordinal();
            case 3 -> aum_0.cWf().c("enchantment.sacrifice.action.add.charges.description", (byte)7);
            case 4 -> this.iQj;
            case 5 -> this.iQk == null ? -1 : this.iQk.Lz();
            case 6 -> this.iQk != null && this.iQk.dBe() != rd_0.bjB;
            case 7 -> this.iQk != null && this.iQk.dBe() != rd_0.bjC;
            case 8 -> this.iQk != null && this.iQk.dBe() != rd_0.bjD;
            case 9 -> this.iQl == null ? rd_0.bjA.aJr() : this.iQl.aJr();
            case 10 -> this.dBa();
            case 11 -> {
                if (!cui_1.eRA()) {
                    yield null;
                }
                if (this.iQh == null) {
                    yield aum_0.cWf().c("enchantment.chose.sacrificed.item", new Object[0]);
                }
                switch (this.iQi) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case bjq: {
                        ffV var4_4 = cui_1.eRw().dBU();
                        if (var4_4 == null) {
                            yield null;
                        }
                        if (var4_4.dXg() && var4_4.eAZ().fYJ() > 0) {
                            yield aum_0.cWf().c("enchantment.sacrifice.button.remaining", new Object[0]);
                        }
                        yield aum_0.cWf().c("enchantment.sacrifice.button.ok", new Object[0]);
                    }
                    case bjr: {
                        ffV var4_5 = cui_1.eRw().dBU();
                        if (var4_5 == null) {
                            yield null;
                        }
                        if (var4_5.fVX() >= var4_5.dOg().cpA()) {
                            yield aum_0.cWf().c("enchantment.sacrifice.max.slot", new Object[0]);
                        }
                        yield aum_0.cWf().c("enchantment.sacrifice.button.ok", new Object[0]);
                    }
                    case bjs: 
                }
                if (this.iQk == null || this.iQk.dBf() != boe_0.iQR) {
                    yield aum_0.cWf().c("enchantment.sacrifice.chose.slot", new Object[0]);
                }
                if (this.iQl == null || this.iQl == this.iQk.dBe()) {
                    yield aum_0.cWf().c("enchantment.sacrifice.chose.color", new Object[0]);
                }
                yield aum_0.cWf().c("enchantment.sacrifice.button.ok", new Object[0]);
            }
            case 12 -> aum_0.cWf().c("enchantment.sacrifice.description", (byte)7);
            default -> null;
        };
    }

    public void a(@NotNull rb_0 rb_02) {
        this.iQi = rb_02;
        this.u(iPU, iQc, iQd);
    }

    private void dAX() {
        if (this.iQh != null && !this.iQg.G(this.iQh)) {
            this.s(null);
        }
    }

    public void s(@Nullable ffV ffV2) {
        this.iQh = ffV2;
        this.u(iPT, iQc, iQd);
    }

    public void dAY() {
        if (this.iQh == null || !this.iQg.G(this.iQh)) {
            this.s(this.iQg.dCf().orElse(null));
        }
    }

    public void ES(int n) {
        if (n != this.iQg.dCh()) {
            return;
        }
        this.iQg.dCb();
    }

    public void t(@NotNull ffV ffV2) {
        if (ffV2.avr() != this.iQg.dCh()) {
            return;
        }
        this.iQg.dCd();
        fse_1.gFu().a((aef_2)this, iPT);
    }

    @Nullable
    public ffV dAZ() {
        return this.iQh;
    }

    public void a(bod_0 bod_02) {
        if (bod_02 == this.iQk) {
            return;
        }
        this.iQk = bod_02;
        if (this.iQk != null && this.iQk.dBe() == this.iQl) {
            this.iQl = null;
        }
        this.u(iPX, iPZ, iQa, iQb, iPY, iQc, iQd);
    }

    public void b(rd_0 rd_02) {
        if (this.iQl == rd_02) {
            return;
        }
        this.iQl = rd_02;
        this.u(iPY, iQc, iQd);
    }

    public boolean dBa() {
        if (!cui_1.eRA()) {
            return false;
        }
        if (this.iQh == null) {
            return false;
        }
        ffV ffV2 = cui_1.eRw().dBU();
        if (ffV2 == null || !ffV2.dXg()) {
            return false;
        }
        if (ffV2.LV() == this.iQh.LV() || ffV2.acs() != this.iQh.acs()) {
            return false;
        }
        if (fgt.cG(this.iQh)) {
            return false;
        }
        return switch (this.iQi) {
            default -> throw new MatchException(null, null);
            case rb_0.bjq -> {
                if (ffV2.eAZ().fYJ() <= 0) {
                    yield true;
                }
                yield false;
            }
            case rb_0.bjr -> {
                if (ffV2.fVX() < ffV2.dOg().cpA()) {
                    yield true;
                }
                yield false;
            }
            case rb_0.bjs -> this.iQk != null && this.iQk.dBf() == boe_0.iQR && this.iQl != null && this.iQl != this.iQk.dBe();
        };
    }

    public cjw_0 dBb() {
        cjw_0 cjw_02 = new cjw_0(cui_1.eRw().dBU().LV(), this.iQi, this.iQh.LV());
        if (this.iQi == rb_0.bjs) {
            cjw_02.a((byte)this.iQk.Lz(), this.iQl);
        }
        return cjw_02;
    }

    @Override
    public String[] bxk() {
        return iQf;
    }
}

