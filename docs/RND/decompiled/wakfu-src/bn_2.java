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
 * Renamed from bn
 */
public final class bn_2
extends GeneratedMessageV3.Builder<bn_2>
implements bo_1 {
    private int an;
    private List<bh_1> ak = Collections.emptyList();
    private RepeatedFieldBuilderV3<bh_1, bj_2, bk_1> ao;

    public static final Descriptors.Descriptor is() {
        return ae_1.fC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fD.ensureFieldAccessorsInitialized(bl_1.class, bn_2.class);
    }

    bn_2() {
        this.D();
    }

    bn_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (bl_1.iq()) {
            this.aB();
        }
    }

    public bn_2 it() {
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
        return ae_1.fC;
    }

    public bl_1 ip() {
        return bl_1.io();
    }

    public bl_1 iu() {
        bl_1 bl_12 = this.iv();
        if (!bl_12.isInitialized()) {
            throw bn_2.newUninitializedMessageException((Message)bl_12);
        }
        return bl_12;
    }

    public bl_1 iv() {
        bl_1 bl_12 = new bl_1(this);
        int n = this.an;
        if (this.ao == null) {
            if ((this.an & 1) != 0) {
                this.ak = Collections.unmodifiableList(this.ak);
                this.an &= 0xFFFFFFFE;
            }
            bl_12.ak = this.ak;
        } else {
            bl_12.ak = this.ao.build();
        }
        this.onBuilt();
        return bl_12;
    }

    public bn_2 iw() {
        return (bn_2)super.clone();
    }

    public bn_2 W(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bn_2)super.setField(fieldDescriptor, object);
    }

    public bn_2 y(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bn_2)super.clearField(fieldDescriptor);
    }

    public bn_2 y(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bn_2)super.clearOneof(oneofDescriptor);
    }

    public bn_2 y(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bn_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bn_2 X(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bn_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bn_2 y(Message message) {
        if (message instanceof bl_1) {
            return this.c((bl_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bn_2 c(bl_1 bl_12) {
        if (bl_12 == bl_1.io()) {
            return this;
        }
        if (this.ao == null) {
            if (!bl_12.ak.isEmpty()) {
                if (this.ak.isEmpty()) {
                    this.ak = bl_12.ak;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.ax();
                    this.ak.addAll(bl_12.ak);
                }
                this.onChanged();
            }
        } else if (!bl_12.ak.isEmpty()) {
            if (this.ao.isEmpty()) {
                this.ao.dispose();
                this.ao = null;
                this.ak = bl_12.ak;
                this.an &= 0xFFFFFFFE;
                this.ao = bl_1.ir() ? this.aB() : null;
            } else {
                this.ao.addAllMessages(bl_12.ak);
            }
        }
        this.X(bl_1.b(bl_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bn_2 aw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bl_1 bl_12 = null;
        try {
            bl_12 = (bl_1)bl_1.gI.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bl_12 = (bl_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bl_12 != null) {
                this.c(bl_12);
            }
        }
        return this;
    }

    private void ax() {
        if ((this.an & 1) == 0) {
            this.ak = new ArrayList<bh_1>(this.ak);
            this.an |= 1;
        }
    }

    @Override
    public List<bh_1> ai() {
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
    public bh_1 G(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (bh_1)this.ao.getMessage(n);
    }

    public bn_2 a(int n, bh_1 bh_12) {
        if (this.ao == null) {
            if (bh_12 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.set(n, bh_12);
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)bh_12);
        }
        return this;
    }

    public bn_2 a(int n, bj_2 bj_22) {
        if (this.ao == null) {
            this.ax();
            this.ak.set(n, bj_22.ig());
            this.onChanged();
        } else {
            this.ao.setMessage(n, (AbstractMessage)bj_22.ig());
        }
        return this;
    }

    public bn_2 h(bh_1 bh_12) {
        if (this.ao == null) {
            if (bh_12 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(bh_12);
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)bh_12);
        }
        return this;
    }

    public bn_2 b(int n, bh_1 bh_12) {
        if (this.ao == null) {
            if (bh_12 == null) {
                throw new NullPointerException();
            }
            this.ax();
            this.ak.add(n, bh_12);
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)bh_12);
        }
        return this;
    }

    public bn_2 c(bj_2 bj_22) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(bj_22.ig());
            this.onChanged();
        } else {
            this.ao.addMessage((AbstractMessage)bj_22.ig());
        }
        return this;
    }

    public bn_2 b(int n, bj_2 bj_22) {
        if (this.ao == null) {
            this.ax();
            this.ak.add(n, bj_22.ig());
            this.onChanged();
        } else {
            this.ao.addMessage(n, (AbstractMessage)bj_22.ig());
        }
        return this;
    }

    public bn_2 d(Iterable<? extends bh_1> iterable) {
        if (this.ao == null) {
            this.ax();
            AbstractMessageLite.Builder.addAll(iterable, this.ak);
            this.onChanged();
        } else {
            this.ao.addAllMessages(iterable);
        }
        return this;
    }

    public bn_2 ix() {
        if (this.ao == null) {
            this.ak = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.ao.clear();
        }
        return this;
    }

    public bn_2 I(int n) {
        if (this.ao == null) {
            this.ax();
            this.ak.remove(n);
            this.onChanged();
        } else {
            this.ao.remove(n);
        }
        return this;
    }

    public bj_2 J(int n) {
        return (bj_2)this.aB().getBuilder(n);
    }

    @Override
    public bk_1 H(int n) {
        if (this.ao == null) {
            return this.ak.get(n);
        }
        return (bk_1)this.ao.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends bk_1> aj() {
        if (this.ao != null) {
            return this.ao.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.ak);
    }

    public bj_2 iy() {
        return (bj_2)this.aB().addBuilder((AbstractMessage)bh_1.ib());
    }

    public bj_2 K(int n) {
        return (bj_2)this.aB().addBuilder(n, (AbstractMessage)bh_1.ib());
    }

    public List<bj_2> aA() {
        return this.aB().getBuilderList();
    }

    private RepeatedFieldBuilderV3<bh_1, bj_2, bk_1> aB() {
        if (this.ao == null) {
            this.ao = new RepeatedFieldBuilderV3(this.ak, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.ak = null;
        }
        return this.ao;
    }

    public final bn_2 W(UnknownFieldSet unknownFieldSet) {
        return (bn_2)super.setUnknownFields(unknownFieldSet);
    }

    public final bn_2 X(UnknownFieldSet unknownFieldSet) {
        return (bn_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.X(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.W(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.X(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.y(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.y(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.y(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.W(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.it();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.iw();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.X(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.y(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.it();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.y(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.iw();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.X(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.W(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.X(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.y(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.y(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.y(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.W(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.iw();
    }

    public /* synthetic */ Message buildPartial() {
        return this.iv();
    }

    public /* synthetic */ Message build() {
        return this.iu();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.y(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.it();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.iw();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.iv();
    }

    public /* synthetic */ MessageLite build() {
        return this.iu();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.it();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ip();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ip();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.aw(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.iw();
    }

    public /* synthetic */ Object clone() {
        return this.iw();
    }
}

