/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fDo
 */
class fdo_1
extends frs_1 {
    final /* synthetic */ fdh_1 udM;

    fdo_1(fdh_1 fdh_12) {
        this.udM = fdh_12;
    }

    public boolean gsn() {
        return false;
    }

    private int z(boolean bl, boolean bl2) {
        int n = 0;
        if (bl2) {
            for (fcu_1 fcu_12 : this.udM.ucO) {
                n = Math.max(bl ? fcu_12.getMinSize().width : fcu_12.getMinSize().height, n);
            }
        } else {
            for (fcu_1 fcu_13 : this.udM.ucO) {
                n = Math.max(bl ? fcu_13.getPrefSize().width : fcu_13.getPrefSize().height, n);
            }
        }
        return n;
    }

    private int a(Iterable<fcu_1> iterable, boolean bl, boolean bl2) {
        int n = 0;
        if (bl2) {
            for (fcu_1 fcu_12 : iterable) {
                faw_2 faw_22;
                n += bl ? fcu_12.getMinSize().width : fcu_12.getMinSize().height;
                frz_1 frz_12 = this.udM.ucM.get(fcu_12);
                if (frz_12 == null || (faw_22 = this.udM.ucN.get(frz_12)) == null) continue;
                n += bl ? faw_22.getMinSize().width : faw_22.getMinSize().height;
            }
        } else {
            for (fcu_1 fcu_13 : iterable) {
                faw_2 faw_23;
                n += bl ? fcu_13.getPrefSize().width : fcu_13.getPrefSize().height;
                frz_1 frz_13 = this.udM.ucM.get(fcu_13);
                if (frz_13 == null || (faw_23 = this.udM.ucN.get(frz_13)) == null) continue;
                n += bl ? faw_23.getPrefSize().width : faw_23.getPrefSize().height;
            }
        }
        return n;
    }

    private boolean a(ArrayList<fcu_1> arrayList, int n, int n2, boolean bl) {
        this.udM.ucS.gsm();
        fcu_1 fcu_12 = null;
        int n3 = 0;
        int n4 = 0;
        for (fcu_1 fcu_13 : arrayList) {
            frz_1 frz_12 = this.udM.ucM.get(fcu_13);
            faw_2 faw_22 = frz_12 != null ? this.udM.ucN.get(frz_12) : null;
            int n5 = bl ? fcu_13.getPrefSize().width : fcu_13.getPrefSize().height;
            frz_1 frz_13 = this.udM.ucM.get(fcu_13);
            if (n3 < n || n4 > n2) {
                fcu_13.setVisible(false);
                if (faw_22 != null) {
                    faw_22.setVisible(false);
                }
            } else {
                fcu_13.setVisible(frz_13.isVisible());
                n4 += n5;
                if (faw_22 != null) {
                    if (n3 > n) {
                        faw_22.setVisible(frz_13.isVisible());
                        n4 += bl ? faw_22.getPrefSize().width : faw_22.getPrefSize().height;
                    } else {
                        faw_22.setVisible(false);
                    }
                }
                if (n4 > n2) {
                    fcu_12 = fcu_13;
                }
            }
            ++n3;
        }
        if (this.udM.uda != null) {
            if (fcu_12 != null && fcu_12 == this.udM.uda) {
                this.udM.ude = Math.min(this.udM.ucO.size() - 1, this.udM.ude + 1);
                return this.a(arrayList, this.udM.ude, n2, bl);
            }
            this.udM.uda = null;
        }
        return n4 <= n2;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12 = new fsm_1();
        ArrayList<fcu_1> arrayList = this.udM.ucO;
        switch (this.udM.ucW) {
            case tLq: 
            case tLr: {
                if (!arrayList.isEmpty()) {
                    fsm_12.setHeight(arrayList.get((int)0).getMinSize().height);
                }
                fsm_12.setWidth(Math.min(this.z(true, true), this.a(arrayList, true, true)));
                break;
            }
            case tLt: 
            case tLs: {
                if (!arrayList.isEmpty()) {
                    fsm_12.setWidth(arrayList.get((int)0).getMinSize().width);
                }
                fsm_12.setHeight(Math.min(this.z(false, true), this.a(arrayList, false, true)));
            }
        }
        return fsm_12;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12 = new fsm_1();
        ArrayList<fcu_1> arrayList = this.udM.ucO;
        switch (this.udM.ucW) {
            case tLq: 
            case tLr: {
                if (!arrayList.isEmpty()) {
                    fsm_12.setHeight(arrayList.get((int)0).getPrefSize().height);
                }
                fsm_12.setWidth(Math.min(this.z(true, false), this.a(arrayList, true, false)));
                break;
            }
            case tLt: 
            case tLs: {
                if (!arrayList.isEmpty()) {
                    fsm_12.setWidth(arrayList.get((int)0).getPrefSize().width);
                }
                fsm_12.setHeight(Math.min(this.z(false, false), this.a(arrayList, false, false)));
            }
        }
        return fsm_12;
    }

    @Override
    public void a(faw_2 faw_22) {
        this.udM.ucV = 0.0;
        int n = this.udM.uki.getContentWidth();
        int n2 = this.udM.uki.getContentHeight();
        ArrayList<fcu_1> arrayList = this.udM.getVisibleTabs();
        this.udM.uah.setSize(this.udM.uah.getPrefSize());
        this.udM.uai.setSize(this.udM.uai.getPrefSize());
        switch (this.udM.ucW) {
            case tLq: 
            case tLr: {
                this.udM.udf = n < this.a(arrayList, true, false);
                break;
            }
            case tLt: 
            case tLs: {
                boolean bl = this.udM.udf = n2 < this.a(arrayList, false, false);
            }
        }
        if (this.udM.udf) {
            this.udM.uah.setVisible(true);
            this.udM.uai.setVisible(true);
        } else {
            this.udM.uah.setVisible(false);
            this.udM.uai.setVisible(false);
        }
        boolean bl = true;
        switch (this.udM.ucW) {
            case tLq: 
            case tLr: {
                faw_2 faw_23;
                frz_1 frz_12;
                if (this.udM.udf) {
                    bl = this.a(this.udM.getVisibleTabs(), this.udM.ude, n - this.udM.uah.getWidth() - this.udM.uai.getHeight(), true);
                } else {
                    for (fcu_1 fcu_12 : this.udM.ucO) {
                        frz_12 = this.udM.ucM.get(fcu_12);
                        fcu_12.setVisible(frz_12.isVisible());
                        faw_23 = this.udM.ucN.get(frz_12);
                        if (faw_23 == null) continue;
                        faw_23.setVisible(frz_12.isVisible());
                    }
                }
                this.udM.ucS.setSize((int)this.udM.ucS.getPrefSize().getWidth(), (int)this.udM.ucS.getPrefSize().getHeight());
                this.udM.ucU.setSize(n - (this.udM.udf ? this.udM.uah.getWidth() + this.udM.uai.getHeight() : 0), (int)this.udM.ucS.getPrefSize().getHeight());
                this.udM.ucQ.setSize(n, this.udM.ucS.getHeight());
                this.udM.ucR.setSize(n, (int)this.udM.ucR.getPrefSize().getHeight());
                if (this.udM.ucP == null) break;
                this.udM.ucP.setSize(n, n2 - this.udM.ucS.getHeight() - this.udM.ucR.getHeight());
                break;
            }
            case tLt: 
            case tLs: {
                faw_2 faw_23;
                frz_1 frz_12;
                if (this.udM.udf) {
                    bl = this.a(this.udM.ucO, this.udM.ude, n2 - this.udM.uah.getHeight() - this.udM.uai.getHeight(), false);
                } else {
                    for (fcu_1 fcu_12 : this.udM.ucO) {
                        frz_12 = this.udM.ucM.get(fcu_12);
                        fcu_12.setVisible(frz_12.isVisible());
                        faw_23 = this.udM.ucN.get(frz_12);
                        if (faw_23 == null) continue;
                        faw_23.setVisible(frz_12.isVisible());
                    }
                }
                this.udM.ucS.setSize((int)this.udM.ucS.getPrefSize().getWidth(), (int)this.udM.ucS.getPrefSize().getHeight());
                this.udM.ucU.setSize((int)this.udM.ucS.getPrefSize().getWidth(), n2 - (this.udM.udf ? this.udM.uah.getHeight() + this.udM.uai.getHeight() : 0));
                this.udM.ucQ.setSize(this.udM.ucS.getWidth(), n2);
                this.udM.ucR.setSize((int)this.udM.ucR.getPrefSize().getWidth(), n2);
                if (this.udM.ucP == null) break;
                this.udM.ucP.setSize(n - this.udM.ucS.getWidth() - this.udM.ucR.getWidth(), n2);
            }
        }
        this.udM.uah.setEnabled(!bl);
        this.udM.uai.setEnabled(this.udM.ude != 0);
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        switch (this.udM.ucW) {
            case tLq: {
                n5 = n3 = this.udM.udh;
                n7 = n3;
                n6 = n4 = this.udM.uki.getContentHeight() - this.udM.ucS.getHeight() + this.udM.udi;
                n14 = n4;
                n12 = n4;
                n8 = n4 - this.udM.ucR.getHeight();
                if (this.udM.udf) {
                    if (this.udM.udc) {
                        if (this.udM.udb) {
                            n13 = n3;
                            n11 = n13 + this.udM.uai.getWidth();
                            n3 += this.udM.uai.getWidth() + this.udM.uah.getWidth();
                        } else {
                            n11 = this.udM.uki.getContentWidth() - this.udM.uah.getWidth();
                            n13 = n11 - this.udM.uai.getWidth();
                        }
                    } else {
                        n13 = n3;
                        n3 += this.udM.uai.getWidth();
                        n11 = this.udM.uki.getContentWidth() - this.udM.uah.getWidth();
                    }
                } else if (this.udM.ucX == fzY.tLz) {
                    n3 += (n - this.udM.ucS.getWidth()) / 2;
                } else if (this.udM.ucX != fzY.tLy) {
                    n3 += n - this.udM.ucS.getWidth();
                }
                n9 = 0;
                n10 = 0;
                break;
            }
            case tLr: {
                n5 = n3 = this.udM.udh;
                n7 = n3;
                n6 = n4 = this.udM.udi;
                n14 = n4;
                n12 = n4;
                n8 = n4 + this.udM.ucS.getHeight();
                if (this.udM.udf) {
                    if (this.udM.udc) {
                        if (this.udM.udb) {
                            n13 = n3;
                            n11 = n13 + this.udM.uai.getWidth();
                            n3 += this.udM.uai.getWidth() + this.udM.uah.getWidth();
                        } else {
                            n11 = this.udM.uki.getContentWidth() - this.udM.uah.getWidth();
                            n13 = n11 - this.udM.uai.getWidth();
                        }
                    } else {
                        n13 = n3;
                        n3 += this.udM.uai.getWidth();
                        n11 = this.udM.uki.getContentWidth() - this.udM.uah.getWidth();
                    }
                } else if (this.udM.ucX == fzY.tLz) {
                    n3 += (n - this.udM.ucS.getWidth()) / 2;
                } else if (this.udM.ucX != fzY.tLy) {
                    n3 += n - this.udM.ucS.getWidth();
                }
                n9 = 0;
                n10 = n8 + this.udM.ucR.getHeight();
                break;
            }
            case tLs: {
                n5 = n3 = this.udM.uki.getContentWidth() - this.udM.ucS.getWidth() + this.udM.udh;
                n13 = n3;
                n11 = n3;
                n6 = n4 = this.udM.udi;
                n8 = n4;
                n7 = n3 - this.udM.ucR.getWidth();
                if (this.udM.udf) {
                    if (this.udM.udc) {
                        if (this.udM.udb) {
                            n14 = this.udM.uki.getContentHeight() - this.udM.uai.getHeight();
                            n12 = n14 - this.udM.uah.getHeight();
                        } else {
                            n12 = n4;
                            n14 = this.udM.uah.getWidth();
                            n4 += this.udM.uai.getHeight() + this.udM.uah.getHeight();
                        }
                    } else {
                        n12 = n4;
                        n4 += this.udM.uah.getHeight();
                        n14 = this.udM.uki.getContentHeight() - this.udM.uai.getWidth();
                    }
                    this.udM.ucU.setLocation(n3, n4);
                    this.udM.ucV = (double)this.udM.ucS.getHeight() - this.udM.ucU.getHeight();
                    n4 = (int)((double)n4 - this.udM.ucV);
                } else if (this.udM.ucX == fzY.tLz) {
                    n4 += (n2 - this.udM.ucS.getHeight()) / 2;
                } else if (this.udM.ucX != fzY.tLw) {
                    n4 += n2 - this.udM.ucS.getHeight();
                }
                n9 = 0;
                n10 = 0;
                break;
            }
            case tLt: {
                n5 = n3 = this.udM.udh;
                n13 = n3;
                n11 = n3;
                n6 = n4 = this.udM.udi;
                n8 = n4;
                n7 = n3 + this.udM.ucS.getWidth();
                if (this.udM.udf) {
                    if (this.udM.udc) {
                        if (this.udM.udb) {
                            n14 = this.udM.uki.getContentHeight() - this.udM.uai.getHeight();
                            n12 = n14 - this.udM.uah.getHeight();
                        } else {
                            n12 = n4;
                            n14 = this.udM.uah.getWidth();
                            n4 += this.udM.uai.getHeight() + this.udM.uah.getHeight();
                        }
                    } else {
                        n12 = n4;
                        n4 += this.udM.uah.getHeight();
                        n14 = this.udM.uki.getContentHeight() - this.udM.uai.getWidth();
                    }
                    this.udM.ucU.setLocation(n3, n4);
                    this.udM.ucV = (double)this.udM.ucS.getHeight() - this.udM.ucU.getHeight();
                    n4 = (int)((double)n4 - this.udM.ucV);
                } else if (this.udM.ucX == fzY.tLz) {
                    n4 += (n2 - this.udM.ucS.getHeight()) / 2;
                } else if (this.udM.ucX != fzY.tLw) {
                    n4 += n2 - this.udM.ucS.getHeight();
                }
                n9 = n7 + this.udM.ucR.getWidth();
                n10 = 0;
            }
        }
        this.udM.ucS.setPosition(n3, n4);
        this.udM.ucQ.setPosition(n5, n6);
        this.udM.ucR.setPosition(n7, n8);
        this.udM.uah.setPosition(n11, n12);
        this.udM.uai.setPosition(n13, n14);
        if (this.udM.ucP != null) {
            this.udM.ucP.setPosition(n9, n10);
        }
    }
}

