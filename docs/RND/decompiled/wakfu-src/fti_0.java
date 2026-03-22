/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fti
 */
public final class fti_0
extends Record {
    private final int tfg;
    @NotNull
    private final ftn_0 tfh;
    private final int tfi;
    private final int tfj;
    private final int tfk;
    @NotNull
    private final ftp_0 tfl;
    @NotNull
    private final Set<VN> tfm;

    public fti_0(int n, @NotNull ftn_0 ftn_02, int n2, int n3, int n4, @NotNull ftp_0 ftp_02, @NotNull Set<VN> set) {
        this.tfg = n;
        this.tfh = ftn_02;
        this.tfi = n2;
        this.tfj = n3;
        this.tfk = n4;
        this.tfl = ftp_02;
        this.tfm = set;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fti_0.class, "id;definition;editorGroupId;x;y;initialState;lockedCell", "tfg", "tfh", "tfi", "tfj", "tfk", "tfl", "tfm"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fti_0.class, "id;definition;editorGroupId;x;y;initialState;lockedCell", "tfg", "tfh", "tfi", "tfj", "tfk", "tfl", "tfm"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fti_0.class, "id;definition;editorGroupId;x;y;initialState;lockedCell", "tfg", "tfh", "tfi", "tfj", "tfk", "tfl", "tfm"}, this, object);
    }

    public int cZa() {
        return this.tfg;
    }

    @NotNull
    public ftn_0 glJ() {
        return this.tfh;
    }

    public int glK() {
        return this.tfi;
    }

    public int bkP() {
        return this.tfj;
    }

    public int bkQ() {
        return this.tfk;
    }

    @NotNull
    public ftp_0 glL() {
        return this.tfl;
    }

    @NotNull
    public Set<VN> glM() {
        return this.tfm;
    }
}

