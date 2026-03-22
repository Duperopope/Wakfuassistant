/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.List;

/*
 * Renamed from Et
 */
public class et_0 {
    private final fi_0 ayv;

    public et_0(fi_0 fi_02) {
        this.ayv = fi_02;
    }

    public void b(fp_0 fp_02) {
        try {
            List<fk_0> list = this.ayv.aIt();
            fp_02.k((short)list.size());
            for (fk_0 fk_02 : list) {
                fp_02.g((byte)fk_02.aKA().d());
                eu_0 eu_02 = ev_0.b(fk_02);
                if (eu_02 == null) continue;
                eu_02.b(fp_02);
            }
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite definitions", iOException);
        }
    }
}

