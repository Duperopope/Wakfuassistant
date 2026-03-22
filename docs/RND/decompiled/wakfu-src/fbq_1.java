/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBq
 */
public class fbq_1
extends frs_1 {
    final /* synthetic */ fbo_2 tSw;

    public fbq_1(fbo_2 fbo_22) {
        this.tSw = fbo_22;
    }

    public boolean gsn() {
        return false;
    }

    @Override
    public fsm_1 getContentMinSize(faw_2 faw_22) {
        fsm_1 fsm_12 = this.tSw.tSq.isVisibleForLayout() ? this.tSw.tSq.getMinSize() : new fsm_1(0, 0);
        switch (this.tSw.tSo) {
            case tLq: 
            case tLr: {
                fsm_12.height += this.tSw.tSp.getMinSize().height;
                fsm_12.width = Math.max(fsm_12.width, this.tSw.tSp.getMinSize().width);
                break;
            }
            case tLs: 
            case tLt: {
                fsm_12.width += this.tSw.tSp.getMinSize().width;
                fsm_12.height = Math.max(fsm_12.height, this.tSw.tSp.getMinSize().height);
            }
        }
        return fsm_12;
    }

    @Override
    public fsm_1 getContentPreferedSize(faw_2 faw_22) {
        fsm_1 fsm_12 = this.tSw.tSq.isVisibleForLayout() ? this.tSw.tSq.getPrefSize() : new fsm_1(0, 0);
        switch (this.tSw.tSo) {
            case tLq: 
            case tLr: {
                fsm_12.height += this.tSw.tSp.getPrefSize().height;
                fsm_12.width = Math.max(fsm_12.width, this.tSw.tSp.getPrefSize().width);
                break;
            }
            case tLs: 
            case tLt: {
                fsm_12.width += this.tSw.tSp.getPrefSize().width;
                fsm_12.height = Math.max(fsm_12.height, this.tSw.tSp.getPrefSize().height);
            }
        }
        return fsm_12;
    }

    @Override
    public void a(faw_2 faw_22) {
        int n = faw_22.uki.getContentHeight();
        int n2 = faw_22.uki.getContentWidth();
        switch (this.tSw.tSo) {
            case tLq: {
                this.tSw.tSp.setSize(n2, this.tSw.tSp.getPrefSize().height);
                this.tSw.tSp.setPosition(0, n - this.tSw.tSp.getHeight());
                if (!this.tSw.tSq.isVisibleForLayout()) break;
                this.tSw.tSq.setSize(n2, n - this.tSw.tSp.getHeight());
                this.tSw.tSq.setPosition(0, 0);
                break;
            }
            case tLr: {
                this.tSw.tSp.setSize(n2, this.tSw.tSp.getPrefSize().height);
                this.tSw.tSp.setPosition(0, 0);
                if (!this.tSw.tSq.isVisibleForLayout()) break;
                this.tSw.tSq.setSize(n2, n - this.tSw.tSp.getHeight());
                this.tSw.tSq.setPosition(0, this.tSw.tSp.getHeight());
                break;
            }
            case tLt: {
                this.tSw.tSp.setSize(this.tSw.tSp.getPrefSize().width, n);
                this.tSw.tSp.setPosition(0, 0);
                if (!this.tSw.tSq.isVisibleForLayout()) break;
                this.tSw.tSq.setSize(n2 - this.tSw.tSp.getWidth(), n);
                this.tSw.tSq.setPosition(this.tSw.tSp.getWidth(), 0);
                break;
            }
            case tLs: {
                this.tSw.tSp.setSize(this.tSw.tSp.getPrefSize().width, n);
                this.tSw.tSp.setPosition(n2 - this.tSw.tSp.getWidth(), 0);
                if (!this.tSw.tSq.isVisibleForLayout()) break;
                this.tSw.tSq.setSize(n2 - this.tSw.tSp.getWidth(), n);
                this.tSw.tSq.setPosition(0, 0);
            }
        }
    }
}

