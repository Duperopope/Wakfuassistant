/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from amh
 */
public abstract class amh_1
implements Iterable<amp_2> {
    protected final List<amp_2> cHt = new ArrayList<amp_2>();

    public void a(amp_2 amp_22) {
        this.cHt.add(amp_22);
    }

    @Override
    @NotNull
    public Iterator<amp_2> iterator() {
        return this.cHt.iterator();
    }

    public anc_1 fi(String string) {
        for (amp_2 amp_22 : this.cHt) {
            if (!amp_22.fj(string)) continue;
            return amp_22.fi(string);
        }
        return null;
    }

    public abstract String bCT();
}

