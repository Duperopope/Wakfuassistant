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
 * Renamed from cZ
 */
public final class cz_1
extends GeneratedMessageV3.Builder<cz_1>
implements da_1 {
    private int an;
    private List<db_2> jj = Collections.emptyList();
    private RepeatedFieldBuilderV3<db_2, dd_1, de_1> jm;

    public static final Descriptors.Descriptor oC() {
        return cw_1.jd;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return cw_1.je.ensureFieldAccessorsInitialized(cx_1.class, cz_1.class);
    }

    cz_1() {
        this.D();
    }

    cz_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (cx_1.aJ()) {
            this.oL();
        }
    }

    public cz_1 oD() {
        super.clear();
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
        } else {
            this.jm.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return cw_1.jd;
    }

    public cx_1 oA() {
        return cx_1.oz();
    }

    public cx_1 oE() {
        cx_1 cx_12 = this.oF();
        if (!cx_12.isInitialized()) {
            throw cz_1.newUninitializedMessageException((Message)cx_12);
        }
        return cx_12;
    }

    public cx_1 oF() {
        cx_1 cx_12 = new cx_1(this);
        int n = this.an;
        if (this.jm == null) {
            if ((this.an & 1) != 0) {
                this.jj = Collections.unmodifiableList(this.jj);
                this.an &= 0xFFFFFFFE;
            }
            cx_12.jj = this.jj;
        } else {
            cx_12.jj = this.jm.build();
        }
        this.onBuilt();
        return cx_12;
    }

    public cz_1 oG() {
        return (cz_1)super.clone();
    }

    public cz_1 aM(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cz_1)super.setField(fieldDescriptor, object);
    }

    public cz_1 T(Descriptors.FieldDescriptor fieldDescriptor) {
        return (cz_1)super.clearField(fieldDescriptor);
    }

    public cz_1 T(Descriptors.OneofDescriptor oneofDescriptor) {
        return (cz_1)super.clearOneof(oneofDescriptor);
    }

    public cz_1 T(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (cz_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public cz_1 aN(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (cz_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public cz_1 T(Message message) {
        if (message instanceof cx_1) {
            return this.c((cx_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public cz_1 c(cx_1 cx_12) {
        if (cx_12 == cx_1.oz()) {
            return this;
        }
        if (this.jm == null) {
            if (!cx_12.jj.isEmpty()) {
                if (this.jj.isEmpty()) {
                    this.jj = cx_12.jj;
                    this.an &= 0xFFFFFFFE;
                } else {
                    this.oH();
                    this.jj.addAll(cx_12.jj);
                }
                this.onChanged();
            }
        } else if (!cx_12.jj.isEmpty()) {
            if (this.jm.isEmpty()) {
                this.jm.dispose();
                this.jm = null;
                this.jj = cx_12.jj;
                this.an &= 0xFFFFFFFE;
                this.jm = cx_1.oB() ? this.oL() : null;
            } else {
                this.jm.addAllMessages(cx_12.jj);
            }
        }
        this.aN(cx_1.b(cx_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.ov(); ++i) {
            if (this.aj(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public cz_1 bH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        cx_1 cx_12 = null;
        try {
            cx_12 = (cx_1)cx_1.jl.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            cx_12 = (cx_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (cx_12 != null) {
                this.c(cx_12);
            }
        }
        return this;
    }

    private void oH() {
        if ((this.an & 1) == 0) {
            this.jj = new ArrayList<db_2>(this.jj);
            this.an |= 1;
        }
    }

    @Override
    public List<db_2> ot() {
        if (this.jm == null) {
            return Collections.unmodifiableList(this.jj);
        }
        return this.jm.getMessageList();
    }

    @Override
    public int ov() {
        if (this.jm == null) {
            return this.jj.size();
        }
        return this.jm.getCount();
    }

    @Override
    public db_2 aj(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (db_2)this.jm.getMessage(n);
    }

    public cz_1 a(int n, db_2 db_22) {
        if (this.jm == null) {
            if (db_22 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.set(n, db_22);
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)db_22);
        }
        return this;
    }

    public cz_1 a(int n, dd_1 dd_12) {
        if (this.jm == null) {
            this.oH();
            this.jj.set(n, dd_12.oY());
            this.onChanged();
        } else {
            this.jm.setMessage(n, (AbstractMessage)dd_12.oY());
        }
        return this;
    }

    public cz_1 a(db_2 db_22) {
        if (this.jm == null) {
            if (db_22 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(db_22);
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)db_22);
        }
        return this;
    }

    public cz_1 b(int n, db_2 db_22) {
        if (this.jm == null) {
            if (db_22 == null) {
                throw new NullPointerException();
            }
            this.oH();
            this.jj.add(n, db_22);
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)db_22);
        }
        return this;
    }

    public cz_1 a(dd_1 dd_12) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(dd_12.oY());
            this.onChanged();
        } else {
            this.jm.addMessage((AbstractMessage)dd_12.oY());
        }
        return this;
    }

    public cz_1 b(int n, dd_1 dd_12) {
        if (this.jm == null) {
            this.oH();
            this.jj.add(n, dd_12.oY());
            this.onChanged();
        } else {
            this.jm.addMessage(n, (AbstractMessage)dd_12.oY());
        }
        return this;
    }

    public cz_1 h(Iterable<? extends db_2> iterable) {
        if (this.jm == null) {
            this.oH();
            AbstractMessageLite.Builder.addAll(iterable, this.jj);
            this.onChanged();
        } else {
            this.jm.addAllMessages(iterable);
        }
        return this;
    }

    public cz_1 oI() {
        if (this.jm == null) {
            this.jj = Collections.emptyList();
            this.an &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.jm.clear();
        }
        return this;
    }

    public cz_1 al(int n) {
        if (this.jm == null) {
            this.oH();
            this.jj.remove(n);
            this.onChanged();
        } else {
            this.jm.remove(n);
        }
        return this;
    }

    public dd_1 am(int n) {
        return (dd_1)this.oL().getBuilder(n);
    }

    @Override
    public de_1 ak(int n) {
        if (this.jm == null) {
            return this.jj.get(n);
        }
        return (de_1)this.jm.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends de_1> ou() {
        if (this.jm != null) {
            return this.jm.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.jj);
    }

    public dd_1 oJ() {
        return (dd_1)this.oL().addBuilder((AbstractMessage)db_2.oT());
    }

    public dd_1 an(int n) {
        return (dd_1)this.oL().addBuilder(n, (AbstractMessage)db_2.oT());
    }

    public List<dd_1> oK() {
        return this.oL().getBuilderList();
    }

    private RepeatedFieldBuilderV3<db_2, dd_1, de_1> oL() {
        if (this.jm == null) {
            this.jm = new RepeatedFieldBuilderV3(this.jj, (this.an & 1) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.jj = null;
        }
        return this.jm;
    }

    public final cz_1 aM(UnknownFieldSet unknownFieldSet) {
        return (cz_1)super.setUnknownFields(unknownFieldSet);
    }

    public final cz_1 aN(UnknownFieldSet unknownFieldSet) {
        return (cz_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aN(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aM(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aN(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.T(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.T(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.T(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aM(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.oD();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.oG();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aN(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.T(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.oD();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.T(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.oG();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aN(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.aM(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aN(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.T(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.T(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.T(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.aM(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.oG();
    }

    public /* synthetic */ Message buildPartial() {
        return this.oF();
    }

    public /* synthetic */ Message build() {
        return this.oE();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.T(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.oD();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.oG();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.oF();
    }

    public /* synthetic */ MessageLite build() {
        return this.oE();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.oD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.oA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.oA();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.bH(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.oG();
    }

    public /* synthetic */ Object clone() {
        return this.oG();
    }
}

