/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
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
import com.google.protobuf.ByteString;
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
 * Renamed from bg
 */
public final class bg_2
extends GeneratedMessageV3.Builder<bg_2>
implements bt_2 {
    private bw_2 gu;
    private SingleFieldBuilderV3<bw_2, by_1, cj_2> gA;
    private bh_1 fO;
    private SingleFieldBuilderV3<bh_1, bj_2, bk_1> fR;
    private Object gx = "";

    public static final Descriptors.Descriptor hN() {
        return ae_1.fu;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fv.ensureFieldAccessorsInitialized(be_2.class, bg_2.class);
    }

    bg_2() {
        this.D();
    }

    bg_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (be_2.hM()) {
            // empty if block
        }
    }

    public bg_2 hO() {
        super.clear();
        if (this.gA == null) {
            this.gu = null;
        } else {
            this.gu = null;
            this.gA = null;
        }
        if (this.fR == null) {
            this.fO = null;
        } else {
            this.fO = null;
            this.fR = null;
        }
        this.gx = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fu;
    }

    public be_2 hL() {
        return be_2.hK();
    }

    public be_2 hP() {
        be_2 be_22 = this.hQ();
        if (!be_22.isInitialized()) {
            throw bg_2.newUninitializedMessageException((Message)be_22);
        }
        return be_22;
    }

    public be_2 hQ() {
        be_2 be_22 = new be_2(this);
        be_22.gu = this.gA == null ? this.gu : (bw_2)this.gA.build();
        be_22.fO = this.fR == null ? this.fO : (bh_1)this.fR.build();
        be_22.gx = this.gx;
        this.onBuilt();
        return be_22;
    }

    public bg_2 hR() {
        return (bg_2)super.clone();
    }

    public bg_2 S(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bg_2)super.setField(fieldDescriptor, object);
    }

    public bg_2 w(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bg_2)super.clearField(fieldDescriptor);
    }

    public bg_2 w(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bg_2)super.clearOneof(oneofDescriptor);
    }

    public bg_2 w(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bg_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bg_2 T(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bg_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bg_2 w(Message message) {
        if (message instanceof be_2) {
            return this.c((be_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bg_2 c(be_2 be_22) {
        if (be_22 == be_2.hK()) {
            return this;
        }
        if (be_22.hC()) {
            this.h(be_22.hD());
        }
        if (be_22.fT()) {
            this.d(be_22.fU());
        }
        if (!be_22.hF().isEmpty()) {
            this.gx = be_22.gx;
            this.onChanged();
        }
        this.T(be_2.b(be_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bg_2 aq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        be_2 be_22 = null;
        try {
            be_22 = (be_2)be_2.gz.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            be_22 = (be_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (be_22 != null) {
                this.c(be_22);
            }
        }
        return this;
    }

    @Override
    public boolean hC() {
        return this.gA != null || this.gu != null;
    }

    @Override
    public bw_2 hD() {
        if (this.gA == null) {
            return this.gu == null ? bw_2.kP() : this.gu;
        }
        return (bw_2)this.gA.getMessage();
    }

    public bg_2 g(bw_2 bw_22) {
        if (this.gA == null) {
            if (bw_22 == null) {
                throw new NullPointerException();
            }
            this.gu = bw_22;
            this.onChanged();
        } else {
            this.gA.setMessage((AbstractMessage)bw_22);
        }
        return this;
    }

    public bg_2 d(by_1 by_12) {
        if (this.gA == null) {
            this.gu = by_12.kU();
            this.onChanged();
        } else {
            this.gA.setMessage((AbstractMessage)by_12.kU());
        }
        return this;
    }

    public bg_2 h(bw_2 bw_22) {
        if (this.gA == null) {
            this.gu = this.gu != null ? bw_2.i(this.gu).k(bw_22).kV() : bw_22;
            this.onChanged();
        } else {
            this.gA.mergeFrom((AbstractMessage)bw_22);
        }
        return this;
    }

    public bg_2 hS() {
        if (this.gA == null) {
            this.gu = null;
            this.onChanged();
        } else {
            this.gu = null;
            this.gA = null;
        }
        return this;
    }

    public by_1 hT() {
        this.onChanged();
        return (by_1)this.hU().getBuilder();
    }

    @Override
    public cj_2 hE() {
        if (this.gA != null) {
            return (cj_2)this.gA.getMessageOrBuilder();
        }
        return this.gu == null ? bw_2.kP() : this.gu;
    }

    private SingleFieldBuilderV3<bw_2, by_1, cj_2> hU() {
        if (this.gA == null) {
            this.gA = new SingleFieldBuilderV3((AbstractMessage)this.hD(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.gu = null;
        }
        return this.gA;
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

    public bg_2 c(bh_1 bh_12) {
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

    public bg_2 b(bj_2 bj_22) {
        if (this.fR == null) {
            this.fO = bj_22.ig();
            this.onChanged();
        } else {
            this.fR.setMessage((AbstractMessage)bj_22.ig());
        }
        return this;
    }

    public bg_2 d(bh_1 bh_12) {
        if (this.fR == null) {
            this.fO = this.fO != null ? bh_1.e(this.fO).g(bh_12).ih() : bh_12;
            this.onChanged();
        } else {
            this.fR.mergeFrom((AbstractMessage)bh_12);
        }
        return this;
    }

    public bg_2 hV() {
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

    @Override
    public String hF() {
        Object object = this.gx;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.gx = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString hG() {
        Object object = this.gx;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.gx = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public bg_2 r(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.gx = string;
        this.onChanged();
        return this;
    }

    public bg_2 hW() {
        this.gx = be_2.hK().hF();
        this.onChanged();
        return this;
    }

    public bg_2 W(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        be_2.V(byteString);
        this.gx = byteString;
        this.onChanged();
        return this;
    }

    public final bg_2 S(UnknownFieldSet unknownFieldSet) {
        return (bg_2)super.setUnknownFields(unknownFieldSet);
    }

    public final bg_2 T(UnknownFieldSet unknownFieldSet) {
        return (bg_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.T(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.S(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.T(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.w(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.w(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.w(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.S(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.hO();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.hR();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.T(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.w(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.hO();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.w(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.hR();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.T(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.S(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.T(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.w(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.w(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.w(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.S(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.hR();
    }

    public /* synthetic */ Message buildPartial() {
        return this.hQ();
    }

    public /* synthetic */ Message build() {
        return this.hP();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.w(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.hO();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.hR();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.hQ();
    }

    public /* synthetic */ MessageLite build() {
        return this.hP();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.hO();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.hL();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.hL();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aq(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.hR();
    }

    public /* synthetic */ Object clone() {
        return this.hR();
    }
}

