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

/*
 * Renamed from fb
 */
public final class fb_0
extends GeneratedMessageV3.Builder<fb_0>
implements fc_0 {
    private int an;
    private List<eS> oz = Collections.emptyList();
    private RepeatedFieldBuilderV3<eS, eU, eV> oG;
    private List<eS> oD = Collections.emptyList();
    private RepeatedFieldBuilderV3<eS, eU, eV> oH;

    public static final Descriptors.Descriptor za() {
        return eO.nQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eO.nR.ensureFieldAccessorsInitialized(eZ.class, fb_0.class);
    }

    fb_0() {
        this.D();
    }

    fb_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (eZ.el()) {
            this.yN();
            this.yT();
        }
    }

    public fb_0 zb() {
        super.clear();
        if (this.oG == null) {
            this.oz = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.oG.clear();
        }
        if (this.oH == null) {
            this.oD = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.oH.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eO.nQ;
    }

    public eZ yZ() {
        return eZ.yY();
    }

    public eZ zc() {
        eZ eZ2 = this.zd();
        if (!eZ2.isInitialized()) {
            throw fb_0.newUninitializedMessageException((Message)eZ2);
        }
        return eZ2;
    }

    public eZ zd() {
        eZ eZ2 = new eZ(this);
        int n = this.an;
        if (this.oG == null) {
            if ((this.an & 1) != 0) {
                this.oz = Collections.unmodifiableList(this.oz);
                this.an &= 0xFFFFFFFE;
            }
            eZ2.oz = this.oz;
        } else {
            eZ2.oz = this.oG.build();
        }
        if (this.oH == null) {
            if ((this.an & 2) != 0) {
                this.oD = Collections.unmodifiableList(this.oD);
                this.an &= 0xFFFFFFFD;
            }
            eZ2.oD = this.oD;
        } else {
            eZ2.oD = this.oH.build();
        }
        this.onBuilt();
        return eZ2;
    }

    public fb_0 ze() {
        return (fb_0)super.clone();
    }

    public fb_0 bI(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fb_0)super.setField(fieldDescriptor, object);
    }

    public fb_0 ar(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fb_0)super.clearField(fieldDescriptor);
    }

    public fb_0 ar(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fb_0)super.clearOneof(oneofDescriptor);
    }

    public fb_0 ar(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fb_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fb_0 bJ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fb_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public fb_0 ar(Message message) {
        if (message instanceof eZ) {
            return this.c((eZ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fb_0 c(eZ eZ2) {
        if (eZ2 == eZ.yY()) {
            return this;
        }
        if (this.oG == null) {
            if (!eZ2.oz.isEmpty()) {
                if (this.oz.isEmpty()) {
                    this.oz = eZ2.oz;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.yJ();
                    this.oz.addAll(eZ2.oz);
                }
                this.onChanged();
            }
        } else if (!eZ2.oz.isEmpty()) {
            if (this.oG.isEmpty()) {
                this.oG.dispose();
                this.oG = null;
                this.oz = eZ2.oz;
                this.an &= 0xFFFFFFFE;
                this.oG = eZ.cs() ? this.yN() : null;
            } else {
                this.oG.addAllMessages(eZ2.oz);
            }
        }
        if (this.oH == null) {
            if (!eZ2.oD.isEmpty()) {
                if (this.oD.isEmpty()) {
                    this.oD = eZ2.oD;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.yP();
                    this.oD.addAll(eZ2.oD);
                }
                this.onChanged();
            }
        } else if (!eZ2.oD.isEmpty()) {
            if (this.oH.isEmpty()) {
                this.oH.dispose();
                this.oH = null;
                this.oD = eZ2.oD;
                this.an &= 0xFFFFFFFD;
                this.oH = eZ.ju() ? this.yT() : null;
            } else {
                this.oH.addAllMessages(eZ2.oD);
            }
        }
        this.bJ(eZ.b(eZ2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.yt(); ++n) {
            if (this.bS(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.yy(); ++n) {
            if (this.bU(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fb_0 db(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eZ eZ2 = null;
        try {
            eZ2 = (eZ)eZ.oM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eZ2 = (eZ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eZ2 != null) {
                this.c(eZ2);
            }
        }
        return this;
    }

    private void yJ() {
        if ((this.an & 1) == 0) {
            this.oz = new ArrayList<eS>(this.oz);
            this.an |= 1;
        }
    }

    @Override
    public List<eS> yr() {
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
    public eS bS(int n) {
        if (this.oG == null) {
            return this.oz.get(n);
        }
        return (eS)this.oG.getMessage(n);
    }

    public fb_0 a(int n, eS eS2) {
        if (this.oG == null) {
            if (eS2 == null) {
                throw new NullPointerException();
            }
            this.yJ();
            this.oz.set(n, eS2);
            this.onChanged();
        } else {
            this.oG.setMessage(n, (AbstractMessage)eS2);
        }
        return this;
    }

    public fb_0 a(int n, eU eU2) {
        if (this.oG == null) {
            this.yJ();
            this.oz.set(n, eU2.ye());
            this.onChanged();
        } else {
            this.oG.setMessage(n, (AbstractMessage)eU2.ye());
        }
        return this;
    }

    public fb_0 d(eS eS2) {
        if (this.oG == null) {
            if (eS2 == null) {
                throw new NullPointerException();
            }
            this.yJ();
            this.oz.add(eS2);
            this.onChanged();
        } else {
            this.oG.addMessage((AbstractMessage)eS2);
        }
        return this;
    }

    public fb_0 b(int n, eS eS2) {
        if (this.oG == null) {
            if (eS2 == null) {
                throw new NullPointerException();
            }
            this.yJ();
            this.oz.add(n, eS2);
            this.onChanged();
        } else {
            this.oG.addMessage(n, (AbstractMessage)eS2);
        }
        return this;
    }

    public fb_0 a(eU eU2) {
        if (this.oG == null) {
            this.yJ();
            this.oz.add(eU2.ye());
            this.onChanged();
        } else {
            this.oG.addMessage((AbstractMessage)eU2.ye());
        }
        return this;
    }

    public fb_0 b(int n, eU eU2) {
        if (this.oG == null) {
            this.yJ();
            this.oz.add(n, eU2.ye());
            this.onChanged();
        } else {
            this.oG.addMessage(n, (AbstractMessage)eU2.ye());
        }
        return this;
    }

    public fb_0 o(Iterable<? extends eS> iterable) {
        if (this.oG == null) {
            this.yJ();
            AbstractMessageLite.Builder.addAll(iterable, this.oz);
            this.onChanged();
        } else {
            this.oG.addAllMessages(iterable);
        }
        return this;
    }

    public fb_0 zf() {
        if (this.oG == null) {
            this.oz = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.oG.clear();
        }
        return this;
    }

    public fb_0 bW(int n) {
        if (this.oG == null) {
            this.yJ();
            this.oz.remove(n);
            this.onChanged();
        } else {
            this.oG.remove(n);
        }
        return this;
    }

    public eU bX(int n) {
        return (eU)this.yN().getBuilder(n);
    }

    @Override
    public eV bT(int n) {
        if (this.oG == null) {
            return this.oz.get(n);
        }
        return (eV)this.oG.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends eV> ys() {
        if (this.oG != null) {
            return this.oG.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.oz);
    }

    public eU zg() {
        return (eU)this.yN().addBuilder((AbstractMessage)eS.ya());
    }

    public eU bY(int n) {
        return (eU)this.yN().addBuilder(n, (AbstractMessage)eS.ya());
    }

    public List<eU> yM() {
        return this.yN().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eS, eU, eV> yN() {
        if (this.oG == null) {
            this.oG = new RepeatedFieldBuilderV3(this.oz, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.oz = null;
        }
        return this.oG;
    }

    private void yP() {
        if ((this.an & 2) == 0) {
            this.oD = new ArrayList<eS>(this.oD);
            this.an |= 2;
        }
    }

    @Override
    public List<eS> yw() {
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
    public eS bU(int n) {
        if (this.oH == null) {
            return this.oD.get(n);
        }
        return (eS)this.oH.getMessage(n);
    }

    public fb_0 c(int n, eS eS2) {
        if (this.oH == null) {
            if (eS2 == null) {
                throw new NullPointerException();
            }
            this.yP();
            this.oD.set(n, eS2);
            this.onChanged();
        } else {
            this.oH.setMessage(n, (AbstractMessage)eS2);
        }
        return this;
    }

    public fb_0 c(int n, eU eU2) {
        if (this.oH == null) {
            this.yP();
            this.oD.set(n, eU2.ye());
            this.onChanged();
        } else {
            this.oH.setMessage(n, (AbstractMessage)eU2.ye());
        }
        return this;
    }

    public fb_0 e(eS eS2) {
        if (this.oH == null) {
            if (eS2 == null) {
                throw new NullPointerException();
            }
            this.yP();
            this.oD.add(eS2);
            this.onChanged();
        } else {
            this.oH.addMessage((AbstractMessage)eS2);
        }
        return this;
    }

    public fb_0 d(int n, eS eS2) {
        if (this.oH == null) {
            if (eS2 == null) {
                throw new NullPointerException();
            }
            this.yP();
            this.oD.add(n, eS2);
            this.onChanged();
        } else {
            this.oH.addMessage(n, (AbstractMessage)eS2);
        }
        return this;
    }

    public fb_0 b(eU eU2) {
        if (this.oH == null) {
            this.yP();
            this.oD.add(eU2.ye());
            this.onChanged();
        } else {
            this.oH.addMessage((AbstractMessage)eU2.ye());
        }
        return this;
    }

    public fb_0 d(int n, eU eU2) {
        if (this.oH == null) {
            this.yP();
            this.oD.add(n, eU2.ye());
            this.onChanged();
        } else {
            this.oH.addMessage(n, (AbstractMessage)eU2.ye());
        }
        return this;
    }

    public fb_0 p(Iterable<? extends eS> iterable) {
        if (this.oH == null) {
            this.yP();
            AbstractMessageLite.Builder.addAll(iterable, this.oD);
            this.onChanged();
        } else {
            this.oH.addAllMessages(iterable);
        }
        return this;
    }

    public fb_0 zh() {
        if (this.oH == null) {
            this.oD = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.oH.clear();
        }
        return this;
    }

    public fb_0 bZ(int n) {
        if (this.oH == null) {
            this.yP();
            this.oD.remove(n);
            this.onChanged();
        } else {
            this.oH.remove(n);
        }
        return this;
    }

    public eU ca(int n) {
        return (eU)this.yT().getBuilder(n);
    }

    @Override
    public eV bV(int n) {
        if (this.oH == null) {
            return this.oD.get(n);
        }
        return (eV)this.oH.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends eV> yx() {
        if (this.oH != null) {
            return this.oH.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.oD);
    }

    public eU zi() {
        return (eU)this.yT().addBuilder((AbstractMessage)eS.ya());
    }

    public eU cb(int n) {
        return (eU)this.yT().addBuilder(n, (AbstractMessage)eS.ya());
    }

    public List<eU> yS() {
        return this.yT().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eS, eU, eV> yT() {
        if (this.oH == null) {
            this.oH = new RepeatedFieldBuilderV3(this.oD, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.oD = null;
        }
        return this.oH;
    }

    public final fb_0 bI(UnknownFieldSet unknownFieldSet) {
        return (fb_0)super.setUnknownFields(unknownFieldSet);
    }

    public final fb_0 bJ(UnknownFieldSet unknownFieldSet) {
        return (fb_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bJ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bI(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bJ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ar(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ar(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ar(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bI(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.zb();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ze();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bJ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.db(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.ar(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.zb();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ar(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ze();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bJ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bI(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bJ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.ar(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.ar(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.ar(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bI(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.db(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ze();
    }

    public /* synthetic */ Message buildPartial() {
        return this.zd();
    }

    public /* synthetic */ Message build() {
        return this.zc();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.ar(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.zb();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.db(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ze();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.zd();
    }

    public /* synthetic */ MessageLite build() {
        return this.zc();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.zb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.yZ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.yZ();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.db(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ze();
    }

    public /* synthetic */ Object clone() {
        return this.ze();
    }
}

