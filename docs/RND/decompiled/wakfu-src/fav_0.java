/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from fav
 */
public class fav_0
implements fas_0 {
    private final fbk_0 rPx;
    private final long rPy;
    private final long rPz;
    private short ccg;
    private short cch;
    private int rPA;
    private final TLongObjectHashMap<fat_0> rPB;

    fav_0(fbk_0 fbk_02, long l, int n, long l2, short s, short s2) {
        this.rPx = fbk_02;
        this.rPy = l;
        this.rPA = n;
        this.rPz = l2;
        this.ccg = s;
        this.cch = s2;
        this.rPB = !this.rPx.coy() ? new TLongObjectHashMap() : new TLongObjectHashMap(0);
    }

    public fav_0(fbk_0 fbk_02, ui_2 ui_22) {
        this(fbk_02, ui_22.adP, ui_22.adT, ui_22.acT, ui_22.adR, ui_22.adS);
    }

    @Override
    public fbk_0 erN() {
        return this.rPx;
    }

    @Override
    public long Lx() {
        return this.rPy;
    }

    @Override
    public long fRi() {
        return this.rPz;
    }

    @Override
    public short bsM() {
        return this.ccg;
    }

    @Override
    public short bsN() {
        return this.cch;
    }

    @Override
    public void cY(short s) {
        this.ccg = s;
    }

    @Override
    public void cZ(short s) {
        this.cch = s;
    }

    @Override
    public boolean fRj() {
        return !this.rPB.isEmpty();
    }

    @Override
    public fat_0 rP(long l) {
        return (fat_0)this.rPB.get(l);
    }

    @Override
    public boolean z(TObjectProcedure<fat_0> tObjectProcedure) {
        return this.rPB.forEachValue(tObjectProcedure);
    }

    void a(fat_0 fat_02) {
        this.rPB.put(fat_02.Lx(), (Object)fat_02);
    }

    public void fQ(long l) {
        this.rPB.remove(l);
    }

    public List<fat_0> fRl() {
        return new ArrayList<fat_0>(this.rPB.valueCollection());
    }

    @Override
    public int fRk() {
        return this.rPA;
    }

    public void TM(int n) {
        this.rPA = n;
    }

    public String toString() {
        return "BuildingModel{m_definition=" + String.valueOf(this.rPx) + ", m_uid=" + this.rPy + ", m_creationDate=" + this.rPz + ", m_x=" + this.ccg + ", m_y=" + this.cch + ", m_equippedItemId=" + this.rPA + ", m_elements=" + this.rPB.size() + "}";
    }
}

