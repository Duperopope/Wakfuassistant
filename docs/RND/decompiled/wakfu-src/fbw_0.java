/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from fbW
 */
public class fbw_0 {
    public static final fbw_0 rSQ = new fbw_0();
    private final Map<Short, fbk_0> rSR = new HashMap<Short, fbk_0>();
    private final Map<Short, fbu_0> rSS = new HashMap<Short, fbu_0>();
    private final Map<Short, fby_0> rST = new HashMap<Short, fby_0>();
    private final Map<Short, fcb_0> rSU = new HashMap<Short, fcb_0>();

    private fbw_0() {
    }

    public void j(fbk_0 fbk_02) {
        fbo_0.fSg();
        this.rSR.put(fbk_02.aIi(), fbk_02);
    }

    public fbk_0 eE(short s) {
        return this.rSR.get(s);
    }

    public void b(fbu_0 fbu_02) {
        fbo_0.fSg();
        this.rSS.put(fbu_02.fSj(), fbu_02);
    }

    public fbu_0 eF(short s) {
        return this.rSS.get(s);
    }

    public void g(fby_0 fby_02) {
        fbo_0.fSg();
        this.rST.put(fby_02.fSr(), fby_02);
    }

    public fby_0 eG(short s) {
        return this.rST.get(s);
    }

    public void c(fcb_0 fcb_02) {
        fbo_0.fSg();
        this.rSU.put(fcb_02.fRN(), fcb_02);
    }

    public fcb_0 eH(short s) {
        return this.rSU.get(s);
    }

    public @Unmodifiable List<fby_0> fSo() {
        return this.rST.values().stream().sorted(Comparator.comparingInt(fby_0::aYs)).toList();
    }

    public void S(TObjectProcedure<fcb_0> tObjectProcedure) {
        List<fcb_0> list = this.rSU.values().stream().sorted(new fbx_0()).toList();
        for (fcb_0 fcb_02 : list) {
            if (tObjectProcedure.execute((Object)fcb_02)) continue;
            return;
        }
    }

    public void T(TObjectProcedure<fbk_0> tObjectProcedure) {
        this.rSR.forEach((s, fbk_02) -> tObjectProcedure.execute(fbk_02));
    }

    void U(TObjectProcedure<fby_0> tObjectProcedure) {
        this.rST.forEach((s, fby_02) -> tObjectProcedure.execute(fby_02));
    }

    public @Unmodifiable List<fbu_0> h(fby_0 fby_02) {
        return this.rSS.values().stream().filter(fbu_02 -> fbu_02.coj() == fby_02.fSr()).sorted().toList();
    }
}

