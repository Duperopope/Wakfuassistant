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
 * Renamed from cn
 */
public final class cn_2
extends GeneratedMessageV3.Builder<cn_2>
implements co_1 {
    private long fG;
    private be_2 hn;
    private SingleFieldBuilderV3<be_2, bg_2, bt_2> hq;

    public static final Descriptors.Descriptor mk() {
        return ae_1.fa;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fb.ensureFieldAccessorsInitialized(cl_2.class, cn_2.class);
    }

    cn_2() {
        this.D();
    }

    cn_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cl_2.mj()) {
            // empty if block
        }
    }

    public cn_2 ml() {
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
        return ae_1.fa;
    }

    public cl_2 mi() {
        return cl_2.mh();
    }

    public cl_2 mm() {
        cl_2 cl_22 = this.mn();
        if (!cl_22.isInitialized()) {
            throw cn_2.newUninitializedMessageException((Message)cl_22);
        }
        return cl_22;
    }

    public cl_2 mn() {
        cl_2 cl_22 = new cl_2(this);
        cl_22.fG = this.fG;
        cl_22.hn = this.hq == null ? this.hn : (be_2)this.hq.build();
        this.onBuilt();
        return cl_22;
    }

    public cn_2 mo() {
        return (cn_2)super.clone();
    }

    public cn_2 aw(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cn_2)super.setField(fieldDescriptor, object);
    }

    public cn_2 L(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cn_2)super.clearField(fieldDescriptor);
    }

    public cn_2 L(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cn_2)super.clearOneof(oneofDescriptor);
    }

    public cn_2 L(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cn_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cn_2 ax(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cn_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cn_2 L(Message message) {
        if (message instanceof cl_2) {
            return this.c((cl_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cn_2 c(cl_2 cl_22) {
        if (cl_22 == cl_2.mh()) {
            return this;
        }
        if (cl_22.fD() != 0L) {
            this.B(cl_22.fD());
        }
        if (cl_22.kg()) {
            this.h(cl_22.kh());
        }
        this.ax(cl_2.b(cl_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cn_2 bj(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cl_2 cl_22 = null;
        try {
            cl_22 = (cl_2)cl_2.hZ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cl_22 = (cl_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cl_22 != null) {
                this.c(cl_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cn_2 B(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cn_2 mp() {
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

    public cn_2 g(be_2 be_22) {
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

    public cn_2 c(bg_2 bg_22) {
        if (this.hq == null) {
            this.hn = bg_22.hP();
            this.onChanged();
        } else {
            this.hq.setMessage((AbstractMessage)bg_22.hP());
        }
        return this;
    }

    public cn_2 h(be_2 be_22) {
        if (this.hq == null) {
            this.hn = this.hn != null ? be_2.a(this.hn).c(be_22).hQ() : be_22;
            this.onChanged();
        } else {
            this.hq.mergeFrom((AbstractMessage)be_22);
        }
        return this;
    }

    public cn_2 mq() {
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

    public final cn_2 aw(UnknownFieldSet unknownFieldSet) {
        return (cn_2)super.setUnknownFields(unknownFieldSet);
    }

    public final cn_2 ax(UnknownFieldSet unknownFieldSet) {
        return (cn_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ax(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aw(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ax(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.L(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.L(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.L(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aw(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ml();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.mo();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ax(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.L(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ml();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.L(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.mo();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ax(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aw(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ax(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.L(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.L(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.L(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aw(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.mo();
    }

    public /* synthetic */ Message buildPartial() {
        return this.mn();
    }

    public /* synthetic */ Message build() {
        return this.mm();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.L(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ml();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.mo();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.mn();
    }

    public /* synthetic */ MessageLite build() {
        return this.mm();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ml();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mi();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mi();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bj(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.mo();
    }

    public /* synthetic */ Object clone() {
        return this.mo();
    }
}

