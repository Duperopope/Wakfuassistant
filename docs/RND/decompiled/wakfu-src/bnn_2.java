/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bnN
 */
public class bnn_2
implements fnI {
    protected static final Logger iJV = Logger.getLogger(bnn_2.class);
    public static final bnn_2 iJW = new bnn_2();

    @Override
    public fnH a(fnn fnn2, uu_1 uu_12) {
        bCA bCA2 = (bCA)bcw_0.dQn().dw(uu_12.aes);
        if (bCA2 != null && bCA2 instanceof bDh) {
            bDh bDh2 = (bDh)((Object)bCA2);
            bDh2.a(fnn2);
            bDh2.b(uu_12);
            return bDh2;
        }
        iJV.error((Object)("Impossible de cr\u00e9er un RoomContent de templateId=" + uu_12.aes));
        return null;
    }
}

