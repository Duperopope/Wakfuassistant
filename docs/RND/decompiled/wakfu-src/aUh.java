/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class aUh
implements TObjectProcedure<bKV> {
    final /* synthetic */ int gxl;
    final /* synthetic */ int gxm;
    final /* synthetic */ int gxn;
    final /* synthetic */ int gxo;
    final /* synthetic */ ArrayList gxp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public aUh(int n, int n2, int n3, int n4, ArrayList arrayList) {
        this.gxl = n;
        this.gxm = n2;
        this.gxn = n3;
        this.gxo = n4;
        this.gxp = arrayList;
    }

    public boolean e(bKV bKV2) {
        if (HideFightOccluders.a(bKV2, this.gxl, this.gxm, this.gxn, this.gxo)) {
            this.gxp.add(bKV2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((bKV)object);
    }
}

