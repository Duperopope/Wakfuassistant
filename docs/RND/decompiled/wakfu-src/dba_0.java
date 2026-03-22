/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from dba
 */
public class dba_0
extends dae_0 {
    @NotNull
    private final bpr_1 odk;
    private final bug_0<bpb_1> odl;
    private final String[] odm;

    public dba_0(@NotNull bpr_1 bpr_12, bug_0<bpb_1> bug_02, String ... stringArray) {
        this.odk = bpr_12;
        this.odl = bug_02;
        this.odm = stringArray;
    }

    @NotNull
    public bpr_1 fax() {
        return this.odk;
    }

    public bug_0<bpb_1> fay() {
        return this.odl;
    }

    public String[] faz() {
        return this.odm;
    }

    @Override
    public int d() {
        return 18551;
    }
}

