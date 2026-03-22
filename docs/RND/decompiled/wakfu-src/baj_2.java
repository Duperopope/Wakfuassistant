/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from baJ
 */
public class baj_2 {
    public static final baj_2 hzf = new baj_2();
    private static final Logger hzg = Logger.getLogger(baj_2.class);
    @Nullable
    private ekh_0 hzh = null;
    @Nullable
    private bmw_1 hzi = null;
    @NotNull
    private final Map<Long, eki_0> hzj = new HashMap<Long, eki_0>();
    @NotNull
    private final Map<Long, bmw_1> hzk = new HashMap<Long, bmw_1>();

    protected baj_2() {
    }

    @NotNull
    public Optional<eki_0> iJ(long l) {
        if (aue_0.cVJ().cVO().xl() == l) {
            if (this.hzh != null) {
                return Optional.of(this.hzh);
            }
            Optional optional = bbs_2.a(eva_1.owE);
            if (optional.isEmpty()) {
                hzg.error((Object)String.format("[CRAFT] CraftAccountData of current account %s can't be retrieved", l));
                return Optional.empty();
            }
            ekv_0 ekv_02 = (ekv_0)optional.get();
            eki_0 eki_02 = ekv_02.cZr();
            this.hzh = new ekh_0(eki_02);
            this.hzh.a(bmu_2.iBB);
            this.hzi = new bmw_1(l, this.hzh);
            fse_1.gFu().a((aef_2)aue_0.cVJ().cVK(), "craft");
            return Optional.of(this.hzh);
        }
        return Optional.ofNullable(this.hzj.getOrDefault(l, null));
    }

    public void cZq() {
        long l = aue_0.cVJ().cVO().xl();
        if (this.hzi == null) {
            return;
        }
        Optional optional = bbs_2.a(eva_1.owE);
        if (optional.isEmpty()) {
            hzg.error((Object)String.format("[CRAFT] CraftAccountData of current account %s can't be retrieved", l));
            return;
        }
        ekv_0 ekv_02 = (ekv_0)optional.get();
        eki_0 eki_02 = ekv_02.cZr();
        this.hzh.a(eki_02);
        this.hzi.clear();
    }

    @NotNull
    public Optional<bmw_1> iK(long l) {
        if (aue_0.cVJ().cVO().xl() == l) {
            if (this.hzi == null && this.iJ(l).isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(this.hzi);
        }
        return Optional.ofNullable(this.hzk.getOrDefault(l, null));
    }

    @NotNull
    public eki_0 iL(long l) {
        return this.iJ(l).orElse(ekg_0.qDB);
    }

    @NotNull
    public bmw_1 iM(long l) {
        return this.iK(l).orElse(new bmw_1(0L, ekg_0.qDB));
    }

    @NotNull
    public eki_0 cZr() {
        return this.iL(aue_0.cVJ().cVO().xl());
    }

    public void a(long l, @NotNull eki_0 eki_02) {
        if (aue_0.cVJ().cVO().xl() == l) {
            return;
        }
        this.hzj.put(l, eki_02);
        this.hzk.put(l, new bmw_1(l, eki_02));
    }

    public void iN(long l) {
        if (aue_0.cVJ().cVO().xl() == l) {
            return;
        }
        this.hzj.remove(l);
        this.hzk.remove(l);
    }

    public void cZs() {
        if (this.hzh != null) {
            this.hzh.b(bmu_2.iBB);
            this.hzh = null;
        }
        if (this.hzi != null) {
            this.hzi.dwB();
            this.hzi = null;
        }
    }
}

