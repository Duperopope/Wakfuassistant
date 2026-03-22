/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asX
 */
public class asx_2 {
    public static final asx_2 day = new asx_2();
    private asv_2 daz;
    private asw_2 daA;

    public void a(asv_2 asv_22, asw_2 asw_22) {
        this.daz = asv_22;
        this.daA = asw_22;
    }

    public ast_2 btu() {
        if (this.daz != null) {
            return this.daz.btu();
        }
        return null;
    }

    public void a(ast_2 ast_22) {
        if (this.daA != null) {
            this.daA.a(ast_22);
        }
    }

    public void b(ast_2 ast_22) {
        if (this.daA != null) {
            this.daA.b(ast_22);
        }
    }
}

