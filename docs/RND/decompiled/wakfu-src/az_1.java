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
 * Renamed from az
 */
public final class az_1
extends GeneratedMessageV3.Builder<az_1>
implements ac_1 {
    private int dS;
    private int eb = 0;
    private ap_2 dU;
    private SingleFieldBuilderV3<ap_2, ar_2, as_2> dX;

    public static final Descriptors.Descriptor fs() {
        return ak_1.dr;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.ds.ensureFieldAccessorsInitialized(ax_1.class, az_1.class);
    }

    az_1() {
        this.D();
    }

    az_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ax_1.bg()) {
            // empty if block
        }
    }

    public az_1 ft() {
        super.clear();
        this.dS = 0;
        this.eb = 0;
        if (this.dX == null) {
            this.dU = null;
        } else {
            this.dU = null;
            this.dX = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_1.dr;
    }

    public ax_1 fr() {
        return ax_1.fq();
    }

    public ax_1 fu() {
        ax_1 ax_12 = this.fv();
        if (!ax_12.isInitialized()) {
            throw az_1.newUninitializedMessageException((Message)ax_12);
        }
        return ax_12;
    }

    public ax_1 fv() {
        ax_1 ax_12 = new ax_1(this);
        ax_12.dS = this.dS;
        ax_12.eb = this.eb;
        ax_12.dU = this.dX == null ? this.dU : (ap_2)this.dX.build();
        this.onBuilt();
        return ax_12;
    }

    public az_1 fw() {
        return (az_1)super.clone();
    }

    public az_1 E(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (az_1)super.setField(fieldDescriptor, object);
    }

    public az_1 p(Descriptors.FieldDescriptor fieldDescriptor) {
        return (az_1)super.clearField(fieldDescriptor);
    }

    public az_1 p(Descriptors.OneofDescriptor oneofDescriptor) {
        return (az_1)super.clearOneof(oneofDescriptor);
    }

    public az_1 p(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (az_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public az_1 F(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (az_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public az_1 p(Message message) {
        if (message instanceof ax_1) {
            return this.e((ax_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public az_1 e(ax_1 ax_12) {
        if (ax_12 == ax_1.fq()) {
            return this;
        }
        if (ax_12.eR() != 0) {
            this.y(ax_12.eR());
        }
        if (ax_12.eb != 0) {
            this.z(ax_12.fl());
        }
        if (ax_12.eS()) {
            this.i(ax_12.eT());
        }
        this.F(ax_1.d(ax_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public az_1 V(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ax_1 ax_12 = null;
        try {
            ax_12 = (ax_1)ax_1.ee.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ax_12 = (ax_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ax_12 != null) {
                this.e(ax_12);
            }
        }
        return this;
    }

    @Override
    public int eR() {
        return this.dS;
    }

    public az_1 y(int n) {
        this.dS = n;
        this.onChanged();
        return this;
    }

    public az_1 fx() {
        this.dS = 0;
        this.onChanged();
        return this;
    }

    @Override
    public int fl() {
        return this.eb;
    }

    public az_1 z(int n) {
        this.eb = n;
        this.onChanged();
        return this;
    }

    @Override
    public aa_2 fm() {
        aa_2 aa_22 = aa_2.A(this.eb);
        return aa_22 == null ? aa_2.el : aa_22;
    }

    public az_1 a(aa_2 aa_22) {
        if (aa_22 == null) {
            throw new NullPointerException();
        }
        this.eb = aa_22.getNumber();
        this.onChanged();
        return this;
    }

    public az_1 fy() {
        this.eb = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean eS() {
        return this.dX != null || this.dU != null;
    }

    @Override
    public ap_2 eT() {
        if (this.dX == null) {
            return this.dU == null ? ap_2.eH() : this.dU;
        }
        return (ap_2)this.dX.getMessage();
    }

    public az_1 h(ap_2 ap_22) {
        if (this.dX == null) {
            if (ap_22 == null) {
                throw new NullPointerException();
            }
            this.dU = ap_22;
            this.onChanged();
        } else {
            this.dX.setMessage((AbstractMessage)ap_22);
        }
        return this;
    }

    public az_1 c(ar_2 ar_22) {
        if (this.dX == null) {
            this.dU = ar_22.eL();
            this.onChanged();
        } else {
            this.dX.setMessage((AbstractMessage)ar_22.eL());
        }
        return this;
    }

    public az_1 i(ap_2 ap_22) {
        if (this.dX == null) {
            this.dU = this.dU != null ? ap_2.c(this.dU).e(ap_22).eM() : ap_22;
            this.onChanged();
        } else {
            this.dX.mergeFrom((AbstractMessage)ap_22);
        }
        return this;
    }

    public az_1 fz() {
        if (this.dX == null) {
            this.dU = null;
            this.onChanged();
        } else {
            this.dU = null;
            this.dX = null;
        }
        return this;
    }

    public ar_2 fi() {
        this.onChanged();
        return (ar_2)this.fj().getBuilder();
    }

    @Override
    public as_2 eU() {
        if (this.dX != null) {
            return (as_2)this.dX.getMessageOrBuilder();
        }
        return this.dU == null ? ap_2.eH() : this.dU;
    }

    private SingleFieldBuilderV3<ap_2, ar_2, as_2> fj() {
        if (this.dX == null) {
            this.dX = new SingleFieldBuilderV3((AbstractMessage)this.eT(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.dU = null;
        }
        return this.dX;
    }

    public final az_1 E(UnknownFieldSet unknownFieldSet) {
        return (az_1)super.setUnknownFields(unknownFieldSet);
    }

    public final az_1 F(UnknownFieldSet unknownFieldSet) {
        return (az_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.F(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.E(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.F(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.p(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.p(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.p(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.E(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ft();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.fw();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.F(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.V(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.p(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ft();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.p(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.fw();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.F(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.E(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.F(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.p(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.p(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.p(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.E(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.V(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.fw();
    }

    public /* synthetic */ Message buildPartial() {
        return this.fv();
    }

    public /* synthetic */ Message build() {
        return this.fu();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.p(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ft();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.V(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.fw();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.fv();
    }

    public /* synthetic */ MessageLite build() {
        return this.fu();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ft();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.fr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.fr();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.V(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.fw();
    }

    public /* synthetic */ Object clone() {
        return this.fw();
    }
}

