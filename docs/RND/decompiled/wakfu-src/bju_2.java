/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bju
 */
public class bju_2
extends fiL {
    private static final Logger iop = Logger.getLogger(bju_2.class);
    @NotNull
    private List<bjs_2> ion = Collections.emptyList();
    private boolean eoN = false;

    public bju_2 A(int[] nArray) {
        this.ion = new ArrayList<bjs_2>(nArray.length);
        for (int i = 0; i < nArray.length; i += 2) {
            int n = nArray[i];
            bje_2 bje_22 = bje_2.Dw(n);
            if (bje_22 == null) {
                iop.error((Object)("Could not parse client criterion with id " + n));
                continue;
            }
            this.ion.add(new bjs_2(bje_22, nArray[i + 1]));
        }
        return this;
    }

    public bju_2 G(List<bjs_2> list) {
        this.ion = new ArrayList<bjs_2>(list);
        return this;
    }

    public bju_2 gn(boolean bl) {
        this.eoN = bl;
        return this;
    }

    @Override
    public fhv drr() {
        return new bjt_2(this);
    }

    @NotNull
    public List<bjs_2> drq() {
        return this.ion;
    }

    public boolean css() {
        return this.eoN;
    }
}

