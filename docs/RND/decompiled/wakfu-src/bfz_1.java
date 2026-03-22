/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from bFz
 */
public class bfz_1
extends bfc_1
implements bfv_1 {
    private short jTE;
    private int jTF;

    public bfz_1(int n) {
        super(n);
    }

    @Override
    public void v(String[] stringArray) {
        this.jTE = Short.parseShort(stringArray[0]);
        this.jTF = Integer.parseInt(stringArray[1]);
    }

    @Override
    public boolean aR(ffV ffV2) {
        boolean bl = ewo_0.oBF.k(ewr_0.oDK);
        if (!bl) {
            return false;
        }
        return super.aR(ffV2);
    }

    @Override
    public boolean aQ(ffV ffV2) {
        this.jU(ffV2.LV());
        return true;
    }

    @Override
    public void clear() {
    }

    @Override
    public @Unmodifiable Collection<Integer> dTn() {
        return List.of(Integer.valueOf(this.jTF));
    }

    @Override
    public fgM dTl() {
        return fgM.skB;
    }
}

