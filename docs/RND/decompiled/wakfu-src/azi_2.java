/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from azi
 */
public class azi_2<T>
implements Iterable<T> {
    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new azi_1();
    }
}

