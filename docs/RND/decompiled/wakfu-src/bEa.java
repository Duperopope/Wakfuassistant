/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bEa
implements aeh_2 {
    public static final String jMc = "element";
    public static final String jMd = "selected";
    private final bmj_1 jMe;
    private boolean bWn;

    public bEa(bmj_1 bmj_12) {
        this.jMe = bmj_12;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jMc)) {
            return this.jMe;
        }
        if (string.equals(jMd)) {
            return this.bWn;
        }
        return null;
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, jMd);
    }

    public bmj_1 dRO() {
        return this.jMe;
    }

    public boolean bqr() {
        return this.bWn;
    }

    public boolean equals(Object object) {
        if (object instanceof eNd) {
            return object == this.jMe.dTh();
        }
        return super.equals(object);
    }
}

