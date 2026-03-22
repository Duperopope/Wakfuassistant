/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

public class fcr
implements TObjectProcedure<fas_0> {
    private final azg_1 rTC = new azg_1();
    private int oam;

    public boolean c(fas_0 fas_02) {
        this.rTC.dH(fak_0.i(fas_02));
        ++this.oam;
        return true;
    }

    public int fSx() {
        return this.oam;
    }

    public byte[] aKU() {
        return this.rTC.bTe();
    }

    public String toString() {
        return "SerializeBuilding{m_bb=" + String.valueOf(this.rTC) + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

