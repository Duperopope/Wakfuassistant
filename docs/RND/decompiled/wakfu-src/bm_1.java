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
 * Renamed from bM
 */
public final class bm_1
extends GeneratedMessageV3.Builder<bm_1>
implements bn_1 {
    private long fG;
    private az_2 hg;
    private SingleFieldBuilderV3<az_2, bb_1, bd_1> hj;

    public static final Descriptors.Descriptor jW() {
        return ae_1.ey;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.ez.ensureFieldAccessorsInitialized(bk_2.class, bm_1.class);
    }

    bm_1() {
        this.D();
    }

    bm_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bk_2.fa()) {
            // empty if block
        }
    }

    public bm_1 jX() {
        super.clear();
        this.fG = 0L;
        if (this.hj == null) {
            this.hg = null;
        } else {
            this.hg = null;
            this.hj = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.ey;
    }

    public bk_2 jV() {
        return bk_2.jU();
    }

    public bk_2 jY() {
        bk_2 bk_22 = this.jZ();
        if (!bk_22.isInitialized()) {
            throw bm_1.newUninitializedMessageException((Message)bk_22);
        }
        return bk_22;
    }

    public bk_2 jZ() {
        bk_2 bk_22 = new bk_2(this);
        bk_22.fG = this.fG;
        bk_22.hg = this.hj == null ? this.hg : (az_2)this.hj.build();
        this.onBuilt();
        return bk_22;
    }

    public bm_1 ka() {
        return (bm_1)super.clone();
    }

    public bm_1 ai(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bm_1)super.setField(fieldDescriptor, object);
    }

    public bm_1 E(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bm_1)super.clearField(fieldDescriptor);
    }

    public bm_1 E(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bm_1)super.clearOneof(oneofDescriptor);
    }

    public bm_1 E(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bm_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bm_1 aj(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bm_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public bm_1 E(Message message) {
        if (message instanceof bk_2) {
            return this.c((bk_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bm_1 c(bk_2 bk_22) {
        if (bk_22 == bk_2.jU()) {
            return this;
        }
        if (bk_22.fD() != 0L) {
            this.t(bk_22.fD());
        }
        if (bk_22.jO()) {
            this.e(bk_22.jP());
        }
        this.aj(bk_2.b(bk_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bm_1 aO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bk_2 bk_22 = null;
        try {
            bk_22 = (bk_2)bk_2.hi.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bk_22 = (bk_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bk_22 != null) {
                this.c(bk_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public bm_1 t(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public bm_1 kb() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean jO() {
        return this.hj != null || this.hg != null;
    }

    @Override
    public az_2 jP() {
        if (this.hj == null) {
            return this.hg == null ? az_2.hm() : this.hg;
        }
        return (az_2)this.hj.getMessage();
    }

    public bm_1 d(az_2 az_22) {
        if (this.hj == null) {
            if (az_22 == null) {
                throw new NullPointerException();
            }
            this.hg = az_22;
            this.onChanged();
        } else {
            this.hj.setMessage((AbstractMessage)az_22);
        }
        return this;
    }

    public bm_1 a(bb_1 bb_12) {
        if (this.hj == null) {
            this.hg = bb_12.hs();
            this.onChanged();
        } else {
            this.hj.setMessage((AbstractMessage)bb_12.hs());
        }
        return this;
    }

    public bm_1 e(az_2 az_22) {
        if (this.hj == null) {
            this.hg = this.hg != null ? az_2.a(this.hg).c(az_22).ht() : az_22;
            this.onChanged();
        } else {
            this.hj.mergeFrom((AbstractMessage)az_22);
        }
        return this;
    }

    public bm_1 kc() {
        if (this.hj == null) {
            this.hg = null;
            this.onChanged();
        } else {
            this.hg = null;
            this.hj = null;
        }
        return this;
    }

    public bb_1 kd() {
        this.onChanged();
        return (bb_1)this.ke().getBuilder();
    }

    @Override
    public bd_1 jQ() {
        if (this.hj != null) {
            return (bd_1)this.hj.getMessageOrBuilder();
        }
        return this.hg == null ? az_2.hm() : this.hg;
    }

    private SingleFieldBuilderV3<az_2, bb_1, bd_1> ke() {
        if (this.hj == null) {
            this.hj = new SingleFieldBuilderV3((AbstractMessage)this.jP(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.hg = null;
        }
        return this.hj;
    }

    public final bm_1 ai(UnknownFieldSet unknownFieldSet) {
        return (bm_1)super.setUnknownFields(unknownFieldSet);
    }

    public final bm_1 aj(UnknownFieldSet unknownFieldSet) {
        return (bm_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aj(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ai(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aj(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.E(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.E(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.E(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ai(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.jX();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ka();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aj(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.E(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.jX();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.E(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ka();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aj(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ai(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aj(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.E(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.E(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.E(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ai(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ka();
    }

    public /* synthetic */ Message buildPartial() {
        return this.jZ();
    }

    public /* synthetic */ Message build() {
        return this.jY();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.E(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.jX();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ka();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.jZ();
    }

    public /* synthetic */ MessageLite build() {
        return this.jY();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.jX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.jV();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.jV();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aO(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ka();
    }

    public /* synthetic */ Object clone() {
        return this.ka();
    }
}

