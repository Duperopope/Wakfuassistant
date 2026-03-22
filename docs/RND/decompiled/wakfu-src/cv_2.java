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
 * Renamed from cv
 */
public final class cv_2
extends GeneratedMessageV3.Builder<cv_2>
implements cw_2 {
    private long fG;
    private bh_1 fO;
    private SingleFieldBuilderV3<bh_1, bj_2, bk_1> fR;

    public static final Descriptors.Descriptor mM() {
        return ae_1.fg;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fh.ensureFieldAccessorsInitialized(ct_2.class, cv_2.class);
    }

    cv_2() {
        this.D();
    }

    cv_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ct_2.mL()) {
            // empty if block
        }
    }

    public cv_2 mN() {
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
        return ae_1.fg;
    }

    public ct_2 mK() {
        return ct_2.mJ();
    }

    public ct_2 mO() {
        ct_2 ct_22 = this.mP();
        if (!ct_22.isInitialized()) {
            throw cv_2.newUninitializedMessageException((Message)ct_22);
        }
        return ct_22;
    }

    public ct_2 mP() {
        ct_2 ct_22 = new ct_2(this);
        ct_22.fG = this.fG;
        ct_22.fO = this.fR == null ? this.fO : (bh_1)this.fR.build();
        this.onBuilt();
        return ct_22;
    }

    public cv_2 mQ() {
        return (cv_2)super.clone();
    }

    public cv_2 aA(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cv_2)super.setField(fieldDescriptor, object);
    }

    public cv_2 N(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cv_2)super.clearField(fieldDescriptor);
    }

    public cv_2 N(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cv_2)super.clearOneof(oneofDescriptor);
    }

    public cv_2 N(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cv_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cv_2 aB(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cv_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public cv_2 N(Message message) {
        if (message instanceof ct_2) {
            return this.c((ct_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cv_2 c(ct_2 ct_22) {
        if (ct_22 == ct_2.mJ()) {
            return this;
        }
        if (ct_22.fD() != 0L) {
            this.E(ct_22.fD());
        }
        if (ct_22.fT()) {
            this.j(ct_22.fU());
        }
        this.aB(ct_2.b(ct_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public cv_2 bp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ct_2 ct_22 = null;
        try {
            ct_22 = (ct_2)ct_2.ij.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ct_22 = (ct_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ct_22 != null) {
                this.c(ct_22);
            }
        }
        return this;
    }

    @Override
    public long fD() {
        return this.fG;
    }

    public cv_2 E(long l) {
        this.fG = l;
        this.onChanged();
        return this;
    }

    public cv_2 mR() {
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

    public cv_2 i(bh_1 bh_12) {
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

    public cv_2 d(bj_2 bj_22) {
        if (this.fR == null) {
            this.fO = bj_22.ig();
            this.onChanged();
        } else {
            this.fR.setMessage((AbstractMessage)bj_22.ig());
        }
        return this;
    }

    public cv_2 j(bh_1 bh_12) {
        if (this.fR == null) {
            this.fO = this.fO != null ? bh_1.e(this.fO).g(bh_12).ih() : bh_12;
            this.onChanged();
        } else {
            this.fR.mergeFrom((AbstractMessage)bh_12);
        }
        return this;
    }

    public cv_2 mS() {
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

    public final cv_2 aA(UnknownFieldSet unknownFieldSet) {
        return (cv_2)super.setUnknownFields(unknownFieldSet);
    }

    public final cv_2 aB(UnknownFieldSet unknownFieldSet) {
        return (cv_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aB(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aA(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aB(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.N(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.N(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.N(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aA(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.mN();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.mQ();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aB(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.N(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.mN();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.N(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.mQ();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aB(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aA(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aB(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.N(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.N(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.N(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aA(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.mQ();
    }

    public /* synthetic */ Message buildPartial() {
        return this.mP();
    }

    public /* synthetic */ Message build() {
        return this.mO();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.N(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.mN();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.mQ();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.mP();
    }

    public /* synthetic */ MessageLite build() {
        return this.mO();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.mN();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mK();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mK();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bp(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.mQ();
    }

    public /* synthetic */ Object clone() {
        return this.mQ();
    }
}

