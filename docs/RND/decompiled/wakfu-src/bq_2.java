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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from bQ
 */
public final class bq_2
extends GeneratedMessageV3.Builder<bq_2>
implements br_1 {
    private long fG;
    private be_2 hn;
    private SingleFieldBuilderV3<be_2, bg_2, bt_2> hq;

    public static final Descriptors.Descriptor ko() {
        return ae_1.eC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eD.ensureFieldAccessorsInitialized(bo_2.class, bq_2.class);
    }

    bq_2() {
        this.D();
    }

    bq_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bo_2.el()) {
            // empty if block
        }
    }

    public bq_2 kp() {
        super.clear();
        this.fG = 0L;
        if (this.hq == null) {
            this.hn = null;
        } else {
            this.hn = null;
            this.hq = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eC;
    }

    public bo_2 kn() {
        return bo_2.km();
    }

    public bo_2 kq() {
        bo_2 bo_22 = this.kr();
        if (!bo_22.isInitialized()) {
            throw bq_2.newUninitializedMessageException((Message)bo_22);
        }
        return bo_22;
    }

    public bo_2 kr() {
        bo_2 bo_22 = new bo_2(this);
        bo_22.fG = this.fG;
        bo_22.hn = this.hq == null ? this.hn : (be_2)this.hq.build();
        this.onBuilt();
        return bo_22;
    }

    public bq_2 ks() {
        return (bq_2)super.clone();
    }

    public bq_2 ak(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bq_2)super.setField(fieldDescriptor, object);
    }

    public bq_2 F(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bq_2)super.clearField(fieldDescriptor);
    }

    public bq_2 F(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bq_2)super.clearOneof(oneofDescriptor);
    }

    public bq_2 F(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bq_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bq_2 al(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bq_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bq_2 F(Message message) {
        if (message instanceof bo_2) {
            return this.c((bo_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bq_2 c(bo_2 bo_22) {
        if (bo_22 == bo_2.km()) {
            return this;
        }
        if (bo_22.fD() != 0L) {
            this.u(bo_22.fD());
        }
        if (bo_22.kg()) {
            this.f(bo_22.kh());
        }
        this.al(bo_2.b(bo_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bq_2 aR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bo_2 bo_22 = null;
        try {
            bo_22 = (bo_2)bo_2.hp.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bo_22 = (bo_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bo_22 != null) {
                this.c(bo_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public bq_2 u(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public bq_2 kt() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean kg() {
        return this.hq != null || this.hn != null;
    }

    @Override
    public be_2 kh() {
        if (this.hq == null) {
            return this.hn == null ? be_2.hK() : this.hn;
        }
        return (be_2)this.hq.getMessage();
    }

    public bq_2 e(be_2 be_22) {
        if (this.hq == null) {
            if (be_22 == null) {
                throw new NullPointerException();
            }
            this.hn = be_22;
            this.onChanged();
        } else {
            this.hq.setMessage((AbstractMessage)be_22);
        }
        return this;
    }

    public bq_2 b(bg_2 bg_22) {
        if (this.hq == null) {
            this.hn = bg_22.hP();
            this.onChanged();
        } else {
            this.hq.setMessage((AbstractMessage)bg_22.hP());
        }
        return this;
    }

    public bq_2 f(be_2 be_22) {
        if (this.hq == null) {
            this.hn = this.hn != null ? be_2.a(this.hn).c(be_22).hQ() : be_22;
            this.onChanged();
        } else {
            this.hq.mergeFrom((AbstractMessage)be_22);
        }
        return this;
    }

    public bq_2 ku() {
        if (this.hq == null) {
            this.hn = null;
            this.onChanged();
        } else {
            this.hn = null;
            this.hq = null;
        }
        return this;
    }

    public bg_2 kv() {
        this.onChanged();
        return (bg_2)this.kw().getBuilder();
    }

    @Override
    public bt_2 ki() {
        if (this.hq != null) {
            return (bt_2)this.hq.getMessageOrBuilder();
        }
        return this.hn == null ? be_2.hK() : this.hn;
    }

    private SingleFieldBuilderV3<be_2, bg_2, bt_2> kw() {
        if (this.hq == null) {
            this.hq = new SingleFieldBuilderV3((AbstractMessage)this.kh(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.hn = null;
        }
        return this.hq;
    }

    public final bq_2 ak(UnknownFieldSet unknownFieldSet) {
        return (bq_2)super.setUnknownFields(unknownFieldSet);
    }

    public final bq_2 al(UnknownFieldSet unknownFieldSet) {
        return (bq_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.al(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ak(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.al(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.F(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.F(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.F(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ak(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.kp();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ks();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.al(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.F(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.kp();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.F(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ks();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.al(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ak(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.al(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.F(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.F(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.F(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ak(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ks();
    }

    public /* synthetic */ Message buildPartial() {
        return this.kr();
    }

    public /* synthetic */ Message build() {
        return this.kq();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.F(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.kp();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ks();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.kr();
    }

    public /* synthetic */ MessageLite build() {
        return this.kq();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.kp();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.kn();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.kn();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aR(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ks();
    }

    public /* synthetic */ Object clone() {
        return this.ks();
    }
}

