/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from eKG
 */
public class ekg_0
implements eki_0 {
    private static final Logger qDA = Logger.getLogger(ekg_0.class);
    public static final ekg_0 qDB = new ekg_0();

    protected ekg_0() {
    }

    @Override
    @NotNull
    public eka_0 i(@NotNull eKW eKW2) {
        qDA.warn((Object)String.format("[CRAFT] Learn craft (%s) inside default craft handler was called, craft handler is probably missing !", eKW2), (Throwable)new IllegalStateException());
        return eka_0.qCC;
    }

    @Override
    @NotNull
    public eka_0 k(@NotNull eKW eKW2) {
        qDA.warn((Object)String.format("[CRAFT] Unlearn craft (%s) inside default craft handler was called, craft handler is probably missing !", eKW2), (Throwable)new IllegalStateException());
        return eka_0.qCC;
    }

    @Override
    @NotNull
    public eka_0 fs(int n, int n2) {
        qDA.warn((Object)String.format("[CRAFT] Learn recipe (craftId : %s, recipeId : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
        return eka_0.qCC;
    }

    @Override
    @NotNull
    public Set<Integer> QD(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting recipes known (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return Collections.emptySet();
    }

    @Override
    public long D(int n, long l) {
        qDA.warn((Object)String.format("[CRAFT] Adding xp (craftId : %s, xp : %s) inside default craft handler was called, craft handler is probably missing !", n, l), (Throwable)new IllegalStateException());
        return 0L;
    }

    @Override
    public void QE(int n) {
        qDA.warn((Object)String.format("[CRAFT] Trigger sucess of plantation (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
    }

    @Override
    public void Y(int n, boolean bl) {
        qDA.warn((Object)String.format("[CRAFT] Trigger sucess of collect (craftId : %s, isGrossProduct : %s) inside default craft handler was called, craft handler is probably missing !", n, bl), (Throwable)new IllegalStateException());
    }

    @Override
    public void t(int n, short s) {
        qDA.warn((Object)String.format("[CRAFT] Trigger sucess of recipe ( craftId : %s, quantity : %d) inside default craft handler was called, craft handler is probably missing !", n, s), (Throwable)new IllegalStateException());
    }

    @Override
    public void QF(int n) {
        qDA.warn((Object)String.format("[CRAFT] Notify sucess of recipe (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
    }

    @Override
    public boolean tX(int n) {
        qDA.warn((Object)String.format("[CRAFT] Check if contains (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public short PG(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting level (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public double F(int n, long l) {
        qDA.warn((Object)String.format("[CRAFT] Getting percent level for xp (craftId : %s, xp : %s) inside default craft handler was called, craft handler is probably missing !", n, l), (Throwable)new IllegalStateException());
        return 0.0;
    }

    @Override
    public double QG(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting current percent level (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0.0;
    }

    @Override
    public long QH(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting next in xp (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0L;
    }

    @Override
    public long QI(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting xp (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0L;
    }

    @Override
    public int QJ(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting seed counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public int QK(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting gross resrouce collect counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public int QL(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting end resource collect counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public int QM(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting recipe counter (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public short QN(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting min level of craft service (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public boolean QO(int n) {
        qDA.warn((Object)String.format("[CRAFT] Getting if craft service is enabled (%s) inside default craft handler was called, craft handler is probably missing !", n), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean fym() {
        qDA.warn((Object)"[CRAFT] Getting if craft service is enabled inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public void lF(boolean bl) {
        qDA.warn((Object)String.format("[CRAFT] Set craft service enabled (%s) inside default craft handler was called, craft handler is probably missing !", bl), (Throwable)new IllegalStateException());
    }

    @Override
    public void Z(int n, boolean bl) {
        qDA.warn((Object)String.format("[CRAFT] Set craft service enabled (craftId : %s, enabled : %s) inside default craft handler was called, craft handler is probably missing !", n, bl), (Throwable)new IllegalStateException());
    }

    @Override
    public void fu(int n, int n2) {
        qDA.warn((Object)String.format("[CRAFT] Set craft service min level (craftId : %s, minLevel : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
    }

    @Override
    public @Unmodifiable @NotNull Set<Integer> fyp() {
        qDA.warn((Object)"[CRAFT] Getting known crafts inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return Collections.emptySet();
    }

    @Override
    public boolean fv(int n, int n2) {
        qDA.warn((Object)String.format("[CRAFT] Getting if recipe is known (craftId : %s, recipeId : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public @Unmodifiable @NotNull Map<ekb_0, ekd_0> qg() {
        qDA.warn((Object)"[CRAFT] Getting step fees inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return Collections.emptyMap();
    }

    @Override
    public boolean a(ekb_0 ekb_02, @Nullable ekd_0 ekd_02) {
        qDA.warn((Object)String.format("[CRAFT] Set step fee (step : %s, craftSteepFees : %s) inside default craft handler was called, craft handler is probably missing !", new Object[]{ekb_02, ekd_02}), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public void G(Map<ekb_0, ekd_0> map) {
        qDA.warn((Object)String.format("Set steps fees (stepFees : %s) inside default craft handler was called, craft handler is probably missing !", map), (Throwable)new IllegalStateException());
    }

    @Override
    public @Unmodifiable @NotNull Map<Integer, Integer> dyy() {
        qDA.warn((Object)"[CRAFT] Getting overridden fees inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return Collections.emptyMap();
    }

    @Override
    public boolean f(int n, @Nullable Integer n2) {
        qDA.warn((Object)String.format("[CRAFT] Set overridden fee (recipeId : %s, fee : %s) inside default craft handler was called, craft handler is probably missing !", n, n2), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public void H(@NotNull Map<Integer, Integer> map) {
        qDA.warn((Object)String.format("[CRAFT] Set overridden fees (overriddenFees : %s) inside default craft handler was called, craft handler is probably missing !", map), (Throwable)new IllegalStateException());
    }

    @Override
    public boolean fyq() {
        qDA.warn((Object)"[CRAFT] Getting value of fee for guild member inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean lG(boolean bl) {
        qDA.warn((Object)String.format("[CRAFT] Setting value of fee (hasFeeForGuild : %s) for guild member inside default craft handler was called, craft handler is probably missing !", bl), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean fyr() {
        qDA.warn((Object)"Getting value of steps fallthrough inside default craft handler was called, craft handler is probably missing !", (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public boolean lH(boolean bl) {
        qDA.warn((Object)String.format("Setting value of steps fallthrough (stepsFallthrough : %s) inside default craft handler was called, craft handler is probably missing !", bl), (Throwable)new IllegalStateException());
        return false;
    }

    @Override
    public int a(@NotNull eKR eKR2, boolean bl) {
        qDA.warn((Object)String.format("Getting value of fee for specific recipe (recipe : %s, hasSameGuild : %s) inside default craft handler was called, craft handler is probably missing !", eKR2, bl), (Throwable)new IllegalStateException());
        return 0;
    }

    @Override
    public void a(@NotNull ekz_0 ekz_02) {
        qDA.warn((Object)String.format("[CRAFT] Add following listener (%s) inside default craft handler was called, craft handler is probably missing !", ekz_02), (Throwable)new IllegalStateException());
    }

    @Override
    public void b(@NotNull ekz_0 ekz_02) {
        qDA.warn((Object)String.format("[CRAFT] Remove following listener (%s) inside default craft handler was called, craft handler is probably missing !", ekz_02), (Throwable)new IllegalStateException());
    }

    @Override
    public void a(@NotNull dt_2 dt_22, boolean bl) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is immutable, isn't implemented to allow loading from other structs");
    }

    @Override
    public void a(@NotNull gj_1 gj_12, boolean bl) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is immutable, isn't implemented to allow loading from other structs");
    }

    @Override
    public void a(@NotNull dn_2 dn_22, boolean bl) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is immutable, isn't implemented to allow loading from other structs");
    }

    @Override
    @NotNull
    public dt_2 fys() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public dz_2 fyt() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public ga_2 fyu() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public gj_1 fyv() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public dn_2 fyw() {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler is fallback, isn't implemented to allow loading inside other structs");
    }

    @Override
    @NotNull
    public Map<Integer, Short> fyx() {
        return Collections.emptyMap();
    }

    @NotNull
    public static eku_0 l(@NotNull eKW eKW2) {
        throw new UnsupportedOperationException("[CRAFT] Default craft handler isn't redacted to allow created craft");
    }
}

