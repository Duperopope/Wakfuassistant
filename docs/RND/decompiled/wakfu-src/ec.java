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

public final class ec
extends GeneratedMessageV3.Builder<ec>
implements ed {
    private int an;
    private int mj;
    private List<dW> mp = Collections.emptyList();
    private RepeatedFieldBuilderV3<dW, dY, dZ> ms;

    public static final Descriptors.Descriptor uh() {
        return dV.mb;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dV.mc.ensureFieldAccessorsInitialized(ea.class, ec.class);
    }

    ec() {
        this.D();
    }

    ec(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ea.fa()) {
            this.ur();
        }
    }

    public ec ui() {
        super.clear();
        this.mj = 0;
        this.an &= 0xFFFFFFFE;
        if (this.ms == null) {
            this.mp = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
        } else {
            this.ms.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dV.mb;
    }

    public ea ug() {
        return ea.uf();
    }

    public ea uj() {
        ea ea2 = this.uk();
        if (!ea2.isInitialized()) {
            throw ec.newUninitializedMessageException((Message)ea2);
        }
        return ea2;
    }

    public ea uk() {
        ea ea2 = new ea(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            ea2.mj = this.mj;
            n2 |= 1;
        }
        if (this.ms == null) {
            if ((this.an & 2) != 0) {
                this.mp = Collections.unmodifiableList(this.mp);
                this.an &= 0xFFFFFFFD;
            }
            ea2.mp = this.mp;
        } else {
            ea2.mp = this.ms.build();
        }
        ea2.an = n2;
        this.onBuilt();
        return ea2;
    }

    public ec ul() {
        return (ec)super.clone();
    }

    public ec bk(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ec)super.setField(fieldDescriptor, object);
    }

    public ec af(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ec)super.clearField(fieldDescriptor);
    }

    public ec af(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ec)super.clearOneof(oneofDescriptor);
    }

    public ec af(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ec)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ec bl(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ec)super.addRepeatedField(fieldDescriptor, object);
    }

    public ec af(Message message) {
        if (message instanceof ea) {
            return this.c((ea)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ec c(ea ea2) {
        if (ea2 == ea.uf()) {
            return this;
        }
        if (ea2.tK()) {
            this.bj(ea2.tL());
        }
        if (this.ms == null) {
            if (!ea2.mp.isEmpty()) {
                if (this.mp.isEmpty()) {
                    this.mp = ea2.mp;
                    this.an &= 0xFFFFFFFD;
                } else {
                    this.un();
                    this.mp.addAll(ea2.mp);
                }
                this.onChanged();
            }
        } else if (!ea2.mp.isEmpty()) {
            if (this.ms.isEmpty()) {
                this.ms.dispose();
                this.ms = null;
                this.mp = ea2.mp;
                this.an &= 0xFFFFFFFD;
                this.ms = ea.oV() ? this.ur() : null;
            } else {
                this.ms.addAllMessages(ea2.mp);
            }
        }
        this.bl(ea.b(ea2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.ub(); ++i) {
            if (this.bh(i).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ec cr(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ea ea2 = null;
        try {
            ea2 = (ea)ea.mr.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ea2 = (ea)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ea2 != null) {
                this.c(ea2);
            }
        }
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public ec bj(int n) {
        this.an |= 1;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public ec um() {
        this.an &= 0xFFFFFFFE;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    private void un() {
        if ((this.an & 2) == 0) {
            this.mp = new ArrayList<dW>(this.mp);
            this.an |= 2;
        }
    }

    @Override
    public List<dW> tZ() {
        if (this.ms == null) {
            return Collections.unmodifiableList(this.mp);
        }
        return this.ms.getMessageList();
    }

    @Override
    public int ub() {
        if (this.ms == null) {
            return this.mp.size();
        }
        return this.ms.getCount();
    }

    @Override
    public dW bh(int n) {
        if (this.ms == null) {
            return this.mp.get(n);
        }
        return (dW)this.ms.getMessage(n);
    }

    public ec a(int n, dW dW2) {
        if (this.ms == null) {
            if (dW2 == null) {
                throw new NullPointerException();
            }
            this.un();
            this.mp.set(n, dW2);
            this.onChanged();
        } else {
            this.ms.setMessage(n, (AbstractMessage)dW2);
        }
        return this;
    }

    public ec a(int n, dY dY2) {
        if (this.ms == null) {
            this.un();
            this.mp.set(n, dY2.tT());
            this.onChanged();
        } else {
            this.ms.setMessage(n, (AbstractMessage)dY2.tT());
        }
        return this;
    }

    public ec d(dW dW2) {
        if (this.ms == null) {
            if (dW2 == null) {
                throw new NullPointerException();
            }
            this.un();
            this.mp.add(dW2);
            this.onChanged();
        } else {
            this.ms.addMessage((AbstractMessage)dW2);
        }
        return this;
    }

    public ec b(int n, dW dW2) {
        if (this.ms == null) {
            if (dW2 == null) {
                throw new NullPointerException();
            }
            this.un();
            this.mp.add(n, dW2);
            this.onChanged();
        } else {
            this.ms.addMessage(n, (AbstractMessage)dW2);
        }
        return this;
    }

    public ec a(dY dY2) {
        if (this.ms == null) {
            this.un();
            this.mp.add(dY2.tT());
            this.onChanged();
        } else {
            this.ms.addMessage((AbstractMessage)dY2.tT());
        }
        return this;
    }

    public ec b(int n, dY dY2) {
        if (this.ms == null) {
            this.un();
            this.mp.add(n, dY2.tT());
            this.onChanged();
        } else {
            this.ms.addMessage(n, (AbstractMessage)dY2.tT());
        }
        return this;
    }

    public ec j(Iterable<? extends dW> iterable) {
        if (this.ms == null) {
            this.un();
            AbstractMessageLite.Builder.addAll(iterable, this.mp);
            this.onChanged();
        } else {
            this.ms.addAllMessages(iterable);
        }
        return this;
    }

    public ec uo() {
        if (this.ms == null) {
            this.mp = Collections.emptyList();
            this.an &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.ms.clear();
        }
        return this;
    }

    public ec bk(int n) {
        if (this.ms == null) {
            this.un();
            this.mp.remove(n);
            this.onChanged();
        } else {
            this.ms.remove(n);
        }
        return this;
    }

    public dY bl(int n) {
        return (dY)this.ur().getBuilder(n);
    }

    @Override
    public dZ bi(int n) {
        if (this.ms == null) {
            return this.mp.get(n);
        }
        return (dZ)this.ms.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends dZ> ua() {
        if (this.ms != null) {
            return this.ms.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.mp);
    }

    public dY up() {
        return (dY)this.ur().addBuilder((AbstractMessage)dW.tP());
    }

    public dY bm(int n) {
        return (dY)this.ur().addBuilder(n, (AbstractMessage)dW.tP());
    }

    public List<dY> uq() {
        return this.ur().getBuilderList();
    }

    private RepeatedFieldBuilderV3<dW, dY, dZ> ur() {
        if (this.ms == null) {
            this.ms = new RepeatedFieldBuilderV3(this.mp, (this.an & 2) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.mp = null;
        }
        return this.ms;
    }

    public final ec bk(UnknownFieldSet unknownFieldSet) {
        return (ec)super.setUnknownFields(unknownFieldSet);
    }

    public final ec bl(UnknownFieldSet unknownFieldSet) {
        return (ec)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bl(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bk(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bl(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.af(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.af(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.af(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bk(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ui();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.ul();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bl(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.af(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ui();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.af(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.ul();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bl(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.bk(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bl(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.af(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.af(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.af(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.bk(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.ul();
    }

    public /* synthetic */ Message buildPartial() {
        return this.uk();
    }

    public /* synthetic */ Message build() {
        return this.uj();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.af(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ui();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.ul();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.uk();
    }

    public /* synthetic */ MessageLite build() {
        return this.uj();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ui();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ug();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ug();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cr(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.ul();
    }

    public /* synthetic */ Object clone() {
        return this.ul();
    }
}

