/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class cAT {
    private final ArrayList<aix_2> mpM = new ArrayList();
    private int crT;

    cAT() {
    }

    public void b(@NotNull aix_2 aix_22) {
        this.mpM.add(aix_22);
        this.crT = this.mpM.size();
    }

    @Nullable
    public aix_2 eHa() {
        if (this.mpM.size() == 0) {
            return null;
        }
        if (this.crT == this.mpM.size()) {
            this.eHb();
            this.crT = 0;
        }
        aix_2 aix_22 = this.mpM.get(this.crT);
        ++this.crT;
        return aix_22;
    }

    private void eHb() {
        Collections.shuffle(this.mpM, GC.aNL());
    }
}

