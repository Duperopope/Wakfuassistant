/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class aeH {
    private static final Logger cnF = Logger.getLogger(aeH.class);
    private final TIntObjectHashMap<aeI> cnG = new TIntObjectHashMap();
    private String aCH;
    private static final aeH cnH = new aeH();

    public static aeH bwA() {
        return cnH;
    }

    private aeH() {
    }

    public String aLM() {
        return this.aCH;
    }

    public void en(String string) {
        this.aCH = string;
    }

    public void buq() {
        try {
            assert (this.aCH != null && !new File(this.aCH).isDirectory());
            apl_1 apl_12 = apl_1.dw(fo_0.by(this.aCH));
            this.a(apl_12);
            apl_12.close();
        }
        catch (IOException iOException) {
            cnF.error((Object)"", (Throwable)iOException);
        }
    }

    private void a(@NotNull apl_1 apl_12) {
        int n = apl_12.aIA();
        for (int i = 0; i < n; ++i) {
            aeI aeI2 = new aeI();
            aeI2.l(apl_12);
            if (this.cnG.put(aeI2.d(), (Object)aeI2) == null) continue;
            cnF.error((Object)("SoundBank already loaded : " + aeI2.d()));
        }
    }

    public void b(@NotNull fs_0 fs_02) {
        TIntObjectIterator tIntObjectIterator = this.cnG.iterator();
        fs_02.mz(this.cnG.size());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((aeI)tIntObjectIterator.value()).n(fs_02);
        }
    }

    public final aeI a(aeI aeI2) {
        assert (!this.cnG.contains(aeI2.d()));
        return (aeI)this.cnG.put(aeI2.d(), (Object)aeI2);
    }

    public final aeI sb(int n) {
        return (aeI)this.cnG.get(n);
    }

    public final void bwB() {
        this.cnG.clear();
    }
}

