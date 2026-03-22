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
 * Renamed from cb
 */
public final class cb_2
extends GeneratedMessageV3.Builder<cb_2>
implements cc_1 {
    private long fG;
    private bw_2 hF;
    private SingleFieldBuilderV3<bw_2, by_1, cj_2> hI;

    public static final Descriptors.Descriptor lk() {
        return ae_1.fk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fl.ensureFieldAccessorsInitialized(bz_2.class, cb_2.class);
    }

    cb_2() {
        this.D();
    }

    cb_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bz_2.lj()) {
            // empty if block
        }
    }

    public cb_2 ll() {
        super.clear();
        this.fG = 0L;
        if (this.hI == null) {
            this.hF = null;
        } else {
            this.hF = null;
            this.hI = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fk;
    }

    public bz_2 li() {
        return bz_2.lh();
    }

    public bz_2 lm() {
        bz_2 bz_22 = this.ln();
        if (!bz_22.isInitialized()) {
            throw cb_2.newUninitializedMessageException((Message)bz_22);
        }
        return bz_22;
    }

    public bz_2 ln() {
        bz_2 bz_22 = new bz_2(this);
        bz_22.fG = this.fG;
        bz_22.hF = this.hI == null ? this.hF : (bw_2)this.hI.build();
        this.onBuilt();
        return bz_22;
    }

    public cb_2 lo() {
        return (cb_2)super.clone();
    }

    public cb_2 aq(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cb_2)super.setField(fieldDescriptor, object);
    }

    public cb_2 I(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cb_2)super.clearField(fieldDescriptor);
    }

    public cb_2 I(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cb_2)super.clearOneof(oneofDescriptor);
    }

    public cb_2 I(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cb_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cb_2 ar(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cb_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cb_2 I(Message message) {
        if (message instanceof bz_2) {
            return this.c((bz_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cb_2 c(bz_2 bz_22) {
        if (bz_22 == bz_2.lh()) {
            return this;
        }
        if (bz_22.fD() != 0L) {
            this.x(bz_22.fD());
        }
        if (bz_22.lb()) {
            this.m(bz_22.lc());
        }
        this.ar(bz_2.b(bz_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cb_2 ba(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bz_2 bz_22 = null;
        try {
            bz_22 = (bz_2)bz_2.hH.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bz_22 = (bz_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bz_22 != null) {
                this.c(bz_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cb_2 x(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cb_2 lp() {
        this.fG = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean lb() {
        return this.hI != null || this.hF != null;
    }

    @Override
    public bw_2 lc() {
        if (this.hI == null) {
            return this.hF == null ? bw_2.kP() : this.hF;
        }
        return (bw_2)this.hI.getMessage();
    }

    public cb_2 l(bw_2 bw_22) {
        if (this.hI == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.hF = bw_22;
            this.onChanged();
        } else {
            this.hI.setMessage((AbstractMessage)bw_22);
        }
        return this;
    }

    public cb_2 e(by_1 by_12) {
        if (this.hI == null) {
            this.hF = by_12.kU();
            this.onChanged();
        } else {
            this.hI.setMessage((AbstractMessage)by_12.kU());
        }
        return this;
    }

    public cb_2 m(bw_2 bw_22) {
        if (this.hI == null) {
            this.hF = this.hF != null ? bw_2.i(this.hF).k(bw_22).kV() : bw_22;
            this.onChanged();
        } else {
            this.hI.mergeFrom((AbstractMessage)bw_22);
        }
        return this;
    }

    public cb_2 lq() {
        if (this.hI == null) {
            this.hF = null;
            this.onChanged();
        } else {
            this.hF = null;
            this.hI = null;
        }
        return this;
    }

    public by_1 lr() {
        this.onChanged();
        return (by_1)this.ls().getBuilder();
    }

    @Override
    public cj_2 ld() {
        if (this.hI != null) {
            return (cj_2)this.hI.getMessageOrBuilder();
        }
        return this.hF == null ? bw_2.kP() : this.hF;
    }

    private SingleFieldBuilderV3<bw_2, by_1, cj_2> ls() {
        if (this.hI == null) {
            this.hI = new SingleFieldBuilderV3((AbstractMessage)this.lc(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.hF = null;
        }
        return this.hI;
    }

    public final cb_2 aq(UnknownFieldSet unknownFieldSet) {
        return (cb_2)super.setUnknownFields(unknownFieldSet);
    }

    public final cb_2 ar(UnknownFieldSet unknownFieldSet) {
        return (cb_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ar(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aq(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ar(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.I(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.I(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.I(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aq(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ll();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.lo();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ar(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ba(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.I(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ll();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.I(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.lo();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.ar(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aq(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.ar(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.I(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.I(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.I(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aq(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ba(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.lo();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ln();
    }

    public /* synthetic */ Message build() {
        return this.lm();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.I(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ll();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ba(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.lo();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ln();
    }

    public /* synthetic */ MessageLite build() {
        return this.lm();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ll();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.li();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.li();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ba(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.lo();
    }

    public /* synthetic */ Object clone() {
        return this.lo();
    }
}

