/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aEJ
 */
public interface aej_2 {
    public void f(String var1, Object var2);

    default public void a(aef_2 aef_22, @NotNull Collection<String> collection) {
        this.a(aef_22, collection.toArray(new String[0]));
    }

    public void a(aef_2 var1, String ... var2);
}

