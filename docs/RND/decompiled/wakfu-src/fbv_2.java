/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBv
 */
public class fbv_2
extends fdz_1 {
    public static final String TAG = "Label";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public String getStyleTag() {
        return "textWidget";
    }

    @Override
    public fzq getAppearance() {
        return (fzq)this.uki;
    }

    @Override
    public void aVI() {
        super.aVI();
        fzq fzq2 = fzq.checkOut();
        fzq2.setWidget(this);
        this.d(fzq2);
        this.setTextBuilder(new fgx_1(new fgi_2()));
        this.getTextBuilder().b(this);
        this.setMultiline(false);
    }
}

