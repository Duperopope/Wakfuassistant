/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class foX
implements TObjectProcedure<TProtector> {
    final /* synthetic */ foV sNh;

    foX(foV foV2) {
        this.sNh = foV2;
    }

    public boolean g(TProtector TProtector) {
        for (foY foY2 : this.sNh.sNd) {
            try {
                foY2.i(TProtector);
            }
            catch (Exception exception) {
                foV.sNb.error((Object)("Exception lev\u00e9e lors du d\u00e9-enregitrement d'un protecteur ID=" + ((foP)TProtector).d()));
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.g((foP)object);
    }
}

