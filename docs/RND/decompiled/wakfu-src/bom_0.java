/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from boM
 */
public class bom_0
implements aeh_2 {
    public static final String iSl = "totalShardsCount";
    public static final String iSm = "allBonuses";
    public static final String iSn = "0";
    public static final String iSo = "1";
    public static final String iSp = "2";
    public static final String iSq = "3";
    public static final String iSr = "hasChanges";
    public static final String iSs = "validateChangesText";
    public static final String iSt = "canValidateChanges";
    public static final String iSu = "displayValidateButtonImage";
    public static final String[] iSv = new String[]{"totalShardsCount", "allBonuses", "0", "1", "2", "3", "hasChanges", "validateChangesText", "canValidateChanges", "displayValidateButtonImage"};
    private int iSw = 0;
    private final @Unmodifiable List<bok_0> iSx;
    private final List<Integer> iSy = new ArrayList<Integer>();

    public bom_0(@NotNull ffV ffV2) {
        if (ffV2.dXg()) {
            HashMap<Byte, fhn_0> hashMap = new HashMap<Byte, fhn_0>(ffV2.eAZ().dTS());
            for (byte by = 0; by < 4; by = (byte)(by + 1)) {
                if (hashMap.containsKey(by)) continue;
                hashMap.put(by, new fhn_0());
            }
            this.iSx = hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(entry -> new bok_0((fhn_0)entry.getValue(), () -> this.bz((Byte)entry.getKey()))).toList();
            this.iSx.forEach(bok_02 -> bok_02.x(ffV2));
        } else {
            this.iSx = Collections.emptyList();
        }
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iSl -> this.iSw;
            case iSm -> this.iSx;
            case iSn, iSo, iSp, iSq -> {
                if (this.iSx.isEmpty()) {
                    yield null;
                }
                yield this.iSx.get(Integer.parseInt(string));
            }
            case iSr -> this.dBJ();
            case iSs -> {
                if (aue_0.cVJ().cVK().djU()) {
                    yield aum_0.cWf().c("impossible.during.fight", new Object[0]);
                }
                if (aue_0.cVJ().cVK().fhv() == 24) {
                    yield aum_0.cWf().c("impossible.during.trade", new Object[0]);
                }
                int var4_4 = this.dBH();
                if (!this.dBJ()) {
                    yield aum_0.cWf().c("enchantment.validate.changes.no.changes", new Object[0]);
                }
                if (var4_4 == 0) {
                    yield aum_0.cWf().c("enchantment.validate.changes.free", new Object[0]);
                }
                if (var4_4 > 0) {
                    yield aum_0.cWf().c("enchantment.validate.changes.cost", var4_4);
                }
                yield aum_0.cWf().c("enchantment.validate.changes.gain", -var4_4);
            }
            case iSt -> this.dBI();
            case iSu -> this.dBI() && this.dBH() != 0;
            default -> null;
        };
    }

    public void dBG() {
        LU lU = new LU();
        fcI.a(bbs_2.xl(), (exP2, ffV2) -> {
            if (ffV2.acs() == 27083) {
                lU.nt(ffV2.bfd());
            }
            return true;
        });
        this.iSw = lU.aTn();
        fse_1.gFu().a((aef_2)this, iSl, iSt, iSu);
    }

    private int dBH() {
        return this.iSx.stream().mapToInt(bok_0::dBr).sum();
    }

    public boolean dBI() {
        if (aue_0.cVJ().cVK().djU()) {
            return false;
        }
        if (aue_0.cVJ().cVK().fhv() == 24) {
            return false;
        }
        return this.dBH() <= this.iSw && this.dBJ();
    }

    public boolean dBJ() {
        for (bok_0 bok_02 : this.iSx) {
            if (!bok_02.dBu()) continue;
            return true;
        }
        return false;
    }

    private void bz(byte by) {
        this.iSy.add(Integer.valueOf(by));
        this.dBK();
    }

    public void dBq() {
        if (this.iSy.isEmpty()) {
            return;
        }
        int n = this.iSy.removeLast();
        this.iSx.get(n).dBq();
        this.dBK();
    }

    private void dBK() {
        fse_1.gFu().a((aef_2)this, iSr, iSs, iSt, iSu);
    }

    @Override
    public String[] bxk() {
        return iSv;
    }

    @Generated
    public List<bok_0> dBL() {
        return this.iSx;
    }
}

