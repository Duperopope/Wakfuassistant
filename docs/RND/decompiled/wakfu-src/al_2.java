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
 * Renamed from aL
 */
public final class al_2
extends GeneratedMessageV3.Builder<al_2>
implements am_1 {
    private long fG;
    private bh_1 fO;
    private SingleFieldBuilderV3<bh_1, bj_2, bk_1> fR;

    public static final Descriptors.Descriptor gc() {
        return ae_1.eK;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.eL.ensureFieldAccessorsInitialized(aj_2.class, al_2.class);
    }

    al_2() {
        this.D();
    }

    al_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (aj_2.gb()) {
            // empty if block
        }
    }

    public al_2 gd() {
        super.clear();
        this.fG = 0L;
        if (this.fR == null) {
            this.fO = null;
        } else {
            this.fO = null;
            this.fR = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.eK;
    }

    public aj_2 ga() {
        return aj_2.fZ();
    }

    public aj_2 ge() {
        aj_2 aj_22 = this.gf();
        if (!aj_22.isInitialized()) {
            throw al_2.newUninitializedMessageException((Message)aj_22);
        }
        return aj_22;
    }

    public aj_2 gf() {
        aj_2 aj_22 = new aj_2(this);
        aj_22.fG = this.fG;
        aj_22.fO = this.fR == null ? this.fO : (bh_1)this.fR.build();
        this.onBuilt();
        return aj_22;
    }

    public al_2 gg() {
        return (al_2)super.clone();
    }

    public al_2 I(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (al_2)super.setField(fieldDescriptor, object);
    }

    public al_2 r(Descriptors.FieldDescriptor fieldDescriptor) {
        return (al_2)super.clearField(fieldDescriptor);
    }

    public al_2 r(Descriptors.OneofDescriptor oneofDescriptor) {
        return (al_2)super.clearOneof(oneofDescriptor);
    }

    public al_2 r(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (al_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public al_2 J(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (al_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public al_2 r(Message message) {
        if (message instanceof aj_2) {
            return this.c((aj_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public al_2 c(aj_2 aj_22) {
        if (aj_22 == aj_2.fZ()) {
            return this;
        }
        if (aj_22.fD() != 0L) {
            this.j(aj_22.fD());
        }
        if (aj_22.fT()) {
            this.b(aj_22.fU());
        }
        this.J(aj_2.b(aj_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public al_2 ab(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        aj_2 aj_22 = null;
        try {
            aj_22 = (aj_2)aj_2.fQ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aj_22 = (aj_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aj_22 != null) {
                this.c(aj_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public al_2 j(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public al_2 gh() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean fT() {
        return this.fR != null || this.fO != null;
    }

    @Override
    public bh_1 fU() {
        if (this.fR == null) {
            return this.fO == null ? bh_1.ib() : this.fO;
        }
        return (bh_1)this.fR.getMessage();
    }

    public al_2 a(bh_1 bh_12) {
        if (this.fR == null) {
            if (bh_12 == null) {
                throw new NullPointerException();
            }
            this.fO = bh_12;
            this.onChanged();
        } else {
            this.fR.setMessage((AbstractMessage)bh_12);
        }
        return this;
    }

    public al_2 a(bj_2 bj_22) {
        if (this.fR == null) {
            this.fO = bj_22.ig();
            this.onChanged();
        } else {
            this.fR.setMessage((AbstractMessage)bj_22.ig());
        }
        return this;
    }

    public al_2 b(bh_1 bh_12) {
        if (this.fR == null) {
            this.fO = this.fO != null ? bh_1.e(this.fO).g(bh_12).ih() : bh_12;
            this.onChanged();
        } else {
            this.fR.mergeFrom((AbstractMessage)bh_12);
        }
        return this;
    }

    public al_2 gi() {
        if (this.fR == null) {
            this.fO = null;
            this.onChanged();
        } else {
            this.fO = null;
            this.fR = null;
        }
        return this;
    }

    public bj_2 gj() {
        this.onChanged();
        return (bj_2)this.gk().getBuilder();
    }

    @Override
    public bk_1 fV() {
        if (this.fR != null) {
            return (bk_1)this.fR.getMessageOrBuilder();
        }
        return this.fO == null ? bh_1.ib() : this.fO;
    }

    private SingleFieldBuilderV3<bh_1, bj_2, bk_1> gk() {
        if (this.fR == null) {
            this.fR = new SingleFieldBuilderV3((AbstractMessage)this.fU(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.fO = null;
        }
        return this.fR;
    }

    public final al_2 I(UnknownFieldSet unknownFieldSet) {
        return (al_2)super.setUnknownFields(unknownFieldSet);
    }

    public final al_2 J(UnknownFieldSet unknownFieldSet) {
        return (al_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.J(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.I(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.J(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.r(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.r(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.r(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.I(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.gd();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.gg();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.J(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ab(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.r(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.gd();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.r(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.gg();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.J(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.I(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.J(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.r(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.r(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.r(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.I(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ab(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.gg();
    }

    public /* synthetic */ Message buildPartial() {
        return this.gf();
    }

    public /* synthetic */ Message build() {
        return this.ge();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.r(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.gd();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ab(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.gg();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.gf();
    }

    public /* synthetic */ MessageLite build() {
        return this.ge();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.gd();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ga();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ga();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ab(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.gg();
    }

    public /* synthetic */ Object clone() {
        return this.gg();
    }
}

