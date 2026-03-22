/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from caS
 */
public class cas_1
implements WW {
    private static final Logger lHN = LoggerFactory.getLogger(cas_1.class);
    @NotNull
    private final fsr_0 lHO = new cat_1(this);
    @NotNull
    final caq_1 lHP;
    private final caf_1 lHQ;
    @Nullable
    cav_1 lHH;

    cas_1(@NotNull caq_1 caq_12, long l) {
        this.lHP = caq_12;
        this.lHQ = new caf_1(aaa_0.brC().fF(l));
        this.lHH = null;
    }

    @Override
    public void a(adk adk2, aaa_0 aaa_02, acj_0 acj_02) {
        WV.bnj().a(adk2, aaa_02, acj_02);
    }

    @Override
    public void n(short s, short s2) {
        WV.bnj().n(s, s2);
        if (cap_1.erG().el(s, s2)) {
            this.O(s, s2);
        }
        for (VN vN : this.lHP.N(s, s2)) {
            wy_0 wy_02 = wa_0.aQ(vN.bkP(), vN.bkQ());
            if (wy_02 == null) {
                lHN.error("[Ranch] Could not find topology map at coordinates {}, {} in instance {}", new Object[]{s, s2, wa_0.bhh()});
                continue;
            }
            wy_02.b(vN.bkP(), vN.bkQ(), true);
        }
    }

    private void O(short s, short s2) {
        ewi ewi2 = this.lHP.ah(s, s2);
        wa_0.a(this.lHP.bhh(), s, s2, (short)0, ewi2);
    }

    @Override
    public void fz(long l) {
        this.lHQ.mI(l);
        this.lHP.y((TObjectProcedure<fam_0>)((TObjectProcedure)fam_02 -> {
            this.lHQ.a((caj_2)fam_02);
            return true;
        }));
        WV.bnj().a(l, this.lHQ);
        cao_1.a(this.lHO);
    }

    public void a(long l, @Nullable cav_1 cav_12) {
        this.lHH = cav_12;
        this.lHQ.a(l, cav_12, this.lHP);
        cas_1.erM();
    }

    public void a(cav_1 cav_12, @NotNull Set<VN> set) {
        this.lHQ.b(this.lHP);
        this.lHP.j(cav_12);
        this.lHQ.a(cav_12);
        set.forEach(vN -> this.O(vN.bkN(), vN.bkO()));
        cas_1.erM();
    }

    public void a(cav_1 cav_12) {
        this.lHQ.a(cav_12);
        cas_1.erM();
    }

    public void a(cau_1 cau_12) {
        this.lHQ.a(cau_12);
        cas_1.erM();
    }

    public void b(long l, @NotNull Set<VN> set) {
        this.lHP.uK(l);
        this.lHQ.a(l, this.lHO);
        set.forEach(vN -> this.O((short)vN.bkP(), (short)vN.bkQ()));
        cas_1.erM();
    }

    private static void erM() {
        WY.bnm().bnn();
        WY.bnm().a(1, (TShortObjectHashMap<short[]>)new TShortObjectHashMap());
    }

    @Override
    public boolean m(short s, short s2) {
        return WV.bnj().m(s, s2);
    }

    @Override
    public void clear() {
        WV.bnj().clear();
    }

    @Override
    public void fA(long l) {
        WV.bnj().fA(l);
    }

    void mG(long l) {
        this.lHQ.mG(l);
    }

    void mH(long l) {
        this.lHQ.mH(l);
    }
}

