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

public final class ib
extends GeneratedMessageV3.Builder<ib>
implements ig {
    private int an;
    private List<ic> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<ic, ie, if> jm;
    private int mj;

    public static final Descriptors.Descriptor Ln() {
        return hL.vG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vH.ensureFieldAccessorsInitialized(hZ.class, ib.class);
    }

    ib() {
        this.D();
    }

    ib(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (hZ.fa()) {
            this.oL();
        }
    }

    public ib Lo() {
        super.clear();
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.jm.clear();
        }
        this.mj = 0;
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return hL.vG;
    }

    public hZ Lm() {
        return hZ.Ll();
    }

    public hZ Lp() {
        hZ hZ2 = this.Lq();
        if (!hZ2.isInitialized()) {
            throw ib.newUninitializedMessageException((Message)hZ2);
        }
        return hZ2;
    }

    public hZ Lq() {
        hZ hZ2 = new hZ(this);
        int n = this.an;
        int n2 = 0;
        if (this.jm == null) {
            if ((this.an & 1) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFE;
            }
            hZ2.jj = this.jj;
        } else {
            hZ2.jj = this.jm.build();
        }
        if ((n & 2) != 0) {
            hZ2.mj = this.mj;
            n2 |= 1;
        }
        hZ2.an = n2;
        this.onBuilt();
        return hZ2;
    }

    public ib Lr() {
        return (ib)super.clone();
    }

    public ib cQ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ib)super.setField(fieldDescriptor, object);
    }

    public ib aV(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ib)super.clearField(fieldDescriptor);
    }

    public ib aV(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ib)super.clearOneof(oneofDescriptor);
    }

    public ib aV(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ib)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ib cR(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ib)super.addRepeatedField(fieldDescriptor, object);
    }

    public ib aV(Message message) {
        if (message instanceof hZ) {
            return this.c((hZ)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ib c(hZ hZ2) {
        if (hZ2 == hZ.Ll()) {
            return this;
        }
        if (this.jm == null) {
            if (!hZ2.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = hZ2.jj;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.oH();
                    this.jj.addAll(hZ2.jj);
                }
                this.onChanged();
            }
        } else if (!hZ2.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = hZ2.jj;
                this.an &= 0xFFFFFFFE;
                this.jm = hZ.oV() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(hZ2.jj);
            }
        }
        if (hZ2.tK()) {
            this.ei(hZ2.tL());
        }
        this.cR(hZ.b(hZ2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.ov(); ++i) {
            if (this.ed(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ib eN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        hZ hZ2 = null;
        try {
            hZ2 = (hZ)hZ.wn.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hZ2 = (hZ)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (hZ2 != null) {
                this.c(hZ2);
            }
        }
        return this;
    }

    private void oH() {
        if ((this.an & 1) == 0) {
            this.jj = new ArrayList<ic>(this.jj);
            this.an |= 1;
        }
    }

    @Override
    public List<ic> ot() {
        if (this.jm == null) {
            return Collections.unmodifiableList(this.jj);
        }
        return this.jm.getMessageList();
    }

    @Override
    public int ov() {
        if (this.jm == null) {
            return this.jj.size();
        }
        return this.jm.getCount();
    }

    @Override
    public ic ed(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (ic)this.jm.getMessage(n);
    }

    public ib a(int n, ic ic2) {
        if (this.jm == null) {
            if (ic2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, ic2);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)ic2);
        }
        return this;
    }

    public ib a(int n, ie ie2) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, ie2.LH());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)ie2.LH());
        }
        return this;
    }

    public ib a(ic ic2) {
        if (this.jm == null) {
            if (ic2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(ic2);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)ic2);
        }
        return this;
    }

    public ib b(int n, ic ic2) {
        if (this.jm == null) {
            if (ic2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, ic2);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)ic2);
        }
        return this;
    }

    public ib a(ie ie2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(ie2.LH());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)ie2.LH());
        }
        return this;
    }

    public ib b(int n, ie ie2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, ie2.LH());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)ie2.LH());
        }
        return this;
    }

    public ib E(Iterable<? extends ic> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public ib Ls() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public ib ef(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public ie eg(int n) {
        return (ie)this.oL().getBuilder(n);
    }

    @Override
    public if ee(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (if)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends if> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public ie Lt() {
        return (ie)this.oL().addBuilder((AbstractMessage)ic.LD());
    }

    public ie eh(int n) {
        return (ie)this.oL().addBuilder(n, (AbstractMessage)ic.LD());
    }

    public List<ie> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ic, ie, if> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    @Override
    public boolean tK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public ib ei(int n) {
        this.an |= 2;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public ib Lu() {
        this.an &= 0xFFFFFFFD;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    public final ib cQ(UnknownFieldSet unknownFieldSet) {
        return (ib)super.setUnknownFields(unknownFieldSet);
    }

    public final ib cR(UnknownFieldSet unknownFieldSet) {
        return (ib)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cR(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cQ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cR(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aV(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aV(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aV(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cQ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.Lo();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.Lr();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cR(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.aV(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.Lo();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aV(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.Lr();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cR(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.cQ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cR(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.aV(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.aV(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.aV(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.cQ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.Lr();
    }

    public /* synthetic */ Message buildPartial() {
        return this.Lq();
    }

    public /* synthetic */ Message build() {
        return this.Lp();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.aV(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.Lo();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.Lr();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.Lq();
    }

    public /* synthetic */ MessageLite build() {
        return this.Lp();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.Lo();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Lm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Lm();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eN(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.Lr();
    }

    public /* synthetic */ Object clone() {
        return this.Lr();
    }
}

