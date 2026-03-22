/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bES
implements aeh_2 {
    public static final String jRX = "shardStyle";
    public static final String jRY = "index";
    public static final String jRZ = "isSlotted";
    public static final String jSa = "shardLevelText";
    public static final String jSb = "shardBonusText";
    public static final String jSc = "shardDoubleBonusText";
    public static final String jSd = "canRemoveLevel";
    public static final String jSe = "canAddLevel";
    public static final String jSf = "addLevelTooltip";
    private static final @Unmodifiable Map<rd_0, aef_2> jSg;
    private static final String[] jSh;
    private final byte jSi;
    private final fhn_0 jSj;
    private final ffV jSk;
    private final Set<ffS> jSl;
    private int jSm;
    private rd_0 iQD;
    private int jSn;
    private fhg_0 jSo;
    private int jSp;
    private int eoY;
    private boolean jSq;

    public bES(byte by, fhn_0 fhn_02, @NotNull ffV ffV2) {
        this.jSi = by;
        this.jSj = fhn_02;
        this.jSk = ffV2;
        this.jSl = Sets.newHashSet((Object[])ffV2.fWi().fZq());
        this.jSm = fhn_02.air();
        this.iQD = fhn_02.dBe();
        this.jSn = fhn_02.dSU();
        this.dSS();
        this.dST();
        this.jSp = this.eoY;
    }

    @Override
    public String[] bxk() {
        return jSh;
    }

    public byte deO() {
        return this.jSi;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jRX)) {
            return bES.a(this.iQD, this.jSm > 0);
        }
        if (string.equals(jRY)) {
            return this.jSi;
        }
        if (string.equals(jRZ)) {
            return this.jSm > 0;
        }
        if (string.equals(jSa)) {
            if (this.jSo == null) {
                return "TODO";
            }
            if (this.jSo.Fq() == this.eoY) {
                return aum_0.cWf().c("maxLevel", new Object[0]);
            }
            Integer n = this.jSo.Fq() == this.eoY ? null : Integer.valueOf(this.jSo.Vx(this.eoY + 1));
            return aum_0.cWf().c("enchantment.shard.level.full", this.eoY, n);
        }
        if (string.equals(jSb)) {
            String string2;
            if (this.jSo == null) {
                return "TODO";
            }
            Optional<fhc_0> optional = this.dSW();
            if (optional.isEmpty()) {
                return "";
            }
            List<String> list = this.dSV();
            String string3 = string2 = list.isEmpty() ? "" : list.get(0);
            if (!this.jSq) {
                return string2;
            }
            return new ahv_2().ceC().e(awx_2.dnN).c(string2).ceL();
        }
        if (string.equals(jSc)) {
            if (this.jSo == null) {
                return "TODO";
            }
            return bof_0.a(this.jSo);
        }
        if (string.equals(jSd)) {
            bkb_0 bkb_02 = aue_0.cVJ().cVK().dps();
            if (bkb_02 == null || bkb_02.dsm() != 30) {
                return this.jSp < this.eoY;
            }
            return true;
        }
        if (string.equals(jSe)) {
            Optional<fhc_0> optional = this.dSW();
            if (optional.isEmpty()) {
                return false;
            }
            int n = optional.get().dSY().VB(this.eoY);
            return n >= 0 && n <= this.jSk.cmL();
        }
        if (string.equals(jSf)) {
            Optional<fhc_0> optional = this.dSW();
            if (optional.isEmpty()) {
                return null;
            }
            int n = optional.get().dSY().VB(this.eoY);
            if (n < 0) {
                return null;
            }
            return aum_0.cWf().c("required.level.custom", n);
        }
        return null;
    }

    private void dSS() {
        if (this.jSm > 0) {
            this.jSo = fhh_0.spN.VC(this.jSm);
            if (this.jSo == null) {
                return;
            }
            this.jSq = this.jSo.fYF().stream().anyMatch(this.jSl::contains);
        } else {
            this.jSo = null;
            this.jSq = false;
        }
    }

    private void dST() {
        if (this.jSo == null) {
            return;
        }
        this.eoY = this.jSo.Vz(this.jSn);
    }

    public int air() {
        return this.jSm;
    }

    public int dSU() {
        return this.jSn;
    }

    public int tL() {
        return this.eoY;
    }

    List<String> dSV() {
        Optional<fhc_0> optional = this.dSW();
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        return eMi.a(optional.get(), this.jSq, (short)(this.eoY > 0 ? this.eoY : 1)).fzQ();
    }

    private Optional<fhc_0> dSW() {
        return Optional.ofNullable(this.jSm <= 0 ? null : (Object)fgD.fXh().Vd(this.jSm));
    }

    public fhn_0 dSX() {
        return this.jSj;
    }

    public fhg_0 dSY() {
        return this.jSo;
    }

    @Nullable
    public static String a(@Nullable fjd fjd2, boolean bl) {
        if (fjd2 == null) {
            return null;
        }
        switch (fjd2) {
            case swB: {
                return "shardEmpty";
            }
            case swG: {
                return "shardPresent";
            }
            case swH: {
                return "shardAny";
            }
        }
        if (fjd2.gaH() != null) {
            return bES.a(fjd2.gaH(), bl);
        }
        return null;
    }

    @Nullable
    public static String a(rd_0 rd_02, boolean bl) {
        String string;
        if (rd_02 == null) {
            return null;
        }
        switch (rd_02) {
            case bjB: {
                string = "shardRed";
                break;
            }
            case bjC: {
                string = "shardGreen";
                break;
            }
            case bjD: {
                string = "shardBlue";
                break;
            }
            case bjE: {
                string = "shardWhite";
                break;
            }
            default: {
                return null;
            }
        }
        String string2 = bl ? "Full" : "Empty";
        return string + string2;
    }

    @NotNull
    public static Collection<aef_2> a(rd_0 ... rd_0Array) {
        ArrayList<aef_2> arrayList = new ArrayList<aef_2>();
        for (rd_0 rd_02 : rd_0Array) {
            aef_2 aef_22 = jSg.get(rd_02);
            if (aef_22 == null) continue;
            arrayList.add(aef_22);
        }
        return arrayList;
    }

    static {
        EnumMap<rd_0, aei_2> enumMap = new EnumMap<rd_0, aei_2>(rd_0.class);
        for (rd_0 rd_02 : rd_0.values()) {
            String string = bES.a(rd_02, false);
            if (string == null) continue;
            enumMap.put(rd_02, new aei_2(jRX, string));
        }
        jSg = Collections.unmodifiableMap(enumMap);
        jSh = new String[]{jRX, jRY, jRZ, jSa, jSb, jSc, jSd, jSe, jSf};
    }
}

