/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fJW
 */
public abstract class fjw_1
extends fjv_2
implements fku_2 {
    @Nullable
    private String uFg;
    public static final int uFh = 118259828;

    @Override
    public void c(fys_0 fys_02, @Nullable fys_0 fys_03) {
        if (fys_02 != null) {
            fys_02.b(this);
        }
        if (fys_03 != null) {
            fys_03.a(this);
        }
    }

    @Nullable
    public String getStateRelated() {
        fys_0 fys_02 = this.getAppearanceRelated();
        return fys_02 != null ? fys_02.getCurrentState() : null;
    }

    @Nullable
    public fzy_0 getAppearanceStateRelated() {
        String string = this.getStateRelated();
        return string != null ? fzy_0.valueOf(string) : null;
    }

    @Override
    public void aR(String string, String string2) {
        if (Objects.equals(string, string2)) {
            return;
        }
        this.gCJ();
    }

    @Nullable
    public String getValueSeparator() {
        return this.uFg;
    }

    public void setValueSeparator(@Nullable String string) {
        if (Objects.equals(this.uFg, string)) {
            return;
        }
        this.uFg = string;
        this.gCJ();
    }

    public List<String> getValues() {
        if (this.aGT == null) {
            return Collections.emptyList();
        }
        String string = String.valueOf(this.aGT);
        if (this.uFg == null) {
            return List.of(string);
        }
        return Arrays.asList(string.split(this.uFg));
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uFg = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjw_1 fjw_12 = (fjw_1)fhi_22;
        fjw_12.uFg = this.uFg;
        super.a(fhi_22);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 118259828: {
                this.setValueSeparator(string);
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 118259828: {
                this.setValueSeparator(object.toString());
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

