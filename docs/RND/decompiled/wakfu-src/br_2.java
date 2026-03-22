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
 * Renamed from br
 */
public final class br_2
extends GeneratedMessageV3.Builder<br_2>
implements bs_2 {
    private int an;
    private List<be_2> ak = Collections.emptyList();
    private RepeatedFieldBuilderV3<be_2, bg_2, bt_2> ao;

    public static final Descriptors.Descriptor iH() {
        return ae_1.fA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fB.ensureFieldAccessorsInitialized(bp_1.class, br_2.class);
    }

    br_2() {
        this.D();
    }

    br_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bp_1.iF()) {
            this.aB();
        }
    }

    public br_2 iI() {
        super.clear();
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.ao.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fA;
    }

    public bp_1 iE() {
        return bp_1.iD();
    }

    public bp_1 iJ() {
        bp_1 bp_12 = this.iK();
        if (!bp_12.isInitialized()) {
            throw br_2.newUninitializedMessageException((Message)bp_12);
        }
        return bp_12;
    }

    public bp_1 iK() {
        bp_1 bp_12 = new bp_1(this);
        int n = this.an;
        if (this.ao == null) {
            if ((this.an & 1) != 0) {
                this.ak = Collections.unmodifiableList(this.ak);
                this.an &= 0xFFFFFFFE;
            }
            bp_12.ak = this.ak;
        } else {
            bp_12.ak = this.ao.build();
        }
        this.onBuilt();
        return bp_12;
    }

    public br_2 iL() {
        return (br_2)super.clone();
    }

    public br_2 Y(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (br_2)super.setField(fieldDescriptor, object);
    }

    public br_2 z(Descriptors.FieldDescriptor fieldDescriptor) {
        return (br_2)super.clearField(fieldDescriptor);
    }

    public br_2 z(Descriptors.OneofDescriptor oneofDescriptor) {
        return (br_2)super.clearOneof(oneofDescriptor);
    }

    public br_2 z(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (br_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public br_2 Z(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (br_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public br_2 z(Message message) {
        if (message instanceof bp_1) {
            return this.c((bp_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public br_2 c(bp_1 bp_12) {
        if (bp_12 == bp_1.iD()) {
            return this;
        }
        if (this.ao == null) {
            if (!bp_12.ak.isEmpty()) {
                if (this.ak.isEmpty()) {
                    this.ak = bp_12.ak;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.ax();
                    this.ak.addAll(bp_12.ak);
                }
                this.onChanged();
            }
        } else if (!bp_12.ak.isEmpty()) {
            if (this.ao.isEmpty()) {
                this.ao.dispose();
                this.ao = null;
                this.ak = bp_12.ak;
                this.an &= 0xFFFFFFFE;
                this.ao = bp_1.iG() ? this.aB() : null;
            } else {
                this.ao.addAllMessages(bp_12.ak);
            }
        }
        this.Z(bp_1.b(bp_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public br_2 az(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bp_1 bp_12 = null;
        try {
            bp_12 = (bp_1)bp_1.gM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bp_12 = (bp_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bp_12 != null) {
                this.c(bp_12);
            }
        }
        return this;
    }

    private void ax() {
        if ((this.an & 1) == 0) {
            this.ak = new ArrayList<be_2>(this.ak);
            this.an |= 1;
        }
    }

    @Override
    public List<be_2> ai() {
        if (this.ao == null) {
            return Collections.unmodifiableList(this.ak);
        }
        return this.ao.getMessageList();
    }

    @Override
    public int ak() {
        if (this.ao == null) {
            return this.ak.size();
        }
        return this.ao.getCount();
    }

    @Override
    public be_2 L(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (be_2)this.ao.getMessage(n);
    }

    public br_2 a(int n, be_2 be_22) {
        if (this.ao == null) {
            if (be_22 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.set(n, be_22);
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)be_22);
        }
        return this;
    }

    public br_2 a(int n, bg_2 bg_22) {
        if (this.ao == null) {
            this.ax();
            this.ak.set(n, bg_22.hP());
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)bg_22.hP());
        }
        return this;
    }

    public br_2 d(be_2 be_22) {
        if (this.ao == null) {
            if (be_22 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(be_22);
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)be_22);
        }
        return this;
    }

    public br_2 b(int n, be_2 be_22) {
        if (this.ao == null) {
            if (be_22 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(n, be_22);
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)be_22);
        }
        return this;
    }

    public br_2 a(bg_2 bg_22) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(bg_22.hP());
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)bg_22.hP());
        }
        return this;
    }

    public br_2 b(int n, bg_2 bg_22) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(n, bg_22.hP());
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)bg_22.hP());
        }
        return this;
    }

    public br_2 e(Iterable<? extends be_2> iterable) {
        if (this.ao == null) {
            this.ax();
            AbstractMessageLite.Builder.addAll(iterable, this.ak);
            this.onChanged();
        } else {
            this.ao.addAllMessages(iterable);
        }
        return this;
    }

    public br_2 iM() {
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.ao.clear();
        }
        return this;
    }

    public br_2 N(int n) {
        if (this.ao == null) {
            this.ax();
            this.ak.remove(n);
            this.onChanged();
        } else {
            this.ao.remove(n);
        }
        return this;
    }

    public bg_2 O(int n) {
        return (bg_2)this.aB().getBuilder(n);
    }

    @Override
    public bt_2 M(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (bt_2)this.ao.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends bt_2> aj() {
        if (this.ao != null) {
            return this.ao.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.ak);
    }

    public bg_2 iN() {
        return (bg_2)this.aB().addBuilder((AbstractMessage)be_2.hK());
    }

    public bg_2 P(int n) {
        return (bg_2)this.aB().addBuilder(n, (AbstractMessage)be_2.hK());
    }

    public List<bg_2> aA() {
        return this.aB().getBuilderList();
    }

    private RepeatedFieldBuilderV3<be_2, bg_2, bt_2> aB() {
        if (this.ao == null) {
            this.ao = new RepeatedFieldBuilderV3(this.ak, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ak = null;
        }
        return this.ao;
    }

    public final br_2 Y(UnknownFieldSet unknownFieldSet) {
        return (br_2)super.setUnknownFields(unknownFieldSet);
    }

    public final br_2 Z(UnknownFieldSet unknownFieldSet) {
        return (br_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.Z(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.Y(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.Z(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.z(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.z(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.z(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.Y(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.iI();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.iL();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.Z(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.az(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.z(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.iI();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.z(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.iL();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.Z(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.Y(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.Z(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.z(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.z(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.z(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.Y(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.az(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.iL();
    }

    public /* synthetic */ Message buildPartial() {
        return this.iK();
    }

    public /* synthetic */ Message build() {
        return this.iJ();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.z(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.iI();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.az(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.iL();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.iK();
    }

    public /* synthetic */ MessageLite build() {
        return this.iJ();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.iI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.iE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.iE();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.az(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.iL();
    }

    public /* synthetic */ Object clone() {
        return this.iL();
    }
}

