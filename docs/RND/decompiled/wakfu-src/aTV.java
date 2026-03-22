/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.debug.ListResourceInfoCommand;
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

public class aTV
implements TObjectProcedure<bKV> {
    final /* synthetic */ int gvN;
    final /* synthetic */ int gvO;
    final /* synthetic */ TShortObjectHashMap gvP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public aTV(ListResourceInfoCommand listResourceInfoCommand, int n, int n2, TShortObjectHashMap tShortObjectHashMap) {
        this.gvN = n;
        this.gvO = n2;
        this.gvP = tShortObjectHashMap;
    }

    public boolean e(bKV bKV2) {
        int n = (int)aco_1.bn(bKV2.bcC() - this.gvN, bKV2.bcD() - this.gvO);
        if (n > 200) {
            return true;
        }
        short s = bKV2.eco().ghz();
        ArrayList<bKV> arrayList = (ArrayList<bKV>)this.gvP.get(s);
        if (arrayList == null) {
            arrayList = new ArrayList<bKV>();
            this.gvP.put(s, arrayList);
        }
        arrayList.add(bKV2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((bKV)object);
    }
}

