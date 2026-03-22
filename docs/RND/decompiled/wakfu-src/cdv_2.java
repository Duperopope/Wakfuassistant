/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cDV
 */
class cdv_2
implements ZJ {
    final /* synthetic */ fax_1 mUl;
    final /* synthetic */ ArrayList mUm;
    final /* synthetic */ ZC mUn;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cdv_2(fax_1 fax_12, ArrayList arrayList, ZC zC) {
        this.mUl = fax_12;
        this.mUm = arrayList;
        this.mUn = zC;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.mUl.setAnimName((String)this.mUm.get(1));
        this.mUn.b(this);
    }
}

