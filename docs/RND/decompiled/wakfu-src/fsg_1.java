/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fSg
 */
public class fsg_1 {
    final fsi_1<fhi_2> vdn;
    Object aGT;
    @NotNull
    final fsh_1 vdo;

    protected fsg_1(fsi_1<fhi_2> fsi_12, Object object, @NotNull fsh_1 fsh_12) {
        this.vdn = fsi_12;
        this.vdn.a(this);
        this.aGT = this.vdn.getResultProvider() == null ? object : this.vdn.getResultProvider().getResult(object);
        this.vdo = fsh_12;
    }
}

