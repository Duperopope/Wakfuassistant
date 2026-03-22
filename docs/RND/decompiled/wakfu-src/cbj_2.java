/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cbJ
 */
public class cbj_2
implements aeh_2 {
    private static final String lKJ = "text";
    public static final String[] lKK = new String[]{"text"};
    private String bKP;

    @Override
    public String[] bxk() {
        return lKK;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "text": {
                return this.getText();
            }
        }
        return null;
    }

    public String getText() {
        return this.bKP;
    }

    public void setText(String string) {
        if (Objects.equals(string, this.bKP)) {
            return;
        }
        this.bKP = string;
        this.esr();
    }

    public void esr() {
        fse_1.gFu().a((aef_2)this, lKJ);
    }
}

