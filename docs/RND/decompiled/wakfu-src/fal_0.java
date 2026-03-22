/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from faL
 */
class fal_0
implements TObjectProcedure<fat_0> {
    private final azg_1 rPT = new azg_1();
    private int rPU;

    fal_0() {
    }

    public boolean c(fat_0 fat_02) {
        ++this.rPU;
        this.rPT.dH(fak_0.b(fat_02));
        return true;
    }

    public azg_1 fRt() {
        return this.rPT;
    }

    public int getNumber() {
        return this.rPU;
    }

    public String toString() {
        return "SerializeBuildingElements{m_number=" + this.rPU + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fat_0)object);
    }
}

