/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fbM
 */
public class fbm_0
extends fbk_0 {
    public fbm_0(short s, short s2, int n, int n2, int n3) {
        super(s, s2, n, (byte)0, 0, n2, n3, true);
    }

    @Override
    public int Kp(int n) {
        return this.conn();
    }

    @Override
    public boolean Kq(int n) {
        return false;
    }

    @Override
    public int[] erP() {
        return Bv.auu;
    }

    @Override
    public boolean coy() {
        return true;
    }

    @Override
    public boolean erO() {
        return false;
    }

    @Override
    public boolean z(TObjectProcedure<fbv_0> tObjectProcedure) {
        return true;
    }
}

