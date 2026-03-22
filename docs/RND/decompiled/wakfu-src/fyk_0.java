/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyK
 */
public final class fyk_0
extends fys_0 {
    public static final String TAG = "AnimatedElementViewerAppearance";
    private boolean tCY;
    private boolean tCZ;
    public static final int tDa = -962590849;
    public static final int tDb = -735662143;
    public static final int tDc = -795787204;
    public static final int tDd = -1548407259;
    public static final int tDe = -1548407258;
    public static final int tDf = 109250890;
    public static final int tDg = "useDefaultMaterial".hashCode();
    public static final int tDh = -1122949950;
    public static final int tDi = -1290304399;
    public static final int tDj = 2129268483;
    private String tDk;
    private String bdC;
    private float aAx;
    private float aAy;
    private float azQ;
    private int eqA;
    private boolean tDl = true;

    @Override
    public String getTag() {
        return TAG;
    }

    public final String getFilePath() {
        return this.tDk;
    }

    public final void setFilePath(String string) {
        this.tDk = string;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setFilePath(string);
        }
    }

    public String getAnimName() {
        return this.bdC;
    }

    public void setAnimName(String string) {
        this.bdC = string;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setAnimName(this.bdC);
        }
    }

    public float getOffsetX() {
        return this.aAx;
    }

    public void setOffsetX(float f2) {
        this.aAx = f2;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setOffsetX(this.aAx);
        }
    }

    public float getOffsetY() {
        return this.aAy;
    }

    public void setOffsetY(float f2) {
        this.aAy = f2;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setOffsetY(this.aAy);
        }
    }

    public float getScale() {
        return this.azQ;
    }

    public void setScale(float f2) {
        this.azQ = f2;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setScale(this.azQ);
        }
    }

    public void setFlipHorizontal(boolean bl) {
        this.tCY = bl;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setFlipHorizontal(this.tCY);
        }
    }

    public void setFlipVertical(boolean bl) {
        this.tCZ = bl;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setFlipVertical(this.tCZ);
        }
    }

    public int getDirection() {
        return this.eqA;
    }

    public void setDirection(int n) {
        this.eqA = n;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setDirection(this.eqA);
        }
    }

    public void setUseBlendPremult(boolean bl) {
        this.tDl = bl;
        if (this.tCV != null) {
            this.getAnimatedElementViewer().setUseBlendPremult(this.tDl);
        }
    }

    public final fax_1 getAnimatedElementViewer() {
        return (fax_1)this.tCV;
    }

    @Override
    public final void setWidget(fes_2 fes_22) {
        super.setWidget(fes_22);
        fax_1 fax_12 = this.getAnimatedElementViewer();
        fax_12.setFilePath(this.tDk);
        fax_12.setAnimName(this.bdC);
        fax_12.setOffsetX(this.aAx);
        fax_12.setOffsetY(this.aAy);
        fax_12.setScale(this.azQ);
        fax_12.setFlipHorizontal(this.tCY);
        fax_12.setFlipVertical(this.tCZ);
        fax_12.setDirection(this.eqA);
        fax_12.setUseBlendPremult(this.tDl);
    }

    @Override
    public final void a(fhi_2 fhi_22) {
        fyk_0 fyk_02 = (fyk_0)fhi_22;
        super.a(fyk_02);
        if (this.tDk != null) {
            fyk_02.setFilePath(this.tDk);
            fyk_02.setAnimName(this.bdC);
            fyk_02.setOffsetX(this.aAx);
            fyk_02.setOffsetY(this.aAy);
            fyk_02.setScale(this.azQ);
            fyk_02.setFlipHorizontal(this.tCY);
            fyk_02.setFlipVertical(this.tCZ);
            fyk_02.setDirection(this.eqA);
            fyk_02.setUseBlendPremult(this.tDl);
        }
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -735662143) {
            this.setFilePath(string);
        } else if (n == -795787204) {
            this.setAnimName(string);
        } else if (n == -962590849) {
            this.setDirection(Bw.m(string));
        } else if (n == -1548407259) {
            this.setOffsetX(Bw.o(string));
        } else if (n == -1548407258) {
            this.setOffsetY(Bw.o(string));
        } else if (n == 109250890) {
            this.setScale(Bw.o(string));
        } else if (n == -1122949950) {
            this.setUseBlendPremult(Bw.aK(string));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Bw.aK(string));
        } else if (n == 2129268483) {
            this.setFlipVertical(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -735662143) {
            this.setFilePath((String)object);
        } else if (n == -795787204) {
            this.setAnimName((String)object);
        } else if (n == -962590849) {
            this.setDirection(Bw.m(object));
        } else if (n == -1548407259) {
            this.setOffsetX(Bw.o(object));
        } else if (n == -1548407258) {
            this.setOffsetY(Bw.o(object));
        } else if (n == 109250890) {
            this.setScale(Bw.o(object));
        } else if (n == -1122949950) {
            this.setUseBlendPremult(Bw.l(object));
        } else if (n == -1290304399) {
            this.setFlipHorizontal(Bw.l(object));
        } else if (n == 2129268483) {
            this.setFlipVertical(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

