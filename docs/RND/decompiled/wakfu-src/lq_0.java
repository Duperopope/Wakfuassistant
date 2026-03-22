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
 * Renamed from lQ
 */
public final class lq_0
extends GeneratedMessageV3.Builder<lq_0>
implements lr_1 {
    private int an;
    private List<kW> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<kW, kY, lh> jm;

    public static final Descriptors.Descriptor aiR() {
        return kF.Go;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gp.ensureFieldAccessorsInitialized(lo_1.class, lq_0.class);
    }

    lq_0() {
        this.D();
    }

    lq_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (lo_1.aiQ()) {
            this.oL();
        }
    }

    public lq_0 aiS() {
        super.clear();
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.jm.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kF.Go;
    }

    public lo_1 aiP() {
        return lo_1.aiO();
    }

    public lo_1 aiT() {
        lo_1 lo_12 = this.aiU();
        if (!lo_12.isInitialized()) {
            throw lq_0.newUninitializedMessageException((Message)lo_12);
        }
        return lo_12;
    }

    public lo_1 aiU() {
        lo_1 lo_12 = new lo_1(this);
        int n = this.an;
        if (this.jm == null) {
            if ((this.an & 1) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFE;
            }
            lo_12.jj = this.jj;
        } else {
            lo_12.jj = this.jm.build();
        }
        this.onBuilt();
        return lo_12;
    }

    public lq_0 aiV() {
        return (lq_0)super.clone();
    }

    public lq_0 eG(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lq_0)super.setField(fieldDescriptor, object);
    }

    public lq_0 bQ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (lq_0)super.clearField(fieldDescriptor);
    }

    public lq_0 bQ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (lq_0)super.clearOneof(oneofDescriptor);
    }

    public lq_0 bQ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (lq_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public lq_0 eH(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (lq_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public lq_0 bQ(Message message) {
        if (message instanceof lo_1) {
            return this.c((lo_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public lq_0 c(lo_1 lo_12) {
        if (lo_12 == lo_1.aiO()) {
            return this;
        }
        if (this.jm == null) {
            if (!lo_12.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = lo_12.jj;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.oH();
                    this.jj.addAll(lo_12.jj);
                }
                this.onChanged();
            }
        } else if (!lo_12.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = lo_12.jj;
                this.an &= 0xFFFFFFFE;
                this.jm = lo_1.mx() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(lo_12.jj);
            }
        }
        this.eH(lo_1.b(lo_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.ov(); ++i) {
            if (this.dW(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public lq_0 hy(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lo_1 lo_12 = null;
        try {
            lo_12 = (lo_1)lo_1.Jl.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lo_12 = (lo_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lo_12 != null) {
                this.c(lo_12);
            }
        }
        return this;
    }

    private void oH() {
        if ((this.an & 1) == 0) {
            this.jj = new ArrayList<kW>(this.jj);
            this.an |= 1;
        }
    }

    @Override
    public List<kW> ot() {
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
    public kW dW(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (kW)this.jm.getMessage(n);
    }

    public lq_0 e(int n, kW kW2) {
        if (this.jm == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, kW2);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kW2);
        }
        return this;
    }

    public lq_0 e(int n, kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, kY2.aer());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)kY2.aer());
        }
        return this;
    }

    public lq_0 l(kW kW2) {
        if (this.jm == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(kW2);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kW2);
        }
        return this;
    }

    public lq_0 f(int n, kW kW2) {
        if (this.jm == null) {
            if (kW2 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, kW2);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kW2);
        }
        return this;
    }

    public lq_0 f(kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(kY2.aer());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)kY2.aer());
        }
        return this;
    }

    public lq_0 f(int n, kY kY2) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, kY2.aer());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)kY2.aer());
        }
        return this;
    }

    public lq_0 ac(Iterable<? extends kW> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public lq_0 aiW() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public lq_0 hK(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public kY dZ(int n) {
        return (kY)this.oL().getBuilder(n);
    }

    @Override
    public lh dX(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (lh)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lh> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public kY KR() {
        return (kY)this.oL().addBuilder((AbstractMessage)kW.aen());
    }

    public kY ea(int n) {
        return (kY)this.oL().addBuilder(n, (AbstractMessage)kW.aen());
    }

    public List<kY> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kW, kY, lh> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    public final lq_0 eG(UnknownFieldSet unknownFieldSet) {
        return (lq_0)super.setUnknownFields(unknownFieldSet);
    }

    public final lq_0 eH(UnknownFieldSet unknownFieldSet) {
        return (lq_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eH(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eG(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eH(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bQ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bQ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bQ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eG(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aiS();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aiV();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eH(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hy(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bQ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aiS();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bQ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aiV();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eH(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eG(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eH(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bQ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bQ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bQ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eG(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hy(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aiV();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aiU();
    }

    public /* synthetic */ Message build() {
        return this.aiT();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bQ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aiS();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hy(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aiV();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aiU();
    }

    public /* synthetic */ MessageLite build() {
        return this.aiT();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aiS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aiP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aiP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hy(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aiV();
    }

    public /* synthetic */ Object clone() {
        return this.aiV();
    }
}

