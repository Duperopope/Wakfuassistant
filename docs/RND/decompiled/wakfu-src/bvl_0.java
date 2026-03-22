/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.lang.runtime.SwitchBootstraps;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bvL
 */
public class bvl_0
implements aeh_2,
bvg_0,
Comparable<bvl_0> {
    public static final String jvl = "name";
    public static final String jvm = "iconUrl";
    public static final String jvn = "level";
    public static final String jvo = "isLeader";
    public static final String jvp = "stateStyle";
    public static final String jvq = "hpDescription";
    public static final String jvr = "hpPercentage";
    public static final String jvs = "owner";
    public static final String jvt = "isHeroLeader";
    public static final String jvu = "isLocalHeroLeader";
    public static final String jvv = "heroPosition";
    private final String[] jvw = new String[]{"name", "iconUrl", "level", "isLeader", "stateStyle", "hpDescription", "hpPercentage", "owner", "isHeroLeader", "isLocalHeroLeader", "heroPosition"};
    final exz_1 jvx;
    private final pu_0 jvy = new bvm_0(this);
    final /* synthetic */ bvk_0 jvz;

    bvl_0(bvk_0 bvk_02, exz_1 exz_12) {
        this.jvz = bvk_02;
        this.jvx = exz_12;
    }

    @Override
    public String[] bxk() {
        return this.jvw;
    }

    public void dKP() {
        bve_0.dKK().kN(this.Sn());
        fse_1.gFu().a((aef_2)this, jvm);
    }

    @Override
    public void a(awk_1 awk_12, String string) {
        if (awk_12 == null) {
            bvk_0.jvb.warn((Object)string);
            return;
        }
        fse_1.gFu().a((aef_2)this, jvm);
    }

    @Override
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{jvl, jvm, jvn, jvq, jvr, jvo, jvt, jvu, jvs, jvp, jvv}, (Object)string2, n)) {
            case 0 -> {
                String var4_4 = this.getName();
                yield var4_4;
            }
            case 1 -> {
                try {
                    String var4_5 = this.jvx.aXd() ? String.format(auc_0.cVq().bS("companionIconsPath"), this.jvx.aWP()) : String.format(auc_0.cVq().bS("breedPortraitIllustrationPath"), this.jvx.aWP() + String.valueOf(this.jvx.aWO()));
                    yield var4_5;
                }
                catch (fu_0 var5_23) {
                    bvk_0.jvb.error((Object)"PropertyException during getFieldValue for ICON_URL", (Throwable)var5_23);
                    Object var4_6 = null;
                    yield var4_6;
                }
            }
            case 2 -> {
                if (this.jvx.aXd()) {
                    String var4_7 = aum_0.cWf().c("partyList.MemberFormatedName", (short)Math.min(this.dKR(), this.jvx.cmL()));
                    yield var4_7;
                }
                short var5_24 = this.jvx.fPm();
                short var6_28 = this.jvx.cmL();
                if (!this.jvx.fPn() || this.jvx.fPm() == 0) {
                    String var4_8 = aum_0.cWf().c("partyList.MemberFormatedName", var6_28);
                    yield var4_8;
                }
                String var4_9 = aum_0.cWf().c("partyList.MemberDownscaledFormatedName", var5_24, var6_28);
                yield var4_9;
            }
            case 3 -> {
                ahv_2 var5_25 = new ahv_2();
                var5_25.c(aum_0.cWf().c("HPShort", new Object[0])).c(" : ");
                var5_25.yx(this.jvx.fmi()).c("/").yx(this.dKT());
                String var4_10 = var5_25.ceL();
                yield var4_10;
            }
            case 4 -> {
                Float var4_11 = Float.valueOf((float)this.jvx.fmi() / (float)this.jvx.fmj());
                yield var4_11;
            }
            case 5 -> {
                Boolean var4_12 = this.dKU();
                yield var4_12;
            }
            case 6 -> {
                Boolean var4_13 = this.dKQ();
                yield var4_13;
            }
            case 7 -> {
                Boolean var4_14 = this.jvx.aZj() == aue_0.cVJ().cVO().xl() && this.dKQ();
                yield var4_14;
            }
            case 8 -> {
                if (!this.jvx.aXd() && !this.jvx.dmc()) {
                    Object var4_15 = null;
                    yield var4_15;
                }
                bvl_0 var5_26 = this.dKS();
                if (var5_26 == null) {
                    Long var4_16 = this.jvx.aZj();
                    yield var4_16;
                }
                if (this.jvx.aXd()) {
                    String var4_17 = aum_0.cWf().c("companionOwnedBy", var5_26.getName());
                    yield var4_17;
                }
                String var4_18 = aum_0.cWf().c("heroOwnedBy", var5_26.getName());
                yield var4_18;
            }
            case 9 -> {
                String var4_19 = this.dKV();
                yield var4_19;
            }
            case 10 -> {
                Object var4_21;
                if (bvk_0.jvj == -1L || !this.jvz.a(this)) {
                    Object var4_20 = null;
                    yield var4_20;
                }
                long var5_27 = this.jvx.KU();
                int var7_29 = var5_27 == bvk_0.jvj ? 1 : (var5_27 == bvk_0.jvk ? 2 : 0);
                aUl var8_30 = (aUl)aUn.cUM().eu("switchHero" + var7_29);
                yield var4_21 = var8_30.eu("key");
            }
            default -> {
                String var4_22 = null;
                yield var4_22;
            }
        };
    }

    private boolean dKQ() {
        return !this.jvx.dmc() && !this.jvx.aXd();
    }

    private int dKR() {
        long l = this.jvx.aZj();
        short s = Short.MIN_VALUE;
        TLongObjectIterator tLongObjectIterator = this.jvz.jvf.iterator();
        while (tLongObjectIterator.hasNext()) {
            short s2;
            tLongObjectIterator.advance();
            bvl_0 bvl_02 = (bvl_0)tLongObjectIterator.value();
            if (bvl_02.jvx.aXd() || bvl_02.aZj() != l || (s2 = bvl_02.cmL()) <= s) continue;
            s = s2;
        }
        return s;
    }

    private bvl_0 dKS() {
        long l = this.jvx.aZj();
        bvl_0 bvl_02 = null;
        TLongObjectIterator tLongObjectIterator = this.jvz.jvf.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bvl_02 = (bvl_0)tLongObjectIterator.value();
            if (bvl_02.jvx.aXd() || bvl_02.jvx.dmc() || bvl_02.aZj() != l) continue;
            break;
        }
        return bvl_02;
    }

    private String getName() {
        if (this.jvx == null) {
            return "";
        }
        String string = this.jvx.getName();
        if (string == null) {
            return "";
        }
        return string;
    }

    public short cmL() {
        return this.jvx.cmL();
    }

    private int dKT() {
        return this.jvx.fmj() + this.jvx.fmj() * this.jvx.fml() / 100;
    }

    public boolean dKU() {
        return this.jvz.jvh == this;
    }

    private String dKV() {
        if (this.jvx.doP()) {
            return "partyStateDead";
        }
        if (this.jvx.fmm()) {
            return "partyStateInFight";
        }
        return null;
    }

    public void dKW() {
        fse_1.gFu().a((aef_2)this, jvp);
    }

    public long Sn() {
        return this.jvx.KU();
    }

    public long aZj() {
        return this.jvx.aZj();
    }

    public long aqZ() {
        return this.jvx.aqZ();
    }

    public String toString() {
        return this.getName();
    }

    public exz_1 dKX() {
        return this.jvx;
    }

    public boolean dcc() {
        return this.jvx.dcc();
    }

    public int b(@NotNull bvl_0 bvl_02) {
        if (this.jvz.jvh == null) {
            return -1;
        }
        if (this.Sn() == this.jvz.jvh.Sn()) {
            return -1;
        }
        if (bvl_02.Sn() == this.jvz.jvh.Sn()) {
            return 1;
        }
        long l = this.jvx.aZj();
        long l2 = bvl_02.aZj();
        long l3 = this.jvz.jvh.aZj();
        boolean bl = bvl_02.jvx.aXd();
        boolean bl2 = this.jvx.aXd();
        boolean bl3 = bvl_02.jvx.dmc();
        boolean bl4 = this.jvx.dmc();
        if (l == l2) {
            if (!bl4 && !bl2) {
                return -1;
            }
            if (!bl3 && !bl) {
                return 1;
            }
            if (bl4 && bl) {
                return -1;
            }
            if (bl3 && bl2) {
                return 1;
            }
            return this.jvx.KU() > bvl_02.Sn() ? -1 : 1;
        }
        if (l == l3) {
            return -1;
        }
        if (l2 == l3) {
            return 1;
        }
        return l > l2 ? 1 : -1;
    }

    public int dKY() {
        if (bvk_0.jvi == this.Sn()) {
            return 2;
        }
        if (bvk_0.jvj == this.Sn()) {
            return 1;
        }
        if (bvk_0.jvk == this.Sn()) {
            return 0;
        }
        return -1;
    }

    public void dKZ() {
        if (this.jvx == null) {
            return;
        }
        bgy bgy2 = bvz_0.ju(this.jvx.KU());
        if (bgy2 != null) {
            exf_2 exf_22 = bgy2.e(exx_2.rGi);
            exf_22.a(this.jvy);
            this.jvy.a(exf_22);
        }
        bve_0.dKK().a(this.jvx.KU(), this);
        bve_0.dKK().kN(this.jvx.KU());
    }

    public void dLa() {
        bgy bgy2 = bvz_0.ju(this.jvx.KU());
        if (bgy2 != null) {
            bgy2.e(exx_2.rGi).b(this.jvy);
        }
        bve_0.dKK().b(this.jvx.KU(), this);
    }

    public void dLb() {
        fse_1.gFu().a((aef_2)this, jvn);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.b((bvl_0)object);
    }
}

