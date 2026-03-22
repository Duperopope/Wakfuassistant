/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.debug.ListResourceInfoCommand;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class aTW
implements TObjectProcedure<ArrayList<bKV>> {
    final /* synthetic */ ArrayList gvQ;
    final /* synthetic */ ListResourceInfoCommand gvR;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public aTW(ListResourceInfoCommand listResourceInfoCommand, ArrayList arrayList) {
        this.gvR = listResourceInfoCommand;
        this.gvQ = arrayList;
    }

    public boolean c(ArrayList<bKV> arrayList) {
        this.gvQ.addAll(this.gvR.y(arrayList));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((ArrayList)object);
    }
}

