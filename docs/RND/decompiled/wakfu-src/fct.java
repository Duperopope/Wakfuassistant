/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

public class fct
implements TObjectProcedure<fao_0> {
    private int oam;
    private final azg_1 rTE = new azg_1();

    public boolean a(fao_0 fao_02) {
        this.rTE.dH(fak_0.g(fao_02));
        ++this.oam;
        return true;
    }

    public byte[] aKU() {
        return this.rTE.bTe();
    }

    public int fSx() {
        return this.oam;
    }

    public String toString() {
        return "SerializePartitions{m_bb=" + String.valueOf(this.rTE) + ", m_counter=" + this.oam + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fao_0)object);
    }
}

