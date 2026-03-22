/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eY
extends GeneratedMessageV3.Builder<eY>
implements fd_0 {
    private int an;
    private List<eP> oz = Collections.emptyList();
    private RepeatedFieldBuilderV3<eP, eR, fe_0> oG;
    private boolean oB = true;
    private List<eP> oD = Collections.emptyList();
    private RepeatedFieldBuilderV3<eP, eR, fe_0> oH;

    public static final Descriptors.Descriptor yE() {
        return eO.nM;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nN.ensureFieldAccessorsInitialized(eW.class, eY.class);
    }

    eY() {
        this.D();
    }

    eY(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (eW.aJ()) {
            this.yN();
            this.yT();
        }
    }

    public eY yF() {
        super.clear();
        if (this.oG == null) {
            this.oz = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.oG.clear();
        }
        this.oB = true;
        this.an &= 0xFFFFFFFD;
        if (this.oH == null) {
            this.oD = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
        } else {
            this.oH.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eO.nM;
    }

    public eW yD() {
        return eW.yC();
    }

    public eW yG() {
        eW eW2 = this.yH();
        if (!eW2.isInitialized()) {
            throw eY.newUninitializedMessageException((Message)eW2);
        }
        return eW2;
    }

    public eW yH() {
        eW eW2 = new eW(this);
        int n = this.an;
        int n2 = 0;
        if (this.oG == null) {
            if ((this.an & 1) != 0) {
                this.oz = Collections.unmodifiableList(this.oz);
                this.an &= 0xFFFFFFFE;
            }
            eW2.oz = this.oz;
        } else {
            eW2.oz = this.oG.build();
        }
        if ((n & 2) != 0) {
            n2 |= 1;
        }
        eW2.oB = this.oB;
        if (this.oH == null) {
            if ((this.an & 4) != 0) {
                this.oD = Collections.unmodifiableList(this.oD);
                this.an &= 0xFFFFFFFB;
            }
            eW2.oD = this.oD;
        } else {
            eW2.oD = this.oH.build();
        }
        eW2.an = n2;
        this.onBuilt();
        return eW2;
    }

    public eY yI() {
        return (eY)super.clone();
    }

    public eY bG(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eY)super.setField(fieldDescriptor, object);
    }

    public eY aq(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eY)super.clearField(fieldDescriptor);
    }

    public eY aq(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eY)super.clearOneof(oneofDescriptor);
    }

    public eY aq(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eY)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eY bH(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eY)super.addRepeatedField(fieldDescriptor, object);
    }

    public eY aq(Message message) {
        if (message instanceof eW) {
            return this.c((eW)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eY c(eW eW2) {
        if (eW2 == eW.yC()) {
            return this;
        }
        if (this.oG == null) {
            if (!eW2.oz.isEmpty()) {
                if (this.oz.isEmpty()) {
                    this.oz = eW2.oz;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.yJ();
                    this.oz.addAll(eW2.oz);
                }
                this.onChanged();
            }
        } else if (!eW2.oz.isEmpty()) {
            if (this.oG.isEmpty()) {
                this.oG.dispose();
                this.oG = null;
                this.oz = eW2.oz;
                this.an &= 0xFFFFFFFE;
                this.oG = eW.oB() ? this.yN() : null;
            } else {
                this.oG.addAllMessages(eW2.oz);
            }
        }
        if (eW2.yu()) {
            this.i(eW2.yv());
        }
        if (this.oH == null) {
            if (!eW2.oD.isEmpty()) {
                if (this.oD.isEmpty()) {
                    this.oD = eW2.oD;
                    this.an &= 0xFFFFFFFB;
                } else {
                    this.yP();
                    this.oD.addAll(eW2.oD);
                }
                this.onChanged();
            }
        } else if (!eW2.oD.isEmpty()) {
            if (this.oH.isEmpty()) {
                this.oH.dispose();
                this.oH = null;
                this.oD = eW2.oD;
                this.an &= 0xFFFFFFFB;
                this.oH = eW.fa() ? this.yT() : null;
            } else {
                this.oH.addAllMessages(eW2.oD);
            }
        }
        this.bH(eW.b(eW2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.yt(); ++n) {
            if (this.bI(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.yy(); ++n) {
            if (this.bK(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public eY cY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eW eW2 = null;
        try {
            eW2 = (eW)eW.oF.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eW2 = (eW)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eW2 != null) {
                this.c(eW2);
            }
        }
        return this;
    }

    private void yJ() {
        if ((this.an & 1) == 0) {
            this.oz = new ArrayList<eP>(this.oz);
            this.an |= 1;
        }
    }

    @Override
    public List<eP> yr() {
        if (this.oG == null) {
            return Collections.unmodifiableList(this.oz);
        }
        return this.oG.getMessageList();
    }

    @Override
    public int yt() {
        if (this.oG == null) {
            return this.oz.size();
        }
        return this.oG.getCount();
    }

    @Override
    public eP bI(int n) {
        if (this.oG == null) {
            return this.oz.get(n);
        }
        return (eP)this.oG.getMessage(n);
    }

    public eY a(int n, eP eP2) {
        if (this.oG == null) {
            if (eP2 == null) {
                throw new NullPointerException();
            }
            this.yJ();
            this.oz.set(n, eP2);
            this.onChanged();
        } else {
            this.oG.setMessage(n, (AbstractMessage)eP2);
        }
        return this;
    }

    public eY a(int n, eR eR2) {
        if (this.oG == null) {
            this.yJ();
            this.oz.set(n, eR2.xC());
            this.onChanged();
        } else {
            this.oG.setMessage(n, (AbstractMessage)eR2.xC());
        }
        return this;
    }

    public eY d(eP eP2) {
        if (this.oG == null) {
            if (eP2 == null) {
                throw new NullPointerException();
            }
            this.yJ();
            this.oz.add(eP2);
            this.onChanged();
        } else {
            this.oG.addMessage((AbstractMessage)eP2);
        }
        return this;
    }

    public eY b(int n, eP eP2) {
        if (this.oG == null) {
            if (eP2 == null) {
                throw new NullPointerException();
            }
            this.yJ();
            this.oz.add(n, eP2);
            this.onChanged();
        } else {
            this.oG.addMessage(n, (AbstractMessage)eP2);
        }
        return this;
    }

    public eY a(eR eR2) {
        if (this.oG == null) {
            this.yJ();
            this.oz.add(eR2.xC());
            this.onChanged();
        } else {
            this.oG.addMessage((AbstractMessage)eR2.xC());
        }
        return this;
    }

    public eY b(int n, eR eR2) {
        if (this.oG == null) {
            this.yJ();
            this.oz.add(n, eR2.xC());
            this.onChanged();
        } else {
            this.oG.addMessage(n, (AbstractMessage)eR2.xC());
        }
        return this;
    }

    public eY m(Iterable<? extends eP> iterable) {
        if (this.oG == null) {
            this.yJ();
            AbstractMessageLite.Builder.addAll(iterable, this.oz);
            this.onChanged();
        } else {
            this.oG.addAllMessages(iterable);
        }
        return this;
    }

    public eY yK() {
        if (this.oG == null) {
            this.oz = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.oG.clear();
        }
        return this;
    }

    public eY bM(int n) {
        if (this.oG == null) {
            this.yJ();
            this.oz.remove(n);
            this.onChanged();
        } else {
            this.oG.remove(n);
        }
        return this;
    }

    public eR bN(int n) {
        return (eR)this.yN().getBuilder(n);
    }

    @Override
    public fe_0 bJ(int n) {
        if (this.oG == null) {
            return this.oz.get(n);
        }
        return (fe_0)this.oG.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fe_0> ys() {
        if (this.oG != null) {
            return this.oG.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.oz);
    }

    public eR yL() {
        return (eR)this.yN().addBuilder((AbstractMessage)eP.xy());
    }

    public eR bO(int n) {
        return (eR)this.yN().addBuilder(n, (AbstractMessage)eP.xy());
    }

    public List<eR> yM() {
        return this.yN().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eP, eR, fe_0> yN() {
        if (this.oG == null) {
            this.oG = new RepeatedFieldBuilderV3(this.oz, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.oz = null;
        }
        return this.oG;
    }

    @Override
    public boolean yu() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean yv() {
        return this.oB;
    }

    public eY i(boolean bl) {
        this.an |= 2;
        this.oB = bl;
        this.onChanged();
        return this;
    }

    public eY yO() {
        this.an &= 0xFFFFFFFD;
        this.oB = true;
        this.onChanged();
        return this;
    }

    private void yP() {
        if ((this.an & 4) == 0) {
            this.oD = new ArrayList<eP>(this.oD);
            this.an |= 4;
        }
    }

    @Override
    public List<eP> yw() {
        if (this.oH == null) {
            return Collections.unmodifiableList(this.oD);
        }
        return this.oH.getMessageList();
    }

    @Override
    public int yy() {
        if (this.oH == null) {
            return this.oD.size();
        }
        return this.oH.getCount();
    }

    @Override
    public eP bK(int n) {
        if (this.oH == null) {
            return this.oD.get(n);
        }
        return (eP)this.oH.getMessage(n);
    }

    public eY c(int n, eP eP2) {
        if (this.oH == null) {
            if (eP2 == null) {
                throw new NullPointerException();
            }
            this.yP();
            this.oD.set(n, eP2);
            this.onChanged();
        } else {
            this.oH.setMessage(n, (AbstractMessage)eP2);
        }
        return this;
    }

    public eY c(int n, eR eR2) {
        if (this.oH == null) {
            this.yP();
            this.oD.set(n, eR2.xC());
            this.onChanged();
        } else {
            this.oH.setMessage(n, (AbstractMessage)eR2.xC());
        }
        return this;
    }

    public eY e(eP eP2) {
        if (this.oH == null) {
            if (eP2 == null) {
                throw new NullPointerException();
            }
            this.yP();
            this.oD.add(eP2);
            this.onChanged();
        } else {
            this.oH.addMessage((AbstractMessage)eP2);
        }
        return this;
    }

    public eY d(int n, eP eP2) {
        if (this.oH == null) {
            if (eP2 == null) {
                throw new NullPointerException();
            }
            this.yP();
            this.oD.add(n, eP2);
            this.onChanged();
        } else {
            this.oH.addMessage(n, (AbstractMessage)eP2);
        }
        return this;
    }

    public eY b(eR eR2) {
        if (this.oH == null) {
            this.yP();
            this.oD.add(eR2.xC());
            this.onChanged();
        } else {
            this.oH.addMessage((AbstractMessage)eR2.xC());
        }
        return this;
    }

    public eY d(int n, eR eR2) {
        if (this.oH == null) {
            this.yP();
            this.oD.add(n, eR2.xC());
            this.onChanged();
        } else {
            this.oH.addMessage(n, (AbstractMessage)eR2.xC());
        }
        return this;
    }

    public eY n(Iterable<? extends eP> iterable) {
        if (this.oH == null) {
            this.yP();
            AbstractMessageLite.Builder.addAll(iterable, this.oD);
            this.onChanged();
        } else {
            this.oH.addAllMessages(iterable);
        }
        return this;
    }

    public eY yQ() {
        if (this.oH == null) {
            this.oD = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.oH.clear();
        }
        return this;
    }

    public eY bP(int n) {
        if (this.oH == null) {
            this.yP();
            this.oD.remove(n);
            this.onChanged();
        } else {
            this.oH.remove(n);
        }
        return this;
    }

    public eR bQ(int n) {
        return (eR)this.yT().getBuilder(n);
    }

    @Override
    public fe_0 bL(int n) {
        if (this.oH == null) {
            return this.oD.get(n);
        }
        return (fe_0)this.oH.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fe_0> yx() {
        if (this.oH != null) {
            return this.oH.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.oD);
    }

    public eR yR() {
        return (eR)this.yT().addBuilder((AbstractMessage)eP.xy());
    }

    public eR bR(int n) {
        return (eR)this.yT().addBuilder(n, (AbstractMessage)eP.xy());
    }

    public List<eR> yS() {
        return this.yT().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eP, eR, fe_0> yT() {
        if (this.oH == null) {
            this.oH = new RepeatedFieldBuilderV3(this.oD, (this.an & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.oD = null;
        }
        return this.oH;
    }

    public final eY bG(UnknownFieldSet unknownFieldSet) {
        return (eY)super.setUnknownFields(unknownFieldSet);
    }

    public final eY bH(UnknownFieldSet unknownFieldSet) {
        return (eY)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bH(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bG(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bH(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aq(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aq(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aq(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bG(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.yF();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.yI();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bH(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aq(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.yF();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aq(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.yI();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bH(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bG(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bH(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aq(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aq(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aq(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bG(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.yI();
    }

    public /* synthetic */ Message buildPartial() {
        return this.yH();
    }

    public /* synthetic */ Message build() {
        return this.yG();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aq(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.yF();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.yI();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.yH();
    }

    public /* synthetic */ MessageLite build() {
        return this.yG();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.yF();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.yD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.yD();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cY(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.yI();
    }

    public /* synthetic */ Object clone() {
        return this.yI();
    }
}

