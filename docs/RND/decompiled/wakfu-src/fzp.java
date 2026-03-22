/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class fzp
extends fzo {
    public static final String TAG = "textEditorPlusAppearance";
    @Nullable
    protected fsm_1 tFy;
    @Nullable
    protected fsm_1 tFz;
    public static final int tFA = 760645769;
    public static final int tFB = -1514408316;

    @Override
    public void setWidget(fes_2 fes_22) {
        super.setWidget(fes_22);
        if (fes_22 instanceof fdv_1) {
            fdv_1 fdv_12 = (fdv_1)fes_22;
            if (this.tFy != null) {
                fdv_12.setSearchButtonDisplaySize(this.tFy);
            }
            if (this.tFz != null) {
                fdv_12.setClearButtonDisplaySize(this.tFz);
            }
        }
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public void setSearchButtonDisplaySize(@Nullable fsm_1 fsm_12) {
        this.tFy = fsm_12;
        if (this.tCV != null && this.tCV instanceof fdv_1 && fsm_12 != null) {
            ((fdv_1)this.tCV).setSearchButtonDisplaySize(fsm_12);
        }
    }

    public void setClearButtonDisplaySize(@Nullable fsm_1 fsm_12) {
        this.tFz = fsm_12;
        if (this.tCV != null && this.tCV instanceof fdv_1 && fsm_12 != null) {
            ((fdv_1)this.tCV).setClearButtonDisplaySize(fsm_12);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tFy = null;
        this.tFz = null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzp fzp2 = (fzp)fhi_22;
        super.a(fzp2);
        fzp2.setSearchButtonDisplaySize(fzp2.tFy);
        fzp2.setClearButtonDisplaySize(fzp2.tFz);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 760645769: {
                this.setSearchButtonDisplaySize(fic_12.vn(string));
                return true;
            }
            case -1514408316: {
                this.setClearButtonDisplaySize(fic_12.vn(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 760645769: {
                this.setSearchButtonDisplaySize((fsm_1)object);
                return true;
            }
            case -1514408316: {
                this.setClearButtonDisplaySize((fsm_1)object);
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

