/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bjs
 */
public class bjs_2
implements Comparable<bjs_2> {
    private static final int iok = -1;
    @NotNull
    private final bje_2 iol;
    private final int iom;

    bjs_2(@NotNull bje_2 bje_22, int n) {
        this.iol = bje_22;
        this.iom = n;
    }

    @NotNull
    public bje_2 dro() {
        return this.iol;
    }

    public String drp() {
        String string = "loot.client.criterion." + this.iol.name();
        return aum_0.cWf().c(string, this.iom);
    }

    public int a(@NotNull bjs_2 bjs_22) {
        int n = Integer.compare(this.iol.ordinal(), bjs_22.iol.ordinal());
        if (n != 0) {
            return n;
        }
        return Integer.compare(this.iom, bjs_22.iom);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bjs_2 bjs_22 = (bjs_2)object;
        return this.iom == bjs_22.iom && this.iol == bjs_22.iol;
    }

    public int hashCode() {
        return Objects.hash(this.iol, this.iom);
    }

    public String toString() {
        return "ClientLootCriterion{" + String.valueOf(this.iol) + (String)(this.iom == -1 ? "" : ", m_parameter=" + this.iom) + "}";
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bjs_2)object);
    }
}

