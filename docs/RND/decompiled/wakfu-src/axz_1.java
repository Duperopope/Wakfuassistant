/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import javax.swing.table.DefaultTableModel;

/*
 * Renamed from axZ
 */
class axz_1
implements TObjectProcedure<axw_1> {
    final /* synthetic */ DefaultTableModel drU;
    final /* synthetic */ float drV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    axz_1(axy_1 axy_12, DefaultTableModel defaultTableModel, float f2) {
        this.drU = defaultTableModel;
        this.drV = f2;
    }

    public boolean a(axw_1 axw_12) {
        this.drU.addRow(new Object[]{axw_12.getName(), (int)((float)axw_12.aIs() * this.drV), axw_12.bRI()});
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((axw_1)object);
    }
}

