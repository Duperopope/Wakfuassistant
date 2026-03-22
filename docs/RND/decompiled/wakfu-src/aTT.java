/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import com.ankamagames.wakfu.client.console.command.debug.ListCharacterInfoCommand;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import java.util.ArrayList;

public class aTT
implements TLongObjectProcedure<bgy> {
    final /* synthetic */ TIntObjectHashMap gvK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public aTT(ListCharacterInfoCommand listCharacterInfoCommand, TIntObjectHashMap tIntObjectHashMap) {
        this.gvK = tIntObjectHashMap;
    }

    public boolean a(long l, bgy bgy2) {
        int n = bgy2.doV().cqy();
        ArrayList<bgy> arrayList = (ArrayList<bgy>)this.gvK.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<bgy>();
            this.gvK.put(n, arrayList);
        }
        arrayList.add(bgy2);
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bgy)object);
    }
}

