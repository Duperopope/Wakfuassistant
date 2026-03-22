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
 * Renamed from cD
 */
public final class cd_1
extends GeneratedMessageV3.Builder<cd_1>
implements ce_1 {
    private long fG;
    private be_2 hn;
    private SingleFieldBuilderV3<be_2, bg_2, bt_2> hq;

    public static final Descriptors.Descriptor no() {
        return ae_1.fc;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fd.ensureFieldAccessorsInitialized(cb_1.class, cd_1.class);
    }

    cd_1() {
        this.D();
    }

    cd_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cb_1.nn()) {
            // empty if block
        }
    }

    public cd_1 np() {
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
        return ae_1.fc;
    }

    public cb_1 nm() {
        return cb_1.nl();
    }

    public cb_1 nq() {
        cb_1 cb_12 = this.nr();
        if (!cb_12.isInitialized()) {
            throw cd_1.newUninitializedMessageException((Message)cb_12);
        }
        return cb_12;
    }

    public cb_1 nr() {
        cb_1 cb_12 = new cb_1(this);
        cb_12.fG = this.fG;
        cb_12.hn = this.hq == null ? this.hn : (be_2)this.hq.build();
        this.onBuilt();
        return cb_12;
    }

    public cd_1 ns() {
        return (cd_1)super.clone();
    }

    public cd_1 aE(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cd_1)super.setField(fieldDescriptor, object);
    }

    public cd_1 P(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cd_1)super.clearField(fieldDescriptor);
    }

    public cd_1 P(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cd_1)super.clearOneof(oneofDescriptor);
    }

    public cd_1 P(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cd_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cd_1 aF(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cd_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public cd_1 P(Message message) {
        if (message instanceof cb_1) {
            return this.c((cb_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cd_1 c(cb_1 cb_12) {
        if (cb_12 == cb_1.nl()) {
            return this;
        }
        if (cb_12.fD() != 0L) {
            this.G(cb_12.fD());
        }
        if (cb_12.kg()) {
            this.j(cb_12.kh());
        }
        this.aF(cb_1.b(cb_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cd_1 bv(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cb_1 cb_12 = null;
        try {
            cb_12 = (cb_1)cb_1.it.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cb_12 = (cb_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cb_12 != null) {
                this.c(cb_12);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cd_1 G(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cd_1 nt() {
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

    public cd_1 i(be_2 be_22) {
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

    public cd_1 d(bg_2 bg_22) {
        if (this.hq == null) {
            this.hn = bg_22.hP();
            this.onChanged();
        } else {
            this.hq.setMessage((AbstractMessage)bg_22.hP());
        }
        return this;
    }

    public cd_1 j(be_2 be_22) {
        if (this.hq == null) {
            this.hn = this.hn != null ? be_2.a(this.hn).c(be_22).hQ() : be_22;
            this.onChanged();
        } else {
            this.hq.mergeFrom((AbstractMessage)be_22);
        }
        return this;
    }

    public cd_1 nu() {
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

    public final cd_1 aE(UnknownFieldSet unknownFieldSet) {
        return (cd_1)super.setUnknownFields(unknownFieldSet);
    }

    public final cd_1 aF(UnknownFieldSet unknownFieldSet) {
        return (cd_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aF(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aE(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aF(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.P(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.P(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.P(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aE(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.np();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ns();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aF(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.P(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.np();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.P(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ns();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aF(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aE(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aF(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.P(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.P(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.P(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aE(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ns();
    }

    public /* synthetic */ Message buildPartial() {
        return this.nr();
    }

    public /* synthetic */ Message build() {
        return this.nq();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.P(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.np();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ns();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.nr();
    }

    public /* synthetic */ MessageLite build() {
        return this.nq();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.np();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.nm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.nm();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bv(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ns();
    }

    public /* synthetic */ Object clone() {
        return this.ns();
    }
}

