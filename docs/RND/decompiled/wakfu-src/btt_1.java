/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from btT
 */
public class btt_1
implements aeh_2,
Comparable<btt_1> {
    public static final String jmH = "id";
    public static final String jmI = "name";
    public static final String jmJ = "isHero";
    public static final String jmK = "isMonster";
    public static final String jmL = "isCompanion";
    public static final String jmM = "isDead";
    public static final String jmN = "kamas";
    public static final String jmO = "loots";
    public static final String jmP = "plusLootText";
    public static final String jmQ = "hasLotOfLoots";
    public static final String jmR = "backgroundIllustration";
    public static final String jmS = "quantity";
    public static final String jmT = "isDownscaled";
    public static final String jmU = "displayedLevel";
    public static final String jmV = "popupLevelText";
    public static final String jmW = "gainedXp";
    public static final String jmX = "oldPercentLevel";
    public static final String jmY = "percentLevel";
    public static final String jmZ = "levelUp";
    public static final String jna = "popupXpText";
    public static final String jnb = "meritText";
    public static final String jnc = "rankingText";
    public static final String jnd = "rankName";
    private static final int jne = 8;
    private final Optional<jd_1> jnf;
    private final Optional<iz_2> jng;
    private final boolean jnh;
    private List<ffT> jni;
    private fpg_0 jnj;

    public btt_1(jd_1 jd_12, boolean bl) {
        this.jnf = Optional.of(jd_12);
        this.jng = Optional.empty();
        this.jnh = bl;
    }

    public btt_1(iz_2 iz_22, boolean bl) {
        this.jnf = Optional.empty();
        this.jng = Optional.of(iz_22);
        this.jnh = bl;
    }

    @Override
    public String[] bxk() {
        return new String[]{jmO, jmP, jmQ, jmS, jmV, jmW, jmX, jmZ, jna, jnb, jnc, jnd};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jmH.equals(string)) {
            return this.jng.map(iz_2::Sn).orElseGet(() -> this.jnf.map(jd_1::Sn).orElse(-1L));
        }
        if (jmI.equals(string)) {
            return this.jng.map(iz_22 -> aum_0.cWf().a(7, (long)iz_22.xT(), new Object[0])).orElseGet(() -> this.jnf.map(jd_1::getName).orElse(null));
        }
        if (jmJ.equals(string)) {
            return this.dmc();
        }
        if (jmK.equals(string)) {
            return this.jng.isPresent();
        }
        if (jmL.equals(string)) {
            return this.aXd();
        }
        if (jmM.equals(string)) {
            return this.jnf.isPresent() && this.jnf.get().Ta();
        }
        if (jmN.equals(string)) {
            return this.jnf.map(jd_1::SY).orElse(null);
        }
        if (jmO.equals(string)) {
            if (this.jni == null) {
                this.dIn();
            }
            if (this.jni.isEmpty()) {
                return null;
            }
            return this.jni;
        }
        if (jmP.equals(string)) {
            if (this.jni == null) {
                this.dIn();
            }
            if (this.jni.isEmpty()) {
                return null;
            }
            ahv_2 ahv_22 = new ahv_2();
            this.jni.forEach(ffT2 -> ahv_22.a(auc_0.cVq().zx(ffT2.aVt()), 32, 32, "west").ceC().aN(ffT2.bfd()).c("x ").ceu().ih(beo_0.e(ffT2.dwg())).c(ffT2.getName()).cev().ceH().ceD());
            return ahv_22.ceL();
        }
        if (jmQ.equals(string)) {
            return this.jni.size() > 8;
        }
        if (jmR.equals(string)) {
            if (this.jng.isPresent()) {
                bjz_1 bjz_12 = bja_1.drJ().bC((short)this.jng.get().xT());
                if (bjz_12 == null) {
                    return null;
                }
                int n = bjz_12.csk() == -1 ? bjz_12.aGs() : bjz_12.csk();
                return auc_0.cVq().zv(n);
            }
            return this.jnf.map(jd_12 -> auc_0.cVq().dd(jd_12.xT(), jd_12.SU() ? 0 : 1)).orElse(null);
        }
        if (jmS.equals(string)) {
            return this.jng.map(iz_2::oP).orElse(null);
        }
        if (jmT.equals(string)) {
            jx_1 jx_12 = this.Su();
            if (jx_12 == null) {
                return false;
            }
            return jx_12.VU() && jx_12.VV() > 0;
        }
        if (jmU.equals(string)) {
            jx_1 jx_13 = this.Su();
            if (jx_13 == null) {
                return null;
            }
            return jx_13.VU() && jx_13.VV() > 0 ? jx_13.VV() : jx_13.VT();
        }
        if (jmZ.equals(string)) {
            jx_1 jx_14 = this.Su();
            if (jx_14 == null) {
                return false;
            }
            return jx_14.VR() != jx_14.VT();
        }
        if (jmW.equals(string)) {
            jx_1 jx_15 = this.Su();
            if (jx_15 == null) {
                return Float.valueOf(1.0f);
            }
            return jx_15.VN();
        }
        if (jmX.equals(string)) {
            jx_1 jx_16 = this.Su();
            if (jx_16 == null) {
                return Float.valueOf(1.0f);
            }
            return Float.valueOf(mz_1.aVX.a((short)jx_16.VT(), jx_16.VL() - jx_16.VN()));
        }
        if (jmY.equals(string)) {
            jx_1 jx_17 = this.Su();
            if (jx_17 == null) {
                return Float.valueOf(1.0f);
            }
            return Float.valueOf(mz_1.aVX.a((short)jx_17.VT(), jx_17.VL()));
        }
        if (jna.equals(string)) {
            jx_1 jx_18 = this.Su();
            if (jx_18 == null) {
                return null;
            }
            if (jx_18.VT() == 245) {
                return aum_0.cWf().c("fight.report.maxLevelReached", new Object[0]);
            }
            long l = mz_1.aVX.nG(jx_18.VT() + 1);
            long l2 = jx_18.VN() - jx_18.VX();
            return aum_0.cWf().c("fight.report.gained.xp.popup", l - jx_18.VL(), l2);
        }
        if (jmV.equals(string)) {
            jx_1 jx_19 = this.Su();
            if (jx_19 == null) {
                return null;
            }
            if (!jx_19.VU()) {
                return null;
            }
            return aum_0.cWf().c("fight.report.downscaled.level.popup", jx_19.VT());
        }
        if (jnb.equals(string)) {
            if (this.jnj == null) {
                return null;
            }
            if (this.jnj.ghh() < 0) {
                return "-";
            }
            return btt_1.l(this.jnj.ghf(), this.jnj.ghe(), false);
        }
        if (jnc.equals(string)) {
            if (this.jnj == null) {
                return null;
            }
            if (this.jnj.ghh() < 0) {
                return "-";
            }
            return btt_1.l(this.jnj.ghh() + 1, this.jnj.ghg() + 1, true);
        }
        if (jnd.equals(string)) {
            if (this.jnj == null) {
                return null;
            }
            if (this.jnj.ghh() < 0) {
                return "-";
            }
            return aum_0.cWf().c("nation.pvpRank." + String.valueOf(this.jnj.ghj()), new Object[0]);
        }
        return null;
    }

    private void dIn() {
        this.jni = new ArrayList<ffT>();
        List list = this.jnf.map(jd_1::Sq).orElse(this.jng.map(iz_2::Sq).orElse(null));
        if (list == null) {
            return;
        }
        for (iv_2 iv_22 : list) {
            this.jni.add(new ffT(iv_22));
        }
        Collections.sort(this.jni);
    }

    @Nullable
    private jx_1 Su() {
        return this.jnf.map(jd_1::Su).orElse(this.jng.map(iz_2::Su).orElse(null));
    }

    public Optional<jd_1> dIo() {
        return this.jnf;
    }

    public Optional<iz_2> dIp() {
        return this.jng;
    }

    public long Sn() {
        return this.jnf.map(jd_1::Sn).orElse(0L);
    }

    public long Xi() {
        return this.jnf.map(jd_1::xl).orElse(this.jng.map(iz_2::Sp).orElse(0L));
    }

    public boolean dmc() {
        return this.jnf.map(jd_1::SW).orElse(false);
    }

    public boolean aXd() {
        return this.jng.map(iz_22 -> bmo_2.iEv.bE((short)iz_22.xT())).orElse(false);
    }

    private static String l(int n, int n2, boolean bl) {
        ahv_2 ahv_22 = new ahv_2();
        int n3 = bl ? n2 - n : n - n2;
        ahv_22.ceC().e(n3 < 0 ? awx_2.dnJ : awx_2.dnM);
        ahv_22.af(n3 >= 0 ? Character.valueOf('+') : "").yx(n3);
        String string = ahv_22.ceL();
        return aum_0.cWf().c("pvp.fightResult.scoreDeltaDescription", n, n3 != 0 ? string : null);
    }

    public void a(fpg_0 fpg_02) {
        this.jnj = fpg_02;
    }

    public void e(js_1 js_12) {
        if (this.jni == null) {
            this.jni = new ArrayList<ffT>();
        } else {
            this.jni.clear();
        }
        js_12.Sq().forEach(iv_22 -> this.jni.add(new ffT((iv_2)iv_22)));
    }

    public int a(@NotNull btt_1 btt_12) {
        long l = this.Xi();
        long l2 = btt_12.Xi();
        long l3 = aue_0.cVJ().cVO().xl();
        if (l == l3 && l2 != l) {
            return -1;
        }
        if (l2 == l3 && l != l2) {
            return 1;
        }
        if (l2 == l) {
            boolean bl = this.dmc();
            boolean bl2 = btt_12.dmc();
            if (bl && bl2) {
                return Long.compare(this.Sn(), btt_12.Sn());
            }
            if (bl && btt_12.aXd()) {
                return -1;
            }
            if (this.aXd() && bl2) {
                return 1;
            }
            if (bl2) {
                return -1;
            }
        }
        return Long.compare(l, l2);
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((btt_1)object);
    }
}

