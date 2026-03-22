/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Iterator;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bWM
 */
class bwm_2
extends afk_1 {
    private static final afe_1[] luH = new afe_1[]{new afe_1("actionId", null, aff_2.dJy, false)};
    private static final afe_1[] luI = new afe_1[]{new afe_1("targetId", null, aff_2.dJy, false)};
    private static final String luJ = "getNextActionEffectArea";
    private static final String luK = "Permet de r?cup?rer la liste des cellules de la zone d'un effet";
    private final afw_2 luL;

    bwm_2(LuaState luaState, afw_2 afw_22) {
        super(luaState);
        this.luL = afw_22;
    }

    @Override
    public final String getName() {
        return luJ;
    }

    @Override
    public final afe_1[] bBg() {
        return luH;
    }

    @Override
    public afe_1[] bBh() {
        return luI;
    }

    @Override
    public void ss(int n) {
        int n2;
        byte by = eui_1.rsf.aJr();
        aft_2 aft_22 = this.luL.cQ(by, n2 = this.xp(0));
        if (!(aft_22 instanceof aWw)) {
            this.xC(0);
            return;
        }
        Iterable<int[]> iterable = bxa_2.b((aWw)((Object)aft_22));
        if (iterable == null) {
            this.xC(0);
            return;
        }
        Iterator<int[]> iterator = iterable.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            ++n3;
        }
        this.xC(n3);
        iterator = iterable.iterator();
        this.L.newTable();
        int n4 = 1;
        while (iterator.hasNext()) {
            int[] nArray = iterator.next();
            this.L.pushNumber((double)n4++);
            this.L.newTable();
            this.L.pushString("x");
            this.L.pushNumber((double)nArray[0]);
            this.L.setTable(-3);
            this.L.pushString("y");
            this.L.pushNumber((double)nArray[1]);
            this.L.setTable(-3);
            this.L.setTable(-3);
        }
        ++this.dHR;
    }

    @Override
    public String getDescription() {
        return luK;
    }
}

