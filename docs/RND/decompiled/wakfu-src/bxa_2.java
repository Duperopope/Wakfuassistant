/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Iterator;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from bXa
 */
public final class bxa_2
extends bxo_2 {
    private static final String lvR = "getEffectArea";
    private static final String lvS = "Retourne un tableau contenant la liste des cellules (x,y) de l'aire d'effet de l'effet";
    private static final afe_1[] lvT = new afe_1[]{new afe_1("cells", null, aff_2.dJy, false), new afe_1("cells", null, aff_2.dJB, true)};

    public bxa_2(LuaState luaState, aWw aWw2) {
        super(luaState, aWw2);
    }

    @Override
    public String getName() {
        return lvR;
    }

    @Override
    public afe_1[] bBg() {
        return null;
    }

    @Override
    public afe_1[] bBh() {
        return lvT;
    }

    @Override
    public void ss(int n) {
        Iterable<int[]> iterable = bxa_2.b(this.lwK);
        if (iterable == null) {
            this.xC(0);
            return;
        }
        Iterator<int[]> iterator = iterable.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            iterator.next();
            ++n2;
        }
        this.xC(n2);
        iterator = iterable.iterator();
        this.L.newTable();
        int n3 = this.L.getTop();
        int n4 = 1;
        while (iterator.hasNext()) {
            int[] nArray = iterator.next();
            this.L.pushNumber((double)n4++);
            this.L.newTable();
            int n5 = this.L.getTop();
            this.L.pushString("x");
            this.L.pushNumber((double)nArray[0]);
            this.L.setTable(n5);
            this.L.pushString("y");
            this.L.pushNumber((double)nArray[1]);
            this.L.setTable(n5);
            this.L.setTable(n3);
        }
        ++this.dHR;
    }

    public static Iterable<int[]> b(aWw aWw2) {
        ero_0 ero_02 = aWw2.cXu();
        if (ero_02 == null) {
            return null;
        }
        enk_0 enk_02 = (enk_0)ero_02.bba();
        if (enk_02 == null) {
            return null;
        }
        aoh_1 aoh_12 = enk_02.aZS();
        if (aoh_12 == null) {
            return null;
        }
        acd_1 acd_12 = ero_02 instanceof eqc_0 ? ((eqc_0)ero_02).fFf() : ero_02.bbe();
        qu_0 qu_02 = ero_02.bbc();
        Iterable<int[]> iterable = qu_02 != null ? aoh_12.b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), qu_02.bcC(), qu_02.bcD(), acd_12.bdi(), qu_02.bcB()) : aoh_12.b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), acd_12.getX(), acd_12.getY(), acd_12.bdi());
        return iterable;
    }

    @Override
    public String getDescription() {
        return lvS;
    }
}

