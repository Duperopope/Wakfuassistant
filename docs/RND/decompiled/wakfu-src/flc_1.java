/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fLc
 */
public class flc_1
extends flk_1 {
    public void setColor(axb_2 axb_22, fzs_0 fzs_02) {
        if (this.urc == null) {
            return;
        }
        switch (fzs_02) {
            case tKs: {
                this.urc.a(asg_2.cXt, axb_22);
                break;
            }
            case tKr: {
                this.urc.a(asg_2.cXr, axb_22);
                break;
            }
            case tKu: {
                this.urc.a(asg_2.cXs, axb_22);
                break;
            }
            case tKt: {
                this.urc.a(asg_2.cXq, axb_22);
                break;
            }
            default: {
                assert (false) : "We should never end here";
                break;
            }
        }
    }

    @Nullable
    public axb_2 a(fzs_0 fzs_02) {
        if (this.urc == null) {
            return null;
        }
        return switch (fzs_02) {
            case fzs_0.tKs -> this.urc.a(asg_2.cXt);
            case fzs_0.tKr -> this.urc.a(asg_2.cXr);
            case fzs_0.tKu -> this.urc.a(asg_2.cXs);
            case fzs_0.tKt -> this.urc.a(asg_2.cXq);
            default -> null;
        };
    }
}

