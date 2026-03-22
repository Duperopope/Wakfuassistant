/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Th
 */
public class th_0<R extends tk_0>
implements Iterable<R> {
    private final Collection<R> bsn = new ArrayList<R>();

    public void f(R r) {
        this.bsn.add(r);
    }

    @Override
    @NotNull
    public Iterator<R> iterator() {
        return this.bsn.iterator();
    }

    public String toString() {
        return "LadderInitializeData{m_list=" + String.valueOf(this.bsn) + "}";
    }
}

